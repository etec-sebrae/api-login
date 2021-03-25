package br.etec.sebrae.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.etec.sebrae.login.dto.LoginDto;
import br.etec.sebrae.login.entity.LoginEntity;
import br.etec.sebrae.login.repository.LoginRepository;

@RestController
@RequestMapping(value = "/login/v1")
public class LoginController {

	@Autowired
	LoginRepository repository;

	@GetMapping(value = "/consultar_login")
	public ResponseEntity<?> findAllLogin() {		
		List<LoginEntity> listaLogins = repository.findAll();	
		return ResponseEntity.ok(listaLogins);
	}
	
	@PostMapping(path = "/adicionar_login" , consumes = "application/json", produces = "application/json" )
	public ResponseEntity<?> AddLogin(@RequestBody LoginDto dto) {		
		LoginEntity request = new LoginEntity(dto.getLogin(),dto.getPassword(),dto.getTipo(),dto.getNome());
		LoginEntity response = repository.save(request);		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<LoginEntity> findById(@PathVariable Long id) {		
		LoginEntity obj = repository.findById(id).get();	
		return ResponseEntity.ok(obj);
	}
	
	@PutMapping(path = "/atualizar_login" , consumes = "application/json", produces = "application/json" )
	public ResponseEntity<?> updateLogin(@RequestBody LoginEntity entity) {		
		LoginEntity response = repository.save(entity);		
		return ResponseEntity.ok(response);
	}
	
	
	@DeleteMapping(path = "/delete_login" , consumes = "application/json", produces = "application/json" )
	public ResponseEntity<?> deleteLogin(@RequestBody LoginEntity entity) {		
		 repository.delete(entity);		
		return ResponseEntity.ok("Login deletado com sucesso!");
	}
}
