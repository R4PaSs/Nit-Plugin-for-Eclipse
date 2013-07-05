/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AVariableDeclarationDeclarationOrDefinition extends PDeclarationOrDefinition
{
    private PVariableDeclaration _variableDeclaration_;

    public AVariableDeclarationDeclarationOrDefinition()
    {
    }

    public AVariableDeclarationDeclarationOrDefinition(
        PVariableDeclaration _variableDeclaration_)
    {
        setVariableDeclaration(_variableDeclaration_);

    }
    public Object clone()
    {
        return new AVariableDeclarationDeclarationOrDefinition(
            (PVariableDeclaration) cloneNode(_variableDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariableDeclarationDeclarationOrDefinition(this);
    }

    public PVariableDeclaration getVariableDeclaration()
    {
        return _variableDeclaration_;
    }

    public void setVariableDeclaration(PVariableDeclaration node)
    {
        if(_variableDeclaration_ != null)
        {
            _variableDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _variableDeclaration_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_variableDeclaration_);
    }

    void removeChild(Node child)
    {
        if(_variableDeclaration_ == child)
        {
            _variableDeclaration_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_variableDeclaration_ == oldChild)
        {
            setVariableDeclaration((PVariableDeclaration) newChild);
            return;
        }

    }
}