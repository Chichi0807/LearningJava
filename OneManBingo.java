// package whatever; // don't place package name!

import java.io.*;
import java.util.Scanner;

class OneManBingo 
{
    public static void display(int[][] t)
    {
        for (int i = 0; i < 5; i+=1)
        {
            for (int j = 0; j < 5; j+= 1)
            {
                if (t[i][j] == 0)
                {
                    System.out.print("  X|");
                }
                else
                {
                    String formated = String.format(" %2d|", t[i][j]);
                    System.out.print(formated);
                }
            }
            System.out.println("");
        }
    }
    
    public static void cross(int[][] t, int target)
    {
        for (int i = 0; i < 5; i += 1)
        {
            for (int j = 0; j < 5; j += 1)
            {
                if (t[i][j] == target)
                {
                    t[i][j] = 0;
                }
            }
        }
    }
    
    public static boolean isBingo(int[][] t)
    {
        int count = 0;
    
    
        if (t[0][0] == 0 && t[1][1] == 0 && t[2][2] == 0 && t[3][3] == 0 && t[4][4] == 0)
        {
            count += 1;
        }
        
        if (t[0][4] == 0 && t[1][3] == 0 && t[2][2] == 0 && t[3][1] == 0 && t[4][0] == 0)
        {
            count += 1;
        }
        
        //Chi Chi
        
        if (t[0][0] == 0 && t[1][0] == 0 && t[2][0] == 0 && t[3][0] == 0 && t[4][0] == 0)
        {
            count += 1;
        }
        
        if (t[0][1] == 0 && t[1][1] == 0 && t[2][1] == 0 && t[3][1] == 0 && t[4][1] == 0)
        {
            count += 1;
        }
        
        if (t[0][2] == 0 && t[1][2] == 0 && t[2][2] == 0 && t[3][2] == 0 && t[4][2] == 0)
        {
            count += 1;
        }
        
        if (t[0][3] == 0 && t[1][3] == 0 && t[2][3] == 0 && t[3][3] == 0 && t[4][3] == 0)
        {
            count += 1;
        }
        
        if (t[0][4] == 0 && t[1][4] == 0 && t[2][4] == 0 && t[3][4] == 0 && t[4][4] == 0)
        {
            count += 1;
        }
        
        //Xhane
        
        if (t[0][0] == 0 && t[0][1] == 0 && t[0][2] == 0 && t[0][3] == 0 && t[0][4] == 0)
        {
            count += 1;
        }
        
        if (t[1][0] == 0 && t[1][1] == 0 && t[1][2] == 0 && t[1][3] == 0 && t[1][4] == 0)
        {
            count += 1;
        }
        
        if (t[2][0] == 0 && t[2][1] == 0 && t[2][2] == 0 && t[2][3] == 0 && t[2][4] == 0)
        {
            count += 1;
        }
        
        if (t[3][0] == 0 && t[3][1] == 0 && t[3][2] == 0 && t[3][3] == 0 && t[3][4] == 0)
        {
            count += 1;
        }
        
        if (t[4][0] == 0 && t[4][1] == 0 && t[4][2] == 0 && t[4][3] == 0 && t[4][4] == 0)
        {
            count += 1;
        }
        
        
        if (count >= 5)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
	public static void main (String[] args) 
    {
        int[][] table = new int[5][];
        Scanner scanner = new Scanner(System.in);
        
        
        table[0] = new int[] {  1,  2,  3,  4,  5};
        table[1] = new int[] {  6,  7,  8,  9, 10};
        table[2] = new int[] { 11, 12, 13, 14, 15};
        table[3] = new int[] { 16, 17, 18, 19, 20};
        table[4] = new int[] { 21, 22, 23, 24, 25};
        
        
        System.out.println("Game started!");
        while (true)
        {
            int num = scanner.nextInt();

            if (num < 1 || num > 25)
            {
                System.out.println("No, you must type in a number between 1 and 25");
                continue;
            }
            
            cross(table, num);
            
            display(table);
            
            if (isBingo(table))
            {
                System.out.println("Bingo!");
                break;
            }
        }
        
	}
}