
public class Students {
String firstname ;
String middlename ;
String LastName ;
String StudentID ;
String Classification ;
String Major;
	public Students(String firstname2, String middlename2, String LastName2, String StudentID2) {
		// TODO Auto-generated constructor stub
		firstname = firstname2;
		middlename = middlename2;
		LastName = LastName2;
		StudentID = StudentID2;
		
	}
public String printFullName(String printfullname){
	printfullname = firstname + middlename + LastName;
	
	return printfullname;
}
public void setMajor(String newMajor){
	Major = newMajor;
}
public void setClassification (String newClass){
	Classification = newClass;
}
}
