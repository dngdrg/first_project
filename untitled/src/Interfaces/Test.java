package Interfaces;

public class Test {

    public static void main(String[] args) {

        Info animalTest = new Animal(5);
        Info personTest = new Person("Helga");
        animalTest.showInfo();
        personTest.showInfo();

    }

}
