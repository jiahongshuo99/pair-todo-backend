package com.example.pairtodo.mapper;

import com.example.pairtodo.model.Todo;
import com.example.pairtodo.model.TodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TodoMapper {
    long countByExample(TodoExample example);

    int deleteByExample(TodoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Todo row);

    int insertSelective(Todo row);

    List<Todo> selectByExampleWithBLOBs(TodoExample example);

    List<Todo> selectByExample(TodoExample example);

    Todo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Todo row, @Param("example") TodoExample example);

    int updateByExampleWithBLOBs(@Param("row") Todo row, @Param("example") TodoExample example);

    int updateByExample(@Param("row") Todo row, @Param("example") TodoExample example);

    int updateByPrimaryKeySelective(Todo row);

    int updateByPrimaryKeyWithBLOBs(Todo row);

    int updateByPrimaryKey(Todo row);
}