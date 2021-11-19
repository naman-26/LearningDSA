package com.naman.lecture31OOP.oop6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =8;
        int b=0;
        try {
            int c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }

        try {
//            divide(a,b);
//            throw new Exception("Just for fun");
            String name = "naman";
            if (name.equals("naman")){
                throw new MyException("name is naman");
            }


        }catch (MyException e){
            System.out.println("yeppppppppp");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Normal Exception");
        }finally {
            System.out.println("this will always execute");
        }


    }


    static int divide(int a, int b) throws ArithmeticException{
        if( b == 0){
            throw new ArithmeticException("Not allowed");
        }

        return a/b;
    }
}
