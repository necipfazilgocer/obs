public class Courses {
	Teacher courseTeacher;
	Teacher teacher;
	String name;
	String  code;
	String prefix;
	int note;
	Courses(String name,String code,String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.teacher=teacher;
		int note=0;
}
	 public void addTeacher(Teacher t) {
	        if (this.prefix.equals(t.branch)) {
	            this.courseTeacher = t;	           
	        } else {
	            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
	        }
	    } 
		void print() {
		System.out.println("ADI:  "+this.name);
		System.out.println("TELEFONU:  "+this.code);
		System.out.println("BÖLÜMÜ:  "+this.prefix);
		}

}
