package com.laca.bl.entity.Routes.ConcretePrototype;

import com.laca.bl.entity.Package.classes.Package;
import com.laca.bl.entity.Routes.PrototypeModel.RoutePrototype;

public class Route implements RoutePrototype{
    private int id;
    private String type;
    private String name;
    private String description;
    private  StartPoint startPoint;
    private ArrivalPoint arrivalPoint;
    private Package aPackage;

    public Route(int id, String type, String name, String description,
                 StartPoint startPoint, ArrivalPoint arrivalPoint) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.startPoint = startPoint;
        this.arrivalPoint = arrivalPoint;
    }

    public Route() {

    }

    @Override
    public RoutePrototype clone(){
        return (RoutePrototype) new Route(this.id, this.type, this.name,
                this.description, this.startPoint, this.arrivalPoint);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setType (String type){
        this.type = type;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public void setName (String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setDescription (String description) {
        this.description = description;
    }

    @Override
    public String getDescription(){
        return description;
    }

    /**Duda: si se puede utilizar las clases de tipo
     StartPoint, ArrivalPoint.**/
    @Override
    public void setStartPoint (StartPoint startPoint){
        this.startPoint = startPoint;
    }

    @Override
    public StartPoint getStartPoint() {
        return startPoint;
    }

    @Override
    public void setArrivalPoint (ArrivalPoint arrivalPoint){
        this.arrivalPoint = arrivalPoint;
    }

    @Override
    public ArrivalPoint getArrivalPoint() {
        return arrivalPoint;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public String toString() {
        return "Route{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startPoint=" + startPoint +
                ", arrivalPoint=" + arrivalPoint +
                '}';
    }

    public void addPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
