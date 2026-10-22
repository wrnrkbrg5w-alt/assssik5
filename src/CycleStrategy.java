public class CycleStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Cycling route from " + startPoint + " to " + endPoint + " (Follows bike lanes).";
    }
}