package com.example.pairtodo.mapper;

import com.example.pairtodo.model.Pair;
import com.example.pairtodo.model.PairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PairMapper {
    long countByExample(PairExample example);

    int deleteByExample(PairExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pair row);

    int insertSelective(Pair row);

    List<Pair> selectByExample(PairExample example);

    Pair selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Pair row, @Param("example") PairExample example);

    int updateByExample(@Param("row") Pair row, @Param("example") PairExample example);

    int updateByPrimaryKeySelective(Pair row);

    int updateByPrimaryKey(Pair row);
}