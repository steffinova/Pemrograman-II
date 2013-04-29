package com.p2.jdbc.latihan;

import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update
{
	public static void main(String[] args)
	{
		try
		{
			//parameter yang dikirim adalah host, port, nama DB, user dan password
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","");
			Statement stm = conn.createStatement();
			String query = "update produk set nama='Lala', harga='4500' where id=1";
			int hasil = stm.executeUpdate(query);
			
			if(hasil == 1)
			{
				JOptionPane.showMessageDialog(null,"berhasil update");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"gagal update");
			}
		}
		catch(SQLException e)
		{
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
		}
	}
}