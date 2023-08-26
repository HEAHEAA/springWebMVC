package com.applymybatispostgre.mapper;

import com.applymybatispostgre.model.Apply;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ApplyMapper {
    @Select("SELECT * FROM apply")
    List<Apply> findAll();

    @Select("SELECT * FROM apply WHERE id = #{id}")
    Apply findById(@Param("id") int id);

    @Delete("DELETE FROM apply WHERE id = #{id}")
    int deleteById(@Param("id")int id);

    @Insert("INSERT INTO apply(name,age) VALUES (#{name}, #{age})")
    int save (Apply item);

    @Update("UPDATE apply SET name=#{name}, age=#{age} WHERE id=#{id}")
    int update(Apply item);

}
