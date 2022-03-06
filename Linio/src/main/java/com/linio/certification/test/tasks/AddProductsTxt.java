package com.linio.certification.test.tasks;

import com.linio.certification.test.userinterfaces.HomePage;
import com.linio.certification.test.models.Product;
import com.linio.certification.test.utils.SaveFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AddProductsTxt implements Task {

    private List<Product> products;

    public AddProductsTxt(List<Product> products) {
        this.products = products;
    }

    public static AddProductsTxt addProducts(List<Product> products) {
        return Tasks.instrumented(AddProductsTxt.class, products);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.GO_SHOPPING_CART));
        SaveFile file = new SaveFile();
        file.writeFile(products);
    }

}
