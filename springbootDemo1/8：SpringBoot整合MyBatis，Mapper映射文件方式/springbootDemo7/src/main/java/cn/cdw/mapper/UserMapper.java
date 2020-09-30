package cn.cdw.mapper;

import cn.cdw.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DW-CHEN
 */
@Mapper
@Repository
public interface UserMapper {
    public List<User> selectAll();
}
