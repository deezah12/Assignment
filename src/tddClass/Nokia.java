package tddClass;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);

        System.out.printf("select menu function %n1.PhoneBook %n2.Messages %n3.Chat %n4.Call register %n" +
                "5.Tones %n6.Settings %n7.Call divert %n8.Games %n9.Calculator %n10.Reminders %n11.Clock %n" +
                "12.Profiles %n13.Sim Services %n Enter number %n");


        menu = input.nextInt();


        switch (menu) {
            case 1:
                System.out.printf("PhoneBook %n1.Search %n2.Service Nos %n3.add name %n4.erase %n5.edit %n6.assign tone " +
                        "%n7.second b card %n8.options %n9.speed dials %n10.voice tags %n Enter number %n");
                int option = input.nextInt();
                switch (option) {
                    case 1 -> System.out.println("search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("second b card");
                    case 8 -> {
                        System.out.printf("options %n");
                        System.out.println("Enter 1 or 2 for more ");
                        int optionMenu = input.nextInt();
                        switch (optionMenu) {
                            case 1 -> System.out.println("1.type of view");
                            case 2 -> System.out.println("2.memory status");
                            default -> System.out.println("wrong number");
                        }
                        break;
                    }
                    case 9 -> System.out.println("speed dials");
                    case 10 -> System.out.println("voice tags");
                    default -> System.out.println("wrong number");
                }
            case 2:
                System.out.printf("Messages %n1.write messages %n2.inbox %n3. outbox %n4.Picture messages" +
                        "%n5. Template %n6. Smileys %n7.Message settings %n8.Info service %n9.Voice mailbox number" +
                        "%n10. Service command editor %n Enter number %n");


                int option2 = input.nextInt();
                switch (option2) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Template");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Messages setting");
                        System.out.println("Enter 1 or 2 for more ");
                        int optionMenu = input.nextInt();
                        switch (optionMenu) {
                            case 1 -> {
                                System.out.println("Set");
                                System.out.println("Enter 1, 2 or 3 for more ");
                                int optionMenu2 = input.nextInt();
                                switch (optionMenu2) {
                                    case 1 -> System.out.println("Message center number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                    default -> System.out.println("wrong number");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("Enter 1, 2 or 3 for more ");
                                int optionMenu3 = input.nextInt();
                                switch (optionMenu3) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                    default -> System.out.println("wrong number");
                                }
                            }
                            case 8 -> System.out.println("Info service");

                            case 9 -> System.out.println("Voice mailbox number");

                            case 10 -> System.out.println("Service command editor");

                        }
                    }
                }
            case 3:
                System.out.println("chat");{}

            break;
            case 4:
                System.out.printf("call register %n 1.Missed calls %n2. Received calls %n3." +
                        "Dialled numbers %n4. Erase recent call lists %n5. Show call duration %n6." +
                        "Show call costs %n7. Call cost setting %n8. Prepaid credit %n Enter number %n");


                int option3 = input.nextInt();
                switch (option3) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("show call duration");
                        System.out.println("Enter number 1-5 for more ");
                        int optionMenu3 = input.nextInt();
                        switch (optionMenu3) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("all calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                            default -> System.out.println("enter correct number");
                            case 6 -> {
                                System.out.println("Show call costs");
                                System.out.println("Enter 1,2 or 3 for more ");
                                int optionMenu4 = input.nextInt();
                                switch (optionMenu4) {
                                    case 1 -> System.out.println("Last call duration");
                                    case 2 -> System.out.println("all calls' duration");
                                    case 3 -> System.out.println("Received calls' duration");
                                    default -> System.out.println("wrong number");
                                }
                            }
                            case 7 -> {
                                System.out.println("call cost settings");
                                System.out.println("Enter 1or 2 for more ");
                                int optionMenu5 = input.nextInt();
                                switch (optionMenu5) {
                                    case 1 -> System.out.println("Call cost limit");
                                    case 2 -> System.out.println("Show costs in");
                                    default -> System.out.println("wrong number");
                                }
                            }
                        }
                    }
                }

                    case 5:
                         System.out.println("Tones %n1.Ringing tone %n2.Ringing volume %n3.Incoming call alert" +
                                        "%n4.Composer %n5.Message alert tone %n6.Keypad tones %n7.Warning and games tones" +
                                        "%n8.Vibrating alert %n9.Screen saver %n Enter number %n");
                                int case5 = input.nextInt();
                        switch (case5) {
                            case 1 -> System.out.println("Ringing tone");
                            case 2 -> System.out.println("Ringing volume");
                            case 3 -> System.out.println("Incoming call alert");
                            case 4 -> System.out.println("Composer");
                            case 5 -> System.out.println("Message alert tone");
                            case 6 -> System.out.println("Keypad tones");
                            case 7 -> System.out.println("Warning and games tones");
                            case 8 -> System.out.println("Vibrating alert ");
                            case 9 -> System.out.println("Screen saver");
                            default -> System.out.println("wrong number");
                        }

                                case 6:
                                System.out.printf("Setting %n1.Call settings %n2.Phone settings %n3.Security settings %n4." +
                                        "Restore factory settings %n Enter number %n");

                                int case6 = input.nextInt();
                                    switch (case6) {
                                        case 1 -> {
                                            System.out.println("Call settings");
                                            System.out.println("Enter 1, 2,3,4,5 or 6 for more ");
                                            int optionMenu6 = input.nextInt();
                                            switch (optionMenu6) {
                                                case 1 -> System.out.println("Automatic redial");
                                                case 2 -> System.out.println("Speed dialling");
                                                case 3 -> System.out.println("Call waiting options");
                                                case 4 -> System.out.println("Own number sending");
                                                case 5 -> System.out.println("Phone line in use");
                                                case 6 -> System.out.println("Automatic answer");
                                                default -> System.out.println("wrong number");
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("phone settings");
                                            System.out.println("Enter 1,2,3,4,5 or 6 for more ");
                                            int optionMenu7 = input.nextInt();
                                            switch (optionMenu7) {
                                                case 1 -> System.out.println("Language");
                                                case 2 -> System.out.println("Cell info display");
                                                case 3 -> System.out.println("Welcome note");
                                                case 4 -> System.out.println("Network election");
                                                case 5 -> System.out.println("Lights");
                                                case 6 -> System.out.println("Confirm sim service actions");
                                                default -> System.out.println("wrong number");
                                            }
                                        }
                                        case 3 -> {
                                            System.out.println("Security settings");
                                            System.out.println("Enter 1,2,3,4,5 or 6 for more ");
                                            int optionMenu8 = input.nextInt();
                                            switch (optionMenu8) {
                                                case 1 -> System.out.println("Pin code request");
                                                case 2 -> System.out.println("Call barring service");
                                                case 3 -> System.out.println("Fixed dialling");
                                                case 4 -> System.out.println("Closed user group");
                                                case 5 -> System.out.println("Phone security");
                                                case 6 -> System.out.println("Change access codes");
                                                default -> System.out.println("wrong number");
                                            }
                                        }
                                        case 4 -> System.out.println("Restore factory settings");
                                    }



//                                    case 8 -> System.out.println("Games");
//                                    case 9 -> System.out.println("Calculator");
//                                    case 10 -> System.out.println("Reminders");
//                                    case 11-> System.out.println("Clock");
//                                    case 12 -> System.out.println("Profiles");
//                                    case 13 -> System.out.println("Sim services");




                        }



        }

    }

