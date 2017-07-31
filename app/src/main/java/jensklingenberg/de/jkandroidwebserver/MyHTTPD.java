package jensklingenberg.de.jkandroidwebserver;

import android.os.Environment;
import android.util.Log;
import fi.iki.elonen.NanoHTTPD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by jens on 25.03.17.
 */
public class MyHTTPD extends NanoHTTPD {
    public static final int PORT = 8765;

    public MyHTTPD() throws IOException {
        super(PORT);
    }

    @Override
    public Response serve(IHTTPSession session) {
        Log.i("TAG", "serve: "+session.getUri());
        String uri = session.getUri();

        if (uri.equals("/hello")) {
            String response = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>\n"
                + "\n"
                + "<p>Hello World</p></body></html>";


                    return newFixedLengthResponse(response);

            }

        return  null;
        }

}
