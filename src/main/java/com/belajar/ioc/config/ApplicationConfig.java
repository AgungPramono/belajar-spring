/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.ioc.config;

import com.belajar.ioc.dao.MemberDao;
import com.belajar.ioc.model.KoneksiDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author bits
 */
@Configuration
public class ApplicationConfig {
    
    @Bean
    public KoneksiDatabase koneksiDatabase(){
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        koneksiDatabase.setDriver("mysql.jdbc.driver");
        koneksiDatabase.setUrl("mysql://localhost:3306/example");
        koneksiDatabase.setUsername("example123");
        koneksiDatabase.setPassword("1234");
        return koneksiDatabase;
    }
    
    @Bean
    public MemberDao memberDao(){
        MemberDao memberDao = new MemberDao(koneksiDatabase()); 
        return memberDao;
    }
    
}
