import java.util.Scanner;
public class Main {
	public static void main(String[] args) {	
	Scanner scanner=new Scanner(System.in);
	Teacher t1=new Teacher("Mahmut Hoca ","050555765","TRH");
	Teacher t2=new Teacher("Ahmet Hoca ","050500000","MAT");
	Teacher t3=new Teacher("Külyutmaz ","050999990","BIO");
		Courses tarih=new Courses("TARİH","t101","TRH");
		Courses tarih2=new Courses("TARİH","t102","TRH");	
		Courses mat=new Courses("MATEMATİK","m101","MAT");
	Courses mat2=new Courses("MATEMATİK","m102","MAT");	
	Courses bio=new Courses("BIOLOJI","b101","BIO");
	Courses bio2=new Courses("BIOLOJI","b102","BIO");
		tarih.addTeacher(t1);
		mat.addTeacher(t2);
		bio.addTeacher(t3);	
	System.out.println("Öğrenciyi seçiniz.\n"+ "1--İNEK ŞABAN\n"+ "2--GÜDÜK NECMİ");
	int select=scanner.nextInt();
	System.out.println("-----");
		if(select==1)
		{
			student s1=new student("İNEK ŞABAN","123","4",tarih,tarih2,mat,mat2,bio,bio2);
			s1.addBulkExamNote(100,100, 100,80, 100,60  );
			s1.isPass();		
		}
		else if(select==2)
		{
			student s2=new student("GÜDÜK NECMİ","999","4",tarih,tarih2,mat,mat2,bio,bio2);
			s2.addBulkExamNote(80,80,80,25,80,10);
			s2.isPass();
		}
		else
		{
		System.out.println("YANLIŞ GİRİŞ");
		}	
											
	}

}
