/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw;

/**
 * �㷨��
 * @author wangtianwen
 * @version 1.0
 */
public class CalculateUtil {

	/** 
	 * 1.����� 
	 * A.���������� �߶�ֵ
	 * @param gz ��ֵ
	 * @param dz ��ֵ
	 * @param csz ����ֵ
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
	 * 1.����� 
	 * A.���������� �Ͷ�ֵ
	 * @param gz ��ֵ
	 * @param dz ��ֵ
	 * @param csz ����ֵ
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
	 * һ.�����	B.������������
	 * @param qdz ����ֵ
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
	 * һ.�����	C.��Ƶ�仯���迹  ����ӵع��� ��ѹ
	 * @param dz
	 * @param k
	 * @param ��
	 * @param m
	 * @return
	 */
	public static String gpbhlzkDxU(double dz,double k,double ��,String m) {
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
	 * һ.�����	C.��Ƶ�仯���迹  ����ӵع��� ����
	 * @param dz
	 * @param k
	 * @param ��
	 * @param m
	 * @return
	 */
	public static String gpbhlzkDxI(double dz,double k,double ��,String m) {
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
	 * һ.�����	C.��Ƶ�仯���迹  ������ ��ѹ
	 * @param dz
	 * @param k
	 * @param ��
	 * @param m
	 * @return
	 */
	public static String gpbhlzkXjU(double dz,double k,double ��,String m) {
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
	 * һ.�����	C.��Ƶ�仯���迹  ������  ����
	 * @param dz
	 * @param k
	 * @param ��
	 * @param m
	 * @return
	 */
	public static String gpbhlzkXjI(double dz,double k,double ��,String m) {
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
}
