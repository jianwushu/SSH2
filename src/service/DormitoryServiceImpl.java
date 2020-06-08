package service;

import dao.DormitoryDao;
import entity.DormitoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryDao dormitoryDao;
    @Override
    public void addDormitory(DormitoryEntity dormitoryEntity) {
        dormitoryDao.addDormitory(dormitoryEntity);
    }

    @Override
    public void deleteDormitory(DormitoryEntity dormitoryEntity) {
        dormitoryDao.deleteDormitory(dormitoryEntity);
    }

    @Override
    public void updateDormitory(DormitoryEntity dormitoryEntity) {
        dormitoryDao.updateDormitory(dormitoryEntity);
    }

    @Override
    public List<DormitoryEntity> find() {
        return dormitoryDao.find();
    }

    @Override
    public DormitoryEntity findById(Integer roomId) {
        return dormitoryDao.findRoomById(roomId);
    }

    @Override
    public DormitoryEntity findByNumber(Integer roomNumber) {
        return dormitoryDao.findRoomByNumber(roomNumber);
    }

    @Override
    public DormitoryEntity find(String dormitoryName) {
        return dormitoryDao.find(dormitoryName);
    }

    @Override
    public DormitoryEntity find(String dormitoryName, Integer roomNumber) {
        return dormitoryDao.find(dormitoryName,roomNumber);
    }

}
