package Test;
/**
*@Date 2018/7/28  21:38
**/
public class Student {
    public static void main(String[] args) {
        int[][]arr={{75,80,85},{82,84,86},{80,75,90}};
        for(int i=0;i<arr.length;i+=2){
            System.out.println("这是第"+(i+1)+"学生的成绩");
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+"\t");
            }
        }
        System.out.println("这是第2学生的成绩");
        for(int j=0;j<arr.length;j++){
            arr[1][j]+=5;
            System.out.println(arr[1][j]);
        }
    }
}




