package PracticeWeek.SimpleTasks.Task1;

/*
Задача 1
Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
В этом классе должны быть следующие методы:
    addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
    addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
    getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.
 */

public class Balance {

    private int Right, Left;

    public void addRight(int n) {
        this.Right += n;
    }

    public void addLeft(int n) {
        this.Left += n;
    }

    public String getSituation(){
        if (this.Left == this.Right)
            return "=";
        else if (this.Right>this.Left)
            return "R";
        else
            return "L";
    }

    /* Ответ:
        public class Balance {
           int r = 0, l = 0;

           void addRight(int n) {
               r += n;
           }

           void addLeft(int n) {
               l += n;
           }

           String getSituation() {
               if (r == l) return "=";
               else if (r > l) return "r";
               else return "l";
           }
        }
    */
}
