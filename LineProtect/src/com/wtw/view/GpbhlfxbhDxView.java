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
 * �����������뱣��
 * ��Ƶ�仯�����򱣻�   ����ӵع���
 * @author wangtianwen
 * @version 1.0
 */
public class GpbhlfxbhDxView {
	public GpbhlfxbhDxView(JPanel panelCenter) {

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 10, 0, 0); // top padding
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 8;
		panel.add(new JLabel("�����������뱣��    A.��Ƶ�仯�����򱣻�"),c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 8;
		panel.add(new JLabel("1.����ӵع���"),c);
		
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
		panel.add(new JLabel("���ϽǶȦ�(��):"),c);
		
		JTextField ��Field = new JTextField("78");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(��Field,c);
		
		JButton jButton = new JButton("����");
		JLabel msg = new JLabel("");
		JLabel Um0_9 = new JLabel("");
		JLabel Im0_9 = new JLabel("");
		JLabel Um0_7 = new JLabel("");
		JLabel Im0_7 = new JLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("���ڼ���...");
				try {
					double dz = Double.parseDouble(dzField.getText());//������ֵ
					double k = Double.parseDouble(kField.getText());//������ֵ
					double �� = Double.parseDouble(��Field.getText());//����ֵ
					Um0_9.setText(CalculateUtil.gpbhlfxbhDxU(dz,k,��, "0.9")+" V");
					Um0_7.setText(CalculateUtil.gpbhlfxbhDxU(dz,k,��,  "0.7")+ "V");
					Im0_9.setText(CalculateUtil.gpbhlfxbhDxI(dz,k,��, "0.9")+" A");
					Im0_7.setText(CalculateUtil.gpbhlfxbhDxI(dz,k,��, "0.7")+ " A");
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
		panel.add(new JLabel("m=0.9ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 1/3;
		panel.add(Um0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 1/3;
		panel.add(Im0_9,c);
		panelCenter.add(panel);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(new JLabel("m=0.7ʱ:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(Um0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 1/3;
		panel.add(Im0_7,c);
		panelCenter.add(panel);
	}
}
