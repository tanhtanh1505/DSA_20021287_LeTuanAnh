package Week2;
import java.util.List;

public class IntroJavaB34 {
    public static void main(String[] args) {
        List<String> month = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        int m = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);

        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((y%4 == 0 && y%100 != 0) || (y%400 == 0)){
            days[1] = 28;
        }
        String[][] calendar = new String[6][7];
        int d = 1, i = 0;
        int thu = IntroJavaH29.getDay(d, m, y);

        while(d <= days[m-1]){
            calendar[i][thu] = String.valueOf(d);
            thu++;
            d++;
            if(thu == 7){
                i++;
                thu = 0;
            }
        }

        System.out.printf("%25s%n", month.get(m-1) + "  " + String.valueOf(y));
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int e = 0; e<6; e++){
            for(int j = 0; j<7; j++)
                if(calendar[e][j] != null)
                    System.out.printf("%5s", calendar[e][j]);
                else System.out.printf("%5s","");
            System.out.println(" ");
        }

    }
}
