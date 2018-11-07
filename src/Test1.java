public class Test1 {
     public static void main(String[] args) {
        int x=0,y=1;
        if(++x==y--&&x++==1||--y==0)
            System.out.println("x="+x+",y="+y);
        else{
            System.out.println("y="+y+",x="+x);
        }
    }
}
