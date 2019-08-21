package Lesson1;

public abstract class Fruit
{
    private String nameFruit;
    private float weight;

    public Fruit(String nameFruit)
    {
        this.nameFruit=nameFruit;
    }

    public String getNameFruit()
    {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit)
    {
        this.nameFruit = nameFruit;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }
}

class Apple extends Fruit
{
    public Apple(String nameFruit)
    {
        super(nameFruit);
        setWeight(1.0f);
    }
}
class Orange extends Fruit
{
public Orange(String nameFruit)
{
    super(nameFruit);
    setWeight(1.5f);
}
}
