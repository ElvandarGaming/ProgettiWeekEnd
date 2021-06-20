package settimana1;

import java.time.LocalDate;

public class Student {
	public String name;
	public String surname;
	public LocalDate  bornDate;
	public String fiscalCode;
	public static final int MAX_SKILL = 10;
	public Skill[] skillList = new Skill[MAX_SKILL];
	public int skillCount;
	
	public Student() {
	}

	public Student(String name, String surname, int year , int month , int day , String fiscalCode, Skill skill) {
		this.name = name;
		this.surname = surname;
		this.bornDate = LocalDate.of( year , month  , day );
		this.fiscalCode = fiscalCode;
		addSkill(skill);

	}

	public Student(String name, String surname, Skill skill ) {
		this.name = name;
		this.surname = surname;
	}
		
		public boolean addSkill(Skill skill) {
			
			if(skillCount<skillList.length) {
				skillList[skillCount] = skill;
				skillCount++;
				return true;
			}
			return false;
		
		
		
		
	}

}
