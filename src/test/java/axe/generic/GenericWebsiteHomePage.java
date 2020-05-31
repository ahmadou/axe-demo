package axe.generic;

import axe.generic.beans.AccessibilityReport;
import com.deque.axe.AXE;
import net.serenitybdd.core.pages.PageObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;

import static org.junit.Assert.assertTrue;

public class GenericWebsiteHomePage extends PageObject {

    public void ouvrir_page_accueil() {
        this.open();
    }

    public AccessibilityReport analyser_accessibilite() {
        AccessibilityReport report = new AccessibilityReport();
        URL minifiedJs = this.getClass().getResource("/axe/axe.min.js");
        AXE.Builder builder = new AXE.Builder(this.getDriver(), minifiedJs);
        builder.skipFrames();
        JSONObject responseJSON = builder.analyze();
        JSONArray violations = responseJSON.getJSONArray("violations");
        report.setAccesssible(violations.length() == 0);
        report.setReport(AXE.report(violations));
        report.setPageName(this.getClass().getCanonicalName());
        return report;
    }
}
