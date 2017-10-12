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
 * �����������뱣��
 * ��Ƶ�仯�����򱣻�   ������
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
		panel.add(new JLabel("�����������뱣��     A.��Ƶ�仯�����򱣻�"),c);
		
		
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
		
		JTextField dzField = new MyTextField("DZ(��)");
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
		panel.add(new JLabel("���ϽǶȦ�(��):"),c);
		
		JTextField ��Field = new MyTextField("78");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 2;
		c.weightx = 1/8;
		panel.add(��Field,c);
		
		JButton jButton = new MyButton("����");
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
				System.out.println("���ڼ���...");
				try {
					double dz = Double.parseDouble(dzField.getText());//������ֵ
					double k = Double.parseDouble(kField.getText());//������ֵ
					double �� = Double.parseDouble(��Field.getText());//����ֵ
					UAm0_9.setText("UA��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.9")+" V");
					UBm0_9.setText("UB��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.9")+" V");
					UCm0_9.setText("UC��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.9")+" V");
					UAm0_7.setText("UA��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.7")+" V");
					UBm0_7.setText("UB��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.7")+" V");
					UCm0_7.setText("UC��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��, "0.7")+" V");
					UAzfxdl.setText("UA��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��)+" V");
					UBzfxdl.setText("UB��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��)+" V");
					UCzfxdl.setText("UC��" + CalculateUtil.gpbhlfxbhXjU(dz,k,��)+" V");
					
					IAm0_9.setText("IA��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.9")+" A");
					IBm0_9.setText("IB��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.9")+" A");
					ICm0_9.setText("IC��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.9")+" A");
					IAm0_7.setText("IA��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.7")+" A");
					IBm0_7.setText("IB��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.7")+" A");
					ICm0_7.setText("IC��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��, "0.7")+" A");
					IAzfxdl.setText("IA��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��)+" A");
					IBzfxdl.setText("IB��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��)+" A");
					ICzfxdl.setText("IC��" + CalculateUtil.gpbhlfxbhXjI(dz,k,��)+" A");
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
		panel.add(new JLabel("m=0.9ʱ:"),c);
		
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
		panel.add(new JLabel("m=0.7ʱ:"),c);
		
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
		
		//������������·ʱ
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1/7;
		panel.add(new JLabel("������������·ʱ:"),c);
		
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
