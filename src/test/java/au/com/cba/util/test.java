package au.com.cba.util;

import java.sql.*;

public class test {

    public static void main(String[] args) throws SQLException {

        String DB_URL = "jdbc:sqlserver://norvtfgbb1:1435;databaseName=SIT_GasBB_GTM;integratedSecurity=true;trustServerCertificate=true;encrypt=true;authenticationScheme=NTLM;UserName=Kjaganathan;Password=Anvi1234!";
        ResultSet rs = null;
        String FacId = "112238";
        String CompanyID = "13";
        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from GasBB.Gas_Facility_OpState where FacilityId ="+FacId+";");
            stmt.executeUpdate("delete from GasBB.Gas_Facility_Detail where FacilityId ="+FacId+";");
            stmt.executeUpdate("delete from GasBB.Gas_Facility_Detail_CapLimits where FacilityId ="+FacId+";");
            stmt.executeUpdate("delete from GasBB.Gas_Facility_Owner where FacilityId ="+FacId+";");
            stmt.executeUpdate("delete from GasBB.Gas_Facility where FacilityId ="+FacId+";");
            stmt.executeUpdate("delete from GasBB.Gas_Facility_Owner_Trk where CompanyId ="+CompanyID+";");

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
