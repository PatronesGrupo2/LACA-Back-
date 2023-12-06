package com.laca.controller;

import com.laca.entity.Transport.ConcreteProduct.MotorcycleUnit;
import com.laca.service.MotorcycleUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorcycle-units")
@CrossOrigin(origins = "http://localhost:4200/")
public class MotorcycleUnitController {

    private final MotorcycleUnitService motorcycleUnitService;

    @Autowired
    public MotorcycleUnitController(MotorcycleUnitService motorcycleUnitService) {
        this.motorcycleUnitService = motorcycleUnitService;
    }

    @GetMapping
    public List<MotorcycleUnit> getAllMotorcycleUnits() {
        List<MotorcycleUnit> motorcycleUnits = motorcycleUnitService.getAllMotorcycleUnits();
        return motorcycleUnits;
    }

    @PostMapping
    public MotorcycleUnit saveMotorcycleUnit(@RequestBody MotorcycleUnit motorcycleUnit) {
        return motorcycleUnitService.saveMotorcycleUnit(motorcycleUnit);
    }

    @PutMapping("/{motorcycleUnitId}")
    public ResponseEntity<?> updateMotorcycleUnit(
            @PathVariable Long motorcycleUnitId,
            @RequestBody MotorcycleUnit updatedMotorcycleUnit) {
        try {
            MotorcycleUnit updated = motorcycleUnitService.updateMotorcycleUnit(motorcycleUnitId, updatedMotorcycleUnit);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating motorcycle unit: " + e.getMessage());
        }
    }

    @GetMapping("/{motorcycleUnitId}")
    public ResponseEntity<?> getMotorcycleUnitById(@PathVariable Long motorcycleUnitId) {
        try {
            MotorcycleUnit motorcycleUnit = motorcycleUnitService.getMotorcycleUnitById(motorcycleUnitId);
            return ResponseEntity.ok(motorcycleUnit);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Motorcycle unit not found: " + e.getMessage());
        }
    }

    @DeleteMapping("/{motorcycleUnitId}")
    public ResponseEntity<?> deleteMotorcycleUnit(@PathVariable Long motorcycleUnitId) {
        try {
            boolean isDeleted = motorcycleUnitService.deleteMotorcycleUnit(motorcycleUnitId);
            MotorcycleUnit motorcycleUnit = new MotorcycleUnit();
            motorcycleUnit.setId(motorcycleUnitId);
            if (isDeleted) {
                return ResponseEntity.ok(motorcycleUnit);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(motorcycleUnitId);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error deleting motorcycle unit: " + e.getMessage());
        }
    }
}
