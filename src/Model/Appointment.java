package Model;

import java.util.Date;

public class Appointment {

    String appointmentDate;
    Diagnoses diagnoses;
    Psychologist Psychologist;
    Client client;

    public Appointment(String appointmentDate,
                       Diagnoses diagnoses,
                       Psychologist psychologist,
                       Client client) {
        this.appointmentDate = appointmentDate;
        this.diagnoses = diagnoses;
        this.Psychologist = psychologist;
        this.client = client;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Diagnoses getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Diagnoses diagnoses) {
        this.diagnoses = diagnoses;
    }

    public Model.Psychologist getPsychologist() {
        return Psychologist;
    }

    public void setPsychologist(Model.Psychologist psychologist) {
        Psychologist = psychologist;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentDate=" + appointmentDate +
                ", diagnoses=" + diagnoses +
                ", Psychologist=" + Psychologist +
                ", client=" + client +
                '}';
    }
}
