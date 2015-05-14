package org.jace.parser.constant;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.jace.parser.ConstantPool;

public class InvokeDynamicConstantReader implements ConstantReader
{
	private final static short TAG = 18;

	@Override
	public int getTag() {
		return TAG;
	}

	@Override
	public Constant readConstant(InputStream input,	ConstantPool pool )	throws ClassFormatError {
		short bootstrapMethodIndex;
		short nameAndTypeIndex;

		try
		{
			bootstrapMethodIndex = new DataInputStream(input).readShort();
			nameAndTypeIndex = new DataInputStream(input).readShort();
		}
		catch (IOException e)
		{
			ClassFormatError exception = new ClassFormatError("Unable to read the InvokeDynamic Constant");
			exception.initCause(e);
			throw exception;
		}

		return new InvokeDynamicConstant(bootstrapMethodIndex, nameAndTypeIndex);
	}
}
