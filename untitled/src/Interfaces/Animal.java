package Interfaces;

public class Animal implements Info {

    public int id;

    public void sleep(){
        System.out.println("I'm sleeping");
    }

    public Animal(int id){
        this.id = id;
    }

    public void showInfo() {
        System.out.println("ID is: " + this.id);
    }

}
