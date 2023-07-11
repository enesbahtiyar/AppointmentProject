package com.eb.assignmentproject.main;

import java.util.Scanner;

public class AppointmentProjectService
{
    private static final Scanner scanner = new Scanner(System.in);


    public static void displayMenuAppointmentManagementSystem()
    {
        boolean isExit = false;
        while (!isExit)
        {
            System.out.println("------Appointment System-------");
            System.out.println("Choose a Role");
            System.out.println("1: Doctor");
            System.out.println("2: Helper");
            System.out.println("3: Patient");
            System.out.println("4: Exit");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    //enter the doctor password
                    //if password exists then open doctor menu
                    break;
                case 2:
                    //enter the helper password
                    //if password exists then open helper menu
                    break;
                case 3:
                    //enter the patient password
                    //if patient exists then open patient menu
                    //if not create new patient then open menu
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice please select number from 1 To 4");
            }
        }
    }

    public static void displayDoctorMenu()
    {
        boolean isExit = false;
        while (!isExit)
        {
            System.out.println("----Doctor Menu----");
            System.out.println("1: Check Hospitals");
            System.out.println("2: Check Patients");
            System.out.println("3: Check Doctors");
            System.out.println("4: Exit");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice please select number from 1 To 4");
            }
        }
    }



}
