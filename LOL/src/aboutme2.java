import java.util.Scanner;
public class aboutme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		printname();
		printage();
		printgender();
		printbirthday();
		printmarital_status();
		printcitizienship();
		printhome_adress();
		printHp();
		printresult();
		printwork_experience();
		printlanguange();
		printprofessional_skill();
		printcgpa();
	}
	public static void printname() {
		Scanner sc= new Scanner(System.in);
		String name = "Muhammad Hidayat Bin Ibrahim";
		System.out.println("Name : " + name);
	}
	public static void printage() {
		Scanner sc= new Scanner(System.in);
		int age = 21;
		System.out.println("Age :" + age + " Years old" );
	}
	public static void printgender() {
		Scanner sc= new Scanner(System.in);
		char gender = 'M';
		System.out.println("Gender : " + gender);
	}
	public static void printbirthday() {
		Scanner sc= new Scanner(System.in);
		String birthday ="22 October 2000";
		System.out.println("Birthday : " + birthday);
	}
	public static void printmarital_status() {
		Scanner sc= new Scanner(System.in);
		String marital_status = "Single";
		System.out.println("Marital Statuts: " + marital_status);
	}
	public static void printcitizienship() {
		Scanner sc= new Scanner(System.in);
		String citizienship = "Malaysia";
		System.out.println("Citizienship: " + citizienship);
	}
	public static void printhome_adress() {
		Scanner sc= new Scanner(System.in);
		String home_adress = "Lot 778, Jalan Haji Ibrahim, Jeram, Selangor";
		System.out.println("Home Adress: " + home_adress);
	}
	public static void printHp() {
		Scanner sc= new Scanner(System.in);
		String Hp= "0102259817";
		System.out.println("Hp Number: " + Hp);
	}
	public static void printresult() {
		Scanner sc= new Scanner(System.in);
		char result = 'A';
		System.out.println("Programming Languange Result : " + result );
	}
	public static void printwork_experience() {
		Scanner sc= new Scanner(System.in);
		String work_experience = "-";
		System.out.println("Work Experience:\n\t1." + work_experience);
	}
	public static void printlanguange() {
		Scanner sc= new Scanner(System.in);
		String languange1 = "Malay (100%)";
		String languange2= "English (50%)";
		System.out.println("Languange:\n\t1."+languange1 +"\n\t2."+languange2);	
	}
	public static void printprofessional_skill() {
		Scanner sc= new Scanner(System.in);
		String professional_skill1="Adobe photoshop (90%)";
		String professional_skill2="Java Programming (80%)";
		System.out.println("Professional Skill: \n\t1."+professional_skill1 + "\n\t2."+professional_skill2 );
	}
	public static void printcgpa() {
		Scanner sc= new Scanner(System.in);
		Double cgpa1 = 3.92;
		Double cgpa2 = 3.67;
		Double cgpa=(cgpa1 + cgpa2)/2;
		System.out.println("cgpa: " + cgpa);
	}
}