import java.util.Scanner;

class Sample
{
	public String fname;
	public String lname;
	public int age;
	public String place;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}

class Generate
{
	void school(Sample s)
	{
        System.out.println("   ");
        System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Student  First Name                                    "+s.getFname());
		System.out.println("");
		System.out.println("Student  Last Name                                     "+s.getLname());
		System.out.println("");
		System.out.println("Student  Age                                           "+s.getAge());
		System.out.println("");
		System.out.println("Place                                                  "+s.getPlace());
	}
}

class Frame

{
	double sum=0;
	static
	{
	
		System.out.println("");
		System.out.println("");
		System.out.println("                       Student Marks Sheet");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public static void marks()
	{
	
	Scanner sa=new Scanner(System.in);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("Total Subjects:   ");
	int n=sa.nextInt();
	System.out.println(" ");
	System.out.println(" ");
	double marks[]=new double[n];
	
	String []sub= {"Maths","Chemistry","Physics","Telugu","Social"};
	
	for(int i=0;i<n;i++)
	{
		marks[i]=sa.nextInt();
		
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("                               Subject Marks");
	System.out.println(" ");
	System.out.println(" ");
	for(int i=0;i<marks.length;i++)
	{
		
		System.out.println(                            sub[i]+ "  Marks " +marks[i]);
		System.out.println(" ");
		
		
	}
	
	double average=0;
	for(int i=0;i<marks.length;i++)
	{
		average=average+marks[i]/n;
	}
	
	System.out.println(" ");
	System.out.println("Percentage "+average);
	System.out.println(" ");
	
	if(average>=85)
	{
		System.out.println("S Grade");
	}
	else if(average<85&& average>=75)
    {
		System.out.println("A Grade");
    }
	
	else if(average<75 && average>=65)

	{
		System.out.println("B Grade");
	}
	
	else if(average<65 && average>=55)
	{
		System.out.println("C Grade");
	}
	
	else if(average<55 && average>=40)
	{
		System.out.println("D Grade");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	public static void stotedata()
	{
		
	}
		
	
	
}





public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Frame f=new Frame();
		

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the First Name                                          ");
		String fname=sc.nextLine();
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter the Last Name                                            ");
		String lname=sc.nextLine();
		
System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter the Age                                                   ");
		int age=sc.nextInt();
		
System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter the Place                                                 ");
		String place=sc.next();
		
		Sample s=new Sample();
		s.setFname(fname);
		s.setLname(lname);
		s.setAge(age);
		s.setPlace(place);
		
		Generate g=new Generate();
		g.school(s);
		
		f.marks();
	}

}
