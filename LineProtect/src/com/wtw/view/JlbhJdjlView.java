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
 * 三、距离保护	接地距离(Ⅰ、Ⅱ、Ⅲ)段
 * @author wangtianwen
 * @version 1.0
 */
public class JlbhJdjlView {
	
	public JlbhJdjlView(JPanel panelCenter) {
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
		c.gridwidth = 8;
		panel.add(new JLabel("三、距离保护 "),c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 8;
		panel.add(new JLabel("1.接地距离(Ⅰ、Ⅱ、Ⅲ)段"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("接地距离定值(Ω)："),c);
		
		JTextField dzField = new MyTextField("接地距离定值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(dzField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("线路正序阻抗角(°)："),c);
		
		JTextField kField = new MyTextField("线路正序阻抗角值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(kField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("零序补偿系数:"),c);
		
		JTextField ψField = new MyTextField("零序补偿系数值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(ψField,c);
		
		JButton jButton = new MyButton("计算");
		JLabel msg = new MyLabel("");
		JLabel Um0_95 = new MyLabel("");
		JLabel Im0_95 = new MyLabel("");
		JLabel Um1_05 = new MyLabel("");
		JLabel Im1_05 = new MyLabel("");
		JLabel Um0_7 = new MyLabel("");
		JLabel Im0_7 = new MyLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("正在计算...");
				try {
					double dz = Double.parseDouble(dzField.getText());//电流高值
					double k = Double.parseDouble(kField.getText());//电流低值
					double ψ = Double.parseDouble(ψField.getText());//参数值
					Um0_95.setText(CalculateUtil.jlbhJdjlU(dz,k,ψ, "0.95")+" V");
					Um1_05.setText(CalculateUtil.jlbhJdjlU(dz,k,ψ, "1.05")+" V");
					Um0_7.setText(CalculateUtil.jlbhJdjlU(dz,k,ψ,  "0.7")+ "V");
					Im0_95.setText(CalculateUtil.jlbhJdjlI(dz,k,ψ, "0.95")+" A");
					Im1_05.setText(CalculateUtil.jlbhJdjlI(dz,k,ψ, "1.05")+" A");
					Im0_7.setText(CalculateUtil.jlbhJdjlI(dz,k,ψ, "0.7")+ " A");
				} catch (Exception exception) {
					msg.setText(exception.getMessage());
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(jButton,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 7;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(msg,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.weightx = 1/3;
		panel.add(new JLabel("m=0.95时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 1/3;
		panel.add(Um0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 1/3;
		panel.add(Im0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(new JLabel("m=1.05时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(Um1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(Im1_05,c);
		panelCenter.add(panel);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1/3;
		panel.add(new JLabel("m=0.7时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.weightx = 1/3;
		panel.add(Um0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.weightx = 1/3;
		panel.add(Im0_7,c);
		bigpanel.add(panel);
		panelCenter.add(bigpanel);
	}
}
