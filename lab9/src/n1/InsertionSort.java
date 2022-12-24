package n1;

public class InsertionSort {
    public static void insertionSort(Student[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            Student key = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j].getIDNumber() > key.getIDNumber())) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
