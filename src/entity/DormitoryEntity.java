package entity;

import javax.persistence.*;
@Entity
@Table(name = "dormitory", schema = "struts2", catalog = "")
public class DormitoryEntity {
    private Integer roomId;
    private String dormitoryName;
    private Integer roomNumber;

    @Id
    @Column(name = "RoomId")
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "DormitoryName")
    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    @Basic
    @Column(name = "RoomNumber")
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public DormitoryEntity() {
    }
    public DormitoryEntity(String dormitoryName,Integer roomNumber) {
        this.dormitoryName = dormitoryName;
        this.roomNumber = roomNumber;
    }
}


