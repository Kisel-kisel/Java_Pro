package homeWork1;

public class Person {
    String name;

    int age;

    int height;

    int weight;

//    privet int money;

    public Person(String name, int age, int heigh, int weight){
        this.name = name;
        this.age = age;
        this.height = heigh;
        this.weight = weight;
    }

    public Person(){

    }

   public void infoAboutPerson(){
       System.out.println(name + " is " + age + " years old with height:" + height + " and weight:" + weight + "!");
   }

   public void canGoToWork(){
       if(age < 18 || age >70){
           System.out.println("I can rest at home!");
       }else {
           System.out.println("I have to go on work!");
       }
   }

//   public int getMoney(){
//        return money;
//   }
}
