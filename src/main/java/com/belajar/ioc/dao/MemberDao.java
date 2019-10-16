/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.ioc.dao;

import com.belajar.ioc.model.KoneksiDatabase;
import com.belajar.ioc.model.Member;

/**
 *
 * @author bits
 */
public class MemberDao {
    
    private KoneksiDatabase koneksi;
    
    public MemberDao(KoneksiDatabase koneksiDatabase){
        this.koneksi = koneksiDatabase;
    }
    
    public void save(Member member){
        koneksi.connect();
        System.out.println("menyimpan member");
    }
    
}
