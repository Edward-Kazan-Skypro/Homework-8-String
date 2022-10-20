public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Выполнение задания 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " "
                + firstName + " "
                + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        System.out.println();
        //Задание 2
        System.out.println("Выполнение задания 2:");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println();
        //Задание 3
        System.out.println("Выполнение задания 3:");
        fullName = "Иванов Семён Семёнович";

        //Решение задачи путем деления строки на отдельные строки (слова), создания из слов массива.
        //В цикле перебираем все слова и ищем в каждом слове букву 'ё'.
        //Если находим - заменяем на 'е'.
        //Новой переменной (строке) присваиваем все слова из массива, в том числе и с замененными буквами
        //Результат выводим в консоль.
        String newFullName = "";
        String[] wordsOfName = fullName.split(" ");
        for (int i = 0; i < wordsOfName.length; i++) {
            if (wordsOfName[i].contains("ё")) {
                wordsOfName[i] = wordsOfName[i].replace('ё', 'е');
            }
            newFullName = newFullName + wordsOfName[i] + " ";
        }
        System.out.println("Данные ФИО сотрудника - " + newFullName);

        //Эту задачу можно было бы решить короче - просто заменить символы 'ё' на 'е' в строке
        // fullName.replace('ё', 'е')
        //Результат замены можно присвоить новой переменной или сразу вывести в консоль.
        //Например так - System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }
}