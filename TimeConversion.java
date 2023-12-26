import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter time in 12-hour format (e.g., 07:45:30 PM): ");
        String time12Hour = scanner.nextLine();


        String militaryTime = convertToMilitaryTime(time12Hour);

        if (militaryTime != null) {

            System.out.println("Military Time: " + militaryTime);
        } else {
            System.out.println("Invalid input format. Please enter the time in the correct format.");
        }

        scanner.close();
    }

    private static String convertToMilitaryTime(String time12Hour) {
        try {
       
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(time12Hour);

            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
