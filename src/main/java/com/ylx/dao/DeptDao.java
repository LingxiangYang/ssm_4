package com.ylx.dao;

import com.ylx.dao.provider.DeptDynaSqlProvider;
import com.ylx.model.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

import static com.ylx.util.common.HrmConstants.DEPTTABLE;

public interface DeptDao {
    //动态查询
    @SelectProvider(type = DeptDynaSqlProvider.class,method = "selectWhitParam")
    List<Dept> selectByPage(Map<String,Object> params);
    @SelectProvider(type = DeptDynaSqlProvider.class,method = "count")
    Integer count(Map<String,Object>params);
    @Select("select * from " + DEPTTABLE +" ")
    List<Dept> selectAllDept();
    @Select("select * from " + DEPTTABLE +"where id = #{id}")
    Dept selectById(int id);
    //根据id删除部门
    @Delete("delete from "+ DEPTTABLE + "where id=#{id}")
    void deleteById(int id);
    //动态插入部门
    @SelectProvider(type = DeptDynaSqlProvider.class,method = "insertDept")
    void save(Dept dept);
    //动态修改用户
    @SelectProvider(type = DeptDynaSqlProvider.class,method = "updateDept")
    void update(Dept dept);
}
