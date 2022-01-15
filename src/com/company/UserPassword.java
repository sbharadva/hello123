package com.company;
public class UserPassword {

    public static void main(String args[])
    {
        String username = (args[0]);
        int password=Integer.parseInt(args[1]);
        System.out.println(username);
        System.out.println(password);
        if(username.equals("Surabhi") && password == 12345)
        {
            System.out.println("Login Succesfully...");
        }
        else
        {
            System.out.println("Login Failed...");
        }

    }

}
