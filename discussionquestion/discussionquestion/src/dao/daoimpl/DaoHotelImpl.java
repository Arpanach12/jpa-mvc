package dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.DaoHotel;
import entity.Hotel;
import entity.Room;
import exception.DaoException;
import utility.DBConnectionUtil;

public class DaoHotelImpl implements DaoHotel {

	@Override
	public String addRoomToHotel(List<Hotel> hotelList) {
		
		Connection con=DBConnectionUtil.getCon();

	int update=0;
				for(int i=0;i<hotelList.size();i++)
				{
				String insertQuery="Insert into hotel values(?,?,?)";
			
				try
				{   
					PreparedStatement preparedStatement=con.prepareStatement(insertQuery);
					

					preparedStatement.setInt(1,hotelList.get(i).getHotelId());
					preparedStatement.setString(2,hotelList.get(i).getHotelName() );
					preparedStatement.setString(3, hotelList.get(i).getHotelLocation());
					preparedStatement.executeUpdate();
					
				
				}
				catch (SQLException e) {
					System.out.println(e);
				}
				
				for(int j=0;j<hotelList.get(i).getRooms().size();j++)
				{
				String insertQuery2="Insert into room values(?,?,?,?,?)";
				
				try
				{   
					PreparedStatement preparedStatement=con.prepareStatement(insertQuery2);
					

				preparedStatement.setInt(1, hotelList.get(i).getRooms().get(j).getRoomId());
				preparedStatement.setString(2, hotelList.get(i).getRooms().get(j).getRoomName());
				preparedStatement.setInt(3, hotelList.get(i).getRooms().get(j).getRoomCost());
				preparedStatement.setBoolean(4, hotelList.get(i).getRooms().get(j).isBooked());
				preparedStatement.setInt(5, hotelList.get(i).getHotelId());
					 update=preparedStatement.executeUpdate();
				
				}
				catch (SQLException e) {
					System.out.println(e);
				}
				}
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(update==1)
				return "inserted";
				else
					return "not inserted";
	}

	@Override
	public List<Room> getAllRoomUnbookedRoom(int hotelid) {
		int count = 0;
		Connection con = DBConnectionUtil.getCon();

		String selectQuery = "select * from room where isbooked='"+false+"' and hotelid='"+hotelid+"'";
		List <Room> list=new ArrayList();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Room book= new Room();
				book.setRoomId(rs.getInt(1));
				book.setRoomName(rs.getString(2));
				book.setRoomCost(rs.getInt(3));
				book.setBooked(rs.getBoolean(4));
				book.setHotelId(rs.getInt(5));
				
				list.add(book);
				count++;
			}
			con.close();
			rs.close();
		} catch (SQLException e) {
//			throw new DaoException(e);
			System.out.println(e);
		}
		if (count == 0) {
			System.out.println("data is not there in room table");
			return null;

		}
		
		return list;
	}

	@Override
	public String bookAHotel(int hotelid) {
		int update=0;
		Connection con = DBConnectionUtil.getCon();
		String updateQuery="update room set isbooked='"+1+"' where hotelid='"+hotelid+"'";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(updateQuery);
			 update=preparedStatement.executeUpdate();
				
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(update==1)
		return "update";
		else
			return "not update";
		
	}

}
