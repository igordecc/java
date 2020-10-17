package kotleta;

import javax.persistence.*;

@Entity
@Table(name="Gonorus")
public class Gonorus {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name = "id" )
    private int id;

    @Column( name = "name")
    private String name;

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

    public Gonorus(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
