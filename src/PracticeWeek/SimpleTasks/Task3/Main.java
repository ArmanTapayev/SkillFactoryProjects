package PracticeWeek.SimpleTasks.Task3;

public class Main {
    public static void main(String[] args) {
        Payer payer = new Payer();
        Payer payer1 = new Payer("Surname", "Name", "Address", "4_532_345_234");
        System.out.println(payer.toString());
        System.out.println(payer1.toString());
    }
}
