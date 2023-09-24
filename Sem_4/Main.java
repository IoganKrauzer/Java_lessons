// package Sem_4;

// import java.util.LinkedList;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList<String> linkedList = new LinkedList<>();
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.print("Введите команду: ");
//             String input = scanner.nextLine();

//             if (input.startsWith("text~")) {
                
//                 String[] parts = input.split("~");
//                 if (parts.length == 2) {
//                     int num = Integer.parseInt(parts[1]);
//                     linkedList.add(num, parts[0]);
//                 }
//             } else if (input.startsWith("print~")) {
               
//                 String[] parts = input.split("~");
//                 if (parts.length == 2) {
//                     int num = Integer.parseInt(parts[1]);
//                     if (num < linkedList.size()) {
//                         System.out.println(linkedList.get(num));
//                         linkedList.remove(num);
//                     } else {
//                         System.out.println("Позиция " + num + " не существует в списке.");
//                     }
//                 }
//             } else {
//                 System.out.println("Неверный формат команды.");
//             }
//         }
//     }
// }


//   <aside>
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {3,5,6,78,9};


//         Stack<Integer> stack = new Stack<>();
//         for (int i = 0; i < arr.length; i++) {
//             stack.add(arr[i]);

//         }


//         System.out.println(stack);

//     }
// }


// ----------------------------------------------------------
// Реализовать стэк с помощью массива. Нужно реализовать методы:

// size(), empty(), push(), peek(), pop().


