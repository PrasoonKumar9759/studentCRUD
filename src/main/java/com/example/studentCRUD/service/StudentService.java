package com.example.studentCRUD.service;

import com.example.studentCRUD.model.Student;
import com.example.studentCRUD.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public int save(Student student) {
        return repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Integer id) {
        return repository.findById(id);
    }

    public int update(Integer id, Student student) {
        return repository.update(id, student);
    }

    public int delete(Integer id) {
        return repository.delete(id);
    }
}