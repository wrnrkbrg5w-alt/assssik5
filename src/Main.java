public class Main {
    public static void main(String[] args) {

        Navigator navigator = new Navigator(new CarStrategy());

        System.out.println("--- Trip to Work ---");
        navigator.calculateRoute("Home", "Office");

        System.out.println("\n--- Weekend Park Visit ---");
        navigator.setRouteStrategy(new WalkStrategy());
        navigator.calculateRoute("Home", "Central Park");

        System.out.println("\n--- Evening Workout ---");
        navigator.setRouteStrategy(new CycleStrategy());
        navigator.calculateRoute("Central Park", "Gym");
    }
}