package Test;

/**
 * @Date 2018/7/18  17:01
 * 2.编写程序，使运行后在屏幕上生成如下的图案。
 * *
 * * * *
 * * * * * *
 * * * * * * * *
 * * * * * * * * * *
 **/
public class Print2 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = row - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*for (int i = 1; i < row; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }
            for (int k = 2 * (row - i); k > 1; k--) {

                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
