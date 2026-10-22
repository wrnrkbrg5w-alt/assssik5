public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        setRouteStrategy(routeStrategy);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        if (routeStrategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null.");
        }
        this.routeStrategy = routeStrategy;
    }

    public void calculateRoute(String startPoint, String endPoint) {
        if (startPoint == null || startPoint.isBlank() || endPoint == null || endPoint.isBlank()) {
            throw new IllegalArgumentException("Start and end points must be valid.");
        }

        String result = routeStrategy.buildRoute(startPoint, endPoint);
        System.out.println(result);
    }
}