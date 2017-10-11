/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
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
 * ��Ƶ�仯���迹 ����ӵع���
 * @author wangtianwen
 * @version 1.0
 */
public class GpbhlzkXjView {
	
	public GpbhlzkXjView(JPanel panelCenter) {

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 10, 0, 0); // top padding
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 8;
		panel.add(new JLabel("һ.�����     C.��Ƶ�仯���迹 "),c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 8;
		panel.add(new JLabel("2.������"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("DZ(��)��"),c);
		
		JTextField dzField = new JTextField("DZ(��)");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(dzField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("K��"),c);
		
		JTextField kField = new JTextField("K");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(kField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("��:"),c);
		
		JTextField ��Field = new JTextField("��");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(��Field,c);
		
		JButton jButton = new JButton("����");
		JLabel msg = new JLabel("");
		JLabel UAm1_1 = new JLabel("");
		JLabel UBm1_1 = new JLabel("");
		JLabel UCm1_1 = new JLabel("");
		JLabel IAm1_1 = new JLabel("");
		JLabel IBm1_1 = new JLabel("");
		JLabel ICm1_1 = new JLabel("");
		
		JLabel UAm0_9 = new JLabel("");
		JLabel UBm0_9 = new JLabel("");
		JLabel UCm0_9 = new JLabel("");
		JLabel IAm0_9 = new JLabel("");
		JLabel IBm0_9 = new JLabel("");
		JLabel ICm0_9 = new JLabel("");
		
		JLabel UAm1_2 = new JLabel("");
		JLabel UBm1_2 = new JLabel("");
		JLabel UCm1_2 = new JLabel("");
		JLabel IAm1_2 = new JLabel("");
		JLabel IBm1_2 = new JLabel("");
		JLabel ICm1_2 = new JLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("���ڼ���...");
				try {
					double dz = Double.parseDouble(dzField.getText());//������ֵ
					double k = Double.parseDouble(kField.getText());//������ֵ
					double �� = Double.parseDouble(��Field.getText());//����ֵ
					UAm1_1.setText("UA��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.1")+" V");
					UBm1_1.setText("UB��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.1")+" V");
					UCm1_1.setText("UC��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.1")+" V");
					UAm0_9.setText("UA��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "0.9")+" V");
					UBm0_9.setText("UB��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "0.9")+" V");
					UCm0_9.setText("UC��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "0.9")+" V");
					UAm1_2.setText("UA��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.2")+" V");
					UBm1_2.setText("UB��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.2")+" V");
					UCm1_2.setText("UC��" + CalculateUtil.gpbhlzkXjU(dz,k,��, "1.2")+" V");
					
					IAm1_1.setText("IA��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.1")+" A");
					IBm1_1.setText("IB��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.1")+" A");
					ICm1_1.setText("IC��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.1")+" A");
					IAm0_9.setText("IA��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "0.9")+" A");
					IBm0_9.setText("IB��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "0.9")+" A");
					ICm0_9.setText("IC��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "0.9")+" A");
					IAm1_2.setText("IA��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.2")+" A");
					IBm1_2.setText("IB��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.2")+" A");
					ICm1_2.setText("IC��" + CalculateUtil.gpbhlzkXjI(dz,k,��, "1.2")+" A");
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
		c.weightx = 1/7;
		panel.add(new JLabel("m=1.1ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UAm1_1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IAm1_1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UBm1_1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IBm1_1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UCm1_1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(ICm1_1,c);
		
		//m=0.9
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(new JLabel("m=0.9ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UAm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IAm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UBm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IBm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UCm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(ICm0_9,c);
		
		//m=1.2
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(new JLabel("m=1.2ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UAm1_2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IAm1_2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UBm1_2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IBm1_2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UCm1_2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(ICm1_2,c);
		panelCenter.add(panel);
	}
}
