class Students 
{
	//states
	String name;
	double marks;
	int id;
	static String school="st-joseph";
	//constructor
	public Students(String name,double marks,int id){
		//Loading instruction
		this.name=name;
		this.marks=marks;
		this.id=id;
	}         
	
	//behaviour
	public void detailsOfStudents(){
		System.out.println("student name:"+name);
		System.out.println("student mark:"+marks);
		System.out.println("student id:"+id);
		System.out.println("school:"+school);
		System.out.println("****************");
	}
}
