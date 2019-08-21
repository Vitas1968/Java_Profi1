package Lesson1;

public class FtuitBoxTest
{
    public static void main(String[] args)
    {
        Apple apple1 = new Apple("Apple1");
        Apple apple2 = new Apple("Apple2");
        Apple apple3 = new Apple("Apple3");
        Apple apple4 = new Apple("Apple4");
        Apple apple5 = new Apple("Apple5");

        Apple apple11 = new Apple("Apple11");
        Apple apple22 = new Apple("Apple22");

        Orange orange1 = new Orange("Orange1");
        Orange orange2 = new Orange("Orange2");
        Orange orange3 = new Orange("Orange3");
        Orange orange4 = new Orange("Orange4");
        Orange orange5 = new Orange("Orange5");

        BoxFruit<Apple> appleBox= new BoxFruit<>();
        BoxFruit<Orange> orangeBox= new BoxFruit<>();
        BoxFruit<Apple> appleBox2= new BoxFruit<>();

        appleBox2.putFruit(apple11);
        appleBox2.putFruit(apple22);




        appleBox.putFruit(apple2);
        appleBox.putFruit(apple1);
        appleBox.putFruit(apple5);
        appleBox.putFruit(apple4);
        appleBox.putFruit(apple3);

        orangeBox.putFruit(orange1);
        orangeBox.putFruit(orange2);
        orangeBox.putFruit(orange3);
        orangeBox.putFruit(orange4);
        orangeBox.putFruit(orange5);

//        for (Fruit f: appleBox.contentBox())
//        {
//            System.out.println(f.getNameFruit());
//        }
//        System.out.println();
//
//        for (Fruit f: orangeBox.contentBox())
//        {
//            System.out.println(f.getNameFruit());
//        }
       // System.out.println(orangeBox.compareTo(appleBox));
       // System.out.println(orangeBox.contentBox().get(0).getWeight());
//        System.out.println(appleBox.contentBox().size());
//        System.out.println(appleBox.getFtuit().getNameFruit());
//        System.out.println(appleBox.contentBox().size());
//        System.out.println(appleBox.getFtuit().getNameFruit());
//        System.out.println(appleBox.contentBox().size());
        for (Apple apple:appleBox2.getFruitList())
        {
            System.out.println(apple.getNameFruit());
        }
        System.out.println();
        appleBox.shiftToAnotherBox(appleBox2);

        for (Apple apple:appleBox2.getFruitList())
        {
            System.out.println(apple.getNameFruit());
        }
    }
}
