package Odevler;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage {


    private final SelenideElement addButton = $("#addNewRecordButton");
    private final SelenideElement submitButton = $("#submit");


    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement ageInput = $("#age");
    private final SelenideElement salaryInput = $("#salary");
    private final SelenideElement departmentInput = $("#department");


    private final ElementsCollection tableRows = $$(".rt-tbody .rt-tr-group");

    public WebTablesPage openWebTablesPage() {
        open("https://demoqa.com/webtables");
        return this;
    }

    public WebTablesPage clickAddButton() {
        addButton.click();
        return this;
    }

    public WebTablesPage fillNewRecordForm(String firstName,
                                           String lastName,
                                           String email,
                                           String age,
                                           String salary,
                                           String department) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        ageInput.setValue(age);
        salaryInput.setValue(salary);
        departmentInput.setValue(department);
        return this;
    }

    public WebTablesPage submitForm() {
        submitButton.click();
        return this;
    }

    public WebTablesPage editRecordByEmail(String email, String newAge) {


        SelenideElement row = tableRows.findBy(text(email));


        row.$("span[title='Edit']").click();


        ageInput.clear();
        ageInput.setValue(newAge);


        submitButton.click();
        return this;
    }

    public WebTablesPage verifyAgeByEmail(String email, String expectedAge) {
        SelenideElement row = tableRows.findBy(text(email));
        row.shouldHave(text(expectedAge));
        return this;
    }
}
