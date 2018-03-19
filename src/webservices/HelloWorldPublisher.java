/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import hw.HelloWorldImpl;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "hw.HelloWorld")
public class HelloWorldPublisher {
    
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Web serwis czeka na klienta....");
    }
        
}
