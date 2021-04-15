package Seat;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Pay.PayVO;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SeatVO {

	private int seatnumber;
	private int seatpartition;
	private String startdate;
	private String enddate;
	private String admin;
	private int livetableuse;
	private int paytime;
	
	public int getLivetableuse() {
		return livetableuse;
	}

	public void setLivetableuse(int livetableuse) {
		this.livetableuse = livetableuse;
	}

	public int getPaytime() {
		return paytime;
	}

	public void setPaytime(int paytime) {
		this.paytime = paytime;
	}

	public SeatVO(int seatnumber, int seatpartition, String startdate, String enddate, String admin, int livetableuse,
			int paytime) {
		super();
		this.seatnumber = seatnumber;
		this.seatpartition = seatpartition;
		this.startdate = startdate;
		this.enddate = enddate;
		this.admin = admin;
		this.livetableuse = livetableuse;
		this.paytime = paytime;
	}

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		now.setTime(new Date());
		System.out.println(now.get(Calendar.HOUR)+1);
		SimpleDateFormat df = new SimpleDateFormat("yy-MM-DD hh:mm:ss");
		System.out.println(df.format(now.getTime()));
		Date today = new Date();
		System.out.println(today);
		System.out.println(df.format(today));
		java.util.Date utilDate = today;
		System.out.println(utilDate);
		
		
		
	}
	
	public SeatVO(int seatnumber, String l, String cnt) {
		super();
		this.seatnumber = seatnumber;
		this.startdate = l;
		this.enddate = cnt;
		
	}
	
	
	public SeatVO(int seatnumber, String startdate, int livetableuse) {
		super();
		this.seatnumber = seatnumber;
		this.startdate = startdate;
		this.livetableuse = livetableuse;
	}
	
	
	public SeatVO(int seatnumber, String startdate, String enddate, int livetableuse) {
		super();
		this.seatnumber = seatnumber;
		this.startdate = startdate;
		this.enddate = enddate;
		this.livetableuse = livetableuse;
	}

	

	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public int getSeatpartition() {
		return seatpartition;
	}
	public void setSeatpartition(int seatpartition) {
		this.seatpartition = seatpartition;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
	
	
	
	
	
	
	
	
	
}
