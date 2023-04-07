import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args)throws IOException {
        /*
        Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже)
         в три строчки:

"Меня зовут ..."
"Мне ... лет"
"Я из ..."
 На месте многоточий должны использоваться переменные!

         */
       String name="Tatjana";
        int age=48;
        String city= "Bielefeld";

        System.out.println("Меня зовут "+name+".");
        System.out.println("Мне "+age+" лет.");
        System.out.println("Я из "+city+".");
        //Меня зовут Tatjana.
        //Мне48 лет.
        //Я из Bielefeld.


        // Напишите программу — простого бота, который задаёт вам вопросы и использует ваши ответы.
        //
        // В программе должно быть не меньше трёх вопросов.
        //
        // Как минимум один ответ нужно читать и использовать, как число.


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       /* System.out.println("Hallo, wie geht's? ");
        String answer1=br.readLine();
        System.out.println("Wie alt bist du? ");
        int answer2=Integer.parseInt(br.readLine());
        System.out.println("Aus welcher Stadt kommst du?");
        String answer3= br.readLine();*/
        //Hallo, wie geht's?
        //hi,alles gut
        //Wie alt bist du?
        //48
        //Aus welcher Stadt kommst du?
        //Bielefeld

        /*

 Lesson 4
 Задача 1
 Написать программу для вычисления площади прямоугольника.
 Получить через ввод длину и ширину и вывести площадь.*/

        /*System.out.println("Wie groß ist die Seite a:");
        int a=Integer.parseInt(br.readLine());
        System.out.println("die Seite b: ");
        int b=Integer.parseInt(br.readLine());
        int area=a*b;
        System.out.println("Die Fläche des Rechtecks ist "+area);*/
        //Wie groß ist die Seite a:
        //4
        //die Seite b:
        //6
        //Die Fläche des Rechtecks ist 24

 /*Задача 2
 Написать программу для вычисления скорости.
  Получить на вход время пути и расстояние и вывести скорость.*/
       /* System.out.println("Wir fahren in den Urlaub !\n"+"Wir rechnen nun aus mit welcher Geschwindigkeit\n"+"Wie lange dauert die Fahrt?");
        double time=Double.parseDouble(br.readLine());
        System.out.println("Wie weit lieg der Ort entfernt?");
        double route=Double.parseDouble(br.readLine());
        int speed =route/time;
        System.out.println("Wir sind tasächlich mit einer Geschwindigkeit von "+speed+"km/h gefahren.");

        Wir fahren in den Urlaub !
        Wir rechnen nun aus mit welcher Geschwindigkeit
        Wie lange dauert die Fahrt?
        5
        Wie weit lieg der Ort entfernt?
        435
        Wir sind ttsächlich mit einer Geschwindigkeit von 87km/h gefahren.
*/



/*Задача 3* (не обязательно)
 Написать программу для вычисления средней стомости поездки
 по проездному. Попросить ввести стоимость проездного на месяц
  и количество рабочих дней.

 Считая, что в рабочий день в среднем две поездки, и 1.5 поездки
  в выходной, посчитать и округлить общее число поездок в месяц и
  посчитать среднюю стоимость одной поездки по проездному.*/

// Lesson 5

//  Задача 1
//  Обновить программу для вычисления площади прямоугольника.
//  Добавить вывод единиц измерения через символ Unicode.
   /*     System.out.println("Seite a: ");
    int a=Integer.parseInt(br.readLine());
        System.out.println("Seite b: ");
    int b=Integer.parseInt(br.readLine());
    int area = a*b;
        System.out.println("Die Fläche ist "+area+"cm\u00B2");*/
        //Seite a:
        //5
        //Seite b:
        //5
        //Die Fläche ist 25cm²

//  Задача 2
//  Написать программу, которая считывает с клавиатуры пять
//  символов и выводит их коды.

        int code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
    //Olivia
        //Symbol 'O' ist 79
        //Symbol 'l' ist 108
        //Symbol 'i' ist 105
        //Symbol 'v' ist 118
        //Symbol 'i' ist 105


        /*     System.out.println("Gib ein Symbol ein: ");
        int code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();//liest \n ,steht daher leer und zusätzlich,
        // dann können wir nacheinander Symbole eingeben

        System.out.println("Gib ein Symbol ein: ");
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();

        System.out.println("Gib ein Symbol ein: ");
        code=br.read();
        System.out.println("Symbol '"+(char)code+"' ist "+code);
        code=br.read();
      Gib ein Symbol ein:
T
Symbol 'T' ist 84
Gib ein Symbol ein:
J
Symbol 'J' ist 74
Gib ein Symbol ein:
D
Symbol 'D' ist 68

         */
//Lesson 6
//  Задача 1
//  Напишите программу, которая считывает три числа и выводит их сумму.
//   Каждое число записано в отдельной строке.
        System.out.println("Gib drei Zahlen ein ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        int sum=a+b+c;
        System.out.printf("%d + %d + %d"+sum);

//Lesson 7
//   Задача 1
//   Напишите программу, которая читает строку, и выводит её длину,
//   первый и последний символы.

    }
}
