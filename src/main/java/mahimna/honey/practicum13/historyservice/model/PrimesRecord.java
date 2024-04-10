package mahimna.honey.practicum13.historyservice.model;
@Entity
@Table
public class PrimesRecord {
    @Id
    @GenerativeValue
    private int id;
    private String customer;
    private String n;
    private boolean isPrime;

    public int getId() {return id;}
}
