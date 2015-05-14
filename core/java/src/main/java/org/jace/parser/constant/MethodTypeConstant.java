package org.jace.parser.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class MethodTypeConstant implements Constant
{
	private final short typeIndex;
	
	public MethodTypeConstant (short typeIndex)
	{
		this.typeIndex = typeIndex;
	}
	
	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public Object getValue() {
		return "MethodTypeConstant.getValue() has not yet been implemented.";
	}

	@Override
	public void write(
			DataOutputStream output )
			throws IOException {
		output.writeByte(new MethodTypeConstantReader().getTag());
		output.writeInt(typeIndex);
	}
}
