package com.laca.bl.entity.Transport.Decorator.abstractDecorator;

import Transport.Creator.AbstractProduct.TransportUnit;
import Transport.Decorator.abstractComponent.TransportDecorator;

public abstract class AbstractDecorator implements TransportDecorator {
    private TransportUnit wrappee;

    public AbstractDecorator(TransportUnit wrappee) {
        this.wrappee = wrappee;
    }

    public String getPlate() {
        return null;
    }

    @Override
    public String toString() {
        return wrappee.toString();
    }
}
