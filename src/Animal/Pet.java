package Animal;

public class Pet {
    private String name;
    private int age;
    private String race;
    private String color;


    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getRace() {
        return race;
    }

    public void setRace(java.lang.String race) {
        this.race = race;
    }

    public java.lang.String getColor() {
        return color;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }


    public Pet(java.lang.String name, int age, java.lang.String race, java.lang.String color) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.color = color;
    }
}
