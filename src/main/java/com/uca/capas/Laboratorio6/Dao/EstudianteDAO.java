package com.uca.capas.Laboratorio6.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;

import com.uca.capas.Laboratorio6.Domain.Estudiante;



public interface EstudianteDAO {
	public List<Estudiante> findAll() throws DataAccessException;
	
	public Estudiante findOne(Integer codigo) throws DataAccessException;
	
	@Transactional
	public void insertarEstudiante(Estudiante estudiante) throws DataAccessException;
	
	public void eliminarEstudiante(Estudiante estudiante) throws DataAccessException;
	
	public void save(Estudiante estudiante) throws DataAccessException;
	
	public void delete(Integer codigoEstudiante) throws DataAccessException;
	
}
