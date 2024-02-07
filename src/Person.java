public abstract class Person {
    private String name;

    public String getName() { return name; }

//    public Person() {
//        System.out.println("Im constructor is default");
//    }

    public Person() {
    }

    public Person(String name){
        this.name=name;
    }

    public void open(){
        System.out.println("Open Door");
    };
    public void display(){

        System.out.printf("Person %s \n", name);
    }
}
