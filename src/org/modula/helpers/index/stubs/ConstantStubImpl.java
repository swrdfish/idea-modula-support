package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.parsing.definition.psi.DefinitionConstantDefinition;

import java.io.IOException;

/**
 * Default implementation for {@link ConstantStub}
 */
public class ConstantStubImpl extends AbstractSymbolStub<DefinitionConstantDefinition> implements ConstantStub {

	public ConstantStubImpl(StubElement parent, IStubElementType elementType, String name, String filename, String module) {
		super(parent, elementType, name, filename, module);
	}

	public ConstantStubImpl(StubElement parent, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parent, elementType, dataStream);
	}
}