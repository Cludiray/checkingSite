package config;

import org.apache.commons.lang3.RandomStringUtils;

public class UserConfig {
    public final static String USER_EMAIL = "MyUser_" + RandomStringUtils.randomAlphabetic(4) + "@mail.com";;
    public final static String USER_PASSWORD = "!Q2w#E4r";
    public final static String USER_FIRST_NAME = "AutoFirstName" + RandomStringUtils.randomAlphabetic(2);
    public final static String USER_LAST_NAME = "AutoLastLast" + RandomStringUtils.randomAlphabetic(2);
    public final static String ADDRESS = "5 Avenue";
    public final static String CITY = "New York";
    public final static String State = "New York";
    public final static String POSTAL_CODE = "54321";
    public final static String ADD_INFO = "My name is...";
    public final static String PHONE_NUMBER = "89735439276";
    public final static String SECOND_ADD = "7 Avenue";

}
