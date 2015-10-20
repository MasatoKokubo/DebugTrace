/*
	SLF4JLogger.java
	(C) Masato Kokubo
*/

package org.mkokubo.debugtrace.logger;


/**
	SLF4J を使用するロガーの実装です。
	@since 1.1.0
	@author 小久保 雅人
*/
public class SLF4J implements Logger {
	/**
		SLF4JLogger を構築します。
	*/
	public SLF4J() {}

	/**
		{@inheritDoc}
	*/
	@Override
	public void setLevel(String levelStr) {}

	/**
		{@inheritDoc}
	*/
	@Override
	public boolean isEnabled() {return false;}

	/**
		{@inheritDoc}
	*/
	@Override
	public void log(String message) {}
}