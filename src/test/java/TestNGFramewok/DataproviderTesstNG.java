package TestNGFramewok;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTesstNG {
	
	@Test(dataProvider="getData")
	public void login(String username,String ConfirmPass, String Pass)//variables to the data to be provided
	{
		System.out.println("You have successfully logged in");
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		//5- rows and 3- columns
		Object[][] data=new Object[5][3];// object type array used to store any type of data
		
		data[0][0]="dipali";
		data[0][1]="Dipali@123";
		data[0][2]="Dipali@123";
		
		data[1][0]="Sangita";
		data[1][1]="Sangita@123";
		data[1][2]="Sangita@123";
		
		data[2][0]="Pooja";
		data[2][1]="Pooja@123";
		data[2][2]="Pooja@123";
		
		data[3][0]="Vaishnavi";
		data[3][1]="Vaishnavi@123";
		data[3][2]="Vaishnavi@123";
		
		data[4][0]="Priyanka";
		data[4][1]="Priyanka@123";
		data[4][2]="Priyanka@123";
		
		return data;
	}

}
