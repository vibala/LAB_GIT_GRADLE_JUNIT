/*
 * Copyright (c) 2016, Frédéric Fauberteau
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY FRÉDÉRIC FAUBERTEAU AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package view;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import model.UserList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Vector;

/**
 * @author Frédéric Fauberteau
 */
public class GUI extends AbstractView{

    private final JFrame frame;
    private final JList<String> list = new JList<>();

    
    public GUI(UserList model, String title, int width, int height) {
        super(model);
    	frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void configJMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.setMnemonic(KeyEvent.VK_Q);
        quitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        fileMenu.add(quitItem);
        frame.setJMenuBar(menuBar);
    }

    private void configJPanel() {
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(new BorderLayout());
        final JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.PAGE_START);
        panel.add(list, BorderLayout.CENTER);
        
        textField.addActionListener(this.getController().getAddUserListener(textField));
    }

    public void start() {
        configJMenuBar();
        configJPanel();
        frame.setVisible(true);
    }


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("a");
	if (o == getModel())
	      {
		System.out.println("e");
		list.setListData(getModel().getData());}
	}
	




}