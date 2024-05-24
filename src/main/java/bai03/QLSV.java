/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03;

/**
 *
 * @author lqv20
 */
public class QLSV {
    public static void main(String[] args){
        SInhVien sv;
        sv = new SInhVien();
        sv.hoten = "Vinh Hoan Hao";
        sv.namsinh = 2004;
        sv.sdt = "deo biet";
        
        System.out.println("Ho ten: "+sv.hoten);
        System.out.println("nam sinh: "+ sv.namsinh);
        System.out.println("sdt: "+sv.sdt);
    }
}
