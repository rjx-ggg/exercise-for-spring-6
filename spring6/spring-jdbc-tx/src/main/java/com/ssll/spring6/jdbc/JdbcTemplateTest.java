package com.ssll.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName: JDBCTemplate
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/23 23:29
 */

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testJdbcTemplate(){
//        String sql = "select count(*) from t_emp";
//        Long count = jdbcTemplate.queryForObject(sql, Long.class);
//        System.out.println("count = " + count);

        //添加功能
        String sql = "insert into t_emp values(null,?,?,?)";
        int result = jdbcTemplate.update(sql, "张三", 23, "男");
        System.out.println("result = " + result);
    }

    @Test
    public void testJdbcTemplate2(){
        // 查询对象
        String sql = "select * from t_emp where id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testJdbcTemplate3(){
        // 查询集合
        String sql = "select * from t_emp";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println("empList = " + empList);
    }

    @Test
    public void testJdbcTemplate4(){
        // 查询返回单个值
        String sql = "select count(*) from t_emp";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println("count = " + count);
    }





}

