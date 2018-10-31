public class Human {
    public enum Sex{
        MALE,
        FAMALE;
    }
    private int age;
    private double weight;
    private int height;

    private Sex sex;

    private double picepcVolume;
    private double chestVolume;
    private double waistVolume;
    private double hipVolume;

    public Human() {

    }

    public Human(int age, double weight, int height, Sex sex) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public Human(int age, double weight, int height, Sex sex, double picepcVolume, double chestVolume, double waistVolume, double hipVolume) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.picepcVolume = picepcVolume;
        this.chestVolume = chestVolume;
        this.waistVolume = waistVolume;
        this.hipVolume = hipVolume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getPicepcVolume() {
        return picepcVolume;
    }

    public void setPicepcVolume(double picepcVolume) {
        this.picepcVolume = picepcVolume;
    }

    public double getChestVolume() {
        return chestVolume;
    }

    public void setChestVolume(double chestVolume) {
        this.chestVolume = chestVolume;
    }

    public double getWaistVolume() {
        return waistVolume;
    }

    public void setWaistVolume(double waistVolume) {
        this.waistVolume = waistVolume;
    }

    public double getHipVolume() {
        return hipVolume;
    }

    public void setHipVolume(double hipVolume) {
        this.hipVolume = hipVolume;
    }


}
