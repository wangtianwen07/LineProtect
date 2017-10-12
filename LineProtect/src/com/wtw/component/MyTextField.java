/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.component;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * 自定义文本框
 * @author wangtianwen
 * @version 1.0
 */
public class MyTextField extends JTextField{

	private static final long serialVersionUID = 1L;

	public MyTextField(String text) {
		super(text);
		super.setColumns(10);//设置文本框初始化大小
		//设置监听器
		super.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(getText().trim().equals("")) {
					setText(text);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(getText().equals(text)) {
					setText("");
				}
			}
		});
	}
}
