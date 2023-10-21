package Entities.Package;

public class Package {
    private String type;
    private double weight;
    private String name;
    private String description;
    private double price; //DOLLARS
    private double size;
    private double height; //Forma parte de size
    private double width;  //Forma parte de size

    public Package() {
    }

    public Package(String type, double weight, String name, String description, double price, double size) {
        this.type = type;
        this.weight = weight;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = height * width;
    }
}
