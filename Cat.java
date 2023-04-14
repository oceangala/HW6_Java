import java.util.Date;

public class Cat {
    private String name;
    public long birthDate;
    public boolean sex;
    public boolean isVaccinated;
    public String breed;
    public String ownerName;
    public Integer id_owner;
    public Integer id_cat;

    public void changeSex(){
        this.sex = !this.sex;
    }

//    public void changeVaccinated(){
//        this.isVaccinated = !this.isVaccinated;
//    }

    public void setName(String name){
        this.name = name;
    }

    public static boolean changeVaccinated(boolean isVaccinated){
        return  !isVaccinated;
    }

    @Override
    public String toString() {
        return String.format("id_cat:%d name:%s sex:%b vac:%b",
                id_cat, name, sex, isVaccinated);
    }
}
