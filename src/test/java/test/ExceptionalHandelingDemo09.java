package test;

public class ExceptionalHandelingDemo09 {

    public static void main(String[] args) {

        try{
            System.out.println("Hello world...!");
            int i=1/0;
            System.out.println("completed");

        }
        catch( Exception exp){
            System.out.println("I am inside catch block");
            System.out.println("Message is: " + exp.getMessage());
            System.out.println("Cause is: " + exp.getCause());
            exp.printStackTrace();


        }

        finally {
            System.out.println(" I m inside finally block");
        }
    }
}
