public class Precedence {

    public static void main(String[] args) {

        int sum = 32 - 8 + 16 * 2 ;
        System.out.println("Default procedure: " + sum);

        sum = ( 32 - (8 + 16) ) * 2 ;
        System.out.println( "Default procedure: " + sum ) ;

    }

}
