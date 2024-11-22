import com.sun.net.httpserver.HttpServer; // main class used to create and configurate an http server; listens for incoming HTTP requests on a specified port and routes them to appropriate handlers //

import java.io.IOException; // handle input/output exceptions//
import java.net.InetSocketAddress; // Used to define the IP address//

public class MyHttpServer {
    public static void main(String[] args) throws IOException {

        // Create an HttpServer instance
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); // declares variable server; HttpServer.create() is a static method that initializes a new instance of HttpServer //
        /*the server is actively waiting for incoming HTTP connections on port 8000 = like a portal;
        connection backlog(0 -default) This number specifies the maximum number of queued incoming connections the server will allow.
         */

        // Start the server
        server.setExecutor(null); // Use the default executor;  Sets the executor (thread pool) used by the server to handle incoming requests.
        server.start();

        System.out.println("Server is running on port 8000");
    }
    }