package com.codewithharry;
import  java.net.*;
import java.io.*;

public class reverseEcoServer {
    public static void main(String args[]) throws Exception{
        ServerSocket ss= new ServerSocket(2000);
        Socket stk=ss.accept();
        BufferedReader br= new BufferedReader(new InputStreamReader((stk.getInputStream())));
        PrintStream ps= new PrintStream((stk.getOutputStream()));

        String msg;
        StringBuilder sb;
        do {
            msg=br.readLine();
             sb= new StringBuilder(msg);
            sb.reverse();
            msg= sb.toString();
            ps.println(msg);
        }while (msg.equals("dne"));

    }

}

class client{
    public static void main(String args[]) throws Exception{
        Socket stk= new Socket(" 172.25.172.63",2000);
        BufferedReader Keyb=new BufferedReader(new InputStreamReader((System.in)));
        BufferedReader br= new BufferedReader(new InputStreamReader((stk.getInputStream())));
        PrintStream ps= new PrintStream((stk.getOutputStream()));

        String msg;

        do {
            msg=br.readLine();

            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server"+msg);
        }while (msg.equals("dne"));

        stk.close();

    }

}

