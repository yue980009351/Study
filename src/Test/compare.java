package Test;
/**
 *@Date 2018/7/18  19:39
 **/
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入第一个数 ： ");
        int x = sc.nextInt() ;
        System.out.println("请输入第二个数 ： ");
        int y = sc.nextInt() ;
        System.out.println("请输入第三个数 ： ");
        int z = sc.nextInt() ;
        //x先与y比较
        if(x < y){
            x = x ^ y ;
            y = x ^ y ;
           x = x ^ y ;
        }
        //x再与z比较
        if(x < z){
            x = x ^ z ;
            z = x ^ z ;
            x = x ^ z ;
        }
        //y先与z比较
        if(y < z){
            y = y ^ z ;
            z = y ^ z ;
            y = y ^ z ;
        }
        System.out.println(x + " : " + y + " : " + z);
        sc.close();
    }
 }