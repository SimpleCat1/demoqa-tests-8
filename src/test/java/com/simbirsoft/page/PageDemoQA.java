package com.simbirsoft.page;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PageDemoQA {
    private SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            genderRadio = $(".custom-control-label[for='gender-radio-1']"),
            mobileNumber = $("#userNumber"),
            subject = $("#subjectsInput"),
            subjectSelection = $("#react-select-2-option-0"),
            hobbiesCheckbox = $("label.custom-control-label[for='hobbies-checkbox-1']"),
            downloadScreen = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            selectState = $("#state"),
            selectStateAfterClick = $("#react-select-3-option-1"),
            selectCity = $("#city"),
            selectCityAfterClick = $("#react-select-4-option-1"),
            buttonSubmit = $("#submit"),
            firstNameTitle = $("tr:nth-child(1) td:nth-child(2)"),
            emailTitle = $("tr:nth-child(2) td:nth-child(2)"),
            genderRadioTitle = $("tr:nth-child(3) td:nth-child(2)"),
            mobileNumberTitle = $("tr:nth-child(4) td:nth-child(2)"),
            dateOfBirthTitle = $("tr:nth-child(5) td:nth-child(2)"),
            subjectTitle = $("tr:nth-child(6) td:nth-child(2)"),
            HobbiesTitle = $("tr:nth-child(7) td:nth-child(2)"),
            downloadScreenTitle = $("tr:nth-child(8) td:nth-child(2)"),
            currentAddressTitle = $("tr:nth-child(9) td:nth-child(2)"),
            selectStateAndCityTitle = $("tr:nth-child(10) td:nth-child(2)");


    public void insertTextInFirstNameArea(String value) {
        firstName.setValue(value);
    }

    public void insertTextInLastNameArea(String value) {
        lastName.setValue(value);
    }

    public void insertTextInEmailArea(String value) {
        email.setValue(value);
    }

    public void clickGenderRadio() {
        genderRadio.click();
    }

    public void clickSubjectSelection() {
        subjectSelection.click();
    }

    public void clickHobbiesCheckbox() {
        hobbiesCheckbox.click();
    }

    public void clickCity() {
        selectState.scrollTo().click();
        $(selectStateAfterClick).click();
        $(selectCity).click();
        $(selectCityAfterClick).click();
    }

    public void clickButton() {
        buttonSubmit.scrollTo().click();
    }

    public void checkInfo(String firstNameText, String lastNameText, String emailText,
                          String gender, String mobileNumberText, String birthday, String subjectSelectionText, String hobie,
                          String fileNameGif, String currentAddressText, String state, String city) {
        firstNameTitle.shouldHave(text(firstNameText + " " + lastNameText));
        emailTitle.shouldHave(text(emailText));
        genderRadioTitle.shouldHave(text(gender));
        mobileNumberTitle.shouldHave(text(mobileNumberText));
        dateOfBirthTitle.shouldHave(text(birthday));
        subjectTitle.shouldHave(text(subjectSelectionText));
        HobbiesTitle.shouldHave(text(hobie));
        downloadScreenTitle.shouldHave(text(fileNameGif));
        currentAddressTitle.shouldHave(text(currentAddressText));
        selectStateAndCityTitle.shouldHave(text(state + " " + city));

    }

    public void insertTextInMobileNumberArea(String value) {
        mobileNumber.setValue(value);
    }

    public void insertTextInSubjectArea(String value) {
        subject.setValue(value);
    }


    public void insertTextInCurrentAddressArea(String value) {
        currentAddress.setValue(value);
    }

    public void uploadPicture(String filePathGif) {
        downloadScreen.
                uploadFile(new File(getClass()
                        .getClassLoader()
                        .getResource(filePathGif)
                        .getFile()));
    }
}
