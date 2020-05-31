package axe.generic;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import net.thucydides.core.annotations.Steps;


public class GenericWebsiteFixture {

    @Steps
    private GenericWebsiteSteps steps;

    @Etantdonné("un client arrive la page d'accueil du site")
    public void un_client_arrive_la_page_d_accueil_du_site() {
        steps.openHomePage();
    }

    @Alors("la page répond aux normes W3c en matière d'accessibilité")
    public void la_page_d_accessibilité() {
        steps.effectuer_analyse_accessibilite();
    }


}
