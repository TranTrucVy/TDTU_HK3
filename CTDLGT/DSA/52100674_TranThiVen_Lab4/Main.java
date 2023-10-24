import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[10];
        Double[] doubleArray = new Double[10];
        String[] stringArray = new String[10];
        Character[] charArray = new Character[10];
        Float[] floatArray = new Float[10];

        for (int i = 0; i<intArray.length; i++){
            intArray[i] = new Random().nextInt(100);
            doubleArray[i] = new Random().nextDouble();
            stringArray[i] = new Random().nextInt(100) + "";
            charArray[i] = (char)(new Random().nextInt(26) + 'a');
            floatArray[i] = new Random().nextFloat();
        }

        InterfaceSorting<Integer> intSorting = new Sorting<Integer>(intArray);
        InterfaceSorting<Double> doubleSorting = new Sorting<Double>(doubleArray);
        InterfaceSorting<String> stringSorting = new Sorting<String>(stringArray);
        InterfaceSorting<Character> charSorting = new Sorting<Character>(charArray);
        InterfaceSorting<Float> floatSorting = new Sorting<Float>(floatArray);

        System.out.println(intSorting);
        System.out.println(doubleSorting);
        System.out.println(stringSorting);
        System.out.println(charSorting);

        //Selection sort
        intSorting.select();
        System.out.println("Selection sort");
        System.out.println(intSorting);

        //Merge Sort
        System.out.println("Merger sort");
        doubleSorting.mergeSort(0, 9);
        System.out.println(doubleSorting);

        //Bubble sort
        System.out.println("Bubble sort");
        stringSorting.bubble();
        System.out.println(stringSorting);

        //Insertion sort
        System.out.println("Insertion sort");
        charSorting.insert();
        System.out.println(charSorting);

        //Quick sort
        System.out.println("Quick sort");
        floatSorting.quick(0, 9);
        System.out.println(floatSorting);

        //Test exercise 2
        System.out.println("Exercise 2");
        List<Student> listOfStudent = new ArrayList<Student>();

        listOfStudent.add(new Student("Duuu",10,10,7));
        listOfStudent.add(new Student("Thao",6,10,5));
        listOfStudent.add(new Student("Kiet",8,10,5));
        listOfStudent.add(new Student("Ven",5,10,6));
        listOfStudent.add(new Student("Dong",7,10,8));

    }
}


