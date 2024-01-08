public class Main {
    public static void main(String[] args) {
        Ant ant1 = new Ant(10, "Ant 1");
        Ant ant2 = new Ant(15, "Ant 2");
        Ant ant3 = new Ant(20, "Ant 3");
        Ant ant4 = new Ant(25, "Ant 4");

        AntHill antHill = new AntHill();

        antHill.tilføjAnt(ant1);
        antHill.tilføjAnt(ant2);
        antHill.tilføjAnt(ant3);
        antHill.tilføjAnt(ant4);


        System.out.println("Fastest ant is: " + antHill.fastestAnt());

    }
}
