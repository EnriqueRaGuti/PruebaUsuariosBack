package com.sistema.examenes.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.entidades.Rol;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
