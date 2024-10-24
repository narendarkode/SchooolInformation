package Service;


import Model.School;
import Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    // is used to automatically inject dependencies into a class,
    // making it a fundamental part of Spring's Dependency Injection (DI) mechanism.
    private SchoolRepository schoolRepository;


    public List<School> getAllSchools(){
        return SchoolRepository.findAll();
    }




}
