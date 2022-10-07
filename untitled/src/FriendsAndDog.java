public class FriendsAndDog {

    public static void main(String[] args) {

        int count = 0;
        int distance = 10000;
        int firstFriendSpeed = 1;
        int secondFriendSpeed = 2;
        int dogSpeed = 5;
        int friend = 2;
        int time = 0;

        while (distance > 10) {
            if (friend == 1) {
                time = distance / (dogSpeed + firstFriendSpeed);
                friend = 2;
            } else {
                time = distance / (dogSpeed + secondFriendSpeed);
                friend = 1;
            }
            distance = distance - (firstFriendSpeed + secondFriendSpeed) * time;
            count++;
        }
        System.out.println("The dog will run " + count + " times.");

    }

}
