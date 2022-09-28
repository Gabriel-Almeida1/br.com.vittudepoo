package Model;

public class EducationalBackground {

    String bachelorDegree;
    String college;
    String courseDuration;

    public EducationalBackground(String bachelorDegree, String college, String courseDuration) {
        this.bachelorDegree = bachelorDegree;
        this.college = college;
        this.courseDuration = courseDuration;
    }

    public String getBachelorDegree() {
        return bachelorDegree;
    }

    public String getCollege() {
        return college;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setBachelorDegree(String bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "EducationalBackground{" +
                "bachelorDegree='" + bachelorDegree + '\'' +
                ", college='" + college + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
