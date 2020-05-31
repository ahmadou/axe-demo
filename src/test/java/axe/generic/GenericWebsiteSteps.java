package axe.generic;

import axe.generic.beans.AccessibilityReport;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GenericWebsiteSteps {

    private GenericWebsiteHomePage homePage;

    @Step
    void openHomePage() {
        homePage.ouvrir_page_accueil();
    }

    @Step
    public void effectuer_analyse_accessibilite() {
        AccessibilityReport accessibilityReport = homePage.analyser_accessibilite();
        if (!accessibilityReport.isAccesssible()) {
            Assert.fail(accessibilityReport.getReport());
        }
    }
}
