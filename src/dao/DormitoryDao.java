package dao;

import entity.DormitoryEntity;

import java.util.List;

public interface DormitoryDao {
    public void addDormitory(DormitoryEntity dormitoryEntity);
    public void deleteDormitory(DormitoryEntity dormitoryEntity);
    public void updateDormitory(DormitoryEntity dormitoryEntity);
    public List<DormitoryEntity> find();
    public DormitoryEntity findRoomById(Integer roomId);
    public DormitoryEntity findRoomByNumber(Integer roomNumber);
    public DormitoryEntity find(String dormitoryName);
    public DormitoryEntity find(String dormitoryName, Integer roomNumber);
}
