/**
 * Created by regnisalram on 11/21/16.
 */
public class App {
    public static void main(String[] args) {

        Garden flowersNTrees = new Garden();

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        flowersNTrees.addPlant(yellowFlower);
        flowersNTrees.addPlant(blueFlower);
        flowersNTrees.addPlant(purpleTree);
        flowersNTrees.addPlant(orangeTree);

    }
}
