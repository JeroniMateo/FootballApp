package Competition;

public class Player {
    private String Name;
    private String item;
    private String Surname;
    private Integer age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
