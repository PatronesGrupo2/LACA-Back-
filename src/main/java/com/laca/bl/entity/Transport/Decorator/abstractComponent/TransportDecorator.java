package com.laca.bl.entity.Transport.Decorator.abstractComponent;

import Transport.Creator.AbstractProduct.TransportUnit;

public interface TransportDecorator extends TransportUnit {

    void loadPackage();

    String getPackageInfo();

    String getTransportInfo();


}
