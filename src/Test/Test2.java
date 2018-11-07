package Test;
import java.util.Scanner;
/**
*@Date 2018/7/18  14:03
**/
public class Test2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入4位会员卡号：");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int qianwei=num/1000;
        int baiwei=num/100%10;
        int shiwei=num/10%10;
        int gewei=num%10;
        int sum=qianwei+shiwei+baiwei+gewei;
        System.out.println("会员卡号是："+num);
        System.out.println("千位数："+qianwei+",\t百位数："+baiwei+",\t十位数："+shiwei+",\t个位数"+gewei);
        System.out.println("会员卡号:"+num+ "\t各位之和："+sum);

    }

}