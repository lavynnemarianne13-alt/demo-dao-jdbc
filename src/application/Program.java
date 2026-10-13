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

		SellerDao sellerDao = Daofactory.creatSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}
}
