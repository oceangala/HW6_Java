import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompShop {
    public static void main(String[] args) {
        Set<Notebook> nb = new HashSet<>();

        Notebook notebook1 = new Notebook("Luna", 4, 120, "Win", "Black");
        Notebook notebook2 = new Notebook("Bella", 8, 512, "Lin", "Silver");
        Notebook notebook3 = new Notebook("Daisy", 16, 1024, "Mac", "White");
        Notebook notebook4 = new Notebook("Max", 32, 1024, "Win", "White");
        Notebook notebook5 = new Notebook("Cooper", 16, 512, "Win", "Black");
        nb.add(notebook1); nb.add(notebook2); nb.add(notebook3); nb.add(notebook4); nb.add(notebook5);

        Set<Notebook> my_nb = new HashSet<>();
        my_nb.addAll(nb);

        Scanner sn = new Scanner(System.in);
        //System.out.println(notebook1.toString());

        while (true){
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - Объём ОЗУ\n" +
                    "2 - Объем жесткого диска\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "Для вывода результатов введите 5");
            int choise = sn.nextInt();
            if (choise == 5) break;
            switch (choise){
                case 1:
                    my_nb = ramSelect(my_nb);
                    break;
                case 2:
                    my_nb = hdSelect(my_nb);
                    break;
                case 3:
                    my_nb = osSelect(my_nb);
                    break;
                case 4:
                    my_nb = colorSelect(my_nb);
                    break;

            }
        }
        if (my_nb.isEmpty()) System.out.println("Подходящих не нашлось. \n" +
                "Попробуйте изменить условия поиска");
        else {
            System.out.println("Вам подойдёт:");
            for (Notebook notebook: my_nb) System.out.println(notebook.toString());}
    }


    static Set<Notebook> ramSelect(Set<Notebook> my_nb){
        Set<Notebook> newSet = new HashSet<>();
        System.out.println("Введите минимальное значение объема ОЗУ (ГБ)");
        Scanner sn = new Scanner(System.in);
        Integer ram_min = sn.nextInt();
        for (Notebook notebook: my_nb){
            if (notebook.getRAM() >= ram_min) newSet.add(notebook);
        }
        return newSet;
    }

    static Set<Notebook> hdSelect(Set<Notebook> my_nb){
        Set<Notebook> newSet = new HashSet<>();
        System.out.println("Введите минимальное значение объема жёсткого диска (ГБ)");
        Scanner sn = new Scanner(System.in);
        Integer hd_min = sn.nextInt();
        for (Notebook notebook: my_nb){
            if (notebook.getHd() >= hd_min) newSet.add(notebook);
        }
        return newSet;
    }

    static Set<Notebook>  osSelect(Set<Notebook> my_nb){
        Set<Notebook> newSet = new HashSet<>();
        System.out.println("Введите номер желаемой ОС:\n"+
                "1 - Windows\n"+
                "2 - Linux\n"+
                "3 - Mac");
        Scanner sn = new Scanner(System.in);
        Integer osChoise = sn.nextInt();
        String os_min;
        switch (osChoise){
            case 1:
                os_min = "Win";
                break;
            case 2:
                os_min = "Lin";
                break;
            case 3:
                os_min = "Mac";
                break;
            default: os_min = "Win";
        }
        for (Notebook notebook: my_nb){
            if (notebook.getOs().equals(os_min)) newSet.add(notebook);
        }
        return newSet;
    }

    static Set<Notebook> colorSelect(Set<Notebook>  my_nb){
        Set<Notebook> newSet = new HashSet<>();
        System.out.println("Введите номер желаемого цвета:\n"+
                "1 - Белый\n"+
                "2 - Черный\n"+
                "3 - Серебристый");
        Scanner sn = new Scanner(System.in);
        Integer colorChoise = sn.nextInt();
        String color_min;
        switch (colorChoise) {
            case 1:
                color_min = "White";
                break;
            case 2:
                color_min = "Black";
                break;
            case 3:
                color_min = "Silver";
                break;
            default: color_min = "Black";
        }
        for (Notebook notebook: my_nb){
            if (notebook.getColor().equals(color_min)) newSet.add(notebook);
        }
        return newSet;
    }


}
