package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;


public class TestutomationDataTests extends TestBase {
    @Test
    void formTests() {


        registrationPage.openPage();
        registrationPage.setFirstName(userName);
        registrationPage.setLastName(lastName);
        registrationPage.setEmail(userEmail);
        registrationPage.setGender(userGender);
        registrationPage.setNumber(userNumber);
        registrationPage.setBirthDate("26", "May", "1990");
        registrationPage.setValue(userValue);
        registrationPage.setWrapper(userWrapper );
        registrationPage.setPicture("src/test/resources/paddington-g51aae444a_640.jpg");
        registrationPage.setAddress("Some Address111");
        registrationPage.setState();
        registrationPage.setCity();
        registrationPage.setSubmit();
        registrationPage.verifyResultsModalApperas();
        registrationPage.verifyResults("Student Name",userName + " Ivanov");
        registrationPage.verifyResults("Student Email", "Ivanov@mail.ru");
        registrationPage.verifyResults("Gender", "Other");
        registrationPage.verifyResults("Mobile", "8900076543");
        registrationPage.verifyResults("Date of Birth", "26 May,1990");
        registrationPage.verifyResults("Subjects", "Physics");
        registrationPage.verifyResults("Hobbies", "Reading");
        registrationPage.verifyResults("Picture", "paddington-g51aae444a_640.jpg");
        registrationPage.verifyResults("Address", "Some Address111");
        registrationPage.verifyResults("State and City", "NCR Delhi");
    }
}
