    public class Employee{

        public String name;
        public String position;
        public String email;
        public String phoneNumber;
        public int salary;
        public int age;

        //геттер для age
        public int getAge(){
            return age;
        }

        // конструктор
        public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void print(){
            System.out.println("Имя: " + name + "\nВозраст: " + age + "\nДолжность: " + position + "\nE-mail: " + email + "\nТелефон: " + phoneNumber + "\nЗарплата: " + salary + "\n");
        }
}

