package PreviousReplHomwork;
class SyntaxTechnologies{
	
	String schoolName;
	int batch;
	String year;
	String lastsDayOfClass;
	
	
public	SyntaxTechnologies(String schoolName, int batch,String year, String lastsDayOfClass  ) {
	this.schoolName=schoolName;
	this.batch=batch;
	this.year=year;
	this.lastsDayOfClass=lastsDayOfClass;
	
	System.out.println(schoolName+" "+batch+" "+year+" "+lastsDayOfClass);
}
public SyntaxTechnologies() {
	System.out.println(schoolName+" "+batch+" "+year+" "+lastsDayOfClass);
}
	
}
public class Main142 {

	public static void main(String[] args) {
		
	SyntaxTechnologies obj=new SyntaxTechnologies(null, 0, null, null);
	SyntaxTechnologies obj1=new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
		
	}

}
