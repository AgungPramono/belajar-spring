/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.ioc;

import com.belajar.ioc.dao.MemberDao;
import com.belajar.ioc.model.Member;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bits
 */
public class SpringIOC {
    
    public static void main(String[] args) {
        AbstractApplicationContext container = new ClassPathXmlApplicationContext("classpath:ioc-config.xml");
        MemberDao memberDao = (MemberDao) container.getBean("memberDao");
        
        Member member = new Member();
        member.setId("001");
        member.setName("member001");
        
        memberDao.save(member);
    }
    
}
