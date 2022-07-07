package com.nutritionist;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.nutritionist.entities.Employee;
import com.nutritionist.entities.Nutritionist;
import com.nutritionist.entities.Patient;
import com.nutritionist.exception.SystemException;

public class Application {

	// panel.add(scrollpane);
	// JList, JPanel, JScrollPane
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Integer response = null;

		List<Nutritionist> set = new ArrayList<>();
		Nutritionist nutritionist1 = new Nutritionist("Ricardo Gatti", "Sportist", 6400.50);
		Patient patient1 = new Patient("Lorena Moran", 'F', Instant.now(), nutritionist1);
		Employee employee1 = new Employee("Cristina Aguilera", "Anesthesist", 2520.50);

		try {
			do {
				System.out.println("Welcome! Nutrition System v1.0 by @dudupuci");
				System.out.println("(1) Acess Nutritionist's ");
				System.out.println("(2) Acess Patients");
				System.out.println("(3) Acess Employees");
				System.out.println("(0) Exit system");
				response = read.nextInt();

				if (response == 0) {
					System.exit(0);
				} else if (response == 1) {

					System.out.println("----------- N U T R I T I O N I S T' S ----------- ");
					System.out.println("(1) Register a new Nutritionist");
					System.out.println("(2) Delete a existent Nutritionist");
					System.out.println("(3) Show all nutritionist's list");
					Integer menuNutri = read.nextInt();

					switch (menuNutri) {
					case 1:
						System.out.print("Please, insert the quantity of registers:");
						Integer registers = read.nextInt();
						for (int i = 0; i < registers; i++) {
							System.out.print("#" + (i + 1) + " Nutritionist name: ");
							String name = read.next();
							System.out.print("#" + (i + 1) + " Nutritionist specialty: ");
							String specialty = read.next();
							System.out.print("#" + (i + 1) + " Nutritionist salary: ");
							Double salary = read.nextDouble();
							System.out.println(
									"Registered and saved! Nutritionist number #" + (i + 1) + " (" + name + ")");
							System.out.println();
							Nutritionist n = new Nutritionist(name, specialty, salary);
							n.registerNutritonist(set, n);
						}
						break;
					case 2:

						break;

					case 3:
						for (Nutritionist x : set) {
							System.out.println("Listed: " + x);
						}

						break;
					}

				} else if (response == 2) {

					System.out.println("----------- P A T I E N T' S -----------");
					System.out.println("(1) Register a new Patient");
					System.out.println("(2) Delete a existent Patient");
					System.out.println("(3) Show all patient's list");
				} else if (response == 3) {

					System.out.println("----------- E M P L O Y E E' S -----------");
					System.out.println("(1) Register a new Employee");
					System.out.println("(2) Delete a existent Employee");
					System.out.println("(3) Show all employee's list");
				}

			} while (response > 0 || response < 3);
		} catch (SystemException e) {
			System.out.println(e.getMessage());
		} finally {
			for (Nutritionist x : set) {
				System.out.println(x);
			}

		}

		read.close();
	}

}
