package Test;

/**
 * @Date 2018/7/21  10:01
 **/
public class l1 {
    public static void main(String[] args) {
        fuction();
        int count = 0;
        System.out.println("N" + "\t"+"10*N" + "\t"+"100*N" + "\t"+"1000*N");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 5; j++) {
                count++;
                if (i == 0) {
                //     System.out.println();
                    System.out.print((int) Math.pow(10, j - 1)+"\t");
                } else{
                    System.out.print(((int) Math.pow(10, j - 1) * i) +"\t") ;
                }
            }if(count%4==0)
                System.out.println("\n");

            }
        System.out.println();
    }
    public static void fuction(){
        System.out.println("N" + "\t"+"10*N" + "\t"+"100*N" + "\t"+"1000*N");
        for(int i=1;i<=5;i++){
            System.out.println(i+"\t"+i+"0"+"\t"+i+"00"+"\t"+i+"000");
        }

    }
}
