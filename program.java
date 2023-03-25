import javax.script.Invocable;

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

// ИЛИ
public class program{
    public static void main(String[] args){
        int[][] arr = new int[3][5];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}