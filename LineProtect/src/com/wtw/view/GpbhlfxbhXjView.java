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
 * 二、纵联距离保护
 * 工频变化量方向保护   相间故障
 * @author wangtianwen
 * @version 1.0
 */
public class GpbhlfxbhXjView {
	public GpbhlfxbhXjView(JPanel panelCenter) {
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
		panel.add(new JLabel("二、纵联距离保护     A.工频变化量方向保护"),c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 8;
		panel.add(new JLabel("2.相间故障"),c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("DZ(Ω)："),c);
		
		JTextField dzField = new MyTextField("DZ(Ω)");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(dzField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("K："),c);
		
		JTextField kField = new MyTextField("K");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(kField,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(new JLabel("故障角度ψ(°):"),c);
		
		JTextField ψField = new MyTextField("78");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(ψField,c);
		
		JButton jButton = new MyButton("计算");
		JLabel msg = new MyLabel("");
		JLabel UAm0_9 = new MyLabel("");
		JLabel UBm0_9 = new MyLabel("");
		JLabel UCm0_9 = new MyLabel("");
		JLabel IAm0_9 = new MyLabel("");
		JLabel IBm0_9 = new MyLabel("");
		JLabel ICm0_9 = new MyLabel("");
		
		JLabel UAm0_7 = new MyLabel("");
		JLabel UBm0_7 = new MyLabel("");
		JLabel UCm0_7 = new MyLabel("");
		JLabel IAm0_7 = new MyLabel("");
		JLabel IBm0_7 = new MyLabel("");
		JLabel ICm0_7 = new MyLabel("");
		
		JLabel UAzfxdl = new MyLabel("");
		JLabel UBzfxdl = new MyLabel("");
		JLabel UCzfxdl = new MyLabel("");
		JLabel IAzfxdl = new MyLabel("");
		JLabel IBzfxdl = new MyLabel("");
		JLabel ICzfxdl = new MyLabel("");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText("");
				System.out.println("正在计算...");
				try {
					double dz = Double.parseDouble(dzField.getText());//电流高值
					double k = Double.parseDouble(kField.getText());//电流低值
					double ψ = Double.parseDouble(ψField.getText());//参数值
					UAm0_9.setText("UA：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.9")+" V");
					UBm0_9.setText("UB：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.9")+" V");
					UCm0_9.setText("UC：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.9")+" V");
					UAm0_7.setText("UA：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.7")+" V");
					UBm0_7.setText("UB：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.7")+" V");
					UCm0_7.setText("UC：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ, "0.7")+" V");
					UAzfxdl.setText("UA：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ)+" V");
					UBzfxdl.setText("UB：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ)+" V");
					UCzfxdl.setText("UC：" + CalculateUtil.gpbhlfxbhXjU(dz,k,ψ)+" V");
					
					IAm0_9.setText("IA：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.9")+" A");
					IBm0_9.setText("IB：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.9")+" A");
					ICm0_9.setText("IC：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.9")+" A");
					IAm0_7.setText("IA：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.7")+" A");
					IBm0_7.setText("IB：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.7")+" A");
					ICm0_7.setText("IC：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ, "0.7")+" A");
					IAzfxdl.setText("IA：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ)+" A");
					IBzfxdl.setText("IB：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ)+" A");
					ICzfxdl.setText("IC：" + CalculateUtil.gpbhlfxbhXjI(dz,k,ψ)+" A");
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
		
		//m=0.9
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(new JLabel("m=0.9时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UAm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IAm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UBm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(IBm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(UCm0_9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 3;
		c.weightx = 1/7;
		panel.add(ICm0_9,c);
		
		//m=0.7
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(new JLabel("m=0.7时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UAm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IAm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UBm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(IBm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(UCm0_7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 4;
		c.weightx = 1/7;
		panel.add(ICm0_7,c);
		
		//正方向出三相短路时
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(new JLabel("正方向出三相短路时:"),c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UAzfxdl,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IAzfxdl,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UBzfxdl,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(IBzfxdl,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(UCzfxdl,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(ICzfxdl,c);
		panelCenter.add(panel);
		bigpanel.add(panel);
		panelCenter.add(bigpanel);
	}
}
