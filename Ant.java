
public class Ant {
    private double topSpeed;
    private String name;

    public Ant(double topSpeed, String name){
        this.topSpeed = topSpeed;
        this.name = name;
    }
    public double getTopSpeed(){
        return topSpeed;
    }
    public String toString(){
        return name + " " + topSpeed +"km/t";
    }
}
