package settimana1;

import java.time.LocalDate;

public class CourseEdition {
	public Course type;
	public static String uniqueCode;
	public LocalDate startDate;
	public LocalDate endDate;
	public static final int MAX_STUDENT_NUMBER = 24;
	public Student[] studentList = new Student[MAX_STUDENT_NUMBER];
	public int studentCount;
	public Professor mario;

	public CourseEdition(Course type, String uniqueCode, LocalDate startDate, LocalDate endDate, Professor mario) {
		this.type = type;
		this.uniqueCode = uniqueCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.mario = mario;
	}

	public void addStudent(Student ciccio) {
		if (studentCount < studentList.length) {
			studentList[studentCount] = ciccio;
			studentCount++;
		}
	}

	public boolean addStudentFattoBene(Student ciccio) {
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i] == null) {

				studentList[i] = ciccio;
				return true;
			}

		}
		return false;
	}

	public void report() {
		System.out.println("Il codice del corso è " + CourseEdition.uniqueCode);
		System.out.println("La data di partenza è " + startDate);
		System.out.println("Il docente responsabile è " + mario.name + " " + mario.surname);
		System.out.println("Gli studenti iscritti sono " + studentCount);
		System.out.println("I nomi degli studenti iscritti sono i seguenti:");
		for (int i = 0; i < studentCount; i++) {
			System.out.println(studentList[i].name + " " + studentList[i].surname);

		}
	}

}
