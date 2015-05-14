package org.jace.parser.constant;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.jace.parser.ConstantPool;

public class MethodHandleConstantReader implements ConstantReader
{
	private final static short TAG = 15;

	@Override
	public int getTag() {
		return TAG;
	}

	@Override
	public Constant readConstant(InputStream input, ConstantPool pool ) throws ClassFormatError {
		byte typeDescriptor;
		short handleIndex;

		try
		{
			typeDescriptor = new DataInputStream(input).readByte();
			handleIndex = new DataInputStream(input).readShort();
		}
		catch (IOException e)
		{
			ClassFormatError exception = new ClassFormatError("Unable to read the MethodHandle Constant");
			exception.initCause(e);
			throw exception;
		}

		return new MethodHandleConstant(typeDescriptor, handleIndex);
	}
}
