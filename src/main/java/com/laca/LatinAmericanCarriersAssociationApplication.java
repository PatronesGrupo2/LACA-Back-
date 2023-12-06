package com.laca;

import com.laca.bl.entity.Package.InputProcessor;
import com.laca.bl.entity.Package.builder.PackageBuilder;
import com.laca.bl.entity.Package.classes.Package;
import com.laca.bl.entity.Package.instanceEnum.PackageType;
import com.laca.bl.entity.Transport.AbstractCreator.TransportCreator;
import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;
import com.laca.bl.entity.Transport.ConcreteCreator.MotorcycleCreator;
import com.laca.bl.entity.Transport.ConcreteCreator.OnFootCreator;
import com.laca.bl.entity.Transport.ConcreteCreator.PickUpTruckCreator;
import com.laca.bl.entity.Transport.ConcreteCreator.TruckCreator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;
import com.laca.bl.entity.Package.director.Director;

import java.util.Scanner;

@SpringBootApplication
@EntityScan(basePackages = {"domain"} )
public class LatinAmericanCarriersAssociationApplication {

	public static <TransportMethodSelector> void main(String[] args) {

		// Factory-Transport
		TransportCreator motorcycleCreator = new MotorcycleCreator();
		TransportUnit motorcycle = motorcycleCreator.createTransport(20.5, "Ferrari", "454ADR", 4.3, 3.1, 500.25);
		System.out.println("\n* Transports:\n" + motorcycle.toString());

		TransportCreator onFootCreator = new OnFootCreator();
		TransportUnit onfoot = onFootCreator.createTransport(50.5, "Indio", "None", 1.80, 50, 50);
		System.out.println(onfoot.toString());

		TransportCreator pickUpCreator = new PickUpTruckCreator();
		TransportUnit pickUp = pickUpCreator.createTransport(50.6, "Toyota", "EFG84T", 8.2, 5.4, 1500.50);
		System.out.println(pickUp.toString());

		TransportCreator truckCreator = new TruckCreator();
		TransportUnit truck = truckCreator.createTransport(100.2, "Volvo", "ERF988", 10.2, 5.8, 2500.25);
		System.out.println(truck.toString());

		// Builder-Package
		Scanner input = new Scanner(System.in);

		PackageBuilder builder = new PackageBuilder();

		System.out.println("Choose a package type:");
		int option = displayPackageTypesAndGetOption(input);

		if (option >= 1 && option <= PackageType.values().length) {
			InputProcessor inputProcessor = new InputProcessor();
			Package newPackage = inputProcessor.processPackageInput(builder, option);
			if (newPackage != null) {
				System.out.println("\nPackage built:\n" + newPackage);
			}

			// After creating a newPackage
			// Transport method selection
			TransportMethodSelector transportMethodSelector = new TransportMethodSelector();
			TransportUnit chosenTransport = transportMethodSelector.chooseTransportMethod(input);


			// Decorate the transport with the package
			PackageDecorator decoratedTransport = new PackageDecorator(chosenTransport, newPackage);
			// Print the decorated transport information
			System.out.println("\nDecorated Transport:\n" + decoratedTransport.getTransportInfo());

		} else {
			System.out.println("Invalid option. Please enter a valid number.");
		}

		input.close();
	}

	private static TransportUnit chooseTransportMethod(Scanner input) {
		return null;
	}


	// Helper method to display package types and get user input
	private static int displayPackageTypesAndGetOption(Scanner input) {
		int index = 1;
		for (PackageType packageType : PackageType.values()) {
			System.out.println(index + ". " + packageType);
			index++;
		}

		System.out.print("Enter the number of the package type: ");
		return input.nextInt();
	}
}

