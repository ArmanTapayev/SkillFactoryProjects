package PracticeWeek.MiddleTasks.Task10;

public class Mage {
    public String name;
    public int level;
    public int damage;
    public String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return "{" + this.name + ", " + this.level + ", " + this.damage + ", " + this.type + "}";
    }

    String fight(Mage mage) {
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.name;
        else if (this.type.equals("ice") && mage.type.equals("earth")) return this.name;
        else if (this.type.equals("earth") && mage.type.equals("fire")) return this.name;
        else if (!this.type.equals(mage.type)) return mage.name;
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}
