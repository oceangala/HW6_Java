public class Lec6_Ex1 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 110;
        w2.id = 1100;

        Worker w3 = new Worker();
        w3.firstName = "Имя_2";
        w3.lastName = "Фамилия_2";
        w3.salary = 110;
        w3.id = 1100;

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w2.toString());
        System.out.println(w2==w3);
        System.out.println(w2.equals(w3));
    }
}