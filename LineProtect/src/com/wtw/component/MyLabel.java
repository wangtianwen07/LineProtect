/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.component;

import java.awt.Color;

import javax.swing.JLabel;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class MyLabel extends JLabel{
	private static final long serialVersionUID = 1L;

	public MyLabel(String text) {
		super(text);
		super.setForeground(Color.RED);
	}
}
