package kotleta;

import javax.persistence.*;

@Entity
@Table(name="TournamentWinners")
public class TournamentWinners {
    @Id
    @Column( name = "tournament" )
    private String tournament;

    @Column( name = "year" )
    private int year;

    @Column( name = "winner")
    private String winner;

    public TournamentWinners(String tournament, int year, String winner){
        this.tournament = tournament;
        this.year = year;
        this.winner = winner;
    }

    public TournamentWinners() {
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}

