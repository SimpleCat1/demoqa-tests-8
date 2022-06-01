package com.simbirsoft.Page.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    private static String dateOfBirthInput = "#dateOfBirthInput";
    private static String dateOfBirthMonth = ".react-datepicker__month-select";
    private static String dateOfBirthMonthChoice = "option[value='%s']";
    private static String dateOfBirthYear = ".react-datepicker__year-select";
    private static String dateOfBirthYearChoice = "option[value='%s']";
    private static String dateOfBirthDateChoice = "div.react-datepicker__day--00%s";

    public static void useCalendar(int month, int year, int date) {
        $(dateOfBirthInput).click();
        $(dateOfBirthMonth).click();
        $(String.format(dateOfBirthMonthChoice, month)).click();
        $(dateOfBirthYear).click();
        $(String.format(dateOfBirthYearChoice, year)).click();
        $(String.format(dateOfBirthDateChoice, date)).click();
    }
}
