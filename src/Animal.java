public class Animal {

    protected String type;
    protected String name;
    protected float weight;
    protected String color;
    protected float price;
    public String animalsound;

    public Animal() {
    }

    public Animal(String type, String name, float weight, String color, float price) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public void AnimalSound() {
        System.out.println("the " + type + " say: " + animalsound);
    }

    public void printInformationMethod() {
        String formattedPrice = String.format("%.02f", price);
        System.out.println("Name: " + name + " " + "|" + " " + "Color: " + color + " " + "|" + " " + "Weight: " + weight + " " + "|" + " " + "==> " + "Price: " + formattedPrice + " VND");
    }

}
