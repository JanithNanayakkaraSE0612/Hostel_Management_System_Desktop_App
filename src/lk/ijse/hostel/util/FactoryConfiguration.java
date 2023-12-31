package lk.ijse.hostel.util;

import lk.ijse.hostel.entity.Reservation;
import lk.ijse.hostel.entity.Room;
import lk.ijse.hostel.entity.Student;
import lk.ijse.hostel.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {

        sessionFactory=new Configuration()
                .mergeProperties(Utility.getProperties())
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Reservation.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {

        return factoryConfiguration == null ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
