public abstract  class  Operation{
    void display()
    {
        System.out.println();
    }
}
class addition extends Operation {
    double c;
    void add(double A,double B){
        c=A+B;
    }
    public void display()
    {
        System.out.println("Addition of two numbers is :\n"+c);
    }
}
class subtraction extends addition {
    double c;
    void sub(double A,double B) {
        c = A - B;
    }

    public void display() {
        System.out.println("Subtraction of two numbers is :\n" + c);
    }

}
class Division extends subtraction {
    double c;
    void div(double A,double B) {
        c = A / B;
    }

    public void display() {
        System.out.println("Division of Two numbers is :\n" + c);
    }

}
class Multiply extends Division {
    double c;
    void mul(double A,double B)
    {
        c=A*B;
    }

    public void display() {
        System.out.println("The multiplication of two numbers is :\n" + c);
    }

}