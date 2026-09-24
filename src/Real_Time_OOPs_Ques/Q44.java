package Real_Time_OOPs_Ques;

class Patient
{
	int patientId;
	String patientName;
	String disease;
	
	Patient(int id, String name, String d)
	{
		patientId=id;
		patientName=name;
		disease=d;
	}
	void displayPatient()
	{
		System.out.println("Patient ID: "+patientId);
		System.out.println("Patient Name: "+patientName);
		System.out.println("Disease: "+disease);
	}
}

public class Q44 
{
	public static void main(String[]args)
	{
		Patient p1=new Patient(101,"Riya","Fever");
		p1.displayPatient();
	}
}
