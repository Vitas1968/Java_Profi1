package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListMain
{
    public static void main(String[] args)
    {
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> listOfStrings = new ArrayList<String>();

        // возвращает массив в виде списка
        // любое изменение в массиве приведет к изменению в списке ArrayList
        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println("Полученный ArrayList с помощью метода Arrays.asList()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
        // изменяем элемент в массиве и видим, что элемент также меняется и в списке.
        arrayOfStrings[0] = "5";
        System.out.println("\nИзменения в массиве повлияли и на ArrayList");
        for (String str : listOfStrings)
            System.out.print(" " + str);

        // код ниже выбросит java.lang.UnsupportedOperationException, потому что
        // Arrays.asList() возвращает список фиксированного размера. Этот размер зависит от размера исходного массива
        //listOfStrings.add("5");

        listOfStrings = new ArrayList<String>();

        Collections.addAll(listOfStrings, arrayOfStrings);
        listOfStrings.add("5");
        arrayOfStrings[0] = "1";
        System.out.println("\nArray в ArrayList с помощью метода Collections.addAll()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
    }
}
