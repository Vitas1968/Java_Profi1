package Lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoxFruit <T extends  Fruit>
{
    private List<T> fruitList;

    public List <T> getFruitList()
    {
        return fruitList;
    }

    public BoxFruit ()
    {
        this.fruitList=new ArrayList <>();
    }

    public float getWeightBox(int quantityFruits, float weightFruit)
    {
        return quantityFruits*weightFruit;
    }

    public List <T> contentBox()
    {
        return fruitList;
    }

    public void  putFruit(T fruit)
    {
        fruitList.add(fruit);
    }

    public T getFtuit()
    {
        if(fruitList.size()!=0)
        return fruitList.remove(fruitList.size()-1);
        else  return null;
    }


    public boolean compareTo(BoxFruit<? extends Fruit> boxFruit)
    {

        if (this.getWeightBox(this.fruitList.size(),this.fruitList.get(0).getWeight())==
                boxFruit.getWeightBox(boxFruit.getFruitList().size(),boxFruit.getFruitList().get(0).getWeight())) return true;
        else return false;
    }

    public void shiftToAnotherBox(BoxFruit<T> boxFruit)
    {
        boxFruit.getFruitList().addAll(boxFruit.getFruitList().size(),this.fruitList);
        this.fruitList.clear();
    }
}
