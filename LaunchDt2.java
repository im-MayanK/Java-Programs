import java.time.*;


public class LaunchDt2 {
    public static void main(String[] args) {
        LocalDate Date =LocalDate.now();
        //DayOfWeek Date =DayOfWeek.of(3);
        //System.out.println(Date.toString());
        int a=Date.getDayOfMonth();
        int b=Date.getMonthValue();
        int c=Date.getYear();
        DayOfWeek d= Date.getDayOfWeek();
        System.out.println(Date.getDayOfWeek());
        System.out.println(a+"/"+b+"/"+"/"+c +"  Day of week ="+ d);
        LocalTime Time=LocalTime.now();
        System.out.println(Time);
        int hour=Time.getHour();
        int min=Time.getMinute();
        int sec=Time.getSecond();
        int nano=Time.getNano();
        System.out.println(hour+":"+min+":"+sec+":"+nano);
        
    }
    
}
