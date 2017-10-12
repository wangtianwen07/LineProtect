/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.component;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * �Զ����ı���
 * @author wangtianwen
 * @version 1.0
 */
public class MyTextField extends JTextField{

	private static final long serialVersionUID = 1L;

	public MyTextField(String text) {
		super(text);
		super.setColumns(10);//�����ı����ʼ����С
		//���ü�����
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
