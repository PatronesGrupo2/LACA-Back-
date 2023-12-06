package com.laca.bl.entity.Transport.Decorator.abstractComponent;

import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;

public interface TransportDecorator extends TransportUnit {

    void loadPackage();

    String getPackageInfo();

    String getTransportInfo();


}
