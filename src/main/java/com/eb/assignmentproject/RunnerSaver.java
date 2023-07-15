package com.eb.assignmentproject;

import com.eb.assignmentproject.config.HibernateUtils;
import com.eb.assignmentproject.model.Doctors;
import com.eb.assignmentproject.model.Hospitals;
import com.eb.assignmentproject.model.Specialities;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Random;

public class RunnerSaver
{
    public static void main(String[] args)
    {

        Random random = new Random();

        try(Session session = HibernateUtils.getSessionFactory().openSession())
        {
            Transaction transaction = session.beginTransaction();

            for(int i = 0; i < 20; i++)
            {
                Hospitals hospitals = new Hospitals();
                hospitals.setCountry("country " + i);
                hospitals.setName("hospital" + i);

                Doctors doctors = new Doctors();
                doctors.setName("name" + i);
                doctors.setLastname("lastname" + i+1);
                doctors.setSsn("" + random.nextInt(100,100000));
                doctors.setPassword("" + random.nextInt(1000, 2000));


                Specialities specialities = new Specialities();
                specialities.setSpeciality("specialty" + i);


                specialities.setHospitals(hospitals);
                doctors.setHospitals(hospitals);
                doctors.setSpeciality(specialities);

                session.save(specialities);
                session.save(hospitals);
                session.save(doctors);
            }

            transaction.commit();
            session.close();
        }

    }
}
