public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 10.");
        System.out.println("Task 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String secondName = "Ivanov";
        String fullName = secondName + ' ' + firstName+ ' ' + middleName;
        System.out.println(fullName);
        System.out.println(" ");
        System.out.println("Task 2.");
        System.out.println(fullName.toUpperCase());
        System.out.println(" ");
        System.out.println("Task 3.");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);
    }
}