package lk.ijse.hostel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Reservation {
    @Id
    private String res_id;
    private LocalDate date;
    @ManyToOne
    private Student student;
    @ManyToOne
    private lk.ijse.hostel.entity.Room room;
    private String status;
}
