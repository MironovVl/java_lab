package n1;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int size = 3;
        Student[] students = new Student[size];
        students[0] = new Student("Name3", 3);
        students[1] = new Student("Name1", 1);
        students[2] = new Student("Name2", 2);
        System.out.println(Arrays.toString(students));
        InsertionSort.insertionSort(students);
        System.out.println(Arrays.toString(students));
    }
}
