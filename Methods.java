package BasicsOfJava;

public class Methods {
    // public = access modifier , static = non access modifier
    // void since no value is returned,
    // greetUser name of method
    public static void greetUser(){ // can be defined before the main method
        System.out.println("Hello");
    }
    //method with return value int and parameters i and b
    public static int sum(int i,int b){
        int add = i +b;
        return add;
    }
    //method with return value boolean and parameter n
    public static boolean greaterOrNot(int n){
        if (n > 10) {
            return true;
        }
        else{
            return false;
        }
    }

    int myKidilamVariable = 2; // global variable has a scope within this entire class

    public static void main(String[] args){
        greetUser(); // to call the method greetUser
        int out = sum(1,2); // returned value from sum is saved to out
        System.out.println(out); // returned value inside out is printed
        boolean value = greaterOrNot(2);
        System.out.println(value);


    }

    public static void greetUser2(){ // can be defined after the main method
        System.out.println("Hello 2");
    }

    //scope
    public void method1(){
        int myVariable = 2; // local variable
        System.out.println(myVariable);
    }
    public void method2(){
        //Remove comments to check if it works
        //System.out.println(myVariable); out of scope,
        //is a local variable and cannot be accessed from other methods
        System.out.println(myKidilamVariable); // Can be accessed since its
        //a global variable defined at line 25
    }
     public void method3(){
        int myKidilamVariable = 5; // defining local variable
        System.out.println(myKidilamVariable); // referencing local variable
        System.out.println(this.myKidilamVariable); // referencing global variable
    }
    //Overloading methods
    public static int getMonth(int month){
        return month;
    }
    public static int getMonth(String month){
        return 1;
    }
    public static int getMonth(int month, int year){
        return 2;
    }
}
