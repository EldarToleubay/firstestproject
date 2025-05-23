package entity;

public class Vacancy {
    public String displayVacancy;
    private String jobTitle;
    private String companyName;
    private String location;
    private String searchJob;

    public String getSearchJob() {
        return searchJob;
    }

    public void setSearchJob(String searchJob) {
        this.searchJob = searchJob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
