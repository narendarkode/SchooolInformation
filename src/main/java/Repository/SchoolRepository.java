package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import Model.School;
@Repository
public interface SchoolRepository extends MongoRepository<School, String> {
}
