import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WalkStrategyTest {

    @Test
    void buildRouteReturnsWalkingRouteDescription() {
        WalkStrategy strategy = new WalkStrategy();

        String route = strategy.buildRoute("Home", "Park");

        assertEquals("Walking route from Home to Park (Shortest path, pedestrian friendly).", route);
    }
}