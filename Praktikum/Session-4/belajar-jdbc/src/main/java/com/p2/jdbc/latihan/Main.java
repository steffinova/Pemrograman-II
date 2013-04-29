package com.p2.jdbc.latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.BigDecimal;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			//parameter yang dikirim adalah host, port, nama DB, user dan password
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","");
			String query = "insert into produk(nama,harga) values (?,"+new BigDecimal(23000)+")";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,"Steffi");
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
	}
}