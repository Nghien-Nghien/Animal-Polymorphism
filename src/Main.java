public class Main {

    public static void main(String[] args) {
        Animal pig0 = new Pig ("Pig mini", "Elizabeth", 5.4f,"white pink",15500500);
        pig0.printInformationMethod();
        pig0.AnimalSound();

        Animal dog0= new Dog ("Golden", "Napoleon", 14.9f, "yellow", 23900999);
        dog0.printInformationMethod();
        dog0.AnimalSound();
    }

}

