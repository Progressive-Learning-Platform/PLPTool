/*
    Copyright 2010 David Fritz, Brian Gordon, Wira Mulia

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

package plptool.mods;

import java.awt.Color;
import plptool.Msg;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Toolkit;

/**
 *
 * @author wira
 */
public class VGAFrame extends javax.swing.JFrame
{
	
	private BufferedImage I = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
	// private JPanel container;
	private VGACanvas canvas;
	
	/** Creates new form VGAFrame */
	public VGAFrame()
	{
		this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(
				this.getClass().getResource("resources/toolbar_sim_vga.png")));
		initComponents();
		canvas = new VGACanvas(I);
		canvas.setSize(new Dimension(640, 480));
		// container.setSize(new Dimension(640, 480));
		// container.setOpaque(true);
		// this.add(container);
		container.add("Canvas", canvas);
	}
	
	public void draw(int[][] image)
	{
		if (image.length == 0 || image.length > 640)
			return;
		if (image[0].length == 0 || image[0].length > 480)
			return;
		
		Msg.D("We're actually drawing!", 4, this);
		
		for (int x = 0; x < 640; x++)
			for (int y = 0; y < 480; y++)
				I.setRGB(x, y, image[x][y]);
		
		canvas.setImage(I);
		canvas.paint(canvas.getGraphics());
	}
	
	public void setLabelEnabled(boolean b)
	{
		if (b)
			lblVgaEnabled.setText("VGA is enabled");
		else
			lblVgaEnabled.setText("VGA is disabled");
	}
	
	public void setFramePointer(long addr)
	{
		txtFramePointer.setText(String.format("0x%08x", addr));
	}
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING:
	 * Do NOT modify this code. The content of this method is always regenerated by the
	 * Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{
		
		container = new javax.swing.JPanel();
		btnSaveToFile = new javax.swing.JButton();
		lblVgaEnabled = new javax.swing.JLabel();
		lblFramePointer = new javax.swing.JLabel();
		txtFramePointer = new javax.swing.JTextField();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(plptool.gui.PLPToolApp.class).getContext()
				.getResourceMap(VGAFrame.class);
		setTitle(resourceMap.getString("Form.title")); // NOI18N
		setMinimumSize(new java.awt.Dimension(640, 480));
		setName("Form"); // NOI18N
		setResizable(false);
		
		container.setMaximumSize(new java.awt.Dimension(640, 480));
		container.setMinimumSize(new java.awt.Dimension(640, 480));
		container.setName("container"); // NOI18N
		container.setPreferredSize(new java.awt.Dimension(640, 480));
		
		javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
		container.setLayout(containerLayout);
		containerLayout.setHorizontalGroup(containerLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 640, Short.MAX_VALUE));
		containerLayout.setVerticalGroup(containerLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 480, Short.MAX_VALUE));
		
		btnSaveToFile.setText(resourceMap.getString("btnSaveToFile.text")); // NOI18N
		btnSaveToFile.setName("btnSaveToFile"); // NOI18N
		btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnSaveToFileActionPerformed(evt);
			}
		});
		
		lblVgaEnabled.setText(resourceMap.getString("lblVgaEnabled.text")); // NOI18N
		lblVgaEnabled.setName("lblVgaEnabled"); // NOI18N
		
		lblFramePointer.setText(resourceMap.getString("lblFramePointer.text")); // NOI18N
		lblFramePointer.setName("lblFramePointer"); // NOI18N
		
		txtFramePointer.setEditable(false);
		txtFramePointer.setText(resourceMap.getString("txtFramePointer.text")); // NOI18N
		txtFramePointer.setName("txtFramePointer"); // NOI18N
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblFramePointer,
										javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtFramePointer,
										javax.swing.GroupLayout.PREFERRED_SIZE, 124,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(lblVgaEnabled,
										javax.swing.GroupLayout.DEFAULT_SIZE, 267,
										Short.MAX_VALUE).addGap(18, 18, 18)
								.addComponent(btnSaveToFile).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(
								layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnSaveToFile)
										.addComponent(lblFramePointer)
										.addComponent(txtFramePointer,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblVgaEnabled))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		
		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_btnSaveToFileActionPerformed
		Msg.M("Writing to " + System.getProperty("user.dir") + "/vgacapture.png ...");
		
		try
		{
			javax.imageio.ImageIO.write(I, "png", new java.io.File("./vgacapture.png"));
		}
		catch (Exception e)
		{
			Msg.E("Failed to write vgacapture.png",
					plptool.Constants.PLP_FILE_SAVE_ERROR, null);
		}
	}// GEN-LAST:event_btnSaveToFileActionPerformed
	
	@Override
	public String toString()
	{
		return "VGAFrame";
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnSaveToFile;
	private javax.swing.JPanel container;
	private javax.swing.JLabel lblFramePointer;
	private javax.swing.JLabel lblVgaEnabled;
	private javax.swing.JTextField txtFramePointer;
	// End of variables declaration//GEN-END:variables
	
}
