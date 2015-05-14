package org.jace.parser.constant;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.jace.parser.ConstantPool;

public class MethodTypeConstantReader implements ConstantReader
{
	private final static short TAG = 16;

	@Override
	public int getTag() {
		return TAG;
	}

	@Override
	public Constant readConstant(InputStream input, ConstantPool pool ) throws ClassFormatError {
		short typeIndex;

		try
		{
			typeIndex = new DataInputStream(input).readShort();
		}
		catch (IOException e)
		{
			ClassFormatError exception = new ClassFormatError("Unable to read the MethodType Constant");
			exception.initCause(e);
			throw exception;
		}

		return new MethodTypeConstant(typeIndex);
	}
}
