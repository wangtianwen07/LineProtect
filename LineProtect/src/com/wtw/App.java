/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
public class App {

	public static void main(String[] args) {
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());

		JFrame jFrame = new JFrame("������·��������ʱ��ĳ���");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(dimension);
		jFrame.setContentPane(contentPanel);

		JLabel lable1 = new JLabel("��Ŀ��");
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.GRAY);
		panelNorth.add(lable1);
		JPanel panelCenter = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelCenter, BoxLayout.Y_AXIS);
		panelCenter.setLayout(boxLayout);
		List<String> checks = new ArrayList<String>();
		for (String type : Constants.projects) {
			JCheckBox checkBox = new JCheckBox(type);
			checkBox.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					Object c = e.getSource();
					if (c instanceof JCheckBox) {
						panelCenter.removeAll();
						panelCenter.repaint();
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
			panelNorth.add(checkBox);
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
		if(checks.contains("����������")) {
			new XdlcdbhView(panelCenter);
		}
		if(checks.contains("������������")) {
			new LxcdglbhView(panelCenter);
		}
		if(checks.contains("��Ƶ�仯���迹")) {
			new GpbhlzkDxView(panelCenter);//����ӵع���
			new GpbhlzkXjView(panelCenter);//������
		}
		//�����������뱣��
		if(checks.contains("��Ƶ�仯�����򱣻�")) {
			new GpbhlfxbhDxView(panelCenter);//����ӵع���
			new GpbhlfxbhXjView(panelCenter);//������
		}
		if(checks.contains("�������򱣻�")) {
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
