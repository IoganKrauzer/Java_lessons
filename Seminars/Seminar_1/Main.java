// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package Seminars.Seminar_1;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] binaryArray = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1)
                count++;
            else if (count > max) {
                max = count;
                count = 0;
            }
        }
        if (count > max)
            System.out.println(count);
        else {
            System.out.println(max);
        }
        // int[] arr = { 1, 1, 0, 1, 1, 1 };
        // int counF = 0;
        // int count = 1;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i + 1] == 1) {
        //         count++;
        //     } else if (arr[i + 1] == 0) {
        //         if (count > counF) {
        //             count = counF;
        //             count = 1;
        //         }
        //     }

        }
    }

// ТЕСТОВОЕ
// public class Main {
// public static void main(String [] args){
// Scanner scanner = new Scanner(System.in);
// System.out.println("Введите возраст: ");
// int age = scanner.nextInt();
// if (age > 18){
// System.out.println("Welcome");
// } else{
// System.out.println("Sorry");
// }

// }

// }

// ------------------ВАРИАНТ ОТ ПРЕПОДАВАТЕЛЯ-----------------------
// public class Main {
//     public static void main(String[] args) {
//         int[] binaryArray = {1, 1, 0, 1, 1, 1,1};
//         int maxConsecutiveOnes = 0;
//         int currentCount = 0;

//         for (int num : binaryArray) {
//             if (num == 1) {
//                 currentCount++;
//                 System.out.println(num);
//                 if (currentCount > maxConsecutiveOnes) {
//                     maxConsecutiveOnes = currentCount;
//                 }
//             } else {
//                 currentCount = 0;
//             }
//         }

//         System.out.println( + maxConsecutiveOnes);
//     }
// }