public class Main {
    public static void main(String[] args) {
        User user = new User("Sylvester", 1946,7,6 );
        user.displayDetails();

        User John = new User("John", 1954,2,18);
        John.displayDetails();

        Admin nicolas = new Admin("Nicolas", 1964,1,7);
        nicolas.displayDetails();
        nicolas.displayDetails(true);
        nicolas.displayDetails(false);
    }
}