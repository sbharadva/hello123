package com.company;
 class AccessMode {
    char a='1';
    public int i=12;
    private String s = "surabhi";
    protected float f1 = Float.parseFloat("34.67f");
    protected double d1 = Double.parseDouble("10.34");
    public long lg = 4555;


public void printPropertices()
    {
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("String: " + s);
        System.out.println("Float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("lg: " + lg);

    }
    public static void main(String args[])
    {
        AccessMode as = new AccessMode();
        //TestAccessMod ts = new TestAccessMod();
        as.printPropertices();
        //ts.TestAccessMod();
    }

}



