package com.cilsy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( getMyName() );
        System.out.println( getMyNumber() );
        myMethod("Almas", "Aqmarina", 22);
        System.out.println("Hasilnya adalah "+myMethod(10, 23));
        System.out.println("Totalnya adalah "+diskon(5000, 50));
        System.out.println("Hasilnya adalah "+calc(2,2,1,1));
    }

    public static String getMyName(){
        return "Hello my name is Almas";
    }

    public static Integer getMyNumber(){
        return 1234567;
    }
    
    static void myMethod(String fname, String lname, Integer age) {
    	System.out.println("Selamat Datang "+fname+" "+lname+" dengan umur "+age);
    }
    
    static int myMethod(int x, int y) {
    	return x * y;
    }
    
    static int diskon(int t, int d) {
    	return ((t*d)/100);
    }
    
    static int calc(int t, int d, int a, int b) {
    	return ((t*d)-(a+b));
    }
}
