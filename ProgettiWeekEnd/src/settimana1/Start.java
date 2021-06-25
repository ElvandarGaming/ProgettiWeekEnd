package settimana1;

import java.time.LocalDate;

public class Start {

	public static void main(String[] args) {
		
		
		Skill sk1 = new Skill("programmazione","Java",7);
		Skill sk2 = new Skill("lingua","Inglese",8);
		Skill sk3 = new Skill("programmazione","Phyton",5);
		Skill sk4 = new Skill("programmazione","c#",9);
		
		
		Professor p1 = new Professor("Riccardo", "Audano", true);
		//LocalDate.of(2016, 1, 1);
		Student[] studenti = new Student[10];
		studenti[0] = new Student("Mario" , "Rossi"  , 1994, 3 , 8, "BNTLCU94A28B546G", sk1);
		studenti[1] = new Student("Marco" , "Rossi"  , 1995 , 5 , 9, "BEYLCU94A28B546G", sk2);
		studenti[2] = new Student("Paolo" , "Rossi"  , 1997 , 5, 8, "BTRGLCU94A28B546G", sk3);
		studenti[3] = new Student("Giorgio" , "Rossi"  , 1998 , 8 , 6, "BRYTLCU94A28B546G", sk4);
		studenti[4] = new Student("Luca" , "Rossi"  , 1999 , 5 , 7, "BNTLCU94A28B546G", sk1);
		studenti[5] = new Student("Mario" , "Bianchi"  , 1990 , 5 , 7, "BJHGU94A28B546G", sk3);
		studenti[6] = new Student("Paolo" , "Bianchi"  , 1987, 7 , 9, "BNKJYJTU94A28B546G", sk4);
		studenti[7] = new Student("Giorgio" , "Bianchi"  , 1969 , 7 , 6, "BNTHHT94A28B546G", sk2);
		studenti[8] = new Student("Luca" , "Bianchi"  , 1996 , 3 , 1, "BNTLCU94A2YTJ546G", sk1);
		studenti[9] = new Student("Marco" , "Bianchi"  , 1988 , 3 , 6, "BNTHTYH94A28B546G", sk4);
		//Student[] studenti = {s1,s2,s3,s4,s5,s6,s7,s7,s8,s9,s10};
		
		
		Course backEnd = new Course( "Corso backEnd developer" , 3 , 8 , 3600.00);
		
		CourseEdition bkEnd05 = new CourseEdition(backEnd, "bkEnd05", LocalDate.of(2021,06,14), LocalDate.of(2021, 9, 11),p1 );
		//local date va usato come in course edition, non in student
		//System.out.println(s1.bornDate);
		//System.out.println(s10.bornDate);
		
		for(int i = 0; i<studenti.length; i++) {
			bkEnd05.addStudent(studenti[i]);
			
		}
		
		bkEnd05.report();
		
	/*
			bkEnd05.addStudent(s1);
			bkEnd05.addStudent(s2);
			bkEnd05.addStudent(s3);
			bkEnd05.addStudent(s4);
			bkEnd05.addStudent(s5);
			bkEnd05.addStudent(s6);
			bkEnd05.addStudent(s7);
			bkEnd05.addStudent(s8);
			bkEnd05.addStudent(s9);
			bkEnd05.addStudent(s10);
		*/
		/*public boolean equals(Object o) {
			Class x = o.getClass();
			if(x != Articolo.class) {
				return false;
			}
			Articolo altro = (Articolo) o;
			
			if(this.artCod.equals(altro.artCod)) {
				return true;
			}
			return false;
		}*/
		
		
		
		
		
		
		//System.out.println(bkEnd05.studentList[0].name);
		//System.out.println(bkEnd05.studentList[8].name);
	
		
	}
}

// LocalDate.of(2016, 1, 1)