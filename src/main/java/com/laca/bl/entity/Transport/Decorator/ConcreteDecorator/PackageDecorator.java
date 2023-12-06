package com.laca.bl.entity.Transport.Decorator.ConcreteDecorator;

import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;
import com.laca.bl.entity.Transport.Decorator.abstractDecorator.AbstractDecorator;

public class PackageDecorator extends AbstractDecorator {
  private Package packagedItem;

  public PackageDecorator(TransportUnit wrappee, Package packagedItem) {
    super(wrappee);
    this.packagedItem = packagedItem;
  }

  @Override
  public void deliver() {
    // Implementation for deliver method
  }

  @Override
  public void assignRoute() {
    // Implementation for assignRoute method
  }


  @Override
  public void loadPackage() {

  }

  public String getPackageInfo() {
    return "Package: " + packagedItem.toString();
  }
  public String getTransportInfo() {
    return super.toString();
  }

}

