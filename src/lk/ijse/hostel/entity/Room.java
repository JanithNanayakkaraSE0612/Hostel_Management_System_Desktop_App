package lk.ijse.hostel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Room {
    @Id
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;
    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Reservation> reservationList=new ArrayList<>();

    public Room(String room_type_id, String type, double key_money, int qty) {
        this.room_type_id=room_type_id;
        this.type=type;
        this.key_money=key_money;
        this.qty=qty;
    }

}
