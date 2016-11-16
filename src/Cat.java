/**
 * Created by Роман on 16.11.2016.
 */
public class Cat {
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;

    public Cat(){
        weight = 1500.0 + 3000 * Math.random();
        originWeight = weight;
        maxWeight = 9000.0;
        minWeight = 1500.0;

    }
    public void myaw(){
        weight = weight - 1;
        System.out.println ("myaw");
    }
    public void feed(double amount){
        weight = weight +amount;

    }
    public double getWeight (){
        return weight;
    }
    public  void drink(double amount){
        weight=weight + amount;
    }

    public double differentWeight (){
        weight = Math.abs( originWeight - weight);
        return weight;
    }
    public  String getStatus(){
        if (weight<minWeight)
            return  "dead";
        else if (weight>maxWeight)
            return "exploded";
        else if (weight>originWeight)
            return "sleeping";
        else return "game";
    }
}
