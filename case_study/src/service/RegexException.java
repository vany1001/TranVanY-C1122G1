package service;

public class RegexException {
    public static final String REGEX_ID_VILLA = "(SVVL)[-][0-9]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][0-9]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][0-9]{4}";
    public static final String REGEX_Name = "[A-Z][a-z]+";
    public static final String REGEX_AREA = "^([3-9][1-9]{2,})$";
    public static final String REGEX_COST = "^[0-9]+$";
    public static final String REGEX_FLOOR = "^[1-9]|([1][0-9])$";
}
