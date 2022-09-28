package Main;
import java.util.Date;
import Model.*;

public class Main {

    public static void main(String[] args) {


        Address psychologistAddress = new Address(
                "Brazil",
                "Rua Tenente Arsenio",
                "Business building",
                357,
                "Cajazeiras",
                "Paraíba"
        );

        EducationalBackground educationalBackground = new EducationalBackground(
                "Bachelor's Degree in Psychology",
                "Catholic University of Paraíba",
                "2015.01 - 2018.02"
        );

        Psychologist psychologist = new Psychologist(
                "Mauro",
                27,
                "28/5/1995",
                "445.554.87-97",
                "+5583991418631",
                "mauropsy@outlook.com",
                psychologistAddress,
                250.00,
                "TDAH, Depression, OCD, Autism, Schizophrenia",
                "08:00 AM - 12:00 PM," +
                                "02:00 PM - 06:00 PM",
                educationalBackground
                );

        Address clientAddress = new Address(
                "Brazil",
                "Rua Jose Liberato de Abreu",
                "Residence",
                80,
                "Cajazeiras",
                "Paraiba"
        );

        Client client = new Client(
                "Gabriel",
                25,
                "6/11/1997",
                "233.557.989-75",
                "+5583991133886",
                "gaa.alcz@live.com",
                clientAddress,
                "Pix"
        );

        Diagnoses diagnoses = new Diagnoses(
                "Obsessive compulsive disorder",
                true,
                "Patient diagnosed positive to OCD"
        );

        Appointment appointment = new Appointment(
                "30/9/2022",
                diagnoses,
                psychologist,
                client
        );

        System.out.println(psychologistAddress);
        System.out.println(educationalBackground);
        System.out.println(psychologist);
        System.out.println(clientAddress);
        System.out.println(client);
        System.out.println(diagnoses);
        System.out.println(appointment);

        // como acessar as Override toString() das classes;

    }



}
