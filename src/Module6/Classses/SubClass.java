package Module6.Classses;

public class SubClass extends SuperClass {
    int num = 77;

    public void display(){
        System.out.println("This is a display() method of SubClass");
    }

    public void myMethod(){
        this.display();
        super.display();
        System.out.println("The value of variable num in SubClass is: " + this.num);
        System.out.println("The value of variable num in SuperClass is: " + super.num);
    }
}
