package Odevler;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AddRecordSelenideTest extends BaseSelenideTest {

    @Test
    public void addAndEditRecordTest() {

        WebTablesPage page = new WebTablesPage();

        String email = "deniz@test.com";

        page.openWebTablesPage()
                .clickAddButton()
                .fillNewRecordForm(
                        "Deniz",
                        "Yazıcı",
                        email,
                        "35",
                        "5000",
                        "QA"
                )
                .submitForm()

                .editRecordByEmail(email, "36")

                .verifyAgeByEmail(email, "36");


        sleep(2000);
    }
}
