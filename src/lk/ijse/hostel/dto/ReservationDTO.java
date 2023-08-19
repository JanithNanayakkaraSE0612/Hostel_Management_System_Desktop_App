package lk.ijse.hostel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {
    private String res_id;
    private String student_id;
    private String room_type_id;
    private LocalDate date;
    private String status;
}
