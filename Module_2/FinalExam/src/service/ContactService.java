package service;

import entity.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService {
    private static final String CONTACT_DATA = "src\\data\\contact.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "name,numberPhone,address,email,facebook";


    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CONTACT_DATA));) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(COMMA_DELIMITER);
                String name = data[0];
                int numberPhone = Integer.parseInt(data[1]);
                String address = data[2];
                String email = data[3];
                String facebook = data[4];
                contacts.add(new Contact(name, numberPhone, address, email, facebook));
            }

        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return contacts;
    }

    public void saveContacts(Contact contact) {
        List<Contact> contacts = getAllContacts();
        contacts.add(contact);
        writeFile(contacts);
    }

    public void remove(int numberPhone) {
        List<Contact> contacts = getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getNumberPhone() == numberPhone) {
                contacts.remove(contact);
                break;
            }
        }
        writeFile(contacts);
    }

    public void update(int number, Contact contact) {
        List<Contact> contacts = getAllContacts();
        for (Contact c : contacts) {
            if (c.getNumberPhone() == number) {
                c = contact;
                break;
            }
        }
        writeFile(contacts);
    }

    public Contact inputContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập số điện thoại");
        int numberPhone;
        while (true) {
            try {
                numberPhone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng định dạng số, mời bạn nhập lại:");
            } catch (Exception e) {
                System.out.println("Lỗi khác");
            }
        }
        System.out.println("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập email: ");
        String email = scanner.nextLine();

        System.out.println("Mời bạn nhập facebook: ");
        String facebook = scanner.nextLine();

        return new Contact(name, numberPhone, address, email, facebook);
    }


    public void writeFile(List<Contact> contacts) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(CONTACT_DATA);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Contact contact : contacts) {
                fileWriter.append(contact.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(contact.getNumberPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getFacebook());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
    }

    public Contact findByNumberPhone(int numberPhone) {
        List<Contact> contacts = getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getNumberPhone() == numberPhone) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> findByName(String name) {
        List<Contact> contacts = getAllContacts();
        List<Contact> temp = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(name)) {
                temp.add(contact);
            }
        }
        return temp;
    }

    public boolean isExistsContact(int numberPhone) {
        if (findByNumberPhone(numberPhone) != null) {
            return true;
        }
        return false;
    }
}



