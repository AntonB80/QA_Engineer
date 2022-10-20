public class Lesson_04 {
  public static void main(String args[]) {
        // Стандартные математические функции

        double pi = Math.PI;
        double e = Math.E;

        double result1 = Math.cos(0);
        double result2 = Math.sin(0);

        // корень квадратный
        double result3 = Math.sqrt(8);
        // возведение в степень (какое число и в какую степень)
        double result4 = Math.pow(3, 4);

        System.out.println(pi);
        System.out.println(e);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // task#1
        // Найти длину окружности радиуса 4

        double r = 4;
        double C = 2 * Math.PI * r;
        System.out.println(C);

        // task#2

        // Известно значение температуры пошкале Цельсия 36,6. Найти соответствующее
        // значение температуры пошкале:
        // 1.Фаренгейта;
        // 2.Кельвина.

        double temperatureCelsius = 36.6;
        double temperatureFahrenheit = (temperatureCelsius * 1.8) + 32;
        double temperatureKelvin = temperatureCelsius + 273.15;

        System.out.printf("Fahrenheit: %.2f \n", temperatureFahrenheit);
        System.out.printf("Kelvin: %.2f \n", temperatureKelvin);

        // task#3
        // Дано трехзначное число. Найти:
        // 1.число единиц в нем;
        // 2.число десятков внем;
        // 3.сумму его цифр;
        // 4.произведение его цифр.

        
          int namber = 567;
          
          int s = namber / 100;
          int d = namber / 10 % 10;
          int t = namber % 10;
          System.out.printf("%d = %d*100 + %d*10 + %d\n", namber, s, d, t);
          
          int sum = s + d + t;
          int multiplication = s * d * t;
          
          System.out.println("Sum =" + sum);
          System.out.println("Multiplication =" + multiplication);
         

        // Операции сравнения
        
          int a = 20;
          int b = 10;
          
          boolean result11 = (a == b); // false
          boolean result12 = (a != b); // tue
          boolean result13 = (a > b); // true
          boolean result14 = (a <= b); // false
          
          System.out.println(result11);
          System.out.println(result12);
          System.out.println(result13);
          System.out.println(result14);
         

        // Логические операции

        int q = 20;
          int w = 10;
          
          boolean result21 = ((q > 10) && (w < 10)); // false
          boolean result22 = ((q > 10) && (w >= 10)); // true
          
          boolean result23 = ((q > 10) || (w > 10)); // true
          boolean result24 = ((q > 20) && (w > 10)); // false
          
          System.out.println(result21);
          System.out.println(result22);
          System.out.println(result23);
          System.out.println(result24);
         

        // task#4
        // Известны площади круга и квадрата. Определить:
        // 1. уместится ли круг в квадрате?
        // 2. уместится ли квадрат в круге?

        
          int circleArea = 50;
          int squareArea = 78;
          
          double circleDiameter = 2 * Math.sqrt(circleArea / Math.PI); //
          double squareDiagonal = Math.sqrt(2 * squareArea);
          double squareSide = Math.sqrt(squareArea);
          
          boolean circleInSquare = (circleDiameter <= squareSide);
          boolean squareInCircle = (squareDiagonal <= circleDiameter);
          
          System.out.printf("Диаметр Круга %.2f\n", circleDiameter);
          System.out.printf("Диагональ Квадрата %.3f\n", squareDiagonal);
          System.out.printf("Сторона Квадрата %.2f\n", squareSide);
          System.out.printf("Круг уместится в квадрат %b\n", circleInSquare);
          System.out.printf("Квадрат уместится в круге %b\n", squareInCircle);
        

        // task#5
        // Дано натуральное число. Определить:
        // 1.является ли оно четным;
        // 2.оканчивается ли оно цифрой 7

        
          int number = 7;
          
          boolean isEven = (number % 2 == 0);
          boolean isEvenSeven = (number % 10 == 7);
          
          System.out.printf("Число %d Является четным %b\n", number, isEven);
          System.out.printf("Число %d Оканчивается на 7? %b\n", number, isEvenSeven);
         

        // task#6
        // Оператор MATH
        // Составить программу, которая уменьшает первое введенное число в два раза,
        // если оно больше второго введенного числа по абсолютной величине.

        
          int firstNumber = 20;
          int secondNumber = -30;
          
          System.out.printf("Первое число = %d\n", firstNumber);
          System.out.printf("Второе чило = %d\n", secondNumber);
          
          boolean conditionIsMet = (firstNumber) > Math.abs(secondNumber);
          
          if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
          firstNumber = firstNumber / 2;
          System.out.printf("Условие соблюдается %b\t Первое число становится %d\n",
          conditionIsMet, firstNumber);
          }
          else {
          System.out.println("Условие не соблюдается");
          }
         

        // task#7
        // Оператор IF ELSE
        // Известен вес боксера - любителя. Известно, чтовес таков, что боксер может
        // быть отнесен к одной из трех весовых категорий:
        // 1.легкий вес — до 60 кг;
        // 2.средний вес — до 75 кг;
        // 3.тяжелый вес — до 91 кг;
        // 4.супер тяжелый вес – с 91 кг
        // Определить, в какой категории будет выступать данный боксер.

        
         int boxerWeight = 65;
         if (boxerWeight < 60) {
          System.out.println("легкий вес");
          } else if (boxerWeight < 75) {
          System.out.println("средний вес");
          } else if (boxerWeight < 91) {
          System.out.println("тяжелый вес");
          }else (boxerWeight >=91) {
          System.out.println("супертяжелый вес");
          }
  

        // task#8
        // Оператор SWITCH
        // Составить программу, которая взависимости от порядкового номера дня недели
        // (1, 2, ..., 7) выводит на экран его название (понедельник, вторник, ...,
        // воскресенье).

        
          int day = 9;
          
          switch (day) {
          case 1: // day = 1
          System.out.println("Это понедельник");
          break;
          case 2:
          System.out.println("Это вторник");
          break;
          case 3:
          System.out.println("Это среда");
          break;
          case 4:
          System.out.println("Это четверг");
          break;
          case 5:
          System.out.println("Это пятница");
          break;
          case 6:
          System.out.println("Это суббота");
          break;
          case 7:
          System.out.println("Это воскрнсенье");
          break;
          
          default:
          System.out.println("Такого дня не существует в неделе");
          break;
          }
         

        // task#9
        // В чемпионате пофутболу команде за выигрыш дается 3 очка, за проигрыш — 0, за
        // ничью — 1. Известно количество очков, полученных командой за игру. Определить
        // словесный результат игры (выигрыш, проигрыш или ничья).

        // var numberOfOoints = 18; // Количество очков

        
          switch (numberOfOoints) {
          case 0:
          System.out.println("проигрыш");
          break;
          case 3:
          System.out.println("выигрыш");
          break;
          case 1:
          System.out.println("ничья");
          break;
          
          default:
          System.out.println("Проверьте количество очков");
          
          break;
          }
         

        // task#10
        // Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

        
          int radiusCircle = 8;
          int sideSquare = 10;
          int raiseTheDegree = 2; // Степень возведи
          
          double areaCircle = Math.PI * Math.pow(radiusCircle, raiseTheDegree);
          double areaSquare = Math.pow(sideSquare, raiseTheDegree);
          
          System.out.printf("Площадь круга = %.2f\n", areaCircle);
          System.out.printf("Площадь квадрата = %.2f\n", areaSquare);
          
          if (areaCircle > areaSquare) {
          System.out.println("Площадь круга больше площади квадрата");
          
          } else if (areaCircle < areaSquare) {
          System.out.println("Площадь квадрата больше площади круга");
          
          } else if (areaSquare == areaSquare) {
          System.out.println("Площадь круга и квадрата равны");
          }
         

        // task#11
        // Даны два числа. Если квадратный корень из второго числа меньше первого числа,
        // то увеличить второе число впять раз.

        
          int h = 9;
          int j = 16;
          
          System.out.printf("Первое число = %d\n", h);
          System.out.printf("Второе чило = %d\n", j);
          
          boolean conditionIsMet = Math.sqrt(j) < Math.sqrt(h);
          
          if (Math.sqrt(j) < Math.sqrt(h)) {
          
          System.out.printf("Условие соблюдается %b\t Второе число становится %d\n",
          conditionIsMet, j = j * 5);
          }
          
          else {
          System.out.println("Условие не соблюдается");
          }
         

        // task#12
        // Даны три вещественных числа a, b, c. Проверить:
        // 1. выполняется ли неравенство a < b < c;
        // 2. выполняется ли неравенство b > a > c.

        int y = 5;
        int u = 6;
        int i = 3;

        if (y < u && u < i) {
            System.out.println("выполняется неравенство #1");

        } else if (u > y && u > i) {
            System.out.println("выполняется неравенство #2");
        } else {
            System.out.println("неравенства не выполняется");

        }

    }

}
