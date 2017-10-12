/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.wtw.CalculateUtil;

/**
 * 零序差动过流保护
 * @author wangtianwen
 * @version 1.0
 */
public class LxcdglbhView {

	public LxcdglbhView(JPanel panelCenter) {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 10, 0, 0); // top padding
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 6;
		panel.add(new JLabel("一.差动保护     B.零序差动过流保护"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1/3;
		panel.add(new JLabel("零序差动启动值(A)："),c);
		
		JTextField qdzField = new JTextField("启动值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1/3;
		panel.add(qdzField,c);
		
		JButton jButton = new JButton("计算");
		JLabel msg = new JLabel("");
		JLabel dlzm1_05 = new JLabel("");
		JLabel dlzm2_0 = new JLabel("");
		JLabel dlzm0_95 = new JLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("正在计算...");
				try {
					double qdz = Double.parseDouble(qdzField.getText());//电流高值
					dlzm1_05.setText(CalculateUtil.lxdcglbh(qdz, "1.05")+" A");//m1.05高定值
					dlzm2_0.setText(CalculateUtil.lxdcglbh(qdz, "2.0")+ "A");//m2.0高定值
					dlzm0_95.setText(CalculateUtil.lxdcglbh(qdz, "1.05")+ "A");//m1.05低定值
				} catch (Exception exception) {
					msg.setText(exception.getMessage());
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 1/3;
		panel.add(jButton,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		c.weightx = 1/3;
		panel.add(msg,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(new JLabel("m=1.05时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(dlzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(new JLabel("m=2.0时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(dlzm2_0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(new JLabel("m=0.95时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(dlzm0_95,c);
		panelCenter.add(panel);
	}
}
