package br.com.youtube.mongobd.service;

import java.util.List;

import br.com.youtube.mongobd.model.StudentRequest;
import br.com.youtube.mongobd.model.StudentResponse;

public interface StudantService {

	StudentResponse create(StudentRequest request);
	
	List<StudentResponse> getAll();
}
