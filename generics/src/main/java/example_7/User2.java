package example_7;

public class User2<A> {
    public A name;
    public A surname;
    public A schoolName;

    public User2() {

    }

    public User2(A name, A surname, A schoolName) {
        this.name = name;
        this.surname = surname;
        this.schoolName = schoolName;
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

    public String toString() {
        return "Name: " + this.name + ",Surname: " + this.surname + ",School Name: " + this.schoolName;
    }
}

