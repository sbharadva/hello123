package com.company;

import java.util.Locale;
public class TestCommandLine4 {
    public static void main(String args[]) {

        if (args[0].equals("1")) {
           // obj.add(args);

            double sum=0;
            double num1 = 0;
            for(int i=1;i<args.length;i++)
            {
                try
                {
                   // String sp = (args[1]);
                  //   double str1 = Double.parseDouble(sp);
                //  num1 = Double.parseDouble(String.valueOf(str1));
                    num1 = Double.parseDouble(args[i]);
                    sum= sum+num1;
                }
             catch (NumberFormatException e) {
                    System.out.println("error :");
                }
            }
            System.out.println(sum);

        } else if (args[0].equals("2")) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i].toLowerCase());
            }
        }
    }
}
class MultiCommand
{
    public void add(String args[])
    {
    }
}
