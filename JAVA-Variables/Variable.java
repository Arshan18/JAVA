public class Variable{
    int no = 100;

    void m1(){
        int no1 = 82;
        System.out.println(no + no1);
    }

    void m2(){
        int no2 = 52;
        System.out.println(no + no2);
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.m1();
        obj.m2();
    }
}