package com.ylx.dao;

import com.ylx.dao.provider.EmployeeDynaSqlProvider;
import com.ylx.model.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import javax.swing.*;
import java.util.List;
import java.util.Map;

import static com.ylx.util.common.HrmConstants.EMPLOYEETABLE;

public interface EmployeeDao  {
    //根据参数查询员工总数
    @SelectProvider(type = EmployeeDynaSqlProvider.class,method = "count")
    Integer count(Map<String,Object> params);
    //根据参数动态查询员工
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "CRAD_ID",property = "cardId"),
            @Result(column = "POST_CODE",property = "postCode"),
            @Result(column = "QQ_NUM",property = "qqNum"),
            @Result(column = "BIRTHDAY",property = "birthday",javaType = java.util.Date.class),
            @Result(column = "CREATE_DATE",property = "createDate",javaType = java.util.Date.class),
            @Result(column = "DEPT_ID",property = "dept",one = @One(select = "com.ylx.dao.DeptDao.selectById",fetchType = FetchType.EAGER)),
            @Result(column = "JOB_ID",property = "job",one = @One(select = "com.ylc.dao.JobDao.selectById",fetchType = FetchType.EAGER)),
            @Result(column = "JOB_ID",property = "job")
    })
    List<Employee> selectByPage(Map<String,Object> params);
    //动态插入员工
    @SelectProvider(type = EmployeeDynaSqlProvider.class,method = "insertEmployee")
    void save(Employee employee);
    //根据id删除员工
    @Delete("delete from" + EMPLOYEETABLE +"where id = #{id}")
    void deleteById(Integer id);
    //根据id查询员工
    @Select("select * from"+EMPLOYEETABLE+"where ID = #{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "CARD_ID",property = "cardId"),
            @Result(column = "POST_CODE",property = "postCode"),
            @Result(column = "QQ_NUM",property = "qqNum"),
            @Result(column = "BIRTHDAY",property = "birthday",javaType = java.util.Date.class),
            @Result(column = "CREATE_DATE",property = "createDate",javaType = java.util.Date.class),
            @Result(column = "DEPT_ID",property = "dept",one = @One(select="com.ylx.dao.DeptDao.selectById",fetchType = FetchType.EAGER)),
            @Result(column = "JOB_ID",property = "job",one = @One(select = "com.ylc.dao.JobDao.selectById",fetchType = FetchType.EAGER)),
    })
    Employee selectById(Integer id);
    //动态修改员工
    @SelectProvider(type = EmployeeDynaSqlProvider.class,method = "updateEmployee")
    void update(Employee employee);
}
