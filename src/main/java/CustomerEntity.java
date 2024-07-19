import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private double salary;

    public CustomerEntity(){
        System.out.println("CustomerEntity constructor called");
    }

    public CustomerEntity(String id, String name, String email, String address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
