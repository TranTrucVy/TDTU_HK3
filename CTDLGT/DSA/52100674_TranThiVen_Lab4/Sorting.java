import java.util.Arrays;
public class Sorting <E extends Comparable<E>> implements InterfaceSorting<E> {
    private E[] arr  = null;
    private int size = 0;

    public Sorting(E[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
    public int size (){return size;}

    @Override
    public void select() {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            E temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void mergeSort(int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;

            mergeSort(start, middle);
            mergeSort(middle + 1, end); 
            merge(start, middle, end);
        }
    }

    public void merge(int start, int middle, int end)
    {
        E[] leftArray  = (E[]) new Comparable[middle - start + 1];
        E[] rightArray = (E[]) new Comparable[end - middle];

        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = arr[start + i];
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = arr[middle + 1 + i];
        int leftIndex = 0, rightIndex = 0;
        int currentIndex = start;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                arr[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                arr[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        while (leftIndex < leftArray.length) arr[currentIndex++] = leftArray[leftIndex++];

        while (rightIndex < rightArray.length) arr[currentIndex++] = rightArray[rightIndex++];
    }

    @Override
    public void bubble() {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    @Override
    public void insert() {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j].compareTo(arr[j - 1]) < 0) {
                E temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    @Override
    public void quick(int left, int right) {
        //Base case
        if (left < right){
            int p_i = partition(left,right);
            quick(left,p_i-1);
            quick(p_i+1,right);
        }
    }

    public int partition(int left, int right){
        // pivot
        E pivot = arr[right];
        int i = (left - 1);
        for(int j = left; j <= right - 1; j++){
            if (arr[j].compareTo(pivot) < 0){
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, right);
        return (i + 1);
    }

    public void swap(int i, int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public void heap() {


    }
    @Override
    public void radix() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "       + Array: " + Arrays.toString(arr);
    }

}