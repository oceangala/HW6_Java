public class Notebook {
   // private Integer id_nb;
    private String name;
    private Integer ram;
    private Integer hd;
    private String os;
    private String color;

    public Notebook(String name, Integer ram, Integer hd, String os, String color){
     this.name = name;
     this.ram = ram;
     this.hd = hd;
     this.os = os;
     this.color = color;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public Integer getRAM() {return ram;}
    public void setRam(Integer ram) {this.ram = ram;}

    public Integer getHd() {return hd;}
    public void setHd(Integer hd) {this.hd = hd;}

    public String getColor() {return color;}
    public void setColor(String name) {this.color = color;}

    public String getOs() {return os;}
    public void setOs(String name) {this.os = os;}


 @Override
 public String toString() {
  return String.format("name:%s OS:%s HD:%d RAM:%d Color:%s", name, os, hd, ram, color);
 }

}
