package com.tts.exceptions;

public class Main {

    private static int divide(int x, int y){
       try{
           return x/y;
       }catch(ArithmeticException e){
           e.printStackTrace();
           return 0;
        }
    }

    public static void main(String[] args) {

        try{
            //here we attempt code we want to run that may throw an exception
            throw new Exception("please stop doing that...");
        }catch(Exception e){
           // if exception occurs you can catch it here

            e.printStackTrace();
        }finally {
            System.out.println("this is last thing in a finally block");

            //the finally block will always run regardless of try catch
        }
        System.out.println(divide(5,0));
    }
}
