package br.etec.sebrae.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.etec.sebrae.login.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

}
