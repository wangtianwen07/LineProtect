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
 * ����������
 * @author wangtianwen
 * @version 1.0
 */
public class XdlcdbhView {

	public XdlcdbhView(JPanel panelCenter) {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 10, 0, 0); // top padding
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 8;
		panel.add(new JLabel("һ.�����     A.���������� "),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(new JLabel("�������ֵ(A)��"),c);
		
		JTextField dlgz = new JTextField("������ֵ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(dlgz,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(new JLabel("�������ֵ(A)��"),c);
		
		JTextField dldz = new JTextField("������ֵ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(dldz,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(new JLabel("X(C1):"),c);
		
		JTextField dlcsz = new JTextField("����ֵ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(dlcsz,c);
		
		JButton jButton = new JButton("����");
		JLabel msg = new JLabel("");
		JLabel gdzm1_05 = new JLabel("");
		JLabel gdzm2_0 = new JLabel("");
		JLabel ddzm1_05 = new JLabel("");
		JLabel ddzm2_0 = new JLabel("");
		JLabel ddzm0_95 = new JLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("���ڼ���...");
				try {
					double gz = Double.parseDouble(dlgz.getText());//������ֵ
					double dz = Double.parseDouble(dldz.getText());//������ֵ
					double csz = Double.parseDouble(dlcsz.getText());//����ֵ
					gdzm1_05.setText(CalculateUtil.xdlbh_gdz(gz, dz, csz, "1.05")+" A");//m1.05�߶�ֵ
					gdzm2_0.setText(CalculateUtil.xdlbh_gdz(gz, dz, csz, "2.0")+ "A");//m2.0�߶�ֵ
					ddzm1_05.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "1.05")+ "A");//m1.05�Ͷ�ֵ
					ddzm2_0.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "2.0")+ "A");//m2.0�Ͷ�ֵ
					ddzm0_95.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "0.95")+ "A");//m0.95�Ͷ�ֵ
				} catch (Exception exception) {
					msg.setText(exception.getMessage());
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(jButton,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 7;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(msg,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(new JLabel("�߶�ֵm=1.05:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(gdzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(new JLabel("�߶�ֵm=2.0:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(gdzm2_0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		panel.add(new JLabel("�Ͷ�ֵm=1.05:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		panel.add(ddzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		panel.add(new JLabel("�Ͷ�ֵm=2.0:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		panel.add(ddzm2_0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		panel.add(new JLabel("�Ͷ�ֵm=0.95:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 3;
		panel.add(ddzm0_95,c);
		panelCenter.add(panel);
	}
}
