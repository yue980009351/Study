package Test;
import java.util.Scanner;
/**
*@Date 2018/7/18  16:18
 * 1.利用for循环打印如下格式的程序
 * 1
 * 22
 * 333
 * 4444
 * 55555
**/
public class Print1 {
    public static void main(String[] args) {
      for (int i=1;i<=5;i++)
      {
          for(int j=0;j<i;j++)
          {
              System.out.print(i);
          }
          System.out.println("");
      }

    }
}