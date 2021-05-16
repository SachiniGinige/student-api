package com.example.studentapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentRepository {

    void save (Student student);

    Student get(String id);

    void deleteById(String id);

    void update(String id, Student student);
}
