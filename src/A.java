public class A {
    void method(){
        System.out.println("Hello");

    }
    int method(int x){
        return x;

    }
    void method(int x, int y){

        System.out.println("Number is "+(x+y));
    }

    public static void main(String[] args) {
        //create a object
        A a=new A();
        a.method();
        a.method(1, 2);
        System.out.println("Number is "+ a.method(2));
    }
}
