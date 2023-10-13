package Medicinas;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerSide {
	public static void main(String[] args) throws Exception {

		LocateRegistry.createRegistry(1099);

		Stock pharmacy = new Stock();

		pharmacy.addMedicine("Paracetamol", 3.2f, 10);
		pharmacy.addMedicine("Mejoral", 2.0f, 20);
		pharmacy.addMedicine("Amoxilina", 1.0f, 30);
		pharmacy.addMedicine("Aspirina", 5.0f, 40);

		Naming.rebind("rmi://127.0.0.1:1099/PHARMACY", pharmacy);
		System.out.println("Server ready");
	}
}