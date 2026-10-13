package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.DB;
import db.DbIntegrityException;
import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = Daofactory.creatSellerDao();
		System.out.println("Test 1 ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("Test 2 ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller1 : list) {
			System.out.println(seller1);
		}
		System.out.println("Test 3 ");
		list = sellerDao.findAll();
		for (Seller seller1 : list) {
			System.out.println(seller1);
		}
		System.out.println("Test 4 ");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("Test 5 ");
		seller = sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("Test 6 ");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();

	}
}
