class Dog extends Animal {

    public Dog(String type, String name, float weight, String color, float price) {
        super(type, name, weight, color, price);
    }

    @Override
    public void AnimalSound() {
        animalsound = "goo goo";
        super.AnimalSound();
    }

}
