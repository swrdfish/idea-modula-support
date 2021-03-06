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

public class DefinitionDesignatorImpl extends ASTWrapperPsiElement implements DefinitionDesignator {

  public DefinitionDesignatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitDesignator(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionExpression.class);
  }

  @Override
  @NotNull
  public List<DefinitionIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionIdent.class);
  }

  @Override
  @NotNull
  public DefinitionQualident getQualident() {
    return findNotNullChildByClass(DefinitionQualident.class);
  }

}
