package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banco.Fabrica;
import entidade.Categoria;

public class DAOCategoria {

	public Categoria salvar(Categoria categoria) {
		EntityManagerFactory fabrica = Fabrica.get();
		
		EntityManager manager = fabrica.createEntityManager();// Representa conexão, salvar, alterar, excluir,
																// consultar.
		System.out.println("Gerenciador de transação");
		EntityTransaction transacao = manager.getTransaction();// Gerenciar transaçao

		try {
			
			System.out.println("iniciar transação");
			transacao.begin();// Inicia transacao
			System.out.println("INSERT INTO CATEGORIA (..)...");
			// Passar objeto entidade
			manager.persist(categoria); // Salva
			manager.merge(categoria);// Altera
			manager.remove(categoria);// Remove
			// manager.find(x, z);// Consulta
			System.out.println("CONFIRMAR transação");
			transacao.commit();// Envia transacao


			return null;

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();

			return null;
		} finally {
			System.out.println("encerrar conexão");
		}

	}

}
