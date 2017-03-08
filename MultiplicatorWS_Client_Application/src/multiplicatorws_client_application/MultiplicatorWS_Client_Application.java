/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicatorws_client_application;

/**
 *
 * @author Admin
 */
public class MultiplicatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = 3;
            int j = 4;
            int result = multiplicate(i, j);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }       }

    private static int multiplicate(int i, int j) {
        org.me.multiplicator.MultiplicatorWS_Service service = new org.me.multiplicator.MultiplicatorWS_Service();
        org.me.multiplicator.MultiplicatorWS port = service.getMultiplicatorWSPort();
        return port.multiplicate(i, j);
    }
    
}
