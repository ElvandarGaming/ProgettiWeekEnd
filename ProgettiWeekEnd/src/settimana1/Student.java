package settimana1;


import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Student {
	public String name;
	public String surname;
	public Date bornDate;
	public String fiscalCode;
	public static final int MAX_SKILL = 10;
	public Skill[] skillList = new Skill[MAX_SKILL];
	public int skillCount;

	public Student(String name, String surname, int bornDate, String fiscalCode, Skill skill) {
		this.name = name;
		this.surname = surname;
		this.bornDate = new Date(bornDate);
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
