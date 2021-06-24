package jdbc;
import java.sql.Connection;

public class TesteBanco {

	public static void main(String[] args) {
		
		try {
			
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("ConexÃ£o OK!!!!");
		}
		catch(Exception e)
		{
			System.out.println("Erro na ConexÃ£o<<>>");
			System.out.println(e);
		}

	}

}
