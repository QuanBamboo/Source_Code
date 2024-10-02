import java.util.Scanner;

public class FindMaxOf2WayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số hàng: ");
        byte row = scanner.nextByte();
        System.out.println("Nhập chỉ số cột: ");
        byte col = scanner.nextByte();

        double[][] array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "]= ");
                array[i][j] = scanner.nextDouble();
            }
        }

        //in mảng:
        System.out.println("-----Mảng trước khi tìm-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println("");
        }
        double max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }

        }

        System.out.println("Giá trị lớn nhất trong mảng là : " + max);
        System.out.print(" Ở vị trí[" + indexRow + "][" + indexCol + "] ");
    }
}
