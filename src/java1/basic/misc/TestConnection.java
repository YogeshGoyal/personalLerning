/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.apps.ad.util.DBUtil;


/**
 *
 * @author yokukuma
 */
public class TestConnection {
    

    public static void main(String args[]) throws Exception {

        DBUtil dbutil = new DBUtil();
        boolean hasError = false;
        try {
           String connectString = "";
           System.out.println("jdbc:oracle:thin:@SLC05CDE.US.ORACLE.COM:1531:srcsid");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           connectString = br.readLine();
           if (connectString == null || connectString.length() == 0){
               System.out.println("Exiting as the jdbc url is not entered.");
               System.exit(1);
           }
           System.out.println("Enter the apps username:");
           String appsUser = br.readLine();
           System.out.println("Enter the apps password:");
           String appspwd = br.readLine();
           
           for (int i = 0; i < 100; i ++){
               Connection conn = null;
               
               try{
                   conn = dbutil.getConnectionUsingJDBCURL(appsUser, appspwd, connectString);
                   if (conn != null){
                       System.out.println("Obtained connection..");                       
                       
                   } else {
                       System.out.println("Unable to establish database connection..");
                   }
                   Thread.sleep(1000);
               
               } catch(Exception e){
                   e.printStackTrace();
                   hasError = true;
                   
                   if (conn != null){
                       try {
                           conn.close();
                           System.out.println("Closed the db connection");
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
               }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hasError){
            System.exit(1);
        } else {
            System.exit(0);
        }
    }
}
