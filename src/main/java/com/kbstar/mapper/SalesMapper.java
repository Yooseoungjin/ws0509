package com.kbstar.mapper;

import com.kbstar.dto.Sales;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SalesMapper extends KBMapper<String, Sales> {
    List<Sales> getdate();
    List<Sales> getmale();
    List<Sales> getfemale();
}
