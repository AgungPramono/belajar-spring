/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.ioc;

import com.belajar.ioc.dao.MemberDao;
import com.belajar.ioc.model.KoneksiDatabase;
import com.belajar.ioc.model.Member;

/**
 *
 * @author bits
 */
public class ManualIOC {

    public static void main(String[] args) {
        
        KoneksiDatabase koneksi = new KoneksiDatabase();
        koneksi.setDriver("mysql.jdbc.driver");
        koneksi.setUrl("mysql://localhost:3306/example");
        koneksi.setUsername("example123");
        koneksi.setPassword("1234");
        
        Member member = new Member();
        member.setId("001");
        member.setName("member001");
        
        //pakai constructor injector
//        MemberDao memberDao = new MemberDao(koneksi);
//        memberDao.save(member);
    }

}
