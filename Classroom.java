
public class Classroom {
    public static void main(String[] args) {
        Wilder jean = new Wilder("Jean", true);
        Wilder paul = new Wilder("Paul", false);
        Wilder albert = new Wilder("albert", true);

        System.out.println(jean.whoAmI());
        System.out.println(paul.whoAmI());
        System.out.println(albert.whoAmI());

    }
}
