package com.fahami.cda;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Class Instant pour manipuler les instants dans le temps
        Instant epoch = Instant.EPOCH;
        Instant instant = Instant.now();

        IO.println("Date de départ Unix : " + epoch);
        IO.println("Instant converti en date lisible par l'humain : " + instant);

        IO.println("Instant en Timestamps : " + instant.getEpochSecond());

        // Manipulation des dates avec LocalDate (année-mois-jour)
        LocalDate currentDate = LocalDate.now();

        LocalDate personalizedDate = LocalDate.of(2022 , 5 , 30);

        IO.println("Date du jour : " +currentDate);
        IO.println("Date personnalisée : " + personalizedDate);

        // Manipulation avec précision des heures, minutes, secondes
        LocalTime currentTime = LocalTime.now();
        LocalTime newCurrentTime = currentTime.of(5, 50, 30);

        IO.println("Temps présent : " + currentTime);
        IO.println("Temps présent personnalisé: " + newCurrentTime);

        // Manipulation des dates et heures avec LocalDateTime 
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime modifiedDateTime = LocalDateTime.of(2023, Month.OCTOBER, 24,23,48);

        IO.println("Date actuelle avec LocalDateTime : " + currentDateTime);
        IO.println("Modification de date avec LocalDateTime : " + modifiedDateTime);

        // Intégration de fuseaux horaires et décalages horaires
        ZoneId zoneParis = ZoneId.of("Europe/Paris");
        IO.println(zoneParis);

        ZoneOffset zoneOffset = ZoneOffset.ofHours(-2);
        OffsetTime offsetTime = OffsetTime.of(currentTime, zoneOffset);

        ZonedDateTime zonedDateTimeParis = ZonedDateTime.of(currentDateTime,  zoneParis);
        IO.println(zonedDateTimeParis);

        // Manipuler les durées
        Duration durationSeconds = Duration.ofSeconds(10000);
        IO.println("Durée en secondes : " + durationSeconds);
        
        LocalDate firstDate= LocalDate.of(2025, 12, 20);
        LocalDate secondDate= LocalDate.of(2026, 12, 25);
        // Duration differenceDuration = Duration.between(firstDate, secondDate);

        // IO.println(differenceDuration);

        Period period = Period.of(2, 3, 2);
        long differenceDays = ChronoUnit.DAYS.between(firstDate, secondDate);
        long differenceMonths = ChronoUnit.MONTHS.between(firstDate, secondDate);
        
        IO.println("Difference en nombre de jours : " + differenceDays);
        IO.println("Difference en nombre de mois : " + differenceMonths);
    }
}