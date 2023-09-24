package telephone_book;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class TelephoneBook {

    public static void addContact(String name, int tel, Map<String, ArrayList<Integer>> hm) {
        if (hm.containsKey(name)) {
            hm.get(name).add(tel);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(tel);
            hm.put(name, list);
        }
    }

    public static void showContactsInOrder(Map<String, ArrayList<Integer>> hm) {
        for (var item : hm.entrySet()) {
            String name = item.getKey();
            String value = item.getValue().toString()
                    .replace("[", " ").replace("]", " ");
            System.out.println("Name: " + name + "\nTelephone number: " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> telephBook = new HashMap<>();
        addContact("Петя", 1234345, telephBook);
        addContact("Петя", 4576423, telephBook);
        addContact("Петя", 1456873, telephBook);
        addContact("Вася", 9677675, telephBook);
        addContact("Вася", 9656567, telephBook);
        addContact("Света", 1243534, telephBook);
        addContact("Тамара", 4323425, telephBook);
        addContact("Кристина", 3685353, telephBook);
        System.out.println();
        showContactsInOrder(telephBook);

    }

}
