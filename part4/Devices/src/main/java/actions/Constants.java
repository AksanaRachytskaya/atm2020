package actions;

public interface Constants {

    public static final String FRIDGE_NAME = "Fridge";
    public static final String IRON_NAME = "Iron";
    public static final String WASHER_NAME = "Washer";

    public static final String FRIDGE_ZONE = "Kitchen";
    public static final String IRON_ZONE = "Bathroom";
    public static final String WASHER_ZONE = "Bathroom";

    public static final int FRIDGE_USESAWEEK = 7;
    public static final int IRON_USESAWEEK = 2;
    public static final int WASHER_USESAWEEK =2;

    public static final int FRIDGE_POWER = 2500;
    public static final int IRON_POWER = 260;
    public static final int WASHER_POWER =60;

    public static final double FRIDGE_WORKINGTIME = 24;
    public static final double IRON_WORKINGTIME = 1.5;
    public static final double WASHER_WORKINGTIME =1;

    public static final String MESSAGE_1 = "Gadgets have been turned on.";
    public  static  final String ERROR_MESSAGE_1 = "Invalid entry. Please select from menu:";
    public static final String ERROR_MESSAGE_2 = "Please review your .json file. Structure may be inconsistent.";

    public static final String PATH_JSON = "E:\\Aksana\\projects\\Devices\\src\\main\\java\\resourses\\gadget_JSON.json";

    public static final String PATH_TXT = "D:\\learn_it\\W-automation\\pre-selection tasks\\java\\projects\\Devices\\src\\main\\java\\resourses\\in.txt";

    public static final String PATH_DB = "database.properties";
}
