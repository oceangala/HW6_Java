public class Sem6_vet {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.sex = true;
        barsik.isVaccinated = false;
        barsik.setName("barsik");
        barsik.birthDate = 0;
        barsik.breed = "Наглая морда";
        barsik.ownerName = "Вася";
        barsik.id_owner = 100;
        barsik.id_cat= 1000;

        System.out.println(barsik.toString());
        barsik.isVaccinated = Cat.changeVaccinated(barsik.isVaccinated);
        System.out.println(barsik.toString());
    }

}
