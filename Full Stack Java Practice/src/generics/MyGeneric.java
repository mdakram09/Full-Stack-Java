package generics;

public class MyGeneric<T,V> {
    private T firstName;
    private T lastname;

    private V age;
    private V salary;

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastname() {
        return lastname;
    }

    public void setLastname(T lastname) {
        this.lastname = lastname;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public V getSalary() {
        return salary;
    }

    public void setSalary(V salary) {
        this.salary = salary;
    }


}
