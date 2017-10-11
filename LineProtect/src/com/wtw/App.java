/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
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

import com.wtw.view.GpbhlzkDxView;
import com.wtw.view.GpbhlzkXjView;
import com.wtw.view.LxcdglbhView;
import com.wtw.view.XdlcdbhView;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());

		JFrame jFrame = new JFrame("缩短线路保护调试时间的程序");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(dimension);
		jFrame.setContentPane(contentPanel);

		JLabel lable1 = new JLabel("项目：");
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(122, 122, 122));
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
		//一、差动保护
		if(checks.contains("相电流差动保护")) {
			new XdlcdbhView(panelCenter);
		}
		if(checks.contains("零序差动过流保护")) {
			new LxcdglbhView(panelCenter);
		}
		if(checks.contains("工频变化量阻抗")) {
			new GpbhlzkDxView(panelCenter);//单相接地故障
			new GpbhlzkXjView(panelCenter);//相间故障
		}
		//二、纵联距离保护
		panelCenter.revalidate();
	}
}
