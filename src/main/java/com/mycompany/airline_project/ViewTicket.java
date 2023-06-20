/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airline_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ViewTicket extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public ViewTicket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        con = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        departure = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        flightdetail = new javax.swing.JLabel();
        flightname = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ticketID = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("First Name");

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText("Gender");

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("Flight Name");

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText("Arrival");

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 255, 255));
        jLabel19.setText("Departure");

        jTextField7.setBackground(new java.awt.Color(204, 204, 204));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(204, 204, 204));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setText("Contact");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("None");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("None");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("None");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("None");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("None");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("None");

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 255, 255));
        jLabel27.setText("Last Name");

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 255, 255));
        jLabel28.setText("Flight No.");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("None");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("None");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(100, 100, 100)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(241, 241, 241)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jLabel28))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(558, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(568, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel27)
                    .addContainerGap(535, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jLabel27)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Thanks for Travelling with Us!");

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("First Name");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Gender");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Last Name");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Arrival");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Departure");

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        con.setBackground(new java.awt.Color(102, 102, 102));
        con.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        con.setForeground(new java.awt.Color(204, 255, 255));
        con.setText("Contact");

        lastname.setBackground(new java.awt.Color(255, 255, 255));
        lastname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setText("None");

        firstname.setBackground(new java.awt.Color(255, 255, 255));
        firstname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setText("None");

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("None");

        departure.setBackground(new java.awt.Color(255, 255, 255));
        departure.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departure.setForeground(new java.awt.Color(255, 255, 255));
        departure.setText("None");

        arrival.setBackground(new java.awt.Color(255, 255, 255));
        arrival.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arrival.setForeground(new java.awt.Color(255, 255, 255));
        arrival.setText("None");

        contact.setBackground(new java.awt.Color(255, 255, 255));
        contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setText("None");

        jLabel31.setBackground(new java.awt.Color(102, 102, 102));
        jLabel31.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));
        jLabel31.setText("Flight Name");

        flightdetail.setBackground(new java.awt.Color(255, 255, 255));
        flightdetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        flightdetail.setForeground(new java.awt.Color(255, 255, 255));
        flightdetail.setText("None");

        flightname.setBackground(new java.awt.Color(255, 255, 255));
        flightname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        flightname.setForeground(new java.awt.Color(255, 255, 255));
        flightname.setText("None");

        jLabel34.setBackground(new java.awt.Color(102, 102, 102));
        jLabel34.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 255, 255));
        jLabel34.setText("Flight Details");

        jLabel35.setBackground(new java.awt.Color(0, 102, 204));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("May You Have a Happy & Safe Journey");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel4))
                                .addGap(116, 116, 116)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(flightname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(flightdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(con))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel35)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(610, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(620, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(firstname)
                    .addComponent(arrival))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(lastname)
                    .addComponent(departure))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(con)
                    .addComponent(gender)
                    .addComponent(contact))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(flightdetail)
                    .addComponent(flightname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Get Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 102, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Ticket ID");

        ticketID.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel6)
                        .addGap(71, 71, 71)
                        .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            String TicketID=ticketID.getText();
            
            
            Connection con;
            PreparedStatement pre;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/airline_project","root","123456");
            pre=con.prepareStatement("select * from ticket where TicketID=?");
            pre.setString(1, TicketID);
            ResultSet rs =  pre.executeQuery();
            
            if(rs.next()!=false){
                firstname.setText(rs.getString("FirstName"));
                lastname.setText(rs.getString("LastName"));
                gender.setText(rs.getString("Gender"));
                flightname.setText(rs.getString("FlightName"));
                contact.setText(rs.getString("Contact"));
                arrival.setText(rs.getString("Arrival"));
                departure.setText(rs.getString("Departure"));
                String detail=rs.getString("FlightID");
                flightdetail.setText(detail);
               
            }
            else{
                 JOptionPane.showMessageDialog(null, "TicketID is invalid!");
            }   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival;
    private javax.swing.JLabel con;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel departure;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel flightdetail;
    private javax.swing.JLabel flightname;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField ticketID;
    // End of variables declaration//GEN-END:variables
}
