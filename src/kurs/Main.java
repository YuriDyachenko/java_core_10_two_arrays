package kurs;

import java.util.*;

public class Main {

    private static final String[] WORDS = {"Мухин", "Пономарёв", "Сусаренко", "Спивак", "Авдеев", "Куликов",
            "Сусаренко", "Авдеев", "Щербаков", "Никитин", "Бородай", "Князев", "Якушев", "Авдеев", "Сусаренко",
            "Бородай", "Романов", "Гурьев", "Авдеев", "Копылов", "Виноградов", "Сусаренко", "Родионов",
            "Хитрук", "Гурьев", "Авдеев", "Бородай", "Гурьев", "Евсеев", "Бородай", "Правый", "Беспалов"};
    private static final Random random = new Random();

    public static void main(String[] args) {
        calcCountOwWords();
        testPhoneBook();
    }

    private static void testPhoneBook() {
        //телефонная книга
        PhoneBook phoneBook = new PhoneBook();
        //добавление случаных фамилий и телефонов
        for (int i = 0; i < 20; i++) {
            phoneBook.add(randomWord(), randomPhone());
        }
        //поиск телефонов по случайным фамилиям
        for (int i = 0; i < 10; i++) {
            String word = randomWord();
            System.out.println(word + ": " + phoneBook.get(word));
        }
    }

    public static String randomWord() {
        return WORDS[random.nextInt(WORDS.length)];
    }

    public static String randomPhone() {
        return "" + (4950000000L + new Random().nextInt(10000000));
    }

    private static void calcCountOwWords() {
        //делаем сет уникальных слов из массива
        Set set = new TreeSet(Arrays.asList(WORDS));
        //делаем список таких слов
        List words = new ArrayList(set);
        //и массив счетчиков такого же размера
        int[] counts = new int[words.size()];
        //идем по исходному массиву слов
        for (String word: WORDS) {
            //находим слово в списке
            int index = words.indexOf(word);
            counts[index]++;
        }
        //просто выводим
        for (int i = 0; i < words.size(); i++) {
            System.out.printf("%s = %d\n", words.get(i), counts[i]);
        }
    }
}
