import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;
    private String surname;
    private String password;
    private String block;
    @Column(name = "phone_number")
    private String phoneNumber;

    // Getters and setters
}
