package com.simbirsoft.tests;

import com.simbirsoft.data.DataForParamerizedTests;
import com.simbirsoft.data.TestData;
import com.simbirsoft.page.PageDemoQA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static com.simbirsoft.page.components.CalendarComponents.useCalendar;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class DemoQATests extends TestBase {
    PageDemoQA page = new PageDemoQA();
    TestData pageData = new TestData();


    @Test
    public void studentRegistrationForm_fillingInFieldsWithData_SubmittingFormAppearsWithRightData() {
        open(pageData.urlSite);
        page.insertTextInFirstNameArea(pageData.firstNameText);
        page.insertTextInLastNameArea(pageData.lastNameText);
        page.insertTextInEmailArea(pageData.emailText);
        page.clickGenderRadio();
        page.insertTextInMobileNumberArea(pageData.mobileNumberText);
        useCalendar(pageData.monthText, pageData.yearInt, pageData.dayInt);
        page.insertTextInSubjectArea(pageData.subjectText);
        page.clickSubjectSelection();
        page.clickHobbiesCheckbox();
        page.uploadPicture(pageData.filePathGif);
        page.insertTextInCurrentAddressArea(pageData.currentAddressText);
        page.clickCity();
        page.clickButton();
        page.checkInfo(pageData.firstNameText, pageData.lastNameText, pageData.emailText, pageData.gender,
                pageData.mobileNumberText, pageData.birthday, pageData.subjectSelectionText, pageData.hobie,
                pageData.fileNameGif, pageData.currentAddressText, pageData.state, pageData.city);
    }

    @CsvSource(value = {"alex, brian,wer@mail.ru,8888888888,3,2022,4,4 April,2022,sdfsdf",
            "олодол, ролж,wer@mail.ru,8888888887,3,2022,4,4 April,2022,sdfsdf"})
    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    public void studentRegistrationForm_fillingInFieldsWithData_SubmittingFormAppearsWithRightDataFromScv(String firstNameText,
                                                                                                          String lastNameText,
                                                                                                          String emailText,
                                                                                                          String mobileNumberText,
                                                                                                          int monthInt,
                                                                                                          int yearInt,
                                                                                                          int dayInt,
                                                                                                          String birthday,
                                                                                                          String currentAddressText) {
        open(pageData.urlSite);
        page.insertTextInFirstNameArea(firstNameText);
        page.insertTextInLastNameArea(lastNameText);
        page.insertTextInEmailArea(emailText);
        page.clickGenderRadio();
        page.insertTextInMobileNumberArea(mobileNumberText);
        useCalendar(monthInt, yearInt, dayInt);
        page.insertTextInSubjectArea(pageData.subjectText);
        page.clickSubjectSelection();
        page.clickHobbiesCheckbox();
        page.uploadPicture(pageData.filePathGif);
        page.insertTextInCurrentAddressArea(currentAddressText);
        page.clickCity();
        page.clickButton();
        page.checkInfo(firstNameText, lastNameText, emailText, pageData.gender,
                mobileNumberText, birthday, pageData.subjectSelectionText, pageData.hobie,
                pageData.fileNameGif, currentAddressText, pageData.state, pageData.city);
    }

    static Stream<Arguments> argsProviderFactory() {
        return Stream.of(arguments("alex", "brian", "wer@mail.ru", "8888888888", 3, 2022, 4, "4 April,2022", "sdfsdf")
                , arguments("try", "iuy", "wer@mail.ru", "8888888887", 3, 2022, 4, "4 April,2022", "11111111"));
    }

    @MethodSource("argsProviderFactory")
    @ParameterizedTest
    public void studentRegistrationForm_fillingInFieldsWithData_SubmittingFormAppearsWithRightDataFromMethods(String firstNameText,
                                                                                                              String lastNameText,
                                                                                                              String emailText,
                                                                                                              String mobileNumberText,
                                                                                                              int monthInt,
                                                                                                              int yearInt,
                                                                                                              int dayInt,
                                                                                                              String birthday,
                                                                                                              String currentAddressText) {
        open(pageData.urlSite);
        page.insertTextInFirstNameArea(firstNameText);
        page.insertTextInLastNameArea(lastNameText);
        page.insertTextInEmailArea(emailText);
        page.clickGenderRadio();
        page.insertTextInMobileNumberArea(mobileNumberText);
        useCalendar(monthInt, yearInt, dayInt);
        page.insertTextInSubjectArea(pageData.subjectText);
        page.clickSubjectSelection();
        page.clickHobbiesCheckbox();
        page.uploadPicture(pageData.filePathGif);
        page.insertTextInCurrentAddressArea(currentAddressText);
        page.clickCity();
        page.clickButton();
        page.checkInfo(firstNameText, lastNameText, emailText, pageData.gender,
                mobileNumberText, birthday, pageData.subjectSelectionText, pageData.hobie,
                pageData.fileNameGif, currentAddressText, pageData.state, pageData.city);
    }

    @EnumSource(com.simbirsoft.data.DataForParamerizedTests.class)
    @ParameterizedTest
    public void studentRegistrationForm_fillingInFieldsWithData_SubmittingFormAppearsWithRightDataFromEnum(DataForParamerizedTests firstNameText) {
        open(pageData.urlSite);
        page.insertTextInFirstNameArea(firstNameText.getDescription());
        page.insertTextInLastNameArea(pageData.lastNameText);
        page.insertTextInEmailArea(pageData.emailText);
        page.clickGenderRadio();
        page.insertTextInMobileNumberArea(pageData.mobileNumberText);
        useCalendar(pageData.monthText, pageData.yearInt, pageData.dayInt);
        page.insertTextInSubjectArea(pageData.subjectText);
        page.clickSubjectSelection();
        page.clickHobbiesCheckbox();
        page.uploadPicture(pageData.filePathGif);
        page.insertTextInCurrentAddressArea(pageData.currentAddressText);
        page.clickCity();
        page.clickButton();
        page.checkInfo(firstNameText.getDescription(), pageData.lastNameText, pageData.emailText, pageData.gender,
                pageData.mobileNumberText, pageData.birthday, pageData.subjectSelectionText, pageData.hobie,
                pageData.fileNameGif, pageData.currentAddressText, pageData.state, pageData.city);
    }
}
