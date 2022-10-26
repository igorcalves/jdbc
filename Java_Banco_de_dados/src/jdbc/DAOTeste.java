package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
	String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
	System.out.println(dao.incluir(sql, "luciana da Silva", 910));
	dao.incluir(sql, "igor da Silva", 900);
	dao.incluir(sql, "iago da Silva", 903);
	
	dao.close();
	
	
	}
}
