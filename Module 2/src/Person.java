public class Person {
private String name;
private String hobby;
private double gpa;

    public Person(){
        name = "";
        hobby = "";
        gpa = 0.0;

    }

    public Person(String name, String hobby, double gpa){
        this.name = name;
        this.hobby = hobby;
        this.gpa = gpa;

    }

    public String getName(){
        return name;
    }
        
    public String getHobby(){
        return hobby;
    }

    public double getGPA(){
        return gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return "Name: " + name + ", Hobby: " + hobby + ", GPA: " + gpa;}

    public boolean equals(Person a){
        if(this.name.equals(a.name) && this.hobby.equals(a.hobby) && this.gpa == a.gpa){
            return true;
        }
            return false;

        }   

    }
