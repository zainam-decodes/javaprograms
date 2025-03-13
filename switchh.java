class switchh{
       public static void main(String[] args)  {
           int week=4;
           String day;
           
           switch(week) {
             case 1:
                day = "SUNDAY";
                break;
             case 2:
                day = "MONDAY";
                break;
             case 3:
                day = "TUEDAY";
                break;
             case 4:
                day = "WEDNESDAY";
                break;
             case 5:
                day = "THURSDAY";
                break;
             case 6:
                day = "FRIDAY";
                break;
             case 7:
                day = "SATURDAY";
                break;
             default:
                day="INVALID DAY";
                break;
            }
          System.out.println(day);
} }
               
             
             