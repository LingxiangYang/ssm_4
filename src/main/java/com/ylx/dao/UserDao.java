package com.ylx.dao;

import com.ylx.dao.provider.UserDynaSqlProvider;
import com.ylx.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

import static com.ylx.util.common.HrmConstants.USERTABLE;

public interface UserDao {
    //根据登录名和密码查询员工
    @Select("select * from" + USERTABLE+"where loginname=#{loginname} and password=#{password}")
    User selectByLoginnameAndPassword(
            @Param("loginname") String loginname,
            @Param("password") String password);
    //根据id查询用户
    @Select("select * from "+USERTABLE+"where ID = #{id}")
    User selectById(Integer id);
    //根据id删除用户
    @Delete("delete from " + USERTABLE+"where ID = #{id}")
    void deleteById(Integer id);
    //动态修改用户
    @SelectProvider(type = UserDynaSqlProvider.class,method = "updateUser")
    void update(User user);
    //动态查询
    @SelectProvider(type = UserDynaSqlProvider.class,method = "selectWhitParam")
    List<User> selectByPage(Map<String,Object> params);
    //根据参数查询用户总数
    @SelectProvider(type = UserDynaSqlProvider.class,method = "count")
    Integer count(Map<String,Object> params);
    //动态插入用户
    @SelectProvider(type = UserDynaSqlProvider.class,method = "insertUser")
    void save(User user);


}
