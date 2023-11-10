package Entities.Routes.ConcretePrototype;

import Entities.Routes.PrototypeModel.RoutePrototype;

public class Route implements RoutePrototype{
    private String type;
    private String name;
    private String description;
    private  StartPoint startPoint;
    private ArrivalPoint arrivalPoint;

    public Route(String type, String name, String description,
                 StartPoint startPoint, ArrivalPoint arrivalPoint) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.startPoint = startPoint;
        this.arrivalPoint = arrivalPoint;
    }

    @Override
    public RoutePrototype clone(){
        return (RoutePrototype) new Route(this.type, this.name,
                this.description, this.startPoint, this.arrivalPoint);
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
}
