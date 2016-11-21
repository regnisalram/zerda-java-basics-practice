import java.util.ArrayList;

/**
 * Created by regnisalram on 11/21/16.
 */
public class Garden {

    ArrayList<Plant> garden = new ArrayList<>();

    public Garden() {
    }

    public void addPlant(Plant plantToAdd) {
        garden.add(plantToAdd);
    }

    public void waterPlants(int amountOfWater) {
        int plantsToWater = 0;
        int waterPerPlant;
        for (Plant plant : garden) {
            if (plant.needsWater) {
                plantsToWater += 1;
            }
        }
        waterPerPlant = amountOfWater/plantsToWater;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "garden=" + garden +
                '}';
    }
}
