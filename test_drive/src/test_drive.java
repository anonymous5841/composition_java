public class test_drive {

    public static void main(String[] args) {

        Music m1 = new Music("Atlantis", "1 hour", "song", new Date(12, 6, 2023), new Singer("seafret", "male", "American", new Date(1, 1,1986)));

        Music m2 = new Music("Atlan", "1 hour", "song", new Date(12, 6, 2023), new Singer("seafret", "male", "American", new Date(1, 1,1986)));

        System.out.println(m1);

        System.out.println(m1.equals(m2.getTitle()));


    }
}
