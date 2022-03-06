package co.com.project.certificate.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormRegisterPersonalInformation {

    public static final Target TXT_FIRST_NAME = Target.the("Name field ").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name field").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Email field").located(By.id("email"));
    public static final Target SLT_BIRTH_DAY = Target.the("Birthday day").located(By.name("birthDay"));
    public static final Target SLT_BIRTH_MONTH = Target.the("Month birthday ").located(By.name("birthMonth"));
    public static final Target SLT_BIRTH_YEAR = Target.the("Year birthday").located(By.name("birthYear"));
    public static final Target TXT_LANGUAGES = Target.the("Languages spoken field").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BTN_NEXT = Target.the("Next button").located(By.xpath("//*[@class=\"btn btn-blue\"]"));

}
