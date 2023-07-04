public class Ravenclaw extends student {
    int intelligence;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(String name, String surname, int magic, int teleportation, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magic, teleportation);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Когтевранцев: ");
        System.out.println("Умность: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
    }
    public void compareWith(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.intelligence + student1.wisdom + student1.wit;
        int sum2 = student2.intelligence + student2.wisdom + student2.wit;
        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Когтеврана.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Когтеврана.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Когтеврана.");
        }
    }

}
