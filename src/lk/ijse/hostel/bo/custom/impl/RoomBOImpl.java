package lk.ijse.hostel.bo.custom.impl;

import lk.ijse.hostel.bo.custom.RoomBO;
import lk.ijse.hostel.dao.DAOFactory;
import lk.ijse.hostel.dao.DAOType;
import lk.ijse.hostel.dao.custom.RoomDAO;
import lk.ijse.hostel.dto.RoomDTO;
import lk.ijse.hostel.entity.Room;


import java.util.ArrayList;

public class RoomBOImpl implements RoomBO {
    private RoomDAO roomDAO = (RoomDAO) DAOFactory.getInstance().getDAOType(DAOType.ROOM);

    @Override
    public boolean saveRoom(RoomDTO dto) {
        return roomDAO.save(
                new Room(
                        dto.getRoom_type_id(),
                        dto.getType(),
                        dto.getKey_money(),
                        dto.getQty()
                )
        );
    }
    @Override
    public boolean deleteRoom(RoomDTO dto) {
        return roomDAO.delete(
                new Room(
                        dto.getRoom_type_id(),
                        dto.getType(),
                        dto.getKey_money(),
                        dto.getQty()
                )
        );
    }
    @Override
    public boolean updateRoom(RoomDTO dto) {
        return roomDAO.update(
                new Room(
                        dto.getRoom_type_id(),
                        dto.getType(),
                        dto.getKey_money(),
                        dto.getQty()
                )
        );
    }
    @Override
    public ArrayList<RoomDTO> loadAll() {
        ArrayList<Room> rooms = roomDAO.getAll();
        ArrayList<RoomDTO> roomDTOS=new ArrayList<>();
        for (Room r:rooms) {
            roomDTOS.add(
                    new RoomDTO(
                            r.getRoom_type_id(),
                            r.getType(),
                            r.getKey_money(),
                            r.getQty()
                    )
            );
        }
        return roomDTOS;
    }
}
