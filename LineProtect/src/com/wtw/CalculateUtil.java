/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw;

/**
 * 算法类
 * @author wangtianwen
 * @version 1.0
 */
public class CalculateUtil {

	/** 
	 * 1.差动保护 
	 * A.相电流差动保护 高定值
	 * @param gz 高值
	 * @param dz 低值
	 * @param csz 参数值
	 * @param m
	 * @return
	 */
	public static String xdlbh_gdz(double gz,double dz,double csz,String m) {
		switch (m) {
		case "1.05":
			
			break;
		case "2.0":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	/** 
	 * 1.差动保护 
	 * A.相电流差动保护 低定值
	 * @param gz 高值
	 * @param dz 低值
	 * @param csz 参数值
	 * @param m
	 * @return
	 */
	public static String xdlbh_ddz(double gz,double dz,double csz,String m) {
		switch (m) {
		case "1.05":
			
			break;
		case "2.0":
			
			break;
		case "0.95":
			
			break;
		default:
			break;
		}
		return "1";
	}
	
	/**
	 * 一.差动保护	B.零序差动过流保护
	 * @param qdz 启动值
	 * @param m
	 * @return
	 */
	public static String lxdcglbh(double qdz,String m) {
		switch (m) {
		case "1.05":
			
			break;
		case "2.0":
			
			break;
		case "0.95":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	/**
	 * 一.差动保护	C.工频变化量阻抗  单相接地故障 电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlzkDxU(double dz,double k,double ψ,String m) {
		switch (m) {
		case "1.1":
			
			break;
		case "0.9":
			
			break;
		case "1.2":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	/**
	 * 一.差动保护	C.工频变化量阻抗  单相接地故障 电流
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlzkDxI(double dz,double k,double ψ,String m) {
		switch (m) {
		case "1.1":
			
			break;
		case "0.9":
			
			break;
		case "1.2":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	/**
	 * 一.差动保护	C.工频变化量阻抗  相间故障 电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlzkXjU(double dz,double k,double ψ,String m) {
		switch (m) {
		case "1.1":
			
			break;
		case "0.9":
			
			break;
		case "1.2":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	/**
	 * 一.差动保护	C.工频变化量阻抗  相间故障  电流
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlzkXjI(double dz,double k,double ψ,String m) {
		switch (m) {
		case "1.1":
			
			break;
		case "0.9":
			
			break;
		case "1.2":
			
			break;
		default:
			break;
		}
		return "100";
	}
	
	//二、纵联距离保护
	/**
	 * 工频变化量方向保护  单相接地故障 电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlfxbhDxU(double dz,double k,double ψ,String m) {
		switch (m) {
		case "0.9":
			
			break;
		case "0.7":
			
			break;
		default:
			break;
		}
		return "100";
	}
	/**
	 * 工频变化量方向保护  单相接地故障 电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlfxbhDxI(double dz,double k,double ψ,String m) {
		switch (m) {
		case "0.9":
			
			break;
		case "0.7":
			
			break;
		default:
			break;
		}
		return "100";
	}
	/**
	 * 工频变化量方向保护 相间故障 电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlfxbhXjU(double dz,double k,double ψ,String m) {
		switch (m) {
		case "0.9":
			
			break;
		case "0.7":
			
			break;
		default:
			break;
		}
		return "100";
	}
	/**
	 * 工频变化量方向保护 相间故障  正方向出三相短路时  电压
	 * @param dz
	 * @param k
	 * @param ψ
	 * @return
	 */
	public static String gpbhlfxbhXjU(double dz,double k,double ψ) {
		
		return "100";
	}
	/**
	 * 工频变化量方向保护 相间故障 电流
	 * @param dz
	 * @param k
	 * @param ψ
	 * @param m
	 * @return
	 */
	public static String gpbhlfxbhXjI(double dz,double k,double ψ,String m) {
		switch (m) {
		case "0.9":
			
			break;
		case "0.7":
			
			break;
		default:
			break;
		}
		return "100";
	}
	/**
	 *  工频变化量方向保护 相间故障 正方向出三相短路时 电流
	 * @param dz
	 * @param k
	 * @param ψ
	 * @return
	 */
	public static String gpbhlfxbhXjI(double dz,double k,double ψ) {
		
		return "100";
	}
}
