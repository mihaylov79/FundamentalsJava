package ObjectAndClasses.Exercises.OpiniopPoll_03;

public class Person {

    private String name;
    private String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
}
