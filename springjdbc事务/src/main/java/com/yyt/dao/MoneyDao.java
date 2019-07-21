package com.yyt.dao;


import org.springframework.jdbc.core.JdbcTemplate;




public class MoneyDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int update(String sql, Object[] param){
        return jdbcTemplate.update(sql,param);
    }
}
