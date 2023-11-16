package com.laca.entity.Routes.ConcretePrototype;

public class StartPoint {
    private  String nameStartPoint;
    private  String descriptionStartPoint;
    private Coordinates_Point coordinatesStartPoint;

    public StartPoint() {
    }

    public StartPoint(String nameStartPoint, String descriptionStartPoint, Coordinates_Point coordinatesStartPoint) {
        this.nameStartPoint = nameStartPoint;
        this.descriptionStartPoint = descriptionStartPoint;
        this.coordinatesStartPoint = coordinatesStartPoint;
    }

    public String getNameStartPoint() {
        return nameStartPoint;
    }

    public void setNameStartPoint(String nameStartPoint) {
        this.nameStartPoint = nameStartPoint;
    }

    public String getDescriptionStartPoint() {
        return descriptionStartPoint;
    }

    public void setDescriptionStartPoint(String descriptionStartPoint) {
        this.descriptionStartPoint = descriptionStartPoint;
    }

    public Coordinates_Point getCoordinatesStartPoint() {
        return coordinatesStartPoint;
    }

    public void setCoordinatesStartPoint(Coordinates_Point coordinatesStartPoint) {
        this.coordinatesStartPoint = coordinatesStartPoint;
    }

    @Override
    public String toString() {
        return "StartPoint{" +
                "nameStartPoint='" + nameStartPoint + '\'' +
                ", descriptionStartPoint='" + descriptionStartPoint + '\'' +
                ", coordinatesStartPoint=" + coordinatesStartPoint +
                '}';
    }
}

