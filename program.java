// import javax.script.Invocable;

/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         System.out.println("bye world");    
//     }  
// }

// -----------------
// public class program {
//     public static void main(String[] args) {
//         String s = null;
//         System.out.println(s);        
//     }    
// }

// -----------------
// целочисленный тип данных
// public class program {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);
//         System.out.println(salary);      
//     }    
// }

// -----------------
// вещественный тип данных
// public class program {
//     public static void main(String[] args) {
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e);
//         System.out.println(pi);      
//     }    
// }

// -----------------
// // Тип данных char (символьный)
// public class program {
//     public static void main(String[] args) {
//         char ch = '1';
//         System.out.println(Character.isDigit(ch));
//         ch = 'a';
//         System.out.println(Character.isDigit(ch));
//         System.out.println(ch); 
//     }    
// }

// // -----------------
// // Тип данных boolean
// public class program {
//          public static void main(String[] args){
//             boolean flag1 = 123 <= 234;
//             System.out.println(flag1);
//             boolean flag2 = 123 >= 234;
//             System.out.println(flag2);
//             boolean flag3 = flag1 ^ flag2;
//             System.out.println(flag3);
//             boolean f1 = true && false;
//             System.out.println(f1);
//             boolean f2 = true & false;
//             System.out.println(f2);
//             boolean f3 = true || false;
//             System.out.println(f3);
//             boolean f4 = true | false;
//             System.out.println(f4);

//     } 
// }

// // -----------------
// // Тип данных Строки
// public class program {
//     public static void main(String[] args){
//         String msg = "Hello world";
//         System.out.println(msg);
//     } 
// }

// // -----------------
// // Неявная типизация
// public class program{
//     public static void main(String[] args){
//         var a = 123;
//         System.out.println(a);
//         var d = 123.456;
//         System.out.println(d);
//         System.out.println(getType(a));
//         System.out.println(getType(d));
//         d = 1022;
//         System.out.println(d);
//         // d = "mistake";
//         // error: incompatible types:
//         // String cannot be converted to double
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// }

// // -----------------
// // Классы-Обёртки
// public class program{
//     public static void main(String[] args){
//         System.out.println(Integer.MAX_VALUE);
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

// -----------------
// Операции Java
// // побитовый сдвиг
// public class program{
//     public static void main(String[] args){
//         int a = 8; // 1000
//         System.out.println(a << 1);
//         int d = 18; // 10010
//         System.out.println(d >> 1);
//     }
// }

// public class program{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b); // 5(101) | 2(010) = 7(111)
//         System.out.println(a & b); // 5(101) & 2(010) = 0(000)
//         System.out.println(a ^ b); // 5(101) ^ 2(010) = 7(111)
//     }
// }

// public class program{
//     public static void main(String[] args){
//         String s = "qwer"; // 4 символа, 0..3 - индексы
//         boolean b = s.length() >= 5 && s.charAt(3) == '1';
//         System.out.println(b);
//         // boolean c = s.length() >= 5 & s.charAt(3) == '1';
//         // System.out.println(c);
//         boolean f = s.length() >= 4 && s.charAt(3) == 'r';
//         System.out.println(f);
//     }
// }

// // -----------------
// // Массивы
// // Одномерные массивы
// public class program{
//     public static void main(String[] args){
//         int[] arr = new int[10];
//         System.out.println(arr.length);

//         arr = new int[] {1, 2, 3, 4, 5};
//         System.out.println(arr.length);
//         System.out.println(arr[3]); // посмотреть 3-й элемент массива

//         arr[3] = 13; // записать значение для 3-го элемента
//         System.out.println(arr[3]);
//     }
// }

// // Многомерные массивы
// public class program{
//     public static void main(String[] args){
//         int[] arr[] = new int[3][5];
//         for(int[] line: arr) {
//             for(int item: line) {
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }
//     }
// }

// // ИЛИ
// public class program{
//     public static void main(String[] args){
//         int[][] arr = new int[3][5];
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// // --------------
// // Преобразования
// public class program{
//     public static void main(String[] args){
//         int i = 123; double d = i;
//         System.out.println(i);
//         System.out.println(d);

//         d = 3.1415; i = (int) d;
//         System.out.println(d);
//         System.out.println(i);

//         byte b = Byte.parseByte("123");
//         System.out.println(b);

//         b = Byte.parseByte("1234");
//         System.out.println(d);

//     }
// }

// // для массива
// public class program{
//     public static void main(String[] args){
//         int[] a = new int[10];
//         double[] d = a;
//         System.out.println(d);
//     }
// }

// // --------------------
// // Получение данных из терминала
// // строки
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!\n", name);
//         iScanner.close();
//     }
// }

// // Некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f\n", x, y, x + y);
//         iScanner.close();
//     }
// }

// // Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// -----------------------------
// Форматированный вывод

// // Конкотинация (вредна для String)
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 123;
//         String q = s + a;
//         System.out.println(q);
//     }
// }

// // Использование форматирования
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d\n", a, b, c);
//         System.out.printf("%d + %d = %d\n", a, b, c);
//         System.out.println(res);
//     }
// }

// // Виды спецификаторов
// public class program {
//     public static void main(String[] args) {
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);
//         System.out.printf("%.2f\n", pi);
//         System.out.printf("%.3f\n", pi);
//         System.out.printf("%e\n", pi);
//         System.out.printf("%.2e\n", pi);
//         System.out.printf("%.3ef\n", pi);
//     }
// }

// -------------------
// Область видимости переменных

// так не сработает
// public class program {
//     public static void main(String[] args) {
//         int a = 123;
//         {
//             int a = 222;
//             System.out.println(a);
//         }
//         System.out.println(a);
//     }
// }

// // а так сработает
// public class program {
//     public static void main(String[] args) {
//         {
//             int a = 222;
//             System.out.println(a);
//         }
//         int a = 123;
//         System.out.println(a);
//     }
// }

// // и так сработает
// public class program {
//     public static void main(String[] args) {
//         int b = 111;
//         {
//             int a = 222;
//             System.out.println(a + b);
//         }
//         int a = 123;
//         System.out.println(a);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int b = 111;
//         {
//             int a = 222;
//             System.out.println(a + b);
//         }
//         int a = 123;
//         System.out.println(a);
//     }
// }

// --------------------
// Функции и методы

// // метод внутри класса
// public class program {
//     public static void main(String[] args) {
//         sayHi();
//     }
//     static void sayHi() {
//         System.out.println("hi");
//     }
// }

// // метод в другом файле
// public class program {
//     public static void main(String[] args) {
//         lib.sayHi();
//     }
// }

// public class program {
//     static int sum(int a, int b) {
//     return a+b;
//     }
//     static double factor(int n) {
//     if(n==1)return 1;
//     return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//     System.out.println(sum(1, 3));
//     System.out.println(factor(5));
//     }
// }

// // ---------------------------------
// // Управляющие конструкции
// // оператор ветвления
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// // сокращённая форма оператора ветвления
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;
//         System.out.println(c);
//     }
// }

// // тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

// // оператор выбора
// import java.util.Scanner;
// public class program {
// public static void main(String[] args) {
//     int mounth = value;
//     String text = "";
//     switch (mounth) {
//         case 1:
//             text = "Autumn";
//             break;
//         case 2:
//             text = "Autumns 2";
//             break;
//         default:
//             text = "mistake";
//             break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// --------------------
// Циклы
