package org.crawler.exceptions;

public class CrawlerException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CrawlerException() {
		super();
	}

	public CrawlerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CrawlerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CrawlerException(String message) {
		super(message);
	}

	public CrawlerException(Throwable cause) {
		super(cause);
	}

	
}
