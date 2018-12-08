package com.cm.dao;

import com.cm.pojo.File;
import com.cm.pojo.FileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileMapper {
    long countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(File record);

    int insertSelective(File record);

    List<File> selectByExample(FileExample example);

    File selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}