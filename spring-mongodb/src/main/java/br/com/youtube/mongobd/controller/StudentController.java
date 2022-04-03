package br.com.youtube.mongobd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.youtube.mongobd.model.StudentRequest;
import br.com.youtube.mongobd.model.StudentResponse;
import br.com.youtube.mongobd.service.StudantService;

@RestController
@RequestMapping("/v1")
public class StudentController {
	
	@Autowired
	private StudantService service;
	
	@PostMapping
	public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest request){
		return ResponseEntity.ok(service.create(request));
	}
	
	public ResponseEntity<List<StudentResponse>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}

}
