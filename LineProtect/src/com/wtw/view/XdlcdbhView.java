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
 * 相电流差动保护
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
		panel.add(new JLabel("一.差动保护     A.相电流差动保护 "),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(new JLabel("差动电流高值(A)："),c);
		
		JTextField dlgz = new JTextField("电流高值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(dlgz,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(new JLabel("差动电流低值(A)："),c);
		
		JTextField dldz = new JTextField("电流低值");
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
		
		JTextField dlcsz = new JTextField("参数值");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 1;
		c.weightx = 1/8;
		panel.add(dlcsz,c);
		
		JButton jButton = new JButton("计算");
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
				System.out.println("正在计算...");
				try {
					double gz = Double.parseDouble(dlgz.getText());//电流高值
					double dz = Double.parseDouble(dldz.getText());//电流低值
					double csz = Double.parseDouble(dlcsz.getText());//参数值
					gdzm1_05.setText(CalculateUtil.xdlbh_gdz(gz, dz, csz, "1.05")+" A");//m1.05高定值
					gdzm2_0.setText(CalculateUtil.xdlbh_gdz(gz, dz, csz, "2.0")+ "A");//m2.0高定值
					ddzm1_05.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "1.05")+ "A");//m1.05低定值
					ddzm2_0.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "2.0")+ "A");//m2.0低定值
					ddzm0_95.setText(CalculateUtil.xdlbh_ddz(gz, dz, csz, "0.95")+ "A");//m0.95低定值
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
		panel.add(new JLabel("高定值m=1.05:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(gdzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(new JLabel("高定值m=2.0:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/4;
		panel.add(gdzm2_0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		panel.add(new JLabel("低定值m=1.05:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		panel.add(ddzm1_05,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		panel.add(new JLabel("低定值m=2.0:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		panel.add(ddzm2_0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		panel.add(new JLabel("低定值m=0.95:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 3;
		panel.add(ddzm0_95,c);
		panelCenter.add(panel);
	}
}
