package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
	Department departamento = new Department(1, "Roupas");
	Seller seller = new Seller(1, "Keven", "keveenalison@gmail.com",new Date(), 1000.0, departamento);
	
	System.out.println(departamento);
	System.out.println(seller);
	}
}
