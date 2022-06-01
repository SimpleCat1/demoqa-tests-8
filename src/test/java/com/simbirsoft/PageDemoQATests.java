package com.simbirsoft;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageDemoQATests {
    private String urlSite = "https://demoqa.com/automation-practice-form";
    private String firstNameText = "Игорь";
    private String lastNameText = "Игоревич";
    private String gender = "Male";
    private String birthday = "4 April,2022";
    private String emailText = "igor@mail.ru";
    private String mobileNumberText = "1111111111";
    private String subjectText = "a";
    private String subjectSelectionText = "Math";
    private String hobie = "Sports";
    private String currentAddressText = "person";
    private String state = "Uttar Pradesh";
    private String city = "Lucknow";
    private String filePathGif = "img/weegschaal-emoticon-sterrenbeeld.gif";
    private String fileNameGif = "weegschaal-emoticon-sterrenbeeld.gif";
    private String firstName = "#firstName";
    private String lastName = "#lastName";
    private String email = "#userEmail";
    private String genderRadio = ".custom-control-label[for='gender-radio-1']";
    private String mobileNumber = "#userNumber";
    private String dateOfBirthInput = "#dateOfBirthInput";
    private String dateOfBirthMonth = ".react-datepicker__month-select";
    private String dateOfBirthMonthChoice = ".custom-control-label[for='hobbies-checkbox-3']";
    private String dateOfBirthYear = ".react-datepicker__year-select";
    private String dateOfBirthYearChoice = "option[value='2022']";
    private String dateOfBirthInputCalendar = "div.react-datepicker__day--004";
    private String subject = "#subjectsInput";
    private String subjectSelection = "#react-select-2-option-0";
    private String hobbiesCheckbox = "label.custom-control-label[for='hobbies-checkbox-1']";
    private String downloadScreen = "#uploadPicture";
    private String currentAddress = "#currentAddress";
    private String selectState = "#state";
    private String selectStateAfterClick = "#react-select-3-option-1";
    private String selectCity = "#city";
    private String selectCityAfterClick = "#react-select-4-option-1";
    private String buttonSubmit = "#submit";
    private String firstNameTitle = "tr:nth-child(1) td:nth-child(2)";
    private String emailTitle = "tr:nth-child(2) td:nth-child(2)";
    private String genderRadioTitle = "tr:nth-child(3) td:nth-child(2)";
    private String mobileNumberTitle = "tr:nth-child(4) td:nth-child(2)";
    private String dateOfBirthTitle = "tr:nth-child(5) td:nth-child(2)";
    private String subjectTitle = "tr:nth-child(6) td:nth-child(2)";
    private String HobbiesTitle = "tr:nth-child(7) td:nth-child(2)";
    private String downloadScreenTitle = "tr:nth-child(8) td:nth-child(2)";
    private String currentAddressTitle = "tr:nth-child(9) td:nth-child(2)";
    private String selectStateAndCityTitle = "tr:nth-child(10) td:nth-child(2)";

    @BeforeAll
    public static void helperDriver() {
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
    }

    @Test
    public void studentRegistrationForm_fillingInFieldsWithData_SubmittingFormAppearsWithRightData() {
        open(urlSite);
        $(firstName).setValue(firstNameText);
        $(lastName).setValue(lastNameText);
        $(email).setValue(emailText);
        $(genderRadio).click();
        $(mobileNumber).setValue(mobileNumberText);
        $(dateOfBirthInput).click();
        $(dateOfBirthMonth).click();
        $(dateOfBirthMonthChoice).click();
        $(dateOfBirthYear).click();
        $(dateOfBirthYearChoice).click();
        $(dateOfBirthInputCalendar).click();
        $(subject).setValue(subjectText);
        $(subjectSelection).click();
        $(hobbiesCheckbox).click();
        $(downloadScreen).
                uploadFile(new File(getClass().getClassLoader().getResource(filePathGif).getFile()));
        $(currentAddress).setValue(currentAddressText);
        $(selectState).scrollTo();
        $(selectState).click();
        $(selectStateAfterClick).click();
        $(selectCity).click();
        $(selectCityAfterClick).click();
        $(buttonSubmit).scrollTo();
        $(buttonSubmit).click();
        $(firstNameTitle).shouldHave(text(firstNameText + " " + lastNameText));
        $(emailTitle).shouldHave(text(emailText));
        $(genderRadioTitle).shouldHave(text(gender));
        $(mobileNumberTitle).shouldHave(text(mobileNumberText));
        $(dateOfBirthTitle).shouldHave(text(birthday));
        $(subjectTitle).shouldHave(text(subjectSelectionText));
        $(HobbiesTitle).shouldHave(text(hobie));
        $(downloadScreenTitle).shouldHave(text(fileNameGif));
        $(currentAddressTitle).shouldHave(text(currentAddressText));
        $(selectStateAndCityTitle).shouldHave(text(state + " " + city));
    }
}
