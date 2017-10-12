/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.wtw.Constants;
import com.wtw.view.GpbhlfxbhDxView;
import com.wtw.view.GpbhlfxbhXjView;
import com.wtw.view.GpbhlzkDxView;
import com.wtw.view.GpbhlzkXjView;
import com.wtw.view.JlbhJdjlView;
import com.wtw.view.JlbhXjjlView;
import com.wtw.view.LxcdglbhView;
import com.wtw.view.LxglbhView;
import com.wtw.view.PtdxglLxView;
import com.wtw.view.PtdxglXglView;
import com.wtw.view.XdlcdbhView;
import com.wtw.view.ZllxbhView;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class AppBak {

	public static void main(String[] args) {
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());

		JFrame jFrame = new JFrame("������·��������ʱ��ĳ���");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(dimension);
		jFrame.setContentPane(contentPanel);

		JPanel typePanel0 = new JPanel();
		typePanel0.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lable0 = new JLabel("���ࣺ");
		typePanel0.add(lable0);
		
		JPanel typePanel1 = new JPanel();
		typePanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lable1 = new JLabel("��Ŀ��");
		typePanel1.add(lable1);
		JPanel panelNorth = new JPanel();
		panelNorth.setLayout(new BoxLayout(panelNorth, BoxLayout.Y_AXIS));
		
		panelNorth.setBackground(Color.GRAY);
		panelNorth.add(typePanel0);
		panelNorth.add(typePanel1);
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		List<String> checks = new ArrayList<String>();
		for (String type : Constants.types) {
			JCheckBox checkBox = new JCheckBox(type);
			checkBox.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					Object c = e.getSource();
					if (c instanceof JCheckBox) {
						typePanel1.removeAll();
						panelCenter.removeAll();
						if (((JCheckBox) c).isSelected()) {
							checks.add(((JCheckBox) c).getText());
						} else {
							checks.remove(((JCheckBox) c).getText());
						}
						
						System.out.println(checks);
						List<String> projects = new ArrayList<String>();
						if(checks.size()>0 && checks.contains("�����")) {
							projects.add("����������");
							projects.add("������������");
							projects.add("��Ƶ�仯���迹");
							System.out.println("projects:"+projects.size());
							for (String type : projects) {
								JCheckBox checkBox = new JCheckBox(type);
								checkBox.addItemListener(new ItemListener() {
									@Override
									public void itemStateChanged(ItemEvent e) {
										Object c = e.getSource();
										if (c instanceof JCheckBox) {
											panelCenter.removeAll();
											if (((JCheckBox) c).isSelected()) {
												checks.add(((JCheckBox) c).getText());
											} else {
												checks.remove(((JCheckBox) c).getText());
											}
										}
										System.out.println(checks);
										drawCenterContent(panelCenter,checks);
									}
								});
								typePanel1.add(checkBox);
							}
						} 
						typePanel1.revalidate();
					}
					drawCenterContent(panelCenter,checks);
				}
			});
			typePanel0.add(checkBox);
		}
		jFrame.getContentPane().add(BorderLayout.NORTH, panelNorth);
		drawCenterContent(panelCenter,null);
		jFrame.getContentPane().add(BorderLayout.CENTER, new JScrollPane(panelCenter));
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void drawCenterContent(JPanel panelCenter, List<String> checks) {
		if(checks==null ||checks.isEmpty()) {
			checks = Arrays.asList(Constants.projects);
		}
		//һ�������
		if(checks.contains("�����") || checks.contains("����������")) {
			new XdlcdbhView(panelCenter);
		}
		if(checks.contains("�����") || checks.contains("������������")) {
			new LxcdglbhView(panelCenter);
		}
		if(checks.contains("�����") || checks.contains("��Ƶ�仯���迹")) {
			new GpbhlzkDxView(panelCenter);//����ӵع���
			new GpbhlzkXjView(panelCenter);//������
		}
		//�����������뱣��
		if(checks.contains("�������뱣��") || checks.contains("��Ƶ�仯�����򱣻�")) {
			new GpbhlfxbhDxView(panelCenter);//����ӵع���
			new GpbhlfxbhXjView(panelCenter);//������
		}
		if(checks.contains("�������뱣��") || checks.contains("�������򱣻�")) {
			new ZllxbhView(panelCenter);
		}
		//�������뱣��
		if(checks.contains("���뱣��")) {
			new JlbhJdjlView(panelCenter);//�ӵؾ���(�񡢢򡢢�)��
			new JlbhXjjlView(panelCenter);//������(�񡢢򡢢�)��
		}
		//�ġ������������
		if(checks.contains("�����������")) {
			new LxglbhView(panelCenter);//�������(�񡢢�)��
		}
		//�塢PT���߹���
		if(checks.contains("PT���߹���")) {
			new PtdxglLxView(panelCenter);//�������
			new PtdxglXglView(panelCenter);//�������
		}
		panelCenter.revalidate();
	}
}