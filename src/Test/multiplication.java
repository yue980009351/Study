package Test;

/**
*@Date 2018/7/18  17:55
**/
public class multiplication {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

}