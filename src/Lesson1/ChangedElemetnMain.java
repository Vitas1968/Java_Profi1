package Lesson1;

public class ChangedElemetnMain
{
    public static void main(String[] args)
    {
        char[] charArr = {'a','b','c','d','e'};

            System.out.print(changedElemet(charArr,2,5));

    }
    public static char[] changedElemet(char[] array, int idx1, int idx2)
    {
        if ((idx1>0 && idx1 <array.length) && (idx2>0 && idx2<array.length))
        {
            char ch = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = ch;
        } else
            {throw new ArrayIndexOutOfBoundsException("Некорректный индекс"); }
        return array;
    }
}
