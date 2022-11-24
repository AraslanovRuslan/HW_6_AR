package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class TestutomationFakerTests extends TestBase {
    @Test
    void formTests() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String userEmail = faker.internet().emailAddress();
        String userGender = "Other";
        String number = faker.phoneNumber().subscriberNumber(10);
        String dayBirth = "26";
        String monthBirth = "May";
        String yearBirth = "1990";
        String value = "Physics";
        String wrapper = "Reading";
        String picture = "src/test/resources/paddington-g51aae444a_640.jpg";
        String adress = faker.address().fullAddress();
        String state = "NCR";
        String city = "Delhi";

        registrationPage.openPage();
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setEmail(userEmail);
        registrationPage.setGender(userGender);
        registrationPage.setNumber(number);
        registrationPage.setBirthDate(dayBirth, monthBirth, yearBirth);
        registrationPage.setValue(value);
        registrationPage.setWrapper(wrapper);
        registrationPage.setPicture(picture);
        registrationPage.setAddress(adress);
        registrationPage.setState();
        registrationPage.setCity();
        registrationPage.setSubmit();
        registrationPage.verifyResultsModalApperas();
        registrationPage.verifyResults("Student Name",firstName+" "+ lastName);
        registrationPage.verifyResults("Student Email", userEmail);
        registrationPage.verifyResults("Gender", userGender);
        registrationPage.verifyResults("Mobile", number);
        registrationPage.verifyResults("Date of Birth", dayBirth+" "+ monthBirth+","+yearBirth);
        registrationPage.verifyResults("Subjects", value);
        registrationPage.verifyResults("Hobbies", wrapper);
        registrationPage.verifyResults("Picture", picture);
        registrationPage.verifyResults("Address", adress);
        registrationPage.verifyResults("State and City", state+ " "+city);
    }
}
