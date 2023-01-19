public class doctor1
{
	String name, gender, hospitalName;
	int id,phone;
    
    void setInformation(String n,String g,String hs,int i,int p)
    {
    	name = n;
    	gender = g;
    	hospitalName = hs;
    	id = i;
    	phone = p;

    }



	void displayInformation()
	{
	  System.out.println("\n\n");
	  System.out.println("Name : "+name);
	  System.out.println("Gender : "+gender);
      System.out.println("Hospital Name : "+hospitalName);
      System.out.println("Id : "+id);
	  System.out.println("Phone : "+phone);

	  System.out.println("\n\n");

	}
}