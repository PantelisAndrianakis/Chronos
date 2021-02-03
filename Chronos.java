/*
 * Copyright (c) 2021 Pantelis Andrianakis
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package chronos;

/**
 * Chronos updates an internal long value with System.currentTimeMillis() every 1 millisecond.<br>
 * To get the current time in milliseconds use Chronos.get().currentTimeMillis()
 * @author Pantelis Andrianakis
 * @version February 3rd 2021
 */
public class Chronos extends Thread
{
	private long _currentTimeMillis = System.currentTimeMillis();
	
	public Chronos()
	{
		super.setName("Chronos");
		super.setPriority(MAX_PRIORITY);
		super.setDaemon(true);
		super.start();
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			_currentTimeMillis = System.currentTimeMillis();
			
			try
			{
				Thread.sleep(1);
			}
			catch (Exception e)
			{
			}
		}
	}
	
	public long currentTimeMillis()
	{
		return _currentTimeMillis;
	}
	
	public static Chronos get()
	{
		return SingletonHolder.INSTANCE;
	}
	
	private static class SingletonHolder
	{
		protected static final Chronos INSTANCE = new Chronos();
	}
}
