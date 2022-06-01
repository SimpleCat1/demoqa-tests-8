package com.simbirsoft.data;

import com.github.javafaker.Faker;

public class TestDataFaker {
    Faker faker = new Faker();
    public String urlSite = "https://demoqa.com/automation-practice-form";
    public String firstNameText = faker.name().firstName();
    public String lastNameText = faker.name().lastName();
    public String gender = "Male";
    public String birthday = "4 April,2022";
    public int monthText = 3;
    public int dayInt = 4;
    public int yearInt = 2022;
    public String emailText = faker.internet().emailAddress();
    public String mobileNumberText = faker.number().digits(10);
    public String subjectText = "a";
    public String subjectSelectionText = "Math";
    public String hobie = "Sports";
    public String currentAddressText = faker.address().fullAddress();
    public String state = "Uttar Pradesh";
    public String city = "Lucknow";
    public String filePathGif = "img/weegschaal-emoticon-sterrenbeeld.gif";
    public String fileNameGif = "weegschaal-emoticon-sterrenbeeld.gif";
}
