public class Praktikum {

    public static void main(String[] args) {

        Cat cat = new Cat();

    }

    static class Cat{
        private int age;
        private String name;

        public static String description = "!";
        public static int count1;
        public static int count2;

        public Cat() {
            this.name = "Default name";
            this.age = 10;
            count1++;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            count2++;
        }

        public void setName(String name){
            if (name.isEmpty()){
                System.out.println("Name can't be empty.");
            } else {
                this.name = name;
            }
        }

        public String getName(){
            return name;
        }

        public void setAge(int age){
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Too young");
            }
        }

        public int getAge(){
            return age;
        }
        public void countOfCatsWithDefName(){
            System.out.println("countOfCatsWithDefName: " + count1);
        }
        public void countOfCatsWithName(){
            System.out.println("countOfCatsWithName: " + count2);
        }
    }

}