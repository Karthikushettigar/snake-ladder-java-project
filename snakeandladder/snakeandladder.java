package snakeandladder;
import java.util.*;
import java.util.Random;
import java.lang.Math;
public class snakeandladder
{
    public static int dice()
    {
        while(true)
        {
            int x= (int)(Math.random()*10)+1;
            if(x>=1 && x<=6)
                return x;
        }
    }
   
    public static int snakelad(int x,int ps)
    {
        switch(x+ps)
        {
            case 7: return 21;
            case 18: return 34;
            case 38: return 68;
            case 58: return 88;
            case 72: return 96;
            case 23: return 3;
            case 37: return 17;
            case 55: return 25;
            case 70: return 19;
            case 98: return 8;
            default: return x+ps;
        }
    }
public static void main(String[] args) {
   int p1s=0;
   int p2s=0;
   int score;
   Scanner sc= new Scanner(System.in);
   while(true)
   {
       System.out.print("Enter the player number:");
       int p= sc.nextInt();
       if(p==1)
       {
           int x=dice();
           System.out.println("Dice shows "+x);
           int s=snakelad(x,p1s);
           if(s<=100)
          {
              p1s=s;
          }
          System.out.println("Player 1 score is :"+p1s);
       }
       else
       {
           int x=dice();
           System.out.println("Dice shows "+x);
           int s=snakelad(x,p2s);
           if(s<=100)
          {
              p2s=s;
          }
          System.out.println("Player 2 score is :"+p2s);
       }
       if(p1s==100){
           System.out.println("PLAYER 1 HAS WON!!");
           System.exit(0);
       }
       if(p2s==100){
           System.out.println("PLAYER 2 HAS WON!!");
           System.exit(0);
       }
   }
   
}
}