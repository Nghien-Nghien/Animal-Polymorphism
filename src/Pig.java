class Pig extends Animal {

    public Pig(String type, String name, float weight, String color, float price) {
        super(type, name, weight, color, price);
    }

    @Override
    public void AnimalSound() {
        animalsound = "wee wee";
        super.AnimalSound();
    }

}


