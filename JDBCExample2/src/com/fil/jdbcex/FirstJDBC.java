package com.fil.jdbcex;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class FirstJDBC {
    public static void main(String[] args) throws SQLException {
      
           // System.out.println("Hello world!");
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//            String url = "jdbc:mysql://localhost:3306/jdbcpractice";
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "anjali@24";

            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection is build.....");
            }

//            String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate(q);
//            System.out.println("Table created in DB..........");

//            String q1 = "insert into table1 (tName,tCity) values(?,?)";
//            PreparedStatement pstmt = con.prepareStatement(q1);
//            pstmt.setString(1, "Gautam");
//            pstmt.setString(2, "Mohali");
//            pstmt.executeUpdate();


//            boolean condition = true;
//            while(condition){
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                System.out.println("Enter name");
//                String name = br.readLine();
//                System.out.println("Enter city");
//                String city = br.readLine();
//                if(name.equals("none") || city.equals("none")){
//                    condition = false;
//                    break;
//                }
//                String q1 = "insert into table1 (tName,tCity) values(?,?)";
//                PreparedStatement pstmt = con.prepareStatement(q1);
//                pstmt.setString(1, name);
//                pstmt.setString(2, city);
//                pstmt.executeUpdate();
//            }

//            String q4 = "update table1 set tName=? , tCity = ? where tID = ?";
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter name");
//            String name = br.readLine();
//            System.out.println("Enter city");
//            String city = br.readLine();
//            System.out.println("Enter id");
//            int id = Integer.parseInt(br.readLine());
//            PreparedStatement pstmt = con.prepareStatement(q4);
//            pstmt.setString(1, name);
//            pstmt.setString(2, city);
//            pstmt.setInt(3, id);
//            pstmt.executeUpdate();
//            System.out.println("Done.....");

//            String q5 = "select * from table1";
//            Statement stmt = con.createStatement();
//            ResultSet set = stmt.executeQuery(q5);
//            while(set.next()){
//                int id2 = set.getInt("tID");
//                String name2 = set.getString("tName");
//                String city2 = set.getString("tCity");
//                System.out.println(id2+" :" + name2+ " :" + city2);
//
//
//            }
//            System.out.println("Done................");

//            String q6 = "delete from table1 where tID=?";
//
//            PreparedStatement stmt = con.prepareStatement(q6);
//            Scanner sc = new Scanner(System.in);
//            int id = sc.nextInt();
//            stmt.setInt(1, id);
//            stmt.executeUpdate();

//            String q3 = "insert into imageTB(pic) values(?)";
//            PreparedStatement stmt = con.prepareStatement(q3);
//            FileInputStream fis = new FileInputStream("E:\\Fil java\\JDBCExample\\ele.png");
//            stmt.setBinaryStream(1,fis,fis.available());
//            stmt.executeUpdate();
//            System.out.println("Pic inserted............");

//            String q = "create database sample";
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate(q);
//            System.out.println("done...............");
           // con.close();
//            String q3 = "use sample";
//            PreparedStatement ps = con.prepareStatement(q3);
//            ps.executeUpdate(q3);
//            System.out.println("used........");
//
//            String q1 = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
//            Statement stmt2 = con.createStatement();
//            stmt2.executeUpdate(q1);
//            System.out.println("Table created in DB..........");

//            boolean condition = true;
//            while(condition) {
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Enter you choice : ");
//                int choice = sc.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("Create Database");
//                        String q = "create database sample";
//                        Statement stmt = con.createStatement();
//                        stmt.executeUpdate(q);
//                        System.out.println("done.........");
//                        break;
//                    case 2:
//                        System.out.println("Use database");
//                        String q3 = "use sample";
//                        PreparedStatement ps = con.prepareStatement(q3);
//                        ps.executeUpdate(q3);
//                        System.out.println("used........");
//                        break;
//                    case 3:
//                        System.out.println("Create table");
//                        String q1 = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
//                        Statement stmt2 = con.createStatement();
//                        stmt2.executeUpdate(q1);
//                        System.out.println("Table created in DB..........");
//
//                        break;
//                    case 4:
//                    try{
//                        System.out.println("add values in table");
//                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                        System.out.println("Enter name");
//                        String name = br.readLine();
//                        System.out.println("Enter city");
//                        String city = br.readLine();
//
//                        String q2 = "insert into table (tName,tCity) values(?,?)";
//                        PreparedStatement pstmt = con.prepareStatement(q2);
//                        pstmt.setString(1, name);
//                        pstmt.setString(2, city);
//                        pstmt.executeUpdate();
//                    }catch (Exception e){
//                        System.out.println(e);
//                    }
//
//                        break;
//                    case 5:
//                        System.out.println("delete row");
//                        String q6 = "delete from table1 where tID=?";
//                        PreparedStatement stmt1 = con.prepareStatement(q6);
//                        Scanner sc1 = new Scanner(System.in);
//                        int id = sc1.nextInt();
//                        stmt1.setInt(1, id);
//                        stmt1.executeUpdate();
//                        break;
//                    case 6:
//                        System.out.println("Goodbye");
//                        condition = false;
//                }
//            }
//
//
//
//        }catch (ClassNotFoundException err){
//            err.fillInStackTrace();
//        }

    }
}
