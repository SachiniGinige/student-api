package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    Map<String, Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        database.put(student.id, student);
        System.out.println("Student saved in database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }

    @Override
    public void deleteById(String id) {
        database.remove(id);
        System.out.println("Student deleted from database");
    }

    @Override
    public void update(String id, Student student) {
        database.put(student.id, student);
        System.out.println("Student updated");
    }


}
