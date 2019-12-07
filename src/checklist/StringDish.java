package checklist;


public class StringDish {
    private String name;
    private String[] spices;

    public StringDish(String dishName, String[] sp) {
        this.name = dishName;
        this.spices = sp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSpices() {
        return spices;
    }

    public void setSpices(String[] spices) {
        this.spices = spices;
    }
}
