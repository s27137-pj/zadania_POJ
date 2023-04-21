public class Author {

    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Author(){
        this.surname = surname;
        this.name = "Adam";
        this.age = 50;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString(){
        return "Name: %s age: %s".formatted(name, age);
    }

}
