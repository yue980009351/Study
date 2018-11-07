package Test;

/**
 * @Date 2018/7/21  10:31
 **/
public class l11 {
    public static void main(String[] args) {
        System.out.println("N" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N");

        for (int i = 1; i <= 5; i++) {

            int sum = 1;

            for (int j = 0; j <= 3; j++) {

                sum *= 10;

                System.out.print(i * sum + "\t");
            }
            System.out.println();
        }
    }
}