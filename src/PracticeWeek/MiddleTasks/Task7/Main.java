package PracticeWeek.MiddleTasks.Task7;

public class Main {
    public static void main(String[] args) {
        LimitedRectangle limitedRectangle = new LimitedRectangle(new int[][] {{-1, 2}, {-1, -2}, {-3,5},{2,-1},{1,3},{3,2}});
        System.out.println(limitedRectangle.getHeight());
        System.out.println(limitedRectangle.getWidth());
        System.out.println(limitedRectangle.getBorders());
    }
}
