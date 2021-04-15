package Seat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import Client.ClientVO;
import Pay.PayVO;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class SeatDAO {
	Connection conn = null;
	PreparedStatement pst = null;
	PreparedStatement pst1 = null;
	PreparedStatement pst2 = null;
	ResultSet rs = null;
	
	private Date now = null;
	private SimpleDateFormat df = null;
	
	public void connect() { //연결하는 것은 어떤 메소드를 이용하든 항상 동일하다 복붙하자.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
					
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if(rs!= null) rs.close();
			if(pst!= null) pst.close();
			if(conn!=null) conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public SeatVO enter(ClientVO vo, PayVO pVO) {
		connect();
		long now = System.currentTimeMillis();
		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		String a = f.format(now);
		SeatVO sVO = null;
		int cnt = 1;
		
		try{
			
			String sql = "update bookingroomseat set starttime = (To_date(?,'YYYY/MM/DD HH24:MI:SS')), livetableuse = ? "
					+ ", paytime = ? where seatnumber = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, a);
			pst.setInt(2, cnt);
			pst.setInt(3, pVO.getPaytime());
			pst.setInt(4, pVO.getSeatnumber());
			pst.executeUpdate();
			
			
			String sql1 = "update bookingroomclient set liveuse = ?, starttime = (To_date(?,'YYYY/MM/DD HH24:MI:SS')) where phonenumber = ?";
			pst1 = conn.prepareStatement(sql1);
			pst1.setInt(1, cnt);
			pst1.setString(2, a);
			pst1.setString(3, pVO.getPhonenumber());
			pst1.executeUpdate();
			
			String sql2 = "update bookingroompay set starttime = (To_date(?,'YYYY/MM/DD HH24:MI:SS')) where phonenumber = ?";
			pst2 = conn.prepareStatement(sql2);
			pst2.setString(1, a);
			pst2.setString(2, pVO.getPhonenumber());
			pst2.executeUpdate();
									
			
			sVO = new SeatVO(pVO.getSeatnumber(), a, cnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return sVO;
			
					
		}

	public SeatVO out(ClientVO vo, PayVO pVO, SeatVO sVO) {
		connect();
		int cnt = 0;
		long now = System.currentTimeMillis(); 
			
		SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");  
		String end = format.format(now);
							
		try{
			
			String sql = "update bookingroomseat set endtime = (To_date(?,'YYYY/MM/DD HH24:MI:SS')), livetableuse = ? where seatnumber = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, end);
			pst.setInt(2, cnt);
			pst.setInt(3, sVO.getSeatnumber());
			pst.executeUpdate();
						
			String sql1 = "update bookingroomclient set liveuse = ?, endtime = (To_date(?,'YYYY/MM/DD HH24:MI:SS')) where phonenumber = ?";
			pst1 = conn.prepareStatement(sql1);
			pst1.setInt(1, cnt);
			pst1.setString(2, end);
			pst1.setString(3, pVO.getPhonenumber());
			pst1.executeUpdate();
			
			sVO = new SeatVO(sVO.getSeatnumber(), sVO.getStartdate(), end, cnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return sVO;
		
			}
		
	}
	
	
	
	
	

