package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1,"books");
		System.out.println(department);
		Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0,department);
		SellerDao sellerDao = Daofactory.creatSellerDao();
		System.out.println(seller);

	}
}
