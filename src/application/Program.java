package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1,"books");
		System.out.println(department);

	}
}
