package com.laca.entity.Routes.PrototypeModel;

import entity.Routes.ConcretePrototype.ArrivalPoint;
import entity.Routes.ConcretePrototype.StartPoint;

public interface RoutePrototype {
    RoutePrototype clone();
        void setType (String type);
        String getType();
        void setName (String name);
        String getName();
        void setDescription (String description);
        String getDescription();
        /**Duda: si se puede utilizar las clases de tipo
        StartPoint, ArrivalPoint.**/
        void setStartPoint (StartPoint startPoint);
        StartPoint getStartPoint();
        void setArrivalPoint (ArrivalPoint arrivalPoint);
        ArrivalPoint getArrivalPoint();

}
