public class WalkStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Walking route from " + startPoint + " to " + endPoint + " (Shortest path, pedestrian friendly).";
    }
}