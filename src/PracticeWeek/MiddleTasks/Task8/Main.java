package PracticeWeek.MiddleTasks.Task8;

public class Main {
    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{2, 4, -3, 4, 6, 7});
        for (int i = 0; i < separator.even().length; i++) {
            System.out.print(separator.even()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < separator.odd().length; i++) {
            System.out.print(separator.odd()[i] + " ");
        }
    }
}
