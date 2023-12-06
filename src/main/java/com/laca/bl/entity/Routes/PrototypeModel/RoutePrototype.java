package com.laca.bl.entity.Routes.PrototypeModel;

import com.laca.bl.entity.Routes.ConcretePrototype.ArrivalPoint;
import com.laca.bl.entity.Routes.ConcretePrototype.StartPoint;

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
