package com.generation.learningspringwithspringboot.data;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {
	
	
	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long reservtaionId;
	@Column(name="ROOM_ID")
	private long roomId;
	@Column(name="GUEST_ID")
	private long guestId; 
	@Column(name="RES_DATE")
	private Date reservationDate;
	
	public long getReservtaionId() {
		return reservtaionId;
	}
	public void setReservtaionId(long reservtaionId) {
		this.reservtaionId = reservtaionId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	@Override
	public String toString() {
		return "Reservation [reservtaionId=" + reservtaionId + ", roomId=" + roomId + ", guestId=" + guestId
				+ ", reservationDate=" + reservationDate + "]";
	};

	
}
