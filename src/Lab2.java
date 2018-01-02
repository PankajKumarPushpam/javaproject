import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lab2 {
public static void main(String[] args) {
	Month mon=Month.FEBRUARY;
	System.out.println("Month:"+mon);
	System.out.println("Month:"+mon.getValue());
	System.out.println("Max:"+mon.maxLength());
	System.out.println("Min:"+mon.minLength());
	
	Locale loc=Locale.getDefault();
	System.out.println("FULL:"+mon.getDisplayName(TextStyle.FULL, loc));
	System.out.println("SHORT:"+mon.getDisplayName(TextStyle.SHORT, loc));
	System.out.println("NARROW:"+mon.getDisplayName(TextStyle.NARROW, loc));
	System.out.println("-2:"+mon.minus(2));
	System.out.println("+2:"+mon.plus(2));
	System.out.println("N of Day:"+mon.length(false));
	
	System.out.println("\nDay of Year:"+Month.JANUARY.firstDayOfYear(true));
	System.out.println("Day of Year:"+Month.JANUARY.firstDayOfYear(false));
	System.out.println("Day of Year:"+Month.MARCH.firstDayOfYear(false));
	System.out.println("Month Of Quarter:"+Month.MARCH.firstMonthOfQuarter());
	System.out.println("Month Of Quarter:"+Month.JUNE.firstMonthOfQuarter());

    }
}
