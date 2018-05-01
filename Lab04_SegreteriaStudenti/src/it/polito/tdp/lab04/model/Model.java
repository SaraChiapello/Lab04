package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	StudenteDAO SDAO=new StudenteDAO();
	CorsoDAO CDAO=new CorsoDAO();
	private List<Corso> corsi ;
	public Model() {
		super();
	}
	public List<Corso> getTuttiICorsi() {
		// TODO Auto-generated method stub
	
		
		return CDAO.getTuttiICorsi() ;
	}

}
