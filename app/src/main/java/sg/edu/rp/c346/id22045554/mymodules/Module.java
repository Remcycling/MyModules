package sg.edu.rp.c346.id22045554.mymodules;

public class Module implements java.io.Serializable {

    public String code;
    public String name;
    public String ven;
    public int year;
    public int sem;
    public int cred;

    public Module(String code, String name, int year, int sem, int cred, String ven){
        this.code = code;
        this.name = name;
        this.year = year;
        this.sem = sem;
        this.cred = cred;
        this.ven = ven;

    }


}
