package com.baomidou.mybatisplus.extension.plugins.pagination.dialects;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;

/**
 * @author miemie
 * @since 2018-11-01
 */
class DB2DialectTest {

    @Test
    void m1() {
        Page<?> page = new Page<>(2, 10);
        System.out.println(page.offset() + 1);
        System.out.println(page.getSize() + page.offset());
    }
}
