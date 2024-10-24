package Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentInformation {
    @Id
    private String Id;
    private String firstName;
    private String lastName;
    private String standard;

    public StudentInformation(String id, String firstName, String lastName, String standard) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.standard = standard;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
