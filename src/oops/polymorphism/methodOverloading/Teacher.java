package oops.polymorphism.methodOverloading;

public class Teacher {
    private String name;
    private int id;

    public Teacher(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "Teacher{name: " + name + ", id: "+id+"}";
    }
}
