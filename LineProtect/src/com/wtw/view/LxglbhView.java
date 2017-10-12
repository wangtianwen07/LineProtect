/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.view;

import java.awt.Color;
import java.awt.FlowLayout;
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
import com.wtw.component.MyButton;
import com.wtw.component.MyLabel;
import com.wtw.component.MyTextField;

/**
 * 四、零序过流保护
 * @author wangtianwen
 * @version 1.0
 */
public class LxglbhView {
	
	public LxglbhView(JPanel panelCenter) {
		JPanel bigpanel = new JPanel();
		bigpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bigpanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 10, 0, 0); // top padding
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 9;
		panel.add(new JLabel("四、零序过流保护--零序过流(Ⅰ、Ⅱ)段"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1/4;
		panel.add(new JLabel("I0(A)："),c);
		
		JTextField qdzField = new MyTextField("电流参数值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1/4;
		panel.add(qdzField,c);
		
		JButton jButton = new MyButton("计算");
		JLabel msg = new MyLabel("");
		JLabel dyzm1_05 = new MyLabel("");
		JLabel dyzm0_95 = new MyLabel("");
		JLabel dyzm1_2 = new MyLabel("");
		JLabel dlzm1_05 = new MyLabel("");
		JLabel dlzm0_95 = new MyLabel("");
		JLabel dlzm1_2 = new MyLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("正在计算...");
				try {
					double qdz = Double.parseDouble(qdzField.getText());
					dyzm1_05.setText(CalculateUtil.lxglbhU(qdz, "1.05")+"V");
					dyzm0_95.setText(CalculateUtil.lxglbhU(qdz, "0.95")+ "V");
					dyzm1_2.setText(CalculateUtil.lxglbhU(qdz, "1.2")+ "V");
					
					dlzm1_05.setText(CalculateUtil.lxglbhI(qdz, "1.05")+"A");
					dlzm0_95.setText(CalculateUtil.lxglbhI(qdz, "0.95")+ "A");
					dlzm1_2.setText(CalculateUtil.lxglbhI(qdz, "1.2")+ "A");
				} catch (Exception exception) {
					msg.setText(exception.getMessage());
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 1/4;
		panel.add(jButton,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		c.weightx = 1/4;
		panel.add(msg,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(new JLabel("m=1.05时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dyzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dlzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(new JLabel("m=0.95时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dyzm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dlzm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(new JLabel("m=1.2时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 7;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dyzm1_2,c);
		panelCenter.add(panel);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 8;
		c.gridy = 2;
		c.weightx = 1/9;
		panel.add(dlzm1_2,c);
		bigpanel.add(panel);
		panelCenter.add(bigpanel);
	}
}
