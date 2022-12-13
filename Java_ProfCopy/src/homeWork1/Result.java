package homeWork1;

public class Result {
    public static void main(String[] args) {
    Person person = new Person();
    Person secondPerson = new Person("Agata", 28, 174, 58);
    Person thirdPerson = new Person();
    Person fourth = new Person();

    person.name = "Tom";
    person.age = 17;
    person.height = 203;
    person.weight = 94;

    thirdPerson.name = "Alex";
    thirdPerson.age = 87;
    thirdPerson.height = 183;
    thirdPerson.weight = 89;


    System.out.println(person);
    System.out.println(person.weight);

    System.out.println(secondPerson);
    System.out.println(secondPerson.age);
    System.out.println(secondPerson.height);

    System.out.println(thirdPerson.age);
    System.out.println(thirdPerson.name);

    System.out.println(fourth);

    person.infoAboutPerson();
    secondPerson.infoAboutPerson();
    thirdPerson.infoAboutPerson();

    person.canGoToWork();
    secondPerson.canGoToWork();
    thirdPerson.canGoToWork();




    }
}
