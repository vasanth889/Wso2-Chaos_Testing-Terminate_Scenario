package org.example.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.omg.CORBA.portable.InputStream;

@Path("/service")
public class Kill_Scenario {

    @GET
    public static String Resource() {
        try {
            Process proc = Runtime.getRuntime().exec("../OScheck.sh");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	return "chaos scenario testing";
    }
}
