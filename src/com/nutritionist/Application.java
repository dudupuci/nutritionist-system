package com.nutritionist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.nutritionist.entities.Nutritionist;
import com.nutritionist.entities.Patient;
import com.nutritionist.exception.SystemException;

public class Application {

	// panel.add(scrollpane);
	// JList, JPanel, JScrollPane
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Integer response = null;

		Nutritionist main = new Nutritionist("Ricardo Gatti", "Sportist", 1200.50);
		List<Nutritionist> list = new ArrayList<>();
		List<Patient> listPatient = new ArrayList<>();

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

						Integer registers = Integer
								.parseInt(JOptionPane.showInputDialog(null, "Please, enter the number of registers:",
										"Registering Nutritionist's", JOptionPane.QUESTION_MESSAGE));

						for (int i = 0; i < registers; i++) {
							String name = JOptionPane.showInputDialog(null, "#" + (i + 1) + " Nutritionist name: ");
							String specialty = JOptionPane.showInputDialog(null,
									"#" + (i + 1) + " Nutritionist specialty: ");
							Double salary = Double.parseDouble(
									JOptionPane.showInputDialog(null, "#" + (i + 1) + " Nutritionist salary: "));
							// Registered.
							JOptionPane.showMessageDialog(null,
									"Registered and saved! Nutritionist number #" + (i + 1) + " (" + name + ")");

							Nutritionist n = new Nutritionist(name, specialty, salary);
							n.registerNutritonist(list, n);

						}

						break;
					case 2:
						if (list.size() == 0) {
							JOptionPane.showMessageDialog(null, "The list is empty", "Error captured",
									JOptionPane.ERROR_MESSAGE);

						} else {

							for (Nutritionist x : list) {
								System.out.println(x);
							}
							System.out.print("Delete by index: ");
							Integer num = read.nextInt();
							list.remove(num.intValue());

						}

						break;

					case 3:
						if (list.size() == 0) {
							JOptionPane.showMessageDialog(null, "The list is empty", "Error captured",
									JOptionPane.ERROR_MESSAGE);

						} else {

							for (Nutritionist x : list) {
								System.out.println("Listed: " + x);
							}

						}

						break;
					}

				} else if (response == 2) {

					System.out.println("----------- P A T I E N T' S -----------");
					System.out.println("(1) Register a new Patient");
					System.out.println("(2) Delete a existent Patient");
					System.out.println("(3) Show all patient's list");

					Integer menuPatients = read.nextInt();

					switch (menuPatients) {
					case 1:

						Integer registers = Integer
								.parseInt(JOptionPane.showInputDialog(null, "Please, enter the number of registers:",
										"Registering Patient's", JOptionPane.QUESTION_MESSAGE));

						for (int i = 0; i < registers; i++) {
							try {
								String name = JOptionPane.showInputDialog(null, "#" + (i + 1) + " Patient name: ");
								String sex = JOptionPane.showInputDialog(null, "#" + (i + 1) + " Patient sex: ");
								String birthDate = JOptionPane.showInputDialog(null,
										"#" + (i + 1) + " Patient birthDate: ");
								// Registered.
								JOptionPane.showMessageDialog(null,
										"Registered and saved! Nutritionist number #" + (i + 1) + " (" + name + ")");
								Patient p = new Patient(name, sex, sdf.parse(birthDate), main);
								p.registerPatient(listPatient, p);
							} catch (ParseException e) {
								System.out.println(e.getMessage());
							}
						}

						break;
					case 2:
						if (listPatient.size() == 0) {
							JOptionPane.showMessageDialog(null, "The list is empty", "Error captured",
									JOptionPane.ERROR_MESSAGE);

						} else {

							for (Patient x : listPatient) {
								System.out.println(x);
							}
							System.out.print("Delete by index: ");
							Integer num = read.nextInt();
							listPatient.remove(num.intValue());

						}

						break;

					case 3:
						if (listPatient.size() == 0) {
							JOptionPane.showMessageDialog(null, "The list is empty", "Error captured",
									JOptionPane.ERROR_MESSAGE);

						} else {

							for (Patient x : listPatient) {
								System.out.println("Listed: " + x);
							}

						}

						break;
					}

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
			for (Nutritionist x : list) {
				System.out.println(x);
			}
			for (Patient x : listPatient) {
				System.out.println(x);
			}
			for (Nutritionist x : list) {
				System.out.println(x);
			}

		}

		read.close();
	}

}
