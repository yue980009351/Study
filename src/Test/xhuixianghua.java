package Test;

/**
 * @Date 2018/7/18  19:24
 **/
public class xhuixianghua {
    public static void main(String[] args) {
        System.out.println("100-1000中的水仙花数有：");
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //水仙花数判断要求
            if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                System.out.println(i);
            }
        }


    }


}