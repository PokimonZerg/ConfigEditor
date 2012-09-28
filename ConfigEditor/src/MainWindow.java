import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class MainWindow extends javax.swing.JFrame
{
    public MainWindow()
    {
        initComponents();
              
        db           = new DataBase("config.sdb");
        last_profile = new Profile(); // заглушка на время инициализации
        
        configureControls(); // заполняем доступные разрешения
        createNewTable();    // если база пуста, то создаем новую таблицу
        loadData();          // загружаем из все данные из таблицы
        showProfile();       // показываем первую запись
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        main_panel = new javax.swing.JPanel();
        save_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        user_label = new javax.swing.JLabel();
        resolution_box = new javax.swing.JComboBox();
        resolution_label = new javax.swing.JLabel();
        fullscreen_cb = new javax.swing.JCheckBox();
        vsync_cb = new javax.swing.JCheckBox();
        music_slider = new javax.swing.JSlider();
        volume_slider = new javax.swing.JSlider();
        music_label = new javax.swing.JLabel();
        volume_label = new javax.swing.JLabel();
        volume_on_cb = new javax.swing.JCheckBox();
        music_on_cb = new javax.swing.JCheckBox();
        default_button = new javax.swing.JButton();
        new_button = new javax.swing.JButton();
        size_x_field = new javax.swing.JTextField();
        size_y_field = new javax.swing.JTextField();
        window_label = new javax.swing.JLabel();
        x_label = new javax.swing.JLabel();
        delete_button = new javax.swing.JButton();
        user_box = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfigEditor");
        setBackground(new java.awt.Color(192, 192, 192));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        main_panel.setBackground(new java.awt.Color(192, 192, 192));

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                save_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancel_buttonClick(evt);
            }
        });

        user_label.setText("User");

        resolution_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        resolution_box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resolution_boxActionPerformed(evt);
            }
        });

        resolution_label.setText("Resolution");

        fullscreen_cb.setText("Fullscreen");
        fullscreen_cb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fullscreen_cbActionPerformed(evt);
            }
        });

        vsync_cb.setText("V-Sync");
        vsync_cb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vsync_cbActionPerformed(evt);
            }
        });

        music_slider.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                music_sliderStateChanged(evt);
            }
        });

        volume_slider.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                volume_sliderStateChanged(evt);
            }
        });

        music_label.setText("Music volume");

        volume_label.setText("Game volume");

        volume_on_cb.setText("On");
        volume_on_cb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                volume_on_cbActionPerformed(evt);
            }
        });

        music_on_cb.setText("On");
        music_on_cb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                music_on_cbActionPerformed(evt);
            }
        });

        default_button.setText("Default");
        default_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                default_buttonActionPerformed(evt);
            }
        });

        new_button.setText("New");
        new_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                new_buttonClick(evt);
            }
        });

        size_x_field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                size_x_fieldActionPerformed(evt);
            }
        });

        size_y_field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                size_y_fieldActionPerformed(evt);
            }
        });

        window_label.setText("Window");

        x_label.setText("x");

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                delete_buttonActionPerformed(evt);
            }
        });

        user_box.setEditable(true);
        user_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        user_box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                user_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(new_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(default_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(volume_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(music_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(music_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volume_on_cb)
                            .addComponent(music_on_cb)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(size_x_field, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x_label, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(size_y_field, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(resolution_box, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(window_label)
                            .addComponent(resolution_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vsync_cb)
                            .addComponent(fullscreen_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(volume_label)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(user_box, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user_label)
                        .addComponent(user_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resolution_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolution_label)
                    .addComponent(fullscreen_cb))
                .addGap(11, 11, 11)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(size_x_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vsync_cb)
                    .addComponent(size_y_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(window_label)
                    .addComponent(x_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volume_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(volume_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(music_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(music_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(volume_on_cb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(music_on_cb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(default_button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(new_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configureControls()
    { 
        resolution_box.removeAllItems();
        user_box.removeAllItems();
        
        GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        for(DisplayMode m: g.getDefaultScreenDevice().getDisplayModes())
        {
            resolution_box.addItem(new TextDisplayMode(m));
        }
    }
    
    private Profile createNewProfile()
    {
        Profile p = new Profile();
        
        user_box.addItem(p);
        user_box.setSelectedItem(p);
        
        return p;
    }
    
    private void saveAll()
    {
        int count   = user_box.getItemCount();
        Profile p;
        
        for(int i = 0; i < count; i++)
        {
            p = (Profile)user_box.getItemAt(i);
            
            if(p.howAreYou())
            {
                int variant = JOptionPane.showOptionDialog(main_panel, "Profile " + p.getProfile() + " has been changed. Save it?", "Save question",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, rootPane);
                
                if(variant == 0)
                {
                    try
                    {   
                        p.Save(db);
                    }
                    catch(SQLException e)
                    {
                        JOptionPane.showMessageDialog(main_panel, "Error while saving profile: " + e);
                    }
                }
            }
        }
    }
    
    private void cancel_buttonClick(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancel_buttonClick
    {//GEN-HEADEREND:event_cancel_buttonClick
        saveAll();
        this.dispose();
        db.close();
        System.exit(0);
    }//GEN-LAST:event_cancel_buttonClick

    private void new_buttonClick(java.awt.event.ActionEvent evt)//GEN-FIRST:event_new_buttonClick
    {//GEN-HEADEREND:event_new_buttonClick
        last_profile = createNewProfile();
    }//GEN-LAST:event_new_buttonClick

    private void user_boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_user_boxActionPerformed
    {//GEN-HEADEREND:event_user_boxActionPerformed
        showProfile();
    }//GEN-LAST:event_user_boxActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_delete_buttonActionPerformed
    {//GEN-HEADEREND:event_delete_buttonActionPerformed
        Object o = user_box.getSelectedItem();
        
        if(o instanceof Profile)
        {
            user_box.removeItem(o);

            ((Profile)o).Delete(db);
        }
        
        if(user_box.getItemCount() == 0)
        {
            last_profile = createNewProfile();
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_save_buttonActionPerformed
    {//GEN-HEADEREND:event_save_buttonActionPerformed
        try
        {
            last_profile.Save(db);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(main_panel, "Error while saving profile: " + e);
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void fullscreen_cbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fullscreen_cbActionPerformed
    {//GEN-HEADEREND:event_fullscreen_cbActionPerformed
        last_profile.setFullscreen(fullscreen_cb.isSelected());
    }//GEN-LAST:event_fullscreen_cbActionPerformed

    private void vsync_cbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vsync_cbActionPerformed
    {//GEN-HEADEREND:event_vsync_cbActionPerformed
        last_profile.setVsync(vsync_cb.isSelected());
    }//GEN-LAST:event_vsync_cbActionPerformed

    private void volume_on_cbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_volume_on_cbActionPerformed
    {//GEN-HEADEREND:event_volume_on_cbActionPerformed
        last_profile.setSound(volume_on_cb.isSelected());
    }//GEN-LAST:event_volume_on_cbActionPerformed

    private void music_on_cbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_music_on_cbActionPerformed
    {//GEN-HEADEREND:event_music_on_cbActionPerformed
        last_profile.setMusic(music_on_cb.isSelected());
    }//GEN-LAST:event_music_on_cbActionPerformed

    private void music_sliderStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_music_sliderStateChanged
    {//GEN-HEADEREND:event_music_sliderStateChanged
        last_profile.setMusic_volume(music_slider.getValue());
    }//GEN-LAST:event_music_sliderStateChanged

    private void volume_sliderStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_volume_sliderStateChanged
    {//GEN-HEADEREND:event_volume_sliderStateChanged
        last_profile.setSound_volume(volume_slider.getValue());
    }//GEN-LAST:event_volume_sliderStateChanged

    private void size_x_fieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_size_x_fieldActionPerformed
    {//GEN-HEADEREND:event_size_x_fieldActionPerformed
        last_profile.setSize_x(Integer.valueOf(size_x_field.getText()));
    }//GEN-LAST:event_size_x_fieldActionPerformed

    private void size_y_fieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_size_y_fieldActionPerformed
    {//GEN-HEADEREND:event_size_y_fieldActionPerformed
        last_profile.setSize_y(Integer.valueOf(size_y_field.getText()));
    }//GEN-LAST:event_size_y_fieldActionPerformed

    private void default_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_default_buttonActionPerformed
    {//GEN-HEADEREND:event_default_buttonActionPerformed
        last_profile.setToDefault();
        showProfile();
    }//GEN-LAST:event_default_buttonActionPerformed

    private void resolution_boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resolution_boxActionPerformed
    {//GEN-HEADEREND:event_resolution_boxActionPerformed
        TextDisplayMode m = (TextDisplayMode)resolution_box.getSelectedItem();
        
        if(m != null)
        {
            last_profile.setRes_x(m.getWidth());
            last_profile.setRes_y(m.getHeight());
        }
    }//GEN-LAST:event_resolution_boxActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        saveAll();
        db.close();
    }//GEN-LAST:event_formWindowClosing

    private boolean createNewTable()
    {
        return db.RunPureSQLCommand("CREATE TABLE IF NOT EXISTS options ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, user VARCHAR(32) DEFAULT 'new_user',"
                + "res_x INT DEFAULT 1024, res_y INT DEFAULT 768, fullscreen CHAR(1) DEFAULT 'F', vsync CHAR(1) DEFAULT 'F',"
                + "size_x INT DEFAULT 800, size_y INT DEFAULT 600, sound_volume INT DEFAULT 50, music_volume INT DEFAULT 50,"
                + "sound CHAR(1) DEFAULT 'T', music CHAR(1) DEFAULT 'T');");
    }
    
    private boolean loadData()
    {
        int rows;
        ResultSet rs = db.RunSQLCommand("SELECT * FROM options;"); // Массовый селект. БЕРЕГИСЬ!
        
        try
        {
            for(rows = 0; rs.next(); rows++)
            {
                user_box.addItem(new Profile(rs));
            }
            
            if(rows == 0)
            {
                last_profile = createNewProfile();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(main_panel, e);
            return false;
        }
        
        return true;
    }
    
    private boolean showProfile()
    {
        Object  o;
        Object  mode;
        Profile p;
        
        o = user_box.getSelectedItem();
        
        if(o == null) 
        { 
            return false; 
        }
        
        if(o instanceof String)
        { 
            last_profile.setProfile((String)o);
            
            return true;
        }
        
        last_profile = p = (Profile)o;
        
        fullscreen_cb.setSelected(p.isFullscreen());
        vsync_cb.setSelected(p.isVsync());
        music_on_cb.setSelected(p.isMusic());
        volume_on_cb.setSelected(p.isSound());
        volume_slider.setValue(p.getSound_volume());
        music_slider.setValue(p.getSound_volume());
        size_x_field.setText(String.valueOf(p.getSize_x()));
        size_y_field.setText(String.valueOf(p.getSize_y()));
        user_box.updateUI();
        
        for(int i = 0; i < resolution_box.getItemCount(); i++)
        {
            mode = resolution_box.getItemAt(i);
            
            if(mode instanceof TextDisplayMode)
            {
                if(((TextDisplayMode)mode).compare(p.getRes_x(), p.getRes_y()))
                {
                    resolution_box.setSelectedIndex(i);
                    break;
                }
            }
        }
        
        return true;
    }
    
    public static boolean setStyle()
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException | InstantiationException | 
               IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            return false;
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private DataBase db;
    private Profile last_profile;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton default_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JCheckBox fullscreen_cb;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel music_label;
    private javax.swing.JCheckBox music_on_cb;
    private javax.swing.JSlider music_slider;
    private javax.swing.JButton new_button;
    private javax.swing.JComboBox resolution_box;
    private javax.swing.JLabel resolution_label;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField size_x_field;
    private javax.swing.JTextField size_y_field;
    private javax.swing.JComboBox user_box;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel volume_label;
    private javax.swing.JCheckBox volume_on_cb;
    private javax.swing.JSlider volume_slider;
    private javax.swing.JCheckBox vsync_cb;
    private javax.swing.JLabel window_label;
    private javax.swing.JLabel x_label;
    // End of variables declaration//GEN-END:variables
}

class TextDisplayMode
{
    public TextDisplayMode(DisplayMode dm)
    {
        d = dm;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d x %d", d.getWidth(), d.getHeight());
    }
    
    public int getWidth()
    {
        return d.getWidth();
    }
    
    public int getHeight()
    {
        return d.getHeight();
    }
    
    public boolean compare(int x, int y)
    {
        return d.getWidth() == x && d.getHeight() == y;
    }
    
    private DisplayMode d;
}