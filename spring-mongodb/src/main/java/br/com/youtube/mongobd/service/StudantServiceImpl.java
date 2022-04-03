package br.com.youtube.mongobd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.youtube.mongobd.model.StudentRequest;
import br.com.youtube.mongobd.model.StudentResponse;
import br.com.youtube.mongobd.persistence.repository.entity.Student;
import br.com.youtube.mongobd.persistence.repository.entity.StudentRepository;

public class StudantServiceImpl implements StudantService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public StudentResponse create(StudentRequest request) {
		Student student =  new Student();
		student.setNome(request.getNome());
		student.setDocument(request.getDocument());
		student.setBirthDate(request.getBirthDate());
		
		repository.save(student);
	
		return createResponse(student);
	}

	@Override
	public List<StudentResponse> getAll() {
		List<StudentResponse> responses = new ArrayList<>();
		List<Student> students = repository.findAll();
		
		if(!students.isEmpty()) {
			students.forEach(student -> responses.add(createResponse(student)));
		}
		
		return responses;
	}
	
	
	private StudentResponse createResponse(Student student) {
		StudentResponse response = new StudentResponse();
		response.setId(student.getId());
		response.setNome(student.getNome());
		response.setDocument(student.getDocument());
		response.setBirthDate(student.getBirthDate());
		
		
		return response;
		
	}

}
