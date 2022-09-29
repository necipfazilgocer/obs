
public class Teacher {
	String name; 
	String mpno;
	String branch;
	
	Teacher(String name,String mpno,String branch){
	this.name=name;
	this.branch=branch; 
	this.mpno=mpno;	
	}
	
	void printTeacherInfo() {
	System.out.println(this.branch+" HOCASI :  "+this.name);
	System.out.println("BÖLÜMÜ:  "+this.branch);
	}
	

	

}
