package com.laca.controller;
import com.laca.bl.entity.Routes.ConcretePrototype.Route;
import com.laca.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/routes")
@CrossOrigin(origins = "http://localhost:4200/")
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public List<Route> getAllRoutes() {
        List<Route> routes = routeService.getAllRoutes();
        return routes;
    }

    @PostMapping
    public Route saveRoute(@RequestBody Route route) {
        return routeService.saveRoute(route);
    }

    @PutMapping("/{routeId}")
    public ResponseEntity<?> updateRoute(
            @PathVariable int routeID,
            @RequestBody Route updatedRoute) {
        try {
            Route updated = routeService.updateRoute(routeID, updatedRoute);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating route: " + e.getMessage());
        }
    }

    @GetMapping("/{routeId}")
    public ResponseEntity<?> getRouteById(@PathVariable int routeID) {
        try {
            Route route = routeService.getRouteById(routeID);
            return ResponseEntity.ok(route);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Transporter not found: " + e.getMessage());
        }
    }

    @DeleteMapping("/{routeId}")
    public ResponseEntity<?> deleteRoute(@PathVariable int routeID) {
        try {
            boolean isDeleted = routeService.deleteRoute(routeID);
            Route route= new Route();
            route.setId(routeID);
            if (isDeleted) {
                return ResponseEntity.ok(route);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(routeID);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error deleting route: " + e.getMessage());
        }

    }
}