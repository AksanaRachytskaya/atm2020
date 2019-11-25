package model;

import actions.Constants;
import actions.ReadFromFile;
import actions.ReadJson;
import exceptions.MenuNumberInputException;

import java.util.Arrays;
import java.util.Scanner;

public class Menu implements Constants {

    private static boolean condition = true;

    {
        while (condition) {
            System.out.println("Please select gift data source:\n" +
                    "1 - source is program\n" +
                    "2 - source is .txt file\n" +
                    "3 - source is .json file\n" +
                    "4 - source is DB\n" +
                    "5 - all available sourses\n" +
                    "Q - Quit\n");
            Scanner menuInput = new Scanner(System.in);
            GadgetService gadgetService = new GadgetService();
            Stuff stuff = new Stuff();
            try {
                int menuNumber = Integer.parseInt(menuInput.nextLine());
                stuff = getStuff(menuNumber, gadgetService, stuff);
            } catch (MenuNumberInputException m) {
                System.err.println(ERROR_MESSAGE_1);
                continue;
            } catch (NumberFormatException n) {
                System.err.println(ERROR_MESSAGE_1);
                continue;
            }
            if (!condition) {
                System.out.println("Quitting..");
                break;
            }
            while (condition) {
                System.out.println("Please select action:\n" +
                        "1. Get gadgets by max power:\n" +
                        "2. Get gadgets by power power\n" +
                        "4. Sort gadgets\n" +
                        "0. Exit");
                Scanner actionInput = new Scanner(System.in);
                try {
                    int actionNumber = Integer.parseInt(actionInput.nextLine());
                    makeActionOnStuff(gadgetService, stuff, actionNumber);
                } catch (MenuNumberInputException mnie) {
                    System.err.println(mnie.getMessage());
                    continue;
                } catch (NumberFormatException nfe) {
                    System.err.println("Invalid input. Please enter number from menu");
                    continue;
                }
                if (!condition) {
                    System.out.println("Exit...");
                    break;
                }
            }
        }
    }
       private static Stuff getStuff(int menuNumber, GadgetService gadgetService, Stuff stuff) throws MenuNumberInputException {
        switch (menuNumber) {
            case 1:
                GadgProperties gadgProperties = new GadgProperties();
                Gadget fridge = gadgProperties.getFridge();
                Gadget washer = gadgProperties.getWasher();
                Gadget iron = gadgProperties.getIron();

                stuff = gadgetService.getStuff(Arrays.asList(fridge, washer, iron));
                System.out.println(MESSAGE_1);

                gadgetService.getGadgetsByMaxPower(stuff,800 );
                break;
            case 2:
                ReadFromFile reader = new ReadFromFile();
                stuff = gadgetService.getStuff(reader.read());
                System.out.println(MESSAGE_1);

                gadgetService.getGadgetsByMaxPower(stuff,800 );
                break;
            case 3:
                ReadJson readJson = new ReadJson();
                stuff = gadgetService.getStuff(readJson.read());
                System.out.println(MESSAGE_1);

                gadgetService.getGadgetsByMaxPower(stuff,1000 );
                break;
                /*case 4:
                    ReadDB readDB = new ReadDB();
                    stuff = gadgetService.getStuff(readDB.read());*/
            default:
                throw new MenuNumberInputException(ERROR_MESSAGE_1);
        }
        return stuff;
    }


    private static void makeActionOnStuff(GadgetService gadgetService, Stuff stuff, int actionNumber)
            throws MenuNumberInputException {
        switch (actionNumber) {
            case 1:
                System.out.println(String.format("Max power has ", gadgetService.getGadgetsByMaxPower(Gadget));
                break;
            case 2:
                System.out.println(String.format("Sorted by price and by name gift : %s",
                        gadgService.sortGiftByPriceAndByName(gift).getCandies()));
                break;
            case 3:
                getCandiesByParameters(giftService, gift);
            case 4:
                IWritable writer = new WriterToFile();
                writer.write(gift.getCandies());
                System.out.println("Candies have been written to file successfully");
                break;
            case 0:
                condition = false;
                break;
            default:
                throw new MenuNumberInputException("Invalid number");
        }
    }
}








