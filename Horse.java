//SuperClass or Parent Class
public class Horse {
    private String name;
    private String color;
    private int birthYear;

    //Constructor
    public Horse (String name, String color, int birthYear){
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }
    //Getter and Setter Methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

}
