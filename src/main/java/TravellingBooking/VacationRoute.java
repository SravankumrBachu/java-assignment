package TravellingBooking;
public class VacationRoute {

    public static void main(String[] args) {
       
        String[] tickets = {
            "Paris-Skopje", "Zurich-Amsterdam", "Prague-Zurich",
            "Barcelona-Berlin", "Kiev-Prague", "Skopje-Paris",
            "Amsterdam-Barcelona", "Berlin-Kiev", "Berlin-Amsterdam"
        };
        

        String currentCity = "Kiev";
        
     
        System.out.println("Cities visited by your son:");
        
    
        while (currentCity != null) {
            System.out.println(currentCity);  
            
           
            currentCity = getNextCity(tickets, currentCity);
        }
    }


    public static String getNextCity(String[] tickets, String currentCity) {
       
        for (String ticket : tickets) {
            String[] cities = ticket.split("-");  
            if (cities[0].equals(currentCity)) {
                return cities[1];
            }
        }
        return null;  
    }
}
