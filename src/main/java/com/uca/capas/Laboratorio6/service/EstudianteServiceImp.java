package com.uca.capas.Laboratorio6.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.Laboratorio6.Dao.EstudianteDAO;
import com.uca.capas.Laboratorio6.Domain.Estudiante;

@Service
public class EstudianteServiceImp implements EstudianteService{
	
	@Autowired
	EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		return estudianteDAO.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		return estudianteDAO.findOne(code);
	}
	
	@Transactional
	@Override
	public void save(Estudiante estudiante) throws DataAccessException {
		estudianteDAO.save(estudiante);
	}
	
	@Transactional
	@Override
	public void delete(Integer codigoEstudiante) throws DataAccessException {
		estudianteDAO.delete(codigoEstudiante);
	}
	
}
