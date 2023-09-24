
public class MainM {
            public static void main(String[] args) {
                StringBuilder str = new StringBuilder("арозаупаланалапуазора");
                StringBuilder reverse_str = new StringBuilder(str);
                reverse_str.reverse();
        
                String str_st = str.toString();
                String reverse_str_st = reverse_str.toString();
        
                if (str_st.equals(reverse_str_st)) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
        
                System.out.println(str);
                System.out.println(reverse_str);
        
            }
            public static boolean isPalindrome(String input) {
                return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
            }
        }
        
    












// ---------------------EXc_1---------------------
// String a = "c1";
// String b = "c2";
// String str = "";
// int num = 8;
// for (int i = 0; i <num; i++){
// if (i % 2 == 0) {
// str = str + a;
// }
// else{
// str = str + b;
// }
// }
// System.out.println(str);

// int N = 6;
// String a = "c1";
// String b = "c2";

// StringBuilder stringBuilder = new StringBuilder("");
// for (int i = 0; i < N; i++){
// stringBuilder.append(a).append(b);
// }
// System.out.println(stringBuilder);
//
// ------------------EXC2

// public static void main(String[] args) {
//     String input = "aaaabbbcdd";
//     StringBuilder compressed = new StringBuilder();
//     char currentChar = input.charAt(0);

//     for (int i = 1; i < input.length(); i++) {
//         char nextChar = input.charAt(i);
//         if (nextChar != currentChar) {
//             compressed.append(currentChar);
//             currentChar = nextChar;
//         }
//     }

//     compressed.append(currentChar);
//     System.out.println(compressed.toString()); 
// }

//-------------------EXC_3 ----------------
// public static boolean isPalindrome(String input) {
//     return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
// }

// public static void main(String[] args) {
//     String input = "A man a plan a canal Panama";
//     boolean result = isPalindrome(input);
//     System.out.println("Is palindrome: " + result); // Вывод: "Is palindrome: true"
// }