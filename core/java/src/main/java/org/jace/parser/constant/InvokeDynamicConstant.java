package org.jace.parser.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class InvokeDynamicConstant implements Constant
{
	private short bootstrapMethodIndex;
	private short nameAndTypeIndex;
	
	public InvokeDynamicConstant(short bootstrapMethodIndex, short nameAndTypeIndex)
	{
		this.bootstrapMethodIndex = bootstrapMethodIndex;
		this.nameAndTypeIndex = nameAndTypeIndex;
	}
	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public Object getValue() {
		return "InvokeDynamicConstant.getValue() has not yet been implemented.";
	}

	@Override
	public void write(
			DataOutputStream output )
			throws IOException {
		output.writeByte(new InvokeDynamicConstantReader().getTag());
		output.writeInt(bootstrapMethodIndex);
		output.writeInt(nameAndTypeIndex);
	}
}
