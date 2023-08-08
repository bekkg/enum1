public class School {
    private int id ;
    private String name ;
    private Lessen lessen ;

    public School(int id, String name, Lessen lessen) {
        this.id = id;
        this.name = name;
        this.lessen = lessen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lessen getLessen() {
        return lessen;
    }

    public void setLessen(Lessen lessen) {
        this.lessen = lessen;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lessen=" + lessen +
                '}';
    }
}
