package Test;
import java.util.Scanner;
/**
*@Date 2018/7/18  17:48
**/
public class Print3 {
    public static void main(String[] args) {
        int x;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        x = s.nextInt();
        //首先判断是否>=90;其次判断是否>=60;最后剩余的都是<60
        grade = x >= 90?'A':x>=60?'B':'C';
        System.out.println("等级为："+grade);
    }
}

