package kotleta;

import javax.persistence.*;

@Entity
@Table(name="DatesOfBirth")
public class DatesOfBirth {
    @Id
    @Column( name = "winner")
    private String winner;

    @Column( name = "dateOfBirth")
    private String dateOfBirth;

    public DatesOfBirth(String winner, String dateOfBirth) {
        this.winner = winner;
        this.dateOfBirth = dateOfBirth;
    }

    public DatesOfBirth() {
    }


    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
