package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import db.DB;
import db.DbIntegrityException;
import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = Daofactory.creatSellerDao();
		System.out.println("Test 1 ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("Test 2 ");
		Department department = new Department(2,null);
		List<Seller> list= sellerDao.findByDepartment(department);
		for(Seller seller1 : list){
			System.out.println(seller1);
		}
		System.out.println("Test 3 ");
		list= sellerDao.findAll();
		for(Seller seller1 : list){
			System.out.println(seller1);
		}

	}
}
