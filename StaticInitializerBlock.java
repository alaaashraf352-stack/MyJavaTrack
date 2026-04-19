package HackerRank;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag =true;

    static{
        Scanner input =new Scanner(System.in);
        B=input.nextInt();
        H=input.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
        input.close();
    }

    public static void main(String[] args) {
        if (flag){
           int area=B*H;
            System.out.println(area);
        }
    }

}
