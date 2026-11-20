public class App1 {
    public static void main(String[] args) throws Exception{
            Power p1 = new Power("flight", 90);
            Power p2 = new Power("x-ray vision", 40);
            Power p3 = new Power("speed", 10);

            Superhero s1 = new Superhero("Jacob Uy", p2);
            Superhero s2 = new Superhero("kamran", p2);
            Superhero s3 = new Superhero("Ryan", p3);

            System.out.println(Superhero.getnumSuperheroes());
 

        Propulsion p1 = new Propulsion("Ion Drive", "electric", 70);
        Propulsion p2 = new Propulsion("Warp Core", "antimatter", 100);

        Spaceship s1 = new Spaceship("Enterprise", p2);
        Spaceship s2 = new Spaceship("Voyager", p1);

        System.out.println(s1.getName() + " uses " + s1.getPropulsion().getName());
    }
}
