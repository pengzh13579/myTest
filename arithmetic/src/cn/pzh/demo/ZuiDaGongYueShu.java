package cn.pzh.demo;

import java.util.Scanner;

/**
 * Created by PENGZH on 16/10/12.
 */
public class ZuiDaGongYueShu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            int numFirst = scan.nextInt();
            int numSecond = scan.nextInt();
            int temp = 0;
            while(numFirst != 0 && numSecond != 0){
                temp = numFirst % numSecond;
                numFirst = numSecond;
                numSecond = temp;
            }
            System.out.print(numFirst + "与" + numSecond + "最大公约数是:" + numFirst);
        }catch(Exception e ){
            System.out.print("输入不合法！");
        }
    }
}
