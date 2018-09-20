package demo.insertion.sort;

public class DemoInsertionSort {
    static int[] list = {5, 12, 9, 3, 2, 15, 11, 4, 32, 17, 18};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println("Lay ra phan tu " + currentElement);
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                System.out.println("Thay the vi tri phan tu " + list[j + 1] + " bang " + list[j]);
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
            System.out.println("Chen "+list[j + 1] + " vao vi tri thu " + (j + 2) + "\n");
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Day sau sap xep la: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
