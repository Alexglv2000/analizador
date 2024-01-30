package analizador;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;

public class Analizador {
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
   public void scanPortsAndPrint(JTextArea textArea) {
        StringBuilder imprimir = new StringBuilder();
        imprimir.append("Escaneando puertos abiertos en el equipo:\n");

        // Escaneo de puertos específicos
        for (int port : PORT_SERVICES.keySet()) {
            if (isPortOpen("localhost", port)) {
                String servicio = PORT_SERVICES.get(port);
                imprimir.append("Puerto " + port + " - Servicio: " + servicio + "\n");
            }
        }

        // Escaneo de todos los puertos en un rango
        for (int port = 1; port <= 65535; port++) {
            if (isPortOpen("localhost", port)) {
                imprimir.append("Puerto abierto: " + port + "\n");
            }
        }

      // Actualizar el JTextArea en el hilo de despacho de eventos (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            textArea.setText(imprimir.toString());
        });
    }

    public boolean isPortOpen(String host, int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 1000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void describePort(int port, String description) {
        if (isPortOpen("localhost", port)) {
            imprimir.append("Puerto abierto: " + port + " - " + description + "\n");
        }
    }

    public void describeDynamicPrivatePorts(int startPort, int endPort, String description) {
        imprimir.append("Describiendo rango de puertos " + startPort + " a " + endPort + ": " + description + "\n");
        for (int port = startPort; port <= endPort; port++) {
            PORT_SERVICES.put(port, description);
        }
    }

    @Override
    public String toString() {
        return imprimir.toString();
    }
}