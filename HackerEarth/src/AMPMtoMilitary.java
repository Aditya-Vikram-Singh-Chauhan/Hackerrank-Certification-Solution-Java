public class AMPMtoMilitary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1 = "12:00:00AM";
		System.out.println("The military time for "+time1+" is : "+amPmToMilitary(time1));
		String time4 = "07:00:00AM";
		System.out.println("The military time for "+time4+" is : "+amPmToMilitary(time4));
		String time2 = "12:00:00PM";
		System.out.println("The military time for "+time2+" is : "+amPmToMilitary(time2));
		String time3 = "07:05:45PM";
		System.out.println("The military time for "+time3+" is : "+amPmToMilitary(time3));

	}

	private static String amPmToMilitary(String time) {
		// TODO Auto-generated method stub
//		System.out.println(time.contains("AM"));
//		System.out.println(time.contains("PM"));
		if(time.contains("AM") || time.contains("am")) {
			//System.out.println(time.substring(0,2));
			if(time.substring(0,2).equalsIgnoreCase("12")) {
				return "00"+time.substring(2,time.length()-2);
			}
			else {
				return time.substring(0,time.length()-2);
			}
		}
		if(time.contains("PM") || time.contains("pm")) {
			if(time.substring(0,2).equalsIgnoreCase("12")) {
				return time.substring(0,time.length()-2);
			}
			else {
				//System.out.println((time.substring(0, 2)));
				return (Integer.parseInt(time.substring(0, 2)) + 12)+time.substring(2,time.length()-2);
			}
		}
		return null;
	}

}
