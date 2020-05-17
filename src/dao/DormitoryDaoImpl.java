package dao;

import entity.DormitoryEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository("dormitoryDao")
@Transactional
public class DormitoryDaoImpl extends BaseDao implements DormitoryDao{
    @Resource(name="hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    @Override
    public void addDormitory(DormitoryEntity dormitoryEntity) {
        hibernateTemplate.save(dormitoryEntity);
    }

    @Override
    public void deleteDormitory(DormitoryEntity dormitoryEntity) {
        hibernateTemplate.delete(dormitoryEntity);
    }

    @Override
    public void updateDormitory(DormitoryEntity dormitoryEntity) {
        hibernateTemplate.update(dormitoryEntity);
    }

    @Override
    public List<DormitoryEntity> find() {
        String hql = "from DormitoryEntity";
        List<DormitoryEntity> list = (List<DormitoryEntity>) hibernateTemplate.find(hql);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public DormitoryEntity findRoomById(Integer roomId){
         return hibernateTemplate.get(DormitoryEntity.class,roomId);

    }
    @Override
    public DormitoryEntity findRoomByNumber(Integer roomNumber) {
        String hql = "from DormitoryEntity where roomNumber = ?";
        List<DormitoryEntity> list = (List<DormitoryEntity>) hibernateTemplate.find(hql, roomNumber);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public DormitoryEntity find(String dormitoryName) {
        String hql = "from DormitoryEntity where dormitoryName = ?";
        List<DormitoryEntity> list = (List<DormitoryEntity>) hibernateTemplate.find(hql, dormitoryName);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public DormitoryEntity find(String dormitoryName, Integer roomNumber) {
        String hql = "from DormitoryEntity where dormitoryName= ? and roomNumber = ?";
        List<DormitoryEntity> list = (List<DormitoryEntity>) hibernateTemplate.find(hql, dormitoryName,roomNumber);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
