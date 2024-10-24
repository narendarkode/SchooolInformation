package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Entity
@Data
@Document(collection="Schools")
public class School {
    @Id
    private String id;
    private String SchoolName;
    private  String city;
    private String principalName;
    private String SchoolType;
    private int grades;

    public School(int grades, String schoolType, String principalName, String city, String schoolName, String id) {
        this.grades = grades;
        SchoolType = schoolType;
        this.principalName = principalName;
        this.city = city;
        SchoolName = schoolName;
        this.id = id;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String getSchoolType() {
        return SchoolType;
    }

    public void setSchoolType(String schoolType) {
        SchoolType = schoolType;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
