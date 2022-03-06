package com.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsolesVideoGames {
    public static final Target CATEGORY_CONSOLES_VIDEO_GAMES = Target.the("Category consoles and video games").located(By.xpath("//span[contains(text(),'Consolas y Videojuegos')]"));
    public static final Target PRODUCT_CONSOLES_VIDEO_GAMES = Target.the("Selected product ").locatedBy("//span[contains(text(),'{0}')]");

}
