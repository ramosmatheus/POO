package banco;

public class Conexao {
	
	private static String conexao;
	
	public static String get() {
		try {
			if(conexao == null) {
				conexao = "realizar conexão";
				
			}
			return conexao;
		}catch(Exception e ) {
			e.printStackTrace();
			return null;
		}
	}

}
