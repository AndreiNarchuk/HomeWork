package HomeWork1;

public class home_work_1_3 {

    public static void main(String[] args) {

        double d = -254.56;
        float f= -125.3f;
        int i = -55;
        long l = -689;

        // abs Возвращает абсолютное значение числа (по модулю), может принимать значения (double, float, int и long)
        System.out.println("Абсолютным значением для числа -254.56 является " +Math.abs(d));
        System.out.println("Абсолютным значением для числа -125,3 является " +Math.abs(f));
        System.out.println("Абсолютным значением для числа -55 является " +Math.abs(i));
        System.out.println("Абсолютным значением для числа -689 является " +Math.abs(l));

        // addExact(i, l) Суммирует операнды (целочисленные int или long ) в примере используем приведение к int
        int h = (int)Math.addExact(i, l);
        System.out.println("Сумма чисел -55 и -689 равна " +h);

        // cbrt(double a) возвращает значение извлечения корня кубического
        double j = Math.cbrt(-27);
        System.out.println("Корень кубический из числа 27 равен " +j);

        //Для вывода рандомного значения можно использовать random() выдает рандомное значение от 0,0 до 1,0
        double k = Math.random();
        System.out.println("Случайное число 1 составляет " +k);
        //Умножив данное выражение на 10, 100, 1000 можно изменить разрядность
        k = (Math.random()*100);
        System.out.println("Случайное число 2 составляет " +k);
        //Для получения целочисленного значения приводим к int или long
        int p = (int)(Math.random()*100);
        System.out.println("Случайное число 3 составляет " +p);

//ceil(double a) выполняет округление в большую сторону (дополняет аргумент) до целого числа
        //double q = Math.ceil(-27.8666);
        //System.out.println(q);

//copySign(double magnitude, double sign) возращает первый аргумент со знаком второго, выполняется для double и float
        //double w = Math.copySign(27, -1.3556);
        //System.out.println(w);

//cos(double a) Возвращает тригонометрический косинус угла
        //double y = Math.cos(360);
        //System.out.println(y);

    }

}
