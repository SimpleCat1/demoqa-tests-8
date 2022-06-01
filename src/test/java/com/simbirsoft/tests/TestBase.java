package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    public static void helperDriver() {
        Configuration.browser = "Firefox";
        Configuration.startMaximized = true;
    }
}
