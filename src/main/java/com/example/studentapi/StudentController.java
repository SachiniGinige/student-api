package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST ENDPOINTS

    //Create a Student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    //Retrieve a Student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //Delete a Student
    @DeleteMapping("student/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.deleteById(id);
    }

    //Update Student
    @PutMapping("student/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable String id){
        repository.update(id, student);
    }

}
