public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		if (!(hours >= 0 && hours <= 23) || !(minutes >= 0 && minutes <= 59))
		{
			System.out.println("Invalid time format");
			return;
		}
		if (hours <= 12)
		{
			
				System.out.print(hours + ":");
		}
		else
		{
	
				System.out.print((hours-12) + ":");

		}
		if (minutes < 10)
		{
			System.out.print("0" + minutes);
		}
		else
		{
			System.out.print(minutes);
		}
		if (hours < 12)
		{
			System.out.print(" AM");
		}
		else
		{
			System.out.print(" PM");
		}
		
	}
}