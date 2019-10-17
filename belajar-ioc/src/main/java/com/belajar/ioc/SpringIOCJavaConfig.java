/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.ioc;

import com.belajar.ioc.config.ApplicationConfig;
import com.belajar.ioc.dao.MemberDao;
import com.belajar.ioc.model.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author bits
 */
public class SpringIOCJavaConfig {
    
    public static void main(String[] args) {
        ApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MemberDao memberDao = config.getBean(MemberDao.class);
        
        Member member = new Member();
        member.setId("001");
        member.setName("member001");
        
        memberDao.save(member);
    }
    
}
