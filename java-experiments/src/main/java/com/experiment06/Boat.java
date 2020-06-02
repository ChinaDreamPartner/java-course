package com.experiment06;
import java.util.Scanner;

class DangerException extends Exception
{
    //start
    private final String s="超重";
    public String toString()
    {
        return this.s;
    }
    //end
}

class CargoBoat
{
    int realContent;  //装载的重量
    int maxContent;   //最大装载量
    public void setMaxContent(int c)
    {
        maxContent = c;
    }
    public void loading(int m) throws DangerException
    {
        //start
        if(realContent+m>maxContent) throw new DangerException();
        realContent+=m;
        System.out.println("目前装载了"+realContent+"吨货物");
        //end
    }
}

public class Boat
{
    public static void main(String args[])
    {
        CargoBoat ship = new CargoBoat();
        Scanner in=new Scanner(System.in);
        ship.setMaxContent(1000);
        int m=0;
        try
        {
            //start
            for(;;)
            {
                m=in.nextInt();
                ship.loading(m);
            }
            //end
        }catch(DangerException e)
        {
            //start
            System.out.println(e);
            System.out.println("无法再装载重量是"+m+"吨的集装箱");
            //end
        }finally
        {
            System.out.printf("货船将正点启航");
        }
    }
}
