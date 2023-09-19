public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private String strength;
    private String race;
    private int yearCreated;

    public Superhero(String name, String realName, String superPower, int yearCreated, String race, String strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.race = race;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getStrength() {
        return strength;
    }

    public String getRace() {
        return race;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", strength='" + strength + '\'' +
                ", race='" + race + '\'' +
                ", yearCreated=" + yearCreated +
                '}';
    }
}