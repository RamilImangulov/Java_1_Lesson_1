import static sun.misc.Version.print;

public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        persArray[1] = new Employee("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
        persArray[2] = new Employee("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
        persArray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }
        }

    }
}

