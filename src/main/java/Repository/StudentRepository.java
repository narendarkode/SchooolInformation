package Repository;


import Model.StudentInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentInformation, String> {
}
