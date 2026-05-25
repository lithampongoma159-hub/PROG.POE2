import java.util.Scanner;

    public static void main(String[] args) {

        // PASSWORD
        try (Scanner input = new Scanner(System.in)) {
            // PASSWORD
            String correctPassword = "Fetty1738?";
            
            System.out.print("Enter password: ");
            String password = input.nextLine();
            
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again!");
                return;
            }
            
            System.out.println("\nWelcome! It is great to see you again");
            System.out.println("=== UNC CHATS ===");
            
            // Arrays to store messages
            String[] messages = new String[20];
            
            int totalMessages = 0;
            int messageNumber = 1;
            
            OUTER:
            while (true) {
                System.out.println("\n1. Send Message");
                System.out.println("2. Show Messages");
                System.out.println("3. Quit");
                System.out.print("Choose option: ");
                int choice = input.nextInt();
                input.nextLine();
                // SEND MESSAGE
                switch (choice) {
                    case 1 -> {
                        // Person 1
                        System.out.print("079 162 7147: ");
                        String p1 = input.nextLine();
                        System.out.println("   SENT");
                        System.out.println("   DELIVERED");
                        System.out.println("   READ (blue)\n");
                        // Store message
                        messages[totalMessages] =
                                "Message "
                                + messageNumber
                                + ": "
                                + p1;
                        totalMessages++;
                        messageNumber++;
                        // Exit option
                        if (p1.equalsIgnoreCase("exit")) {
                            System.out.println("Chat ended.");
                            break OUTER;
                        }
                        // Person 2
                        System.out.print("067 151 1727: ");
                        String p2 = input.nextLine();
                        System.out.println("   SENT");
                        System.out.println("   DELIVERED");
                        System.out.println("   READ (blue)\n");
                        // Store message
                        messages[totalMessages] =
                                "Message "
                                + messageNumber
                                + ": "
                                + p2;
                        totalMessages++;
                        messageNumber++;
                        if (p2.equalsIgnoreCase("exit")) {
                            System.out.println("Chat ended.");
                            break OUTER;
                        }
                        // CHAT LOG
                        System.out.println("---- CHAT LOG ----");
                        System.out.println("Message "
                                + (messageNumber - 2)
                                + ": " + p1);
                        System.out.println("Message "
                                + (messageNumber - 1)
                                + ": " + p2);
                        System.out.println("------------------");
                    }
                    case 2 -> {
                        if (totalMessages == 0) {
                            System.out.println("No messages yet.");
                        } else {
                            
                            System.out.println("\n---- ALL MESSAGES ----");
                            
                            for (int i = 0;
                                    i < totalMessages;
                                    i++) {
                                
                                System.out.println(messages[i]);
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println(
                                "Total messages sent: "
                                        + totalMessages);
                        System.out.println("Goodbye!");
                        break OUTER;
                    }
                    default -> System.out.println("Invalid option.");
                }
            }
        }
    }