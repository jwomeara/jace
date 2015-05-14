package org.jace.parser.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class MethodHandleConstant implements Constant
{
	private final byte typeDescriptor;
	private final short handleIndex;
	
	public MethodHandleConstant(byte typeDescriptor, short handleIndex)
	{
		this.typeDescriptor = typeDescriptor;
		this.handleIndex = handleIndex;
	}
	
	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public Object getValue() {
		return "MethodHandleConstant.getValue() has not yet been implemented.";
	}

	@Override
	public void write(
			DataOutputStream output )
			throws IOException {
		output.writeByte(new MethodHandleConstantReader().getTag());
		output.writeByte(typeDescriptor);
		output.writeInt(handleIndex);
	}
}
