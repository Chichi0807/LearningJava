// package whatever; // don't place package name!

import java.io.*;
import java.util.Scanner;
import java.net.ServerSocket;
import java.net.Socket;

class BingoServer 
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
        
        
        table[0] = new int[] {  6,  8,  14,  12,  23};
        table[1] = new int[] {  16,  5,  1,  11, 4};
        table[2] = new int[] { 18, 9, 7, 17, 19};
        table[3] = new int[] { 15, 3, 24, 21, 20};
        table[4] = new int[] { 10, 13, 2, 22, 25};
        
        
        System.out.println("Game started!");
        try
        {
            ServerSocket svs = new ServerSocket(5050);
            System.out.println("waiting for client");
 
            Socket sk = svs.accept();
            System.out.println("Clinet connected");
            
           
            
 
            while(sk.isConnected())
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                String msg = br.readLine();
                int received = Integer.parseInt(msg);
                
                
                // System.out.println(msg);
                cross(table, received);
                display(table);
                if (isBingo(table))
                {
                    System.out.println("You win!");
                    break;
                }

                int sent = scanner.nextInt();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
                bw.write(String.format("%d\n", sent));
                bw.flush();
                cross(table, sent);
                display(table);
                if (isBingo(table))
                {
                    System.out.println("You win!");
                    break;
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
	}
}