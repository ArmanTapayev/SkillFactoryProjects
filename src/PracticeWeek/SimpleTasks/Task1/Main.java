package PracticeWeek.SimpleTasks.Task1;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addLeft(6);
        balance.addRight(6);
        System.out.println(balance.getSituation());
    }
}
