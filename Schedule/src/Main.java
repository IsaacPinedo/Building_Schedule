import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);

        int day_of_the_week;
        int had_breakfast;
        int coding_language;
        int design_type;
        int used_IDE;
        int cxx_activities;
        int java_activities;
        int errors_testing;
        int girlfriend_dating;
        int where_chilling;

        System.out.println("""
                ********************** MENU **********************
                    These are the choices for week of the day.
                    Please enter only values from 1-7:
                        1. MONDAY
                        2. TUESDAY
                        3. WEDNESDAY
                        4. THURSDAY
                        5. FRIDAY
                        6. SATURDAY
                        7. SUNDAY
                **************************************************
                """);

        System.out.println("Enter the day of the week");
        day_of_the_week = keyboard.nextInt();

        switch (day_of_the_week) {
            case 1:
                System.out.println("Monday: It is back to work.....\n");
                System.out.println("""
                        *********** Did you have breakfast? ***********
                                 1. Yes, I had my breakfast
                                 2. No, I would like one
                        *******************************************
                        """);

                had_breakfast = keyboard.nextInt();

                if(had_breakfast == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");

                } else if (had_breakfast == 2) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");

                } else {
                    System.out.println("NO such choice available");
                }

                break;

            case 2:
                System.out.println("Tuesday: Let's go to gym and focus on studying \n");
                System.out.println("""
                        *********** What coding language are you using? ***********
                                 1. C++
                                 2. Java
                        ***********************************************************
                        """);

                coding_language = keyboard.nextInt();

                switch (coding_language) {
                    case 1:
                        System.out.println("So, you chose C++");
                        System.out.println("""
                        *********** What are you doing today? ***********
                                 1. Development
                                 2. Testing
                                 3. Deployment
                                 4. Maintenance
                        *************************************************
                        """);

                        cxx_activities = keyboard.nextInt();

                        switch (cxx_activities) {
                            case 1:
                                System.out.println("Development");
                                break;

                            case 2:
                                System.out.println("Testing");
                                break;

                            case 3:
                                System.out.println("Deployment");
                                break;

                            case 4:
                                System.out.println("Maintenance");
                                break;

                            default:
                                System.out.println("Not a valid choice!");

                        }
                        break;

                    case 2:
                        System.out.println("Great! Java");
                        System.out.println("""
                        *********** What are you doing today? ***********
                                 1. Development
                                 2. Testing
                                 3. Deployment
                                 4. Maintenance
                        *************************************************
                        """);

                        java_activities = keyboard.nextInt();

                        switch (java_activities) {
                            case 1:
                                System.out.println("Development");
                                break;

                            case 2:
                                System.out.println("Testing");
                                break;

                            case 3:
                                System.out.println("Deployment");
                                break;

                            case 4:
                                System.out.println("Maintenance");
                                break;

                            default:
                                System.out.println("Not a valid choice!");

                        }
                        break;

                    default:
                        System.out.println("NO such choice available");
                }

                break;

            case 3:
                System.out.println("Wednesday: Time to have our pet's hair done \n");
                System.out.println("""
                        *********** What kind of design are you using? ***********
                                 1. Simple design
                                 2. Complex design
                        ***********************************************************
                        """);

                design_type = keyboard.nextInt();

                if (design_type == 1) {
                    System.out.println("Ok, simple design!");

                } else if (design_type == 2) {
                    System.out.println("Wow! complex design");

                } else {
                    System.out.println("NO such choice available");

                }

                break;

            case 4:
                System.out.println("Thursday: Maybe practice swimming today\n");
                System.out.println("""
                        *********** What IDE are you using? ***********
                                 1. IntelliJ
                                 2. Eclipse
                                 3. VS Code
                        ***********************************************************
                        """);

                used_IDE = keyboard.nextInt();

                switch (used_IDE) {
                    case 1:
                        System.out.println("Great!, IntelliJ");
                        break;

                    case 2:
                        System.out.println("Nice!, Eclipse");
                        break;

                    case 3:
                        System.out.println("Good!, VS Code");
                        break;

                    default:
                        System.out.println("NO such choice available");
                }

                break;

            case 5:
                System.out.println("Friday: Test your code!");
                System.out.println("""
                        *********** Did you find any errors during the tests? ***********
                                 1. Yes
                                 2. No
                        ***********************************************************
                        """);

                errors_testing = keyboard.nextInt();

                if (errors_testing == 1) {
                    System.out.println("Tell me, what errors did you find?");

                } else if (errors_testing == 2) {
                    System.out.println("Well done!");

                } else {
                    System.out.println("Not a valid option");

                }

                break;

            case 6:
                System.out.println("Saturday: Date with your girlfriend!");
                System.out.println("""
                        *********** Where are you going today? ***********
                                 1. Restaurant
                                 2. Museum
                                 3. Paca
                        ***********************************************************
                        """);

                girlfriend_dating = keyboard.nextInt();

                if (girlfriend_dating == 1) {
                    System.out.println("Are you guys hungry?");

                } else if (girlfriend_dating == 2) {
                    System.out.println("Interesting!");

                } else if (girlfriend_dating == 3) {
                    System.out.println("Choose some good clothes!");

                } else {
                    System.out.println("Not a valid option");

                }

                break;

            case 7:
                System.out.println("Sunday: Ice cream day!");
                System.out.println("""
                        *********** Where are you chilling today? ***********
                                 1. At home
                                 2. In a bar
                                 3. With friends
                                 4. At a nightclub
                        ***********************************************************
                        """);

                where_chilling = keyboard.nextInt();

                if (where_chilling == 1) {
                    System.out.println("Comfortable!");

                } else if (where_chilling == 2) {
                    System.out.println("Some drinks coming!");

                } else if (where_chilling == 3) {
                    System.out.println("Barbecue!");

                } else if (where_chilling == 4) {
                    System.out.println("Dance night!");

                } else {
                    System.out.println("Not a valid option");

                }

                break;


            default:
                System.out.println("Not a valid value! Try again");
        }
        
    } //end of main method

} //end of the main class