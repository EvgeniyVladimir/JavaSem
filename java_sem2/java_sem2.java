package java_sem2;
// Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n.
// n - четное

// import java.util.Scanner;
// public class java_sem2 {
//     public static void main(String[] args) {
//          Scanner iScanner = new Scanner(System.in);
//         System.out.print("Insert char1: ");        
//         char c1 = iScanner.next().charAt(0);
//         System.out.print("Insert char2: ");        
//         char c2 = iScanner.next().charAt(0);
//         System.out.printf("Insert number: ");        
//         int n = iScanner.nextInt();
//         String string = buildStr(c1, c2, n);
//         // String string = buildString(c1: 'a', c2: 'b', n: 4);
//         System.out.println(string);
//         iScanner.close();
//         // System.out.println(string);
//     }
//     public static String buildStr(char c1, char c2, int n) {
//         String string = new String();
//         if(n % 2 == 0 && n != 0) {
//             for (int i = 0; i < n/2; i++) {
//                 string = string + c1 + c2;
//             }
//             return string;
//         } else {
//             return null;
//         }
//     }
// }


// 1/ Вариант преподавателя 
// Задача // n - четное
// Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n
// public class java_sem2 {
//     public static void main(String[] args) {
//         // String result = buildString('a', 'b', 4);
//         // System.out.println(result);
//         System.out.println(buildString('a', 'b', 4));  // Это тоже самое что 41 строка + 42 строка
//     }
// public static String buildString(char c1, char c2, int n) {
//         String res = "";
//         for (int i = 0; i < n / 2; i++) {
//             res += String.valueOf(c1) + String.valueOf(c2);
//             }
   
//         return res;
//     }
// }


// // 2/ Вариант преподавателя
// // Задача // n - четное
// // Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n
// public class java_sem2 {
//     public static void main(String[] args) {
//         // String result = buildString('a', 'b', 4);
//         // System.out.println(result);
//         System.out.println(buildString('a', 'b', 4));  // Это тоже самое что 59 строка + 60 строка
//     }
// public static String buildString(char c1, char c2, int n) {
//     if (n == 0 || n % 2 != 0) {
//     // return "";
//     // return null;
//     throw new IllegalArgumentException("Значение n " + n + " некорректно");
//     }
    
//     StringBuilder builder = new StringBuilder();
//     // String res = "";
//     for (int i = 0; i < n / 2; i++) {
//     builder.append(c1).append(c2);
//     // res += c1 + "" + c2;
//     }
    
//     return builder.toString();
//     }
// }


// // 3/ Вариант преподавателя
// // Задача // n - четное
// // Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n
// public class java_sem2 {
//     public static void main(String[] args) {
//         // String result = buildString('a', 'b', 4);
//         // System.out.println(result);
//         // System.out.println(buildString('a', 'b', 4));  // Это тоже самое что 89 строка + 90 строка
//     try {
//         System.out.println(buildString('a', 'b', 3));
//     } catch (IllegalArgumentException e) {
//         System.out.println("Не удалось вызвать метод: " + e.getMessage());
//         System.out.println("End");
//     }  
// }
// public static String buildString(char c1, char c2, int n) {
//     if (n == 0 || n % 2 != 0) {
//     // return "";
//     // return null;
//     throw new IllegalArgumentException("Значение n " + n + " некорректно");
//     }   
//     StringBuilder builder = new StringBuilder();
//     // String res = "";
//     for (int i = 0; i < n / 2; i++) {
//     builder.append(c1).append(c2);
//     // res += c1 + "" + c2;
//     }
//     return builder.toString();
//     }
// }
// ____________________________________
// Задача // aaaabbbcdd -> a4b3c1d2
import java.util.Scanner;
public class java_sem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert string: ");        
        String res = sc.nextLine();
        if (res.length() !=0){
            System.out.print(compress(res)); 
        } else{
            System.out.print("Insert string: ");            
        }
        sc.close();
    }

    public static String compress(String s){
        // Заводим счетчик
        // итерируемся по строке
        // если текущий символ совпадает с предыдущим, то увеличиваем счетчик
        // если нет, то сохраняем в какую-то (РЕЗУЛЬТИРУЮЩУЮ)строку и обнуляем счетчик
        // в конце возвращаем результирующую строку
        char[] chars = s.toCharArray();
        int count = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(chars[0]);
        for (int i =1; i <chars.length; i++){
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                builder.append(count);
                count = 1;
                builder.append(chars[i]);
            }
        }
        builder.append(count);
        return builder.toString();
    }
}