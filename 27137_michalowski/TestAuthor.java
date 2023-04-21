public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Jan", "Matejko", 55); // pierwsszy myslnik

        Author a2 = new Author();
        a2.setSurname("Malysz");


        System.out.print("Author name = " + a1.getName() + " surname: " + a1.getSurname());
        System.out.println(", age = " + a1.getAge());
        System.out.print("Author name = " + a2.getName() + " surname: " + a2.getSurname());
        System.out.println(", age = " + a2.getAge());
        System.out.println(a2.toString());
    }
}