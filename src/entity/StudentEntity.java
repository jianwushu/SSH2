package entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "student", schema = "struts2", catalog = "")
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = -7018851373053572477L;
    private Integer stuId;
    private String stuName;
    private String stuPassword;
    private Integer roomId;
    private Long stuNumber;
    private DormitoryEntity room;

    @Id
    @Column(name = "StuId")
    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "StuName")
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "StuNumber")
    public Long getStuNumber() {
        return stuNumber;
    }
    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Basic
    @Column(name ="StuPassword")
    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }
    @Basic
    @Column(name = "RoomId")
    public DormitoryEntity getRoom() {
        return room;
    }
    public void setRoom(DormitoryEntity room) {
        this.room = room;
    }
//    @Basic
//    @Column(name = "RoomId")
//    public Integer getRoomId() {
//        return roomId;
//    }
//
//    public void setRoomId(Integer roomId) {
//        this.roomId = roomId;
//    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuNumber=" + stuNumber +
                ", room=" + room +
                '}';
    }

    public StudentEntity() {
    }
    public StudentEntity(String stuName,Long stuNumber){
        this.stuName = stuName;
        this.stuNumber = stuNumber;
    }
    public StudentEntity(String stuName,Long stuNumber,DormitoryEntity room){
        this.stuName = stuName;
        this.stuNumber = stuNumber;
        this.room = room;
    }
}
