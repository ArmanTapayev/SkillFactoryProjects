package PracticeWeek.SimpleTasks.Task2;
/*
    Задача 2
    Напишите класс Bell, имеющий всего один метод sound, если он был вызван,
    то метод должен напечатать в консоль ding или dong. Первый звук всегда ding,
    второй — dong, третий — снова ding и так далее.
 */

public class Bell {

    private static int count = 0;

    public void sound() {
        String snd = count % 2 == 0 ? "ding" : "dong";
        System.out.println(snd);
        count++;
    }

}

/* Ответ:
public class Bell {
   Boolean ding = true;

   void sound() {
       if (ding) {
           System.out.println("ding");
       } else {
           System.out.println("dong");
       }
       ding = !ding;
   }
}
 */