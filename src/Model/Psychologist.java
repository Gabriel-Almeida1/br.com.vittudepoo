package Model;

import java.util.Date;

public class Psychologist extends User {

    double appointmentValue;
    String specialties;
    String appointmentHours;
    EducationalBackground educationalBackground;

    public Psychologist(String fullName,
                     int age,
                     String birthDate,
                     String cpf,
                     String phoneNumber,
                     String email,
                     Address address,
                     double appointmentValue,
                     String specialties,
                     String appointmentHours,
                     EducationalBackground educationalBackground) {
        super(fullName, age, birthDate, cpf, phoneNumber, email, address);
        this.appointmentValue = appointmentValue;
        this.specialties = specialties;
        this.appointmentHours = appointmentHours;
        this.educationalBackground = educationalBackground;
    }

    public Psychologist(String fullName, int age, String birthDate, String cpf, String phoneNumber, String email, Address address) {
        super(fullName, age, birthDate, cpf, phoneNumber, email, address);
    }

    public double getAppointmentValue() {
        return appointmentValue;
    }

    public void setAppointmentValue(double appointmentValue) {
        this.appointmentValue = appointmentValue;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getAppointmentHours() {
        return appointmentHours;
    }

    public void setAppointmentHours(String appointmentHours) {
        this.appointmentHours = appointmentHours;
    }

    public String getEducationalBackground() {
        return educationalBackground.toString();
    }

    public void setEducationalBackground(EducationalBackground educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void setBirthDate(String birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(Address address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "Psychologist{" +
                "appointmentValue=" + appointmentValue +
                ", specialties='" + specialties + '\'' +
                ", appointmentHours='" + appointmentHours + '\'' +
                ", educationalBackground=" + educationalBackground +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", cpf='" + cpf + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}

