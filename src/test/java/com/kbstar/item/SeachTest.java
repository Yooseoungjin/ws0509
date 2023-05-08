package com.kbstar.item;
import com.kbstar.dto.Item;
import com.kbstar.dto.ItemSearch;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class SeachTest {
    @Autowired
    ItemService service;
    @Test
    void contextLoads(){

        try {
            ItemSearch ms =
                    new ItemSearch("팔",10000,"2023/04/25","2023/05/02");
                    service.search(ms);
        } catch (Exception e) {
            log.info("에러...");
            e.printStackTrace();
        }
    }
}
