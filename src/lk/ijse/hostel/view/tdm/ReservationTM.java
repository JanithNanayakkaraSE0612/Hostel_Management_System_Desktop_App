package lk.ijse.hostel.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationTM {
    private String res_id;
    private String student_id;
    private String room_type_id;
    private LocalDate date;
    private String status;
}
