package HomeWork3.calcs.api;

public interface ICalculator {
    /*
    8. Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api . Можете прогуглить слово API, оно очень универсально. Такие пакеты обычно содержат интерфейсы, перечисления и в некоторых случаях абстрактные классы.
	8.1 В данном интерфейсе должны быть объявлены методы:
		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах calcs.simple
     */

    double plus(double a, double b);

    double minus(double a, double b);

    double div(double a, double b);

    double times(double a, double b);

    double pow(double a, int b);

    double abs(double a);

    double sqrt(double a);

    long getCountOperation();
}