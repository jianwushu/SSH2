package service;

import entity.DormitoryEntity;

import java.util.List;

public interface DormitoryService {
    public void addDormitory(DormitoryEntity dormitoryEntity);
    public void deleteDormitory(DormitoryEntity dormitoryEntity);
    public void updateDormitory(DormitoryEntity dormitoryEntity);
    public List<DormitoryEntity> find();
    public DormitoryEntity findById(Integer roomId);
    public DormitoryEntity findByNumber(Integer roomNumber);
    public DormitoryEntity find(String dormitoryName);
    public DormitoryEntity find(String dormitoryName, Integer roomNumber);
}
