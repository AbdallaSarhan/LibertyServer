package org.example;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;


@ApplicationPath("v1")
public class ServerApplication extends Application{

    public ServerApplication ( ) {
        System.out.println("... Server Started");
    }
}
