/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package analizador;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class NewJFrame extends javax.swing.JFrame {
 private static final Map<Integer, String> PORT_SERVICES = new HashMap<>();
    private StringBuilder imprimir = new StringBuilder();

    static {
    PORT_SERVICES.put(1, "TCPMUX");
        PORT_SERVICES.put(5, "RJE");
        PORT_SERVICES.put(7, "ECHO");
        PORT_SERVICES.put(9, "DISCARD");
        PORT_SERVICES.put(11, "SYSTAT");
        PORT_SERVICES.put(13, "DAYTIME");
        PORT_SERVICES.put(17, "QOTD");
        PORT_SERVICES.put(18, "MSP");
        PORT_SERVICES.put(19, "CHARGEN");
        PORT_SERVICES.put(20, "FTP-DATA");
        PORT_SERVICES.put(21, "FTP");
        PORT_SERVICES.put(22, "SSH");
        PORT_SERVICES.put(23, "TELNET");
        PORT_SERVICES.put(25, "SMTP");
        PORT_SERVICES.put(37, "TIME");
        PORT_SERVICES.put(39, "RLP");
        PORT_SERVICES.put(42, "WINS");
        PORT_SERVICES.put(43, "WHOIS");
        PORT_SERVICES.put(49, "TACACS");
        PORT_SERVICES.put(53, "DNS");
        PORT_SERVICES.put(67, "DHCP/BOOTP");
        PORT_SERVICES.put(68, "DHCP/BOOTP");
        PORT_SERVICES.put(69, "TFTP");
        PORT_SERVICES.put(70, "Gopher");
        PORT_SERVICES.put(79, "Finger");
        PORT_SERVICES.put(80, "HTTP");
        PORT_SERVICES.put(88, "Kerberos");
        PORT_SERVICES.put(110, "POP3");
        PORT_SERVICES.put(111, "RPC");
        PORT_SERVICES.put(135, "MS RPC (Microsoft Remote Procedure Call)");
        PORT_SERVICES.put(445, "Microsoft-DS (Microsoft Directory Services)");
        PORT_SERVICES.put(5040, "Real Time Streaming Protocol (RTSP)");
           PORT_SERVICES.put(49152, "Dynamic/Private Ports");
        PORT_SERVICES.put(49153, "Dynamic/Private Ports");
        PORT_SERVICES.put(65481, "Puerto no asignado conocido (posiblemente personalizado)");
        PORT_SERVICES.put(113, "Ident");
        PORT_SERVICES.put(119, "NNTP");
        PORT_SERVICES.put(123, "NTP");
        PORT_SERVICES.put(137, "NetBIOS");
        PORT_SERVICES.put(138, "NetBIOS");
        PORT_SERVICES.put(139, "NetBIOS");
        PORT_SERVICES.put(143, "IMAP");
        PORT_SERVICES.put(161, "SNMP");
        PORT_SERVICES.put(162, "SNMP Trap");
        PORT_SERVICES.put(179, "BGP");
        PORT_SERVICES.put(194, "IRC");
        PORT_SERVICES.put(389, "LDAP");
        PORT_SERVICES.put(443, "HTTPS");
        PORT_SERVICES.put(445, "Microsoft-DS");
        PORT_SERVICES.put(465, "SMTPS");
        PORT_SERVICES.put(514, "Syslog");
        PORT_SERVICES.put(515, "LPD/LPR");
        PORT_SERVICES.put(546, "DHCPv6 Client");
        PORT_SERVICES.put(547, "DHCPv6 Server");
        PORT_SERVICES.put(587, "SMTP Submission");
        PORT_SERVICES.put(993, "IMAPS");
        PORT_SERVICES.put(995, "POP3S");
        PORT_SERVICES.put(1080, "SOCKS Proxy");
        PORT_SERVICES.put(1433, "Microsoft SQL Server");
        PORT_SERVICES.put(1434, "Microsoft SQL Monitor");
        PORT_SERVICES.put(1521, "Oracle");
        PORT_SERVICES.put(3306, "MySQL");
        PORT_SERVICES.put(3389, "RDP");
        PORT_SERVICES.put(5900, "VNC");
        PORT_SERVICES.put(1, "TCPMUX");
        PORT_SERVICES.put(5, "RJE");
        PORT_SERVICES.put(7, "ECHO");
        PORT_SERVICES.put(9, "DISCARD");
        PORT_SERVICES.put(11, "SYSTAT");
        PORT_SERVICES.put(13, "DAYTIME");
        PORT_SERVICES.put(17, "QOTD");
        PORT_SERVICES.put(18, "MSP");
        PORT_SERVICES.put(19, "CHARGEN");
        PORT_SERVICES.put(20, "FTP-DATA");
        PORT_SERVICES.put(21, "FTP");
        PORT_SERVICES.put(22, "SSH");
        PORT_SERVICES.put(23, "Telnet");
        PORT_SERVICES.put(25, "SMTP");
        PORT_SERVICES.put(26, "RSFTP");
        PORT_SERVICES.put(37, "TIME");
        PORT_SERVICES.put(39, "RLP");
        PORT_SERVICES.put(42, "WINS");
        PORT_SERVICES.put(43, "WHOIS");
        PORT_SERVICES.put(49, "TACACS");
        PORT_SERVICES.put(53, "DNS");
        PORT_SERVICES.put(67, "DHCP/BOOTP");
        PORT_SERVICES.put(68, "DHCP/BOOTP");
        PORT_SERVICES.put(69, "TFTP");
        PORT_SERVICES.put(70, "Gopher");
        PORT_SERVICES.put(79, "Finger");
        PORT_SERVICES.put(80, "HTTP");
        PORT_SERVICES.put(88, "Kerberos");
        PORT_SERVICES.put(110, "POP3");
        PORT_SERVICES.put(111, "RPC");
        PORT_SERVICES.put(113, "Ident");
        PORT_SERVICES.put(119, "NNTP");
        PORT_SERVICES.put(123, "NTP");
        PORT_SERVICES.put(137, "NetBIOS");
        PORT_SERVICES.put(138, "NetBIOS");
        PORT_SERVICES.put(139, "NetBIOS");
        PORT_SERVICES.put(143, "IMAP");
        PORT_SERVICES.put(161, "SNMP");
        PORT_SERVICES.put(162, "SNMP Trap");
        PORT_SERVICES.put(179, "BGP");
        PORT_SERVICES.put(194, "IRC");
        PORT_SERVICES.put(389, "LDAP");
        PORT_SERVICES.put(443, "HTTPS");
        PORT_SERVICES.put(445, "Microsoft-DS");
        PORT_SERVICES.put(465, "SMTPS");
        PORT_SERVICES.put(546, "DHCPv6 Client");      
    PORT_SERVICES.put(547, "DHCPv6 Server");
    PORT_SERVICES.put(587, "SMTP Submission");
    PORT_SERVICES.put(993, "IMAPS");
    PORT_SERVICES.put(995, "POP3S");
    PORT_SERVICES.put(1080, "SOCKS Proxy");
    PORT_SERVICES.put(1433, "Microsoft SQL Server");
    PORT_SERVICES.put(1434, "Microsoft SQL Monitor");
    PORT_SERVICES.put(1521, "Oracle");
    PORT_SERVICES.put(3306, "MySQL");
    PORT_SERVICES.put(3389, "RDP");
    PORT_SERVICES.put(5900, "VNC");
    PORT_SERVICES.put(6660, "IRC");
    PORT_SERVICES.put(6661, "IRC");
    PORT_SERVICES.put(6662, "IRC");
    PORT_SERVICES.put(6663, "IRC");
    PORT_SERVICES.put(6664, "IRC");
    PORT_SERVICES.put(6665, "IRC");
    PORT_SERVICES.put(6666, "IRC");
    PORT_SERVICES.put(6667, "IRC");
    PORT_SERVICES.put(6668, "IRC");
    PORT_SERVICES.put(6669, "IRC");
    PORT_SERVICES.put(8000, "HTTP Alternate");
    PORT_SERVICES.put(8008, "HTTP Alternate");
    PORT_SERVICES.put(8080, "HTTP Alternate");
    PORT_SERVICES.put(8443, "HTTPS Alternate");
    PORT_SERVICES.put(9100, "Printer");
    PORT_SERVICES.put(9999, "Application");
    PORT_SERVICES.put(10000, "Network Data Management Protocol");
    PORT_SERVICES.put(12345, "NetBus Trojan");
    PORT_SERVICES.put(137-139, "NetBIOS");
    PORT_SERVICES.put(16000, "Shiva VPN");
    PORT_SERVICES.put(20000, "DNP (Distributed Network Protocol)");
    PORT_SERVICES.put(32768-32775, "Reserved");
    PORT_SERVICES.put(33434, "traceroute");
    PORT_SERVICES.put(3389, "RDP");
    PORT_SERVICES.put(34567, "DVR-Scan");
    PORT_SERVICES.put(37000-38000, "Reserved");
    PORT_SERVICES.put(49152-65535, "Dynamic/Private Ports");
    PORT_SERVICES.put(27015, "Half-Life Game Server");
    PORT_SERVICES.put(27017, "MongoDB");
    PORT_SERVICES.put(28015, "Rust Game Server");
    PORT_SERVICES.put(30305, "Tor Hidden Service");
    PORT_SERVICES.put(31337, "Back Orifice");
    PORT_SERVICES.put(32768-61000, "Dynamic/Private Ports");
    PORT_SERVICES.put(49152-65535, "Dynamic/Private Ports");
    PORT_SERVICES.put(4200, "VRML Multi User Systems");
    PORT_SERVICES.put(4444, "IIS - Internet Information Services");
    PORT_SERVICES.put(5000, "UPnP - Universal Plug and Play");
    PORT_SERVICES.put(5060, "SIP - Session Initiation Protocol");
    PORT_SERVICES.put(5432, "PostgreSQL Database");
    PORT_SERVICES.put(5500, "VNC Remote Frame Buffer Protocol");
    PORT_SERVICES.put(5800, "VNC Remote Frame Buffer Protocol over HTTP");
    PORT_SERVICES.put(5900, "VNC Remote Frame Buffer Protocol over TLS/SSL");
    PORT_SERVICES.put(5984, "CouchDB Database Server");
    PORT_SERVICES.put(6666, "Internet Relay Chat (IRC) - UnrealIRCd");
    PORT_SERVICES.put(8000, "HTTP Alternate");
    PORT_SERVICES.put(8080, "HTTP Alternate");
    PORT_SERVICES.put(8443, "HTTPS Alternate");
    PORT_SERVICES.put(8888, "HTTP - Alternative");
    PORT_SERVICES.put(9000, "SonarQube Web Server");
    PORT_SERVICES.put(9090, "WebLogic Application Server");
    PORT_SERVICES.put(9200, "Elasticsearch");
    PORT_SERVICES.put(9999, "Application");
    PORT_SERVICES.put(10000, "Network Data Management Protocol");
    PORT_SERVICES.put(12345, "NetBus Trojan");
    PORT_SERVICES.put(27017, "MongoDB");
    PORT_SERVICES.put(28015, "Rust Game Server");
    PORT_SERVICES.put(31337, "Back Orifice");
    PORT_SERVICES.put(32768-61000, "Dynamic/Private Ports");
    PORT_SERVICES.put(49152-65535, "Dynamic/Private Ports");
    PORT_SERVICES.put(27015, "Half-Life Game Server");
    PORT_SERVICES.put(30305, "Tor Hidden Service");
    PORT_SERVICES.put(3389, "RDP - Remote Desktop Protocol");
    PORT_SERVICES.put(34567, "DVR-Scan");
    PORT_SERVICES.put(37000, "Steam Game Client");
    PORT_SERVICES.put(37964, "Trojan");
    PORT_SERVICES.put(43110, "ZeroNet Decentralized Websites");
    PORT_SERVICES.put(50000, "Internet Relay Chat (IRC) - UnrealIRCd");
    PORT_SERVICES.put(5353, "Multicast DNS (mDNS)");
    PORT_SERVICES.put(55555, "Oracle WebCenter Content: Inbound Refinery");
    PORT_SERVICES.put(55672, "Python WSGI HTTP Server");
    PORT_SERVICES.put(5672, "AMQP - Advanced Message Queuing Protocol");
    PORT_SERVICES.put(58080, "Kerio Control Web Administration");
    PORT_SERVICES.put(6000, "X11 - X Window System");
    PORT_SERVICES.put(6379, "Redis Database Server");
    PORT_SERVICES.put(6502, "Bo2k Backdoor");
    PORT_SERVICES.put(6660, "Internet Relay Chat (IRC) - UnrealIRCd");
    PORT_SERVICES.put(7001, "WebLogic Server");
    PORT_SERVICES.put(7777, "Kerberos - Oracle WebLogic Server");
    PORT_SERVICES.put(8008, "HTTP Alternate");
    PORT_SERVICES.put(8080, "HTTP Alternate");
    PORT_SERVICES.put(8443, "HTTPS Alternate");
    PORT_SERVICES.put(8765, "Default Port for CockroachDB Admin UI");
    PORT_SERVICES.put(8888, "HTTP - Alternative");
    PORT_SERVICES.put(9000, "SonarQube Web Server");
    PORT_SERVICES.put(9090, "WebLogic Application Server");
    PORT_SERVICES.put(9200, "Elasticsearch");
    PORT_SERVICES.put(9999, "Application");
    PORT_SERVICES.put(10000, "Network Data Management Protocol");
    PORT_SERVICES.put(12345, "NetBus Trojan");
    PORT_SERVICES.put(27017, "MongoDB");
    PORT_SERVICES.put(28015, "Rust Game Server");
    PORT_SERVICES.put(31337, "Back Orifice");
    PORT_SERVICES.put(32768-61000, "Dynamic/Private Ports");
    PORT_SERVICES.put(49152-65535, "Dynamic/Private Ports");
    
    } 
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-play-64.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-play-96.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-off-24.png"))); // NOI18N
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-off-48.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //este metodo llama a el analizador sin embargo gasta un 1900% mas de memoria por lo cual se añade metodo directo
        /* jTextArea1.setText("esto puede ser un poco tardado dependiendo tu equipo");
        Analizador analizador = new Analizador();
        analizador.scanPortsAndPrint(jTextArea1);*/
     StringBuilder resultBuilder = new StringBuilder();
     jTextArea1.setText("********Escaneando puertos abiertos********");
     
        // Escaneo de puertos específicos
        for (int port : PORT_SERVICES.keySet()) {
            String description = PORT_SERVICES.get(port);
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress("localhost", port), 1000);
                if (description != null) {
                    resultBuilder.append("Puerto ").append(port).append(" - Servicio: ").append(description).append("\n");

                } else {
                    resultBuilder.append("Puerto abierto: ").append(port).append("\n");
                }
            } catch (Exception e) {
                // No hacer nada si el puerto no está abierto
            }
        }

        // Escaneo de todos los puertos en un rango
        for (int port = 1; port <= 65535; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress("localhost", port), 1000);
            resultBuilder.append("Puerto abierto: ").append(port).append("\n");
            } catch (Exception e) {
                // No hacer nada si el puerto no está abierto
            }
        
        }
        jTextArea1.setText(resultBuilder.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
