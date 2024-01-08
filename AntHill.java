import java.util.ArrayList;

public class AntHill {
    private final ArrayList<Ant> antObjects;

    public AntHill(){
        this.antObjects = new ArrayList<>();

    }
    public void tilføjAnt(Ant ant){
        antObjects.add(ant);

    }

    public Ant fastestAnt(){
        Ant fastestAnt = antObjects.get(0);

        for (Ant ant: antObjects){
            if (ant.getTopSpeed() > fastestAnt.getTopSpeed()){
                fastestAnt = ant;
            }
        }
        return fastestAnt;
    }
}
