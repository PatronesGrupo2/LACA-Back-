package com.laca.bl.entity.Package.command.concreteCommand;

import com.laca.bl.entity.Package.classes.Package;
import com.laca.bl.entity.Routes.ConcretePrototype.Route;
import com.laca.bl.entity.Package.command.abstractCommand.Command;



public class AsignacionProductoCommand implements Command {
    private Route route;
    private Package aPackage;

    public AsignacionProductoCommand(Route route,Package aPackage) {
        this.route = route;
        this.aPackage = aPackage;
    }

    @Override
    public void execute() {
        this.route.addPackage(this.aPackage);
    }
}