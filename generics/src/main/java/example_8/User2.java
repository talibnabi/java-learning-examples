package example_8;

public class User2<A> extends User3<Integer> {
    public A name;
    public A surname;
    public A schoolName;
    public int age;

    public User2() {

    }

    public User2(A name, A surname, A schoolName, int age) {
        this.name = name;
        this.surname = surname;
        this.schoolName = schoolName;
        this.age = age;
    }

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public A getSurname() {
        return surname;
    }

    public void setSurname(A surname) {
        this.surname = surname;
    }

    public A getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(A schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ",Surname: " + this.surname + ",School name: " + this.schoolName + ",Age: " + this.age;
    }
}
