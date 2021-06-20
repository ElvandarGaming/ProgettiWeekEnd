package settimana1;

public class Skill {
	public String skillType;
	public String specialization;
	public int skillLevel;
	public static final int MAX_SKILL_LEVEL = 10;
	
	public Skill() {
	}

	public Skill(String skillType, String specialization, int skillLevel) {
		this.skillType = skillType;
		this.specialization = specialization;
		this.skillLevel = skillLevel;
	}
	
	public void printSkill() {
		System.out.println("Il livello di abilit� in " + skillType + " e specializzazione " + specialization + " � di " + skillLevel+ "/" + MAX_SKILL_LEVEL );
	}
	
	
	
}
