package entity;

public class PersonEntity {

    private String fullname;
    private int age;

    public PersonEntity(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void setFullname(String fullname){
        this.fullname=fullname;
    }

    public String getFullname(){
        return fullname;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
