package lk.ijse.hostel.bo.custom.impl;

import lk.ijse.hostel.bo.custom.StudentBO;
import lk.ijse.hostel.dao.DAOFactory;
import lk.ijse.hostel.dao.DAOType;
import lk.ijse.hostel.dao.custom.StudentDAO;
import lk.ijse.hostel.dto.StudentDTO;
import lk.ijse.hostel.entity.Student;


import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {
    private StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAOType(DAOType.STUDENT);

    @Override
    public boolean saveStudent(StudentDTO dto) {
        return studentDAO.save(
                new Student(
                        dto.getStudent_id(),
                        dto.getName(),
                        dto.getAddress(),
                        dto.getContact_no(),
                        dto.getDob(),
                        dto.getGender()
                )
        );
    }

    @Override
    public boolean deleteStudent(StudentDTO dto) {
        return studentDAO.delete(
                new Student(
                        dto.getStudent_id(),
                        dto.getName(),
                        dto.getAddress(),
                        dto.getContact_no(),
                        dto.getDob(),
                        dto.getGender()
                )
        );
    }

    @Override
    public boolean updateStudent(StudentDTO dto) {
        return studentDAO.update(
                new Student(
                        dto.getStudent_id(),
                        dto.getName(),
                        dto.getAddress(),
                        dto.getContact_no(),
                        dto.getDob(),
                        dto.getGender()
                )
        );
    }

    @Override
    public ArrayList<StudentDTO> getAllStudent() {
        ArrayList<Student> allStudent = studentDAO.getAllStudent();
        ArrayList<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student s : allStudent) {
            studentDTOS.add(
                    new StudentDTO(
                            s.getStudent_id(),
                            s.getName(),
                            s.getAddress(),
                            s.getContact_no(),
                            s.getDob(),
                            s.getGender()
                    )
            );
        }
        return studentDTOS;
    }
}
