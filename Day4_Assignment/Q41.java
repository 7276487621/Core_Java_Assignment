class Person {
  String name;
  int age;

  Person() {
    this("SSS",81);
    //   name="Sachin";
    // age=25;
    System.out.println("No arg cons");
  }

  Person(String name) {
    this();
    // this.name=name;
    //age=24;
    System.out.println("ONE arg cons");
  }

  Person(String name, int age) {
    //this.name=name;
    //this.age=age;
    System.out.println("TWO arg cons");
  }
}

class PersonDemo1{

  public static void main(String[] args) {
    //   Person p1=new Person();
    Person p2 = new Person("Sachin");
    // Person p3=new Person("Parag",25);
  }
}
