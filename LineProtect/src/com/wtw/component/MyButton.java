/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.component;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class MyButton extends JButton{

	private static final long serialVersionUID = 1L;

	public MyButton(String text) {
		super(text);
		super.setFont(new Font("alias", Font.BOLD, 14));
		Dimension preferredSize = new Dimension(100,30);//���óߴ�
		super.setPreferredSize(preferredSize );
	}
}
