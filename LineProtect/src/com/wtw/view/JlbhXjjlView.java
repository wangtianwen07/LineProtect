/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
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
 * �������뱣��	������(�񡢢򡢢�)��
 * @author wangtianwen
 * @version 1.0
 */
public class JlbhXjjlView {
	public JlbhXjjlView(JPanel panelCenter) {
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
		c.gridwidth = 7;
		panel.add(new JLabel("�������뱣��"),c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 7;
		panel.add(new JLabel("2.������(�񡢢򡢢�)��"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(new JLabel("�����붨ֵ(��)��"),c);
		
		JTextField dzField = new MyTextField("�����붨ֵ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(dzField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(new JLabel("��·�����迹��(��)��"),c);
		
		JTextField ��Field = new MyTextField("��·�����迹��ֵ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(��Field,c);
		
		JButton jButton = new MyButton("����");
		JLabel msg = new MyLabel("");
		JLabel UAm0_95 = new MyLabel("");
		JLabel UBm0_95 = new MyLabel("");
		JLabel UCm0_95 = new MyLabel("");
		JLabel IAm0_95 = new MyLabel("");
		JLabel IBm0_95 = new MyLabel("");
		JLabel ICm0_95 = new MyLabel("");
		
		JLabel UAm1_05 = new MyLabel("");
		JLabel UBm1_05 = new MyLabel("");
		JLabel UCm1_05 = new MyLabel("");
		JLabel IAm1_05 = new MyLabel("");
		JLabel IBm1_05 = new MyLabel("");
		JLabel ICm1_05 = new MyLabel("");
		
		JLabel UAm0_7 = new MyLabel("");
		JLabel UBm0_7 = new MyLabel("");
		JLabel UCm0_7 = new MyLabel("");
		JLabel IAm0_7 = new MyLabel("");
		JLabel IBm0_7 = new MyLabel("");
		JLabel ICm0_7 = new MyLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("���ڼ���...");
				try {
					double dz = Double.parseDouble(dzField.getText());
					double �� = Double.parseDouble(��Field.getText());
					UAm0_95.setText("UA��" + CalculateUtil.jlbhXjjlU(dz,��, "0.95")+" V");
					UBm0_95.setText("UB��" + CalculateUtil.jlbhXjjlU(dz,��, "0.95")+" V");
					UCm0_95.setText("UC��" + CalculateUtil.jlbhXjjlU(dz,��, "0.95")+" V");
					UAm1_05.setText("UA��" + CalculateUtil.jlbhXjjlU(dz,��, "1.05")+" V");
					UBm1_05.setText("UB��" + CalculateUtil.jlbhXjjlU(dz,��, "1.05")+" V");
					UCm1_05.setText("UC��" + CalculateUtil.jlbhXjjlU(dz,��, "1.05")+" V");
					UAm0_7.setText("UA��" + CalculateUtil.jlbhXjjlU(dz,��, "0.7")+" V");
					UBm0_7.setText("UB��" + CalculateUtil.jlbhXjjlU(dz,��, "0.7")+" V");
					UCm0_7.setText("UC��" + CalculateUtil.jlbhXjjlU(dz,��, "0.7")+" V");
					IAm0_95.setText("IA��" + CalculateUtil.jlbhXjjlI(dz,��, "0.95")+" A");
					IBm0_95.setText("IB��" + CalculateUtil.jlbhXjjlI(dz,��, "0.95")+" A");
					ICm0_95.setText("IC��" + CalculateUtil.jlbhXjjlI(dz,��, "0.95")+" A");
					IAm1_05.setText("IA��" + CalculateUtil.jlbhXjjlI(dz,��, "1.05")+" A");
					IBm1_05.setText("IB��" + CalculateUtil.jlbhXjjlI(dz,��, "1.05")+" A");
					ICm1_05.setText("IC��" + CalculateUtil.jlbhXjjlI(dz,��, "1.05")+" A");
					IAm0_7.setText("IA��" + CalculateUtil.jlbhXjjlI(dz,��, "0.7")+" A");
					IBm0_7.setText("IB��" + CalculateUtil.jlbhXjjlI(dz,��, "0.7")+" A");
					ICm0_7.setText("IC��" + CalculateUtil.jlbhXjjlI(dz,��, "0.7")+" A");
				} catch (Exception exception) {
					msg.setText(exception.getMessage());
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(jButton,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/6;
		panel.add(msg,c);
		
		//m=0.95
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(new JLabel("m=0.95ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UAm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IAm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UBm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IBm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UCm0_95,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(ICm0_95,c);
		
		//m=1.05
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(new JLabel("m=1.05ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UAm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IAm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UBm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IBm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UCm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(ICm1_05,c);
		
		//m=0.7
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(new JLabel("m=0.7ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UAm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IAm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UBm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IBm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UCm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(ICm0_7,c);
		bigpanel.add(panel);
		panelCenter.add(bigpanel);
	}
}
