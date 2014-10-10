// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.definition.psi.*;

public class DefinitionVariableDefinitionImpl extends ASTWrapperPsiElement implements DefinitionVariableDefinition {

  public DefinitionVariableDefinitionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionConstantValue getConstantValue() {
    return findChildByClass(DefinitionConstantValue.class);
  }

  @Override
  @NotNull
  public List<DefinitionExportNameDeclaration> getExportNameDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionExportNameDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionTypeSpecification getTypeSpecification() {
    return findChildByClass(DefinitionTypeSpecification.class);
  }

  @Override
  @Nullable
  public DefinitionVariableModifiers getVariableModifiers() {
    return findChildByClass(DefinitionVariableModifiers.class);
  }

  @Override
  @NotNull
  public List<DefinitionVariableNameDefinition> getVariableNameDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionVariableNameDefinition.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitVariableDefinition(this);
    else super.accept(visitor);
  }

}