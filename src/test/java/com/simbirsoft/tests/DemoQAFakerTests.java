package com.simbirsoft.tests;

import com.simbirsoft.Page.PageDemoQA;
import com.simbirsoft.data.TestDataFaker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.simbirsoft.Page.components.CalendarComponents.useCalendar;


public class DemoQAFakerTests extends TestBase {
    PageDemoQA page = new PageDemoQA();
    TestDataFaker pageData = new TestDataFaker();


    @Test
    public void fillingInFieldsWithData() {
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
}
