package com.ylx.dao;

import com.ylx.dao.provider.DocumentDynaSqlProvider;
import com.ylx.model.Document;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import javax.print.Doc;
import java.util.List;
import java.util.Map;

import static com.ylx.util.common.HrmConstants.DOCUMENTTABLE;

public interface DocumentDao {
    @SelectProvider(type = DocumentDynaSqlProvider.class,method = "selectWhitparam")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "CREATE_DATE", property = "createDate", javaType = java.util.Date.class),
            @Result(column = "USER_ID", property = "user", one = @One(select = "com.ylx.dao.UserDao.selectById", fetchType = FetchType.EAGER))
    })
    List<Document> selectByPage(Map<String,Object> params);
    @SelectProvider(type = DocumentDynaSqlProvider.class,method = "count")
    Integer count(Map<String,Object> params);
    //动态插入文档
    @SelectProvider(type = DocumentDynaSqlProvider.class,method = "insertDocument")
    void save(Document document);
    @Select("select * from" + DOCUMENTTABLE + "where id = #{id}")
    Document selectById(int id);
    //根据id删除文档
    @Delete("delete from " + DOCUMENTTABLE + "where id = #{id}")
    void deleteById(int id);
    //动态修改文档
    @SelectProvider(type = DocumentDynaSqlProvider.class,method = "updateDocument")
    void update(Document document);
}
