public class FindMinNumber {

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("phần tử nhỏ nhất là : " + arr[index] + " ở vị trí " + (index + 1));

    }


    //Method tìm vị trí có giá trị nhỏ nhất trong mảng:
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }
        }
        return index;
    }
}
