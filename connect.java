import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class Connect {
    public static void main (String args []) {
	try {
		System.out.println("Start to connect DataBase.");
		Class.forName ("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://10.9.6.95:3306/bishkek?autoReconnect=true&useSSL=false", "root", "root");
	/*	Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String sqlQuary = "SELECT * FROM EMPLOYEES";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		ResultSetMetaData metaData = resultSet.getMetaData();
		int numberOfcolumns = metaData.getColumnCount();
		String y = " ";
		while (resultSet.next()) {
			for (int i = 1; i <= numberOfColumns; i++) {
				String value = resultSet.getString(i);
				System.out.print (value + " | ");
				y = y + value + " | ";
	
			}
		System.out.println ();
                
		}

    javax.swing.JOptionPane.ShowMessageDialog (new javax.swing.Jframe () , y);    



*/	System.out.println("End to Connect DatBase.");
	} catch (ClassNotFoundException cne) {
                System.out.println ("Error:" + cne);
		
	} catch (SQLException sqle) {

		System.out.println("Error:" + sqle);

	}
    }
}
