class Teacher
	{
	  private String name;
	  Teacher(String name)
	  {
	    this.name = name;
	  }
	  public String getTeacherName()
	  {
	    return this.name;
	  }
	}
	class Studentt
	{
	  private String name;
	  Studentt(String name)
	  {
	    this.name = name;
	  }
	  public String getStudentName()
	  {
	    return this.name;
	  }
	}
	class Association
	{
	  public static void main (String[] args)
	  {
	    Teacher teacherObj = new Teacher("Praveen Sir");
	    Studentt studentObj = new Studentt("Renuka");
	    System.out.println(studentObj.getStudentName() +
	        " is Student of " + teacherObj.getTeacherName());
	  }
	}

