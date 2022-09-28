package Model;

public class Diagnoses {

    String healthProblemDescription;
    boolean familyHasTheProblem;
    String finalDiagnoses;

    public Diagnoses(String healthProblemDescription,
                     boolean familyHasTheProblem,
                     String finalDiagnoses) {
        this.healthProblemDescription = healthProblemDescription;
        this.familyHasTheProblem = familyHasTheProblem;
        this.finalDiagnoses = finalDiagnoses;
    }

    public String getHealthProblemDescription() {
        return healthProblemDescription;
    }

    public void setHealthProblemDescription(String healthProblemDescription) {
        this.healthProblemDescription = healthProblemDescription;
    }

    public boolean isFamilyHasTheProblem() {
        return familyHasTheProblem;
    }

    public void setFamilyHasTheProblem(boolean familyHasTheProblem) {
        this.familyHasTheProblem = familyHasTheProblem;
    }

    public String getFinalDiagnoses() {
        return finalDiagnoses;
    }

    public void setFinalDiagnoses(String finalDiagnoses) {
        this.finalDiagnoses = finalDiagnoses;
    }

    @Override
    public String toString() {
        return "Diagnoses{" +
                "healthProblemDescription='" + healthProblemDescription + '\'' +
                ", familyHasTheProblem=" + familyHasTheProblem +
                ", finalDiagnoses='" + finalDiagnoses + '\'' +
                '}';
    }
}
