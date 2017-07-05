import java.util.Scanner;

public class working_day 
	{
	    public static void main(String ar[])
	    {
	    	Scanner sc=new Scanner (System.in);
	    	String day=sc.nextLine();
	    	switch(day)
	    	{
	    	case "Monday":
	    		System.out.println("true");
	    		break;
	    	case "Tuesday":
	    		System.out.println("true");
	    		break;
	    	case "Wednesday":
		    	System.out.println("true");
		    	break;
	    	case "Thursday":
		    	System.out.println("true");
		    	break;
	    	case "Friday":
		    	System.out.println("true");
		    	break;
	    	case "Saturday":
		    	System.out.println("true");
		    	break;
	    	case "Sunday":
		    	System.out.println("false");
		    	break;
		    default:
		    	System.out.println("Enter correct day");
	    	}
	
	    }
	}

