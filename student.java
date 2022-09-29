public class student {
	double c1ort;
	double c2ort;
	double c3ort;
	String name;
	String stuNo;
	String classes;
	Courses c1;
	Courses c1soz;
	Courses c2;
	Courses c2soz;
	Courses c3;
	Courses c3soz;
	Double avarage;
	boolean isPass;
			student(String name,String stuNo,String classes,Courses c1,Courses c1soz,Courses c2,Courses c2soz,Courses c3,Courses c3soz)
			{	
				this.name=name;	
				this.stuNo=stuNo;
				this.classes=classes;
				this.c1=c1;
				this.c2=c2;
				this.c3=c3;
				this.c1soz=c1soz;
				this.c2soz=c2soz;
				this.c3soz=c3soz;
				this.avarage=0.0;
				this.isPass=false;
			}
	
	void isPass() {
		c1ort=(this.c1.note*0.9)+(this.c1soz.note*0.1);
		 c2ort=(this.c2.note*0.8)+(this.c2soz.note*0.2);
		 c3ort=(this.c3.note*0.7)+(this.c3soz.note*0.3);
		this.avarage=(this.c1ort+this.c2ort+this.c3ort)/3.0;
		printnote();
		if(this.avarage>55) {
			System.out.println("Sınıfı geçtin.");
		}
		else {
			System.out.println("Sınıfta kaldın.");
		}}

	void printnote()
	{
		System.out.println("ADI:  "+this.name);
		System.out.println("ÖĞRENCİ NO:  "+this.stuNo);
		System.out.println("SINIFI  : "+this.classes);
		System.out.println("TARİH : "+this.c1ort);
		System.out.println("MATEMATİK DERSİ: "+this.c2ort);
		System.out.println("BİYOLOJİ DERSİ: "+this.c3ort);
		System.out.println("ORTALAMASI: "+this.avarage);
	}
	void addBulkExamNote(int note1,int note1soz,int note2,int note2soz,int note3,int note3soz) 
		{		
			if((note1>=0&&note1<=100)&&(note1soz>=0&&note1soz<=100))
			{
				this.c1.note=note1;
				this.c1soz.note=note1soz;
			}
			if((note2>=0&&note2<=100) &&(note2soz>=0&&note2soz<=100))
			{
				this.c2.note=note2;
				this.c2soz.note=note2soz;
			}
		 
			if((note3>=0&&note3<=100)&&(note3soz>=0&&note3soz<=100))
			{
				this.c3.note=note3;
				this.c3soz.note=note3soz;
			} 
							
		}
	
}
