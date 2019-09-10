package com.ylx.dao.provider;

import com.ylx.model.Job;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

import static com.ylx.util.common.HrmConstants.JOBTABLE;

public class JobDynaSqlProvider {
    public String selectWhitParam(final Map<String,Object> params){
        String sql = new SQL(){
            {
                SELECT("*");
                FROM(JOBTABLE);
                if(params.get("job")!=null){
                    Job job = (Job) params.get("job");
                    if(job.getName()!=null && !job.getName().equals(""));
                }
            }
        }.toString();
        if(params.get("pageModel")!=null){
            sql += "limit #{pageModel.firstLimitParam},#{pageModel.page.size}";
        }
        return sql;
    }
    //动态查询总数量
    public String count(final Map<String,Object> params){
        return new SQL(){
            {
                SELECT("count(*)");
                FROM(JOBTABLE);
                if(params.get("job")!=null){
                    Job job = (Job) params.get("job");
                    if(job.getName()!=null&&!job.getName().equals("")){
                        WHERE("name LIKE CONCAT('%',#{job.name},'%')");
                    }
                }
            }
        }.toString();
    }
    //动态输入
    public String insertJob(final Job job){
        return new SQL(){
            {
                INSERT_INTO(JOBTABLE);
                if(job.getName()!=null){
                    VALUES("name","#{name}");
                }
                if(job.getRemark()!=null){
                    VALUES("remark","remark");
                }
            }
        }.toString();
    }
    //动态更新
    public String updateJob(final Job job) {
        return new SQL(){
            {
                UPDATE(JOBTABLE);
                if(job.getName()!=null){
                    SET("name = #{name}");
                }
                if(job.getRemark()!=null){
                    SET("remark = #{remark}");
                }
            }
        }.toString();
    }
}
