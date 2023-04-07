import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        Задача 1
Создайте метод, который ничего не принимает в качестве параметров,
 выводит в консоль: "Кажется я начинаю понимать".

Назовите этот метод understand. Вызовите метод внутри main.

Задача 2
Создайте метод c именем powOfThree, метод принимает int, возвращает int.
 Пусть метод возводит число в третью степень. Вызовите метод в main.

Задача 3
Создайте метод, который принимает в качестве параметра String - возвращает
новый String.
Пусть метод переводит первые три символа в upper case (верхний регистр),
 а все остальные символы в lower case (нижний регистр). Назовите метод firstToUpper.
         */
    //1.
        transformString();
        //Кажется я начинаю понимать

        //2 .

        System.out.println(powOfThree(5));//125
      // int n= 3;
      // System.out.println(n+"*"+n+"*"+n+"="+powOfThree(n));
      //3*3*3=27

        //3.

        System.out.println( firstToUpper("PRIVET druzja \u270D "));
        //GUTEN TAG
        //guten tag
        System.out.println("Starte den rechner! ");
        speedValue();
    }
    public static void transformString(){
        System.out.println("Кажется я начинаю понимать");
    }

    public static int powOfThree(int n){
        return  n*n*n;
    }
    public static String firstToUpper(String str){
        return (str.substring(0,3).toUpperCase()+str.substring(3).toLowerCase());

    }
    /*
    Написать программу для вычисления скорости.
    Получить на вход время пути и расстояние и вывести скорость.
     */
    public static void speedValue()throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gibt die Reiesezeit ein: ");
        double time = Double.parseDouble(br.readLine());
        System.out.println("Gibt die Entfernung ein:");
        int distance= Integer.parseInt(br.readLine());

        double speed= distance/time;
        System.out.println("Ihre Geschwindigkeit ist:" +speed+"km/h");

    }
    /*
    Написать программу для вычисления средней стомости поездки по проездному.
    Попросить ввести стоимость проездного на месяц и количество рабочих дней.

     Считая, что в рабочий день в среднем две поездки, и 1.5 поездки
     в выходной, посчитать и округлить общее число поездок в месяц и посчитать
     среднюю стоимость одной поездки по проездному.
     */




/*
Задача 1
Напишитте метод, который получает три целых числа и
 возвращает true, первое и второе
число в сумме дают третье числу, иначе false.

Задача 2
Напишитте метод, который получает три целых числа и
возвращает true, если среди этих чисел есть такое,
 которое равно сумме двух оставшихся чисел.
Например:
(12,15,7) -> false;
(8,15,7) -> true;
Подсказка: используйте метод, написанный в задаче 1.

Задача 3
Напишитте метод, который получает две строки и возвращает длинну строки (т.е. int), которая длиннее.
 */
    /*Задача 1
    Напишитте метод, который получает три целых числа и
    возвращает true, первое и второе
    число в сумме дают третье числу, иначе false.*/



}