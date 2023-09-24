package HW_1;
public class Main{
    public static void main(String[] args){

    }
}




// -----------------------------------------------------------
// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class Main {
//     public static void main(String[] args) {
// //        Создать список типа ArrayList<Object>. Поместить в него как строки, так и целые числа.
// //        Пройти по списку, найти и удалить целые числа.
//         ArrayList Test = new ArrayList(List.of( 123, "Венера", 333, 4444, "Zemlya"));
//         var n = Test.size();
//         var temp = 0;
//         for (int i = n-1; i >= 0; i-- ) {
//             if (Test.get(i) instanceof Integer) {
//                 Test.remove(i);
//                 temp = n;
//             }

//         }
//         System.out.println(Test);

//        System.out.println(temp);
//     }


// }







// ------------------------------------------------------------
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> planets = new ArrayList<String>(List.of("Меркурий", "Венера"));
//         planets.add("Земля");
//         planets.add("Марс");
//         planets.add("Юпитер");
//         planets.add("Сатурн");
//         planets.add("Уран");
//         planets.add("Нептун");

//         int n = 10;
//         var random = new Random();
//         ArrayList<String> list = new ArrayList<String>();
//         for (int i=0; i < n; i++) {
//             var planet = planets.get(random.nextInt(0, planets.size()));
//             list.add(planet);
//         }
//         System.out.println(list);

//         Map<String, Integer> planetTimes = new HashMap<>();

//         for (var planet : list) {
//             if (!planetTimes.containsKey(planet)) {
//                 planetTimes.put(planet, 1);
//             }
//             else {
//                 var temp = planetTimes.get(planet);
//                 planetTimes.put(planet, temp + 1);
//             }
//         }
//         System.out.println(planetTimes);

//         Set<String> filteredList = new LinkedHashSet<>(list);
//         System.out.println(filteredList);
//     }
// }





// ---------------------------------------------------------
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.


// public static ArrayList<Integer> randomNumbers(int N){
//     ArrayList<Integer> arrayList = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < N; i++) {
//             arrayList.add(random.nextInt(1,100));
//         }
//     Collections.sort(arrayList);
//     return arrayList;
//     }




// Random random = new Random();
//         System.out.println(random.nextInt( 10 ,60 ));