package dao;

import banco.Conexao;
import entidade.Categoria;

public class DAOCategoria {
	
	public Categoria salvar(Categoria categoria) {
		
		try {
			String conexao = Conexao.get();
			System.out.println("Gerenciador de transação");
			System.out.println("iniciar transação");
			System.out.println("INSERT INTO CATEGORIA (..)...");
			System.out.println("CONFIRMAR transação");
			
			
			return null;
			
			
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			System.out.println("encerrar conexão");
		}
		
	}

}
