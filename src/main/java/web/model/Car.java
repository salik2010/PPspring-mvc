package web.model;





public class Car {
    private String model;
    private String seria;
    private int age;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car(String model, String seria, int age) {
        this.model = model;
        this.seria = seria;
        this.age = age;
    }
}
