abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void getWeight(double weight) {
        this.weight = weight;
    }
    public abstract void eat();
    public abstract void getVoice ();

    @Override
    public String toString() {
        return  "Animal{" + "name=" + name + ", age=" + age + ", weight=" + weight + '}';
    }
}

