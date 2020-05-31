package axe.generic.beans;

/**
 * Pjo contenant le resultat du test d'accessibilité d'une page
 */
public class AccessibilityReport {
    private String pageName;

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    private boolean isAccesssible;

    private String report;

    public boolean isAccesssible() {
        return isAccesssible;
    }

    public void setAccesssible(boolean accesssible) {
        isAccesssible = accesssible;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
