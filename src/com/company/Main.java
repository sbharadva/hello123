package com.company;

public class Main {
        public void greet(){

            System.out.println("hello java");
        }

        public static void main(String[] args) {
            Main printValue = new com.company.Main();
            printValue.greet();
        }

    }
