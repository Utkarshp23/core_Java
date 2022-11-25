class Student
{
	int id;
	float per;
	


	Student(int id,float per)
	{
		this.id=id;
		this.per=per;
		
	}
	
	public String grade()
	{
		String s="";
		if(per>=90)
		s+="Excellent";
		else if((per>=80)&&(per<90))
		s+="Very Good";
		else if((per>=70)&&(per<80))
		s+="Good";
		else if((per>=60)&&(per<70))
		s+="Average";
		else if((per>=40)&&(per<60))
		s+="Pass";
		else if((per<40))
		s+="Fail";

		return s;
	}
	
}