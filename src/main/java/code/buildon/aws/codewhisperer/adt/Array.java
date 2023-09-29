package code.buildon.aws.codewhisperer.adt;

public class Array {

    private int[] myArray = new int[5];

    // Create a method to init the myArray with random values.
    public void initArray() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
    }

    // Create a method to print the myArray.
    public void printArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " = " + myArray[i]);
        }
    }

    // Create a method to add an new element to the end of myArray.
    public void addElement(int element) {
        int[] newArray = new int[myArray.length + 1];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        myArray = newArray;
        myArray[myArray.length - 1] = element;
    }

    // Create a method to add an new element to the middle of myArray.
    public void addElementToTheMiddle(int element) {
        int[] newArray = new int[myArray.length + 1];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        myArray = newArray;
        myArray[myArray.length / 2] = element;
    }

    // Create a method to sort the myArray using Bubble Sort.
    public void sortArray() {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    // Create a method to sort the myArray using Merge Sort.
    public void sortArrayUsingMergeSort() {
        int[] newArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        myArray = mergeSort(newArray, 0, myArray.length - 1);
    }

    private int[] mergeSort(int[] array, int start, int end) {
        if (start == end) {
            int[] newArray = new int[1];
            newArray[0] = array[start];
            return newArray;
        }
        int mid = (start + end) / 2;
        int[] left = mergeSort(array, start, mid);
        int[] right = mergeSort(array, mid + 1, end);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
                k++;
            }
            else {
                result[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    // Main method.
    public static void main(String[] args) {
        Array array = new Array();
        array.initArray();
        array.printArray();
        array.sortArrayUsingMergeSort();
        System.out.println("---------------------");
        array.printArray();
    }

}
