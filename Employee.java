public class Employee extends Person {

    private String badgeId;

    public Employee(String name, int age, String badgeId) {

        super(name, age);

        this.badgeId = badgeId;
    }

    public String getBadgeId() {
        return badgeId;
    }
    @Override
    public String toString() {

        String textBase = super.toString();

        return textBase + " | Crachá: " + this.badgeId;
    }
}