package Animal;

public class PetMain {
    public static void main(String[] args) {
        Pet pet1 = new Pet("lucas",1,"bulldog","black");
        Pet pet2 = new Pet("Lola",2,"Pincher","white");
        Pet pet3 = new Pet("Toby",3,"Pekinés","brown");

        System.out.println("Pet 1: Name: " + pet1.getName() + ", Age: " + pet1.getAge() + ", Race: " + pet1.getRace() + ", Color: " + pet1.getColor());
        System.out.println("Pet 2: Name: " + pet2.getName() + ", Age: " + pet2.getAge() + ", Race: " + pet2.getRace() + ", Color: " + pet2.getColor());
        System.out.println("Pet 3: Name: " + pet3.getName() + ", Age: " + pet3.getAge() + ", Race: " + pet3.getRace() + ", Color: " + pet3.getColor());

        pet1.setAge(2);
        pet2.setName("Lulu");
        System.out.println("Pet 1: Name: " + pet1.getName() + ", Age: " + pet1.getAge() + ", Race: " + pet1.getRace() + ", Color: " + pet1.getColor());
        System.out.println("Pet 2: Name: " + pet2.getName() + ", Age: " + pet2.getAge() + ", Race: " + pet2.getRace() + ", Color: " + pet2.getColor());


    }
}
