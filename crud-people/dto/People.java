package dto;

public class People {
    private String name;
    private int age;
    private boolean married;

    public People(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
