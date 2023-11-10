package Entities.Routes.RouteFactory;

import Entities.Routes.PrototypeModel.RoutePrototype;

import java.util.HashMap;
import java.util.Map;
public class RouteFactory {
    private Map<String, RoutePrototype> prototypes = new HashMap<>();

    public void addPrototype(String key, RoutePrototype prototype){
        prototypes.put(key, prototype);
    }
    public RoutePrototype createRoute(String key){
        return prototypes.get(key).clone();
    }
}
