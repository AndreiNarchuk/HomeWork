package HomeWork2.loops;

public class home_work_1_5 {
    /*
    Вывести таблицу умножения в консоль.
     */
    public static void main(String[] args) {

        System.out.println("\n                          ТАБЛИЦА ");
        System.out.println("                         УМНОЖЕНИЯ \n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t"+"|"+"\t"); //Задаем формат вывода информации в колонки
            }
            System.out.println();
        }
        System.out.println("_____________________________________________________________");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t"+"|"+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ЭТО \nНУЖНО \nЗНАТЬ");
    }
}

