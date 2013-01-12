package org.spout.downpour;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Returns an InputStream for a URL.
 * 
 * For a default implementation, see {@link DefaultURLConnector}.
 */
public interface URLConnector {
	/**
	 * Opens the URL and returns an InputStream on that URL
	 * @param url the url to open
	 * @return the InputStream on said URL
	 * @throws IOException when an error occurs while opening the connection
	 */
	public InputStream openURL(URL url, File temp, File writeTo) throws IOException;
	
	/**
	 * You can override this method to set your own header values when needed. This will be called before connection.
	 * @param connection
	 */
	public void setHeaders(URLConnection connection);
}
