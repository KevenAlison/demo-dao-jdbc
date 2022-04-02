package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("==== TEST 1: seeller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("==== TEST 2: seeller findByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("==== TEST 3: seeller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("==== TEST 4: seeller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== TEST 4: seeller insert ====");
		Seller newSeller = new Seller(null, "Kymi", "kymiandersoon@gmail.com", new Date(), 2000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Seller insrted!");
		
		System.out.println("==== TEST 4: seeller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.upadte(seller);
		System.out.println("Update completed");
		

	}
}
