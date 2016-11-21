/**
 * Created by regnisalram on 11/21/16.
 */
public abstract class Plant {

    protected String color;
    protected int waterInPlant;
    protected boolean needsWater;

    public Plant(String color) {
        this.color = color;
        waterInPlant = 0;
        needsWater = true;
    }

    public waterPlant(int amountOfWater) {
        if (needsWater) {
            waterInPlant += amountOfWater;
        } else

    }
}
