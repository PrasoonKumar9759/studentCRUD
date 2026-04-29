package com.example.studentCRUD.controller;

import com.example.studentCRUD.model.Student;
import com.example.studentCRUD.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        service.save(student);
        return "Student created";
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        service.update(id, student);
        return "Student updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service.delete(id);
        return "Student deleted";
    }
}