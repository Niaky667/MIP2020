package task.student;
public class Student {

	private String studName, studAge, studID;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2= new Student();
		Student s3=new Student();
		s1.studName = "Popescu";
		s1.studAge = "34";
		s1.studID = "1950101285345";
		s2.studName ="Victor";
		s2.studAge = "12";
		s2.studID = "1940303243564";
		s3.studName = "Florin";
		s3.studAge = "12";
		s3.studID = "1990404239576";
		System.out.println("Nume:\t"+ s1.studName +"\nVarsta:\t"+ s1.studAge + "\nID:\t"+ s1.studID);
		System.out.println();
		System.out.println("Nume:\t"+ s2.studName +"\nVarsta:\t"+ s2.studAge + "\nID:\t"+ s2.studID);
		System.out.println();
		System.out.println("Nume:\t"+ s3.studName +"\nVarsta:\t"+ s3.studAge + "\nID:\t"+ s3.studID);
	}
}
