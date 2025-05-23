package com.generation.lojagames.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// SELECT * FROM tb_usuario WHERE usuario = "usuarios";
	public Optional<Usuario> findByUsuario(String usuario);
}