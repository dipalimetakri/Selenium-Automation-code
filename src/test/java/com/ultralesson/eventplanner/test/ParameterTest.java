package com.ultralesson.eventplanner.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	/*
	int id;
	String name;
	String lastname;
	
	public ParameterTest(int id, String name, String lastname) {
		// TODO Auto-generated constructor stub
		if (lastname == null) {
	        throw new IllegalArgumentException("Event name cannot be null.");
	    }
		this.id=id;
		this.name=name;	
		this.lastname=lastname;
	}
	*/
	/* @Parameters("Param")
	@Test

	
	public void testParameters(String Param) {
		
		
		System.out.println(Param);
		
	}
	*/
    @BeforeClass
    public void beforeClass() {
    	System.out.println("Execute before execution of the class");
    }
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("Execute before execution of the method");
    }
    @Test(groups= {"creation","Lowecreation"},priority=1)
    public void test() {
    	System.out.println("Execute the test");
    }
    @AfterMethod
    public void afterMethod() {
    	System.out.println("Execute after execution of the method");
    }
    public void afterClass() {
    	System.out.println("Execute after execution of the class");
    }
    @Test(groups= {"creation","Highcreation"},priority=2)
    public void firstTest() {
    	System.out.println("First test method executed");
    }
    @Test
   public void secondTest() {
    	System.out.println("Second test method executed");
    }
    @Test
    public void comparison() {
    	String str1="TestNG";
    	String str2="TestNG";
    	int a=4;
    	int b=6;
    	int c=a+b;
    	Assert.assertEquals(c, 10);
    	Assert.assertTrue(str1.equals(str2), "Strings should be identical.");
    	
    	boolean con1=true;
    	boolean con2=false;
    	
    	Object obj=new Object();
        Assert.assertTrue(con1, "Condition one should be true");
        Assert.assertFalse(con2, "Condition two should be false");
        Assert.assertNotEquals(a, b, "a and b should be equal");
        Assert.assertNotNull(obj, "object should not be null");
    }
    @Test(groups="group1")
    public void testGroup1() {
    	
    	System.out.println("group 1");
    }
    @Test(groups="group2")
    public void testGroup2() {
    	System.out.println("group 2");
    }
    @DataProvider(name="dataProvider")
    public Object[][] dataProviderMethod() {
    	Object objh=new Object[][] {{1},{2},{3},{4},{5}};
    	
    	return new Object[][] {{1},{2},{3},{4},{5}};
    	
    }
    @Test(dataProvider="dataProvider")
    
    public void testDataProvider(int num) {
    	System.out.println(num);
    	
    }
  /*
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldthroughexception() {
    	
    	  ParameterTest parameter=new ParameterTest(1,"Dipali",null);
    }
    */

}
