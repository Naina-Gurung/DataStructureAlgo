package checklist;


public class TreeEmployee {

    int e_id;
    String e_name;
    String designation;

    public TreeEmployee(int e_id, String e_name, String designation) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.designation = designation;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
