package Task2;



public class Kid {
      String name;
    int age;
    public Kid (String n, int a){
        this.name = n;
        this.age = a;
    }
    public int getAge () {
     return age;
    }
    public String getName () {
        return name;
    }
    public String toString () {
        return ("{name: " + name + " age: " + age + "}" + "\n");
}
}

