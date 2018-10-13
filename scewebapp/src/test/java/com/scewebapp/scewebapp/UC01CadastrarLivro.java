package com.scewebapp.scewebapp;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.scewebapp.models.Livro;
import com.scewebapp.repository.LivroRepository;

public class UC01CadastrarLivro {
	
	//** The factory that produces entity manager. */
	private static EntityManagerFactory mEmf;
	//** The entity manager that persists and queries the DB. */
	private static EntityManager mEntityManager;
	@Autowired
	private static LivroRepository er;
	private static Livro livro;
	@BeforeClass
	public static void initTestFixture() throws Exception {
		livro = new Livro();
	    // Get the entity manager for the tests.
//	    mEmf = Persistence.createEntityManagerFactory(null);
//	    mEntityManager = mEmf.createEntityManager();
	 
	}
	@Test
	public void teste() {
		er.save(livro);
	}

	 /**
	 * Cleans up the session.
	 */
	@AfterClass
	public static void closeTestFixture() {
	   
//	    mEmf.close();
	}

}
