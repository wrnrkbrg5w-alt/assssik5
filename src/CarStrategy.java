public class CarStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Driving route from " + startPoint + " to " + endPoint + " (Fastest, avoids traffic).";
    }
}