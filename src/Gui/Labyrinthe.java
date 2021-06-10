/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import core_lookup.Lookup;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import labyrintheService.LabyrintheService;
import timer_service.TimerChangeListener;
import timer_service.TimerService;

/**
 *
 * @author pc
 */
public class Labyrinthe extends javax.swing.JFrame implements LabyrintheService {
 int [][] mat_obstacle = {{0,0,0,0,0,0,1,0,0,0},
                  {0,0,0,0,0,0,1,0,0,0},
                  {0,0,0,1,1,1,1,0,0,0},
                  {0,0,0,0,0,0,0,0,0,0},
                  {1,1,1,1,1,1,1,0,1,1},
                  {0,0,1,0,0,0,0,0,0,0},
                  {0,0,1,0,0,1,1,1,1,1},
                  {0,0,0,0,0,1,0,0,0,0},
                  {0,0,0,0,0,1,0,0,0,0},
                  {0,0,0,0,0,0,0,0,0,0}};
 
 public int [][] get_mat_obstacle(){
     return this.mat_obstacle;
 }
    
    /**
     * Creates new form NewJFrame
     */
    public Labyrinthe() {
        initComponents();
         mat_button[0][0]=jButton1;
        mat_button[0][1]=jButton2;
        mat_button[0][2]=jButton3;
        mat_button[0][3]=jButton4;
        mat_button[0][4]=jButton5;
        mat_button[0][5]=jButton6;
        mat_button[0][6]=jButton7;
        mat_button[0][7]=jButton8;
        mat_button[0][8]=jButton9;
        mat_button[0][9]=jButton10;
        mat_button[1][0]=jButton11;
        mat_button[1][1]=jButton12;
        mat_button[1][2]=jButton13;
        mat_button[1][3]=jButton14;
        mat_button[1][4]=jButton15;
        mat_button[1][5]=jButton16;
        mat_button[1][6]=jButton17;
        mat_button[1][7]=jButton18;
        mat_button[1][8]=jButton19;
        mat_button[1][9]=jButton20;
        mat_button[2][0]=jButton21;
        mat_button[2][1]=jButton22;
        mat_button[2][2]=jButton23;
        mat_button[2][3]=jButton24;
        mat_button[2][4]=jButton25;
        mat_button[2][5]=jButton26;
        mat_button[2][6]=jButton27;
        mat_button[2][7]=jButton28;
        mat_button[2][8]=jButton29;
        mat_button[2][9]=jButton30;
        mat_button[3][0]=jButton31;
        mat_button[3][1]=jButton32;
        mat_button[3][2]=jButton33;
        mat_button[3][3]=jButton34;
        mat_button[3][4]=jButton35;
        mat_button[3][5]=jButton36;
        mat_button[3][6]=jButton37;
        mat_button[3][7]=jButton38;
        mat_button[3][8]=jButton39;
        mat_button[3][9]=jButton40;
        mat_button[4][0]=jButton41;
        mat_button[4][1]=jButton42;
        mat_button[4][2]=jButton43;
        mat_button[4][3]=jButton44;
        mat_button[4][4]=jButton45;
        mat_button[4][5]=jButton46;
        mat_button[4][6]=jButton47;
        mat_button[4][7]=jButton48;
        mat_button[4][8]=jButton49;
        mat_button[4][9]=jButton50;
        mat_button[5][0]=jButton51;
        mat_button[5][1]=jButton52;
        mat_button[5][2]=jButton53;
        mat_button[5][3]=jButton54;
        mat_button[5][4]=jButton55;
        mat_button[5][5]=jButton56;
        mat_button[5][6]=jButton57;
        mat_button[5][7]=jButton58;
        mat_button[5][8]=jButton59;
        mat_button[5][9]=jButton60;
        mat_button[6][0]=jButton61;
        mat_button[6][1]=jButton62;
        mat_button[6][2]=jButton63;
        mat_button[6][3]=jButton64;
        mat_button[6][4]=jButton65;
        mat_button[6][5]=jButton66;
        mat_button[6][6]=jButton67;
        mat_button[6][7]=jButton68;
        mat_button[6][8]=jButton69;
        mat_button[6][9]=jButton70;
        mat_button[7][0]=jButton71;
        mat_button[7][1]=jButton72;
        mat_button[7][2]=jButton73;
        mat_button[7][3]=jButton74;
        mat_button[7][4]=jButton75;
        mat_button[7][5]=jButton76;
        mat_button[7][6]=jButton77;
        mat_button[7][7]=jButton78;
        mat_button[7][8]=jButton79;
        mat_button[7][9]=jButton80;
        mat_button[8][0]=jButton81;
        mat_button[8][1]=jButton82;
        mat_button[8][2]=jButton83;
        mat_button[8][3]=jButton84;
        mat_button[8][4]=jButton85;
        mat_button[8][5]=jButton86;
        mat_button[8][6]=jButton87;
        mat_button[8][7]=jButton88;
        mat_button[8][8]=jButton89;
        mat_button[8][9]=jButton90;
        mat_button[9][0]=jButton91;
        mat_button[9][1]=jButton92;
        mat_button[9][2]=jButton93;
        mat_button[9][3]=jButton94;
        mat_button[9][4]=jButton95;
        mat_button[9][5]=jButton96;
        mat_button[9][6]=jButton97;
        mat_button[9][7]=jButton98;
        mat_button[9][8]=jButton99;
        mat_button[9][9]=jButton100;
        mat_button[6][9].setBackground(Color.red);
        set_color(mat_button);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton17");

        jButton18.setText("jButton18");

        jButton19.setText("jButton19");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton23.setText("jButton23");

        jButton24.setText("jButton24");

        jButton25.setText("jButton25");

        jButton26.setText("jButton26");

        jButton27.setText("jButton27");

        jButton28.setText("jButton28");

        jButton29.setText("jButton29");

        jButton30.setText("jButton30");

        jButton31.setText("jButton31");

        jButton32.setText("jButton32");

        jButton33.setText("jButton33");

        jButton34.setText("jButton34");

        jButton35.setText("jButton35");

        jButton36.setText("jButton36");

        jButton37.setText("jButton37");

        jButton38.setText("jButton38");

        jButton39.setText("jButton39");

        jButton40.setText("jButton40");

        jButton41.setText("jButton41");

        jButton42.setText("jButton42");

        jButton43.setText("jButton43");

        jButton44.setText("jButton44");

        jButton45.setText("jButton45");

        jButton46.setText("jButton46");

        jButton47.setText("jButton47");

        jButton48.setText("jButton48");

        jButton49.setText("jButton49");

        jButton50.setText("jButton50");

        jButton51.setText("jButton51");

        jButton52.setText("jButton52");

        jButton53.setText("jButton53");

        jButton54.setText("jButton54");

        jButton55.setText("jButton55");

        jButton56.setText("jButton56");

        jButton57.setText("jButton57");

        jButton58.setText("jButton58");

        jButton59.setText("jButton59");

        jButton60.setText("jButton60");

        jButton61.setText("jButton61");

        jButton62.setText("jButton62");

        jButton63.setText("jButton63");

        jButton64.setText("jButton64");

        jButton65.setText("jButton65");

        jButton66.setText("jButton66");

        jButton67.setText("jButton67");

        jButton68.setText("jButton68");

        jButton69.setText("jButton69");

        jButton70.setText("jButton70");

        jButton71.setText("jButton71");

        jButton72.setText("jButton72");

        jButton73.setText("jButton73");

        jButton74.setText("jButton74");

        jButton75.setText("jButton75");

        jButton76.setText("jButton76");

        jButton77.setText("jButton77");

        jButton78.setText("jButton78");

        jButton79.setText("jButton79");

        jButton80.setText("jButton80");

        jButton81.setText("jButton81");

        jButton82.setText("jButton82");

        jButton83.setText("jButton83");

        jButton84.setText("jButton84");

        jButton85.setText("jButton85");

        jButton86.setText("jButton86");

        jButton87.setText("jButton87");

        jButton88.setText("jButton88");

        jButton89.setText("jButton89");

        jButton90.setText("jButton90");

        jButton91.setText("jButton91");

        jButton92.setText("jButton92");

        jButton93.setText("jButton93");

        jButton94.setText("jButton94");

        jButton95.setText("jButton95");

        jButton96.setText("jButton96");

        jButton97.setText("jButton97");

        jButton98.setText("jButton98");

        jButton99.setText("jButton99");

        jButton100.setText("jButton100");

        jButton101.setText("jButton101");

        jButton102.setText("jButton102");

        jButton103.setText("jButton103");

        jButton104.setText("jButton104");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton81)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton83)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton84)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton85)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton86)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton87)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton88)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton89)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton90))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton71)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton72)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton73)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton74)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton76)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton77)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton80))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton62)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton63)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton64)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton65)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton66)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton67)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton68)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton69)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton70))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton54)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton56)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton58)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton60))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton41)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton42)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton44)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton46)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton47)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton50))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton34)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton36)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton40))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton30)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton94))
                            .addComponent(jButton104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton101)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton100))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton103)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9)
                        .addComponent(jButton10))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31)
                    .addComponent(jButton32)
                    .addComponent(jButton33)
                    .addComponent(jButton34)
                    .addComponent(jButton35)
                    .addComponent(jButton36)
                    .addComponent(jButton37)
                    .addComponent(jButton38)
                    .addComponent(jButton39)
                    .addComponent(jButton40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41)
                    .addComponent(jButton42)
                    .addComponent(jButton43)
                    .addComponent(jButton44)
                    .addComponent(jButton45)
                    .addComponent(jButton46)
                    .addComponent(jButton47)
                    .addComponent(jButton48)
                    .addComponent(jButton49)
                    .addComponent(jButton50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton51)
                    .addComponent(jButton52)
                    .addComponent(jButton53)
                    .addComponent(jButton54)
                    .addComponent(jButton55)
                    .addComponent(jButton56)
                    .addComponent(jButton57)
                    .addComponent(jButton58)
                    .addComponent(jButton59)
                    .addComponent(jButton60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton61)
                    .addComponent(jButton62)
                    .addComponent(jButton63)
                    .addComponent(jButton64)
                    .addComponent(jButton65)
                    .addComponent(jButton66)
                    .addComponent(jButton67)
                    .addComponent(jButton68)
                    .addComponent(jButton69)
                    .addComponent(jButton70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton71)
                    .addComponent(jButton72)
                    .addComponent(jButton73)
                    .addComponent(jButton74)
                    .addComponent(jButton75)
                    .addComponent(jButton76)
                    .addComponent(jButton77)
                    .addComponent(jButton78)
                    .addComponent(jButton79)
                    .addComponent(jButton80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton81)
                    .addComponent(jButton82)
                    .addComponent(jButton83)
                    .addComponent(jButton84)
                    .addComponent(jButton85)
                    .addComponent(jButton86)
                    .addComponent(jButton87)
                    .addComponent(jButton88)
                    .addComponent(jButton89)
                    .addComponent(jButton90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton91)
                    .addComponent(jButton92)
                    .addComponent(jButton93)
                    .addComponent(jButton94)
                    .addComponent(jButton95)
                    .addComponent(jButton96)
                    .addComponent(jButton97)
                    .addComponent(jButton98)
                    .addComponent(jButton99)
                    .addComponent(jButton100))
                .addGap(52, 52, 52)
                .addComponent(jButton101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton102)
                    .addComponent(jButton103)
                    .addComponent(jButton104))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Labyrinthe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Labyrinthe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Labyrinthe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Labyrinthe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Labyrinthe().setVisible(true);
            }
            
            
        });
         
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    // End of variables declaration//GEN-END:variables
JButton [][]  mat_button = new JButton[10][10];


public  void set_color(JButton [][] mat)
{
    for(int i= 1;i < 10 ; i ++){
        for(int j= 1;j < 10 ; j ++){
            mat[i][j] = new JButton();
            if(mat_obstacle[i][j] == 1){
               mat[i][j].setBackground(Color.red);
            }
        }
    }
                 
    
}

    @Override
    public int[][] get_matrice_obstacle() {
        return this.mat_obstacle;
    }

     public void propertyChange (PropertyChangeEvent pce) {
        
          
                 
       
        TimerService ts = Lookup.getInstance().getService(TimerService.class);
        
         
        switch (pce.getPropertyName()){


            case "position_horizantale":
                 //reafficher la position 
               break;
            case "position_verticale":
                 //reafficher la position 
               break;   
            case "direction":
                 //reafficher la direction 
               break;     

               
        }
   
    }

}
