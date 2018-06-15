package net.shipovalov.training.model;

public class fillreport {
    private String reportfillsummary;
    private String reportfilldescription;
    private String reportfillstep;

    public fillreport withSummary(String summary) {
        this.reportfillsummary = summary;
        return this;
    }


    public fillreport withDescription(String descrip) {
        this.reportfilldescription = descrip;
        return this;
    }

    public fillreport withStep(String step) {
        this.reportfillstep = step;
        return this;
    }



    public String getReportfillsummary() { return reportfillsummary; }

    public String getReportfilldescription() {
        return reportfilldescription;
    }

    public String getReportfillstep() {
        return reportfillstep;
    }
}
