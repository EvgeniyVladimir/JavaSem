
// package java_sem1;

// import java.util.Scanner;

// class program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("Введите имя: ");
//         String name = sc.nextLine();
//         System.out.println("Привет, " + name + " !");
//         sc.close();
//     }
// }Задача 1.

// Написать программу, которая
// запросит пользователя
// ввести <Имя> в
// консоли.ПОлучит введенную
// строку и
// вывелет в консоль сооьщение"Привет,<Имя>!"

// package java_sem1;

// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         System.setProperty("file.encoding", "UTF-8"); <<--//-->>> Это кодировка на кириллицу(не обязательно),но всеравно не работает.
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Enter name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Hello, %s!", name);
//         iScanner.close();
//     }
// }

// Задача 2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

// package java_sem1;

// public class program {
//     public static void main(String[] args) {
//         int[] array = { 1, 1, 0, 1, 1, 1 };
//         int res = method(array);
//         System.out.println(res);
//     }

//     public static int method(int[] array) {
//         int count = 0;
//         int bestCount = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) {
//                 count++;
//             } else {
//                 if (count > bestCount) {
//                     bestCount = count;
//                 }
//                 count = 0;
//             }
//         }
//         if (count > bestCount) {
//             bestCount = count;
//         }
//         return bestCount;
//     }
// }

//Задача 3. ВО фразе "Добро пожаловатьна курс Java" переставить слова в обратном порядке.

// package java_sem1;
// public class program {

//     public static void main(String[] args) {
//     System.setProperty("file.encoding", "UTF-8");

//     reverseAndPrint("Добро пожаловать на курс по Java");

//     reverseAndPrint("I am like Java programs");

//     }

//     private static void reverseAndPrint(String str) {
//         String[] words = str.split(" ");
//         for (int i = words.length - 1; i>=0; i--){
//             System.out.printf(words[i] + " ");
//         }
//     }
// }
// Задача 4. Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i.

package java_sem1;

public class Program{


    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 6, 5, 6};
        int median = findMedian(numbers);
        System.out.println("median");
    }
    
    private static int findMedian(int[] numbers) {
    // [a1, a2, a3, a4, a5, a6, a7]
    
        int left = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            left += numbers[i - 1];
    
            int right = 0;
            // i + 1, i + 2, ... number.length - 1
            for (int j = i + 1; j < numbers.length; j++) {
                right += numbers[j];
            }
        
            if (left == right) {
                return i;
            }
        }
    
        return -1;
    }
}