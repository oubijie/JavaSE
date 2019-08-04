package com.veryoo.inner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 匿名内部类 Swing事件
 * @author obj
 *
 */
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 匿名内部类 Swing事件
 * @author obj
 *
 */
public class TestInnerClass11 extends JFrame {
	private JButton jButton;

	public TestInnerClass11() {
		super();
		this.setSize(200, 200);
		this.getContentPane().setLayout(null);
		this.add(getJButton(), null);
		this.setTitle("HelloWorld");
	}

	private javax.swing.JButton getJButton() {
		if (jButton == null) {
			jButton = new javax.swing.JButton();
			jButton.setBounds(63, 80, 71, 27);
			jButton.setText("OK");

			// 用匿名内部类实现Swing事件
			jButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("点了一下OK");
				}
			});

		}
		return jButton;
	}

	public static void main(String[] args) {
		TestInnerClass11 w = new TestInnerClass11();
		w.setVisible(true);
	}

}