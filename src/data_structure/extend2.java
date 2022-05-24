package data_structure;

public class extend2 {
    public static void main(String[] args) {
        Student1 a = new Student1();
        a.setName1("杨晓东");
        a.setSchool("高中");
        System.out.println(a.getName1()+" "+a.getSchool());
    }
}

class Person{
    private String name;
    public void setName1(String name){
        this.name = name;
    }
    public String getName1(){
        return this.name;
    }
}

class Student1 extends Person{
    private String school;
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return this.school;
    }
}
