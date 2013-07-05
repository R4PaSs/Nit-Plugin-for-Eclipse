/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AAbstractParameterDeclaration extends PParameterDeclaration
{
    private PTypeSpecifier _typeSpecifier_;
    private PAbstractDeclarator _abstractDeclarator_;

    public AAbstractParameterDeclaration()
    {
    }

    public AAbstractParameterDeclaration(
        PTypeSpecifier _typeSpecifier_,
        PAbstractDeclarator _abstractDeclarator_)
    {
        setTypeSpecifier(_typeSpecifier_);

        setAbstractDeclarator(_abstractDeclarator_);

    }
    public Object clone()
    {
        return new AAbstractParameterDeclaration(
            (PTypeSpecifier) cloneNode(_typeSpecifier_),
            (PAbstractDeclarator) cloneNode(_abstractDeclarator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAbstractParameterDeclaration(this);
    }

    public PTypeSpecifier getTypeSpecifier()
    {
        return _typeSpecifier_;
    }

    public void setTypeSpecifier(PTypeSpecifier node)
    {
        if(_typeSpecifier_ != null)
        {
            _typeSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typeSpecifier_ = node;
    }

    public PAbstractDeclarator getAbstractDeclarator()
    {
        return _abstractDeclarator_;
    }

    public void setAbstractDeclarator(PAbstractDeclarator node)
    {
        if(_abstractDeclarator_ != null)
        {
            _abstractDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _abstractDeclarator_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_typeSpecifier_)
            + toString(_abstractDeclarator_);
    }

    void removeChild(Node child)
    {
        if(_typeSpecifier_ == child)
        {
            _typeSpecifier_ = null;
            return;
        }

        if(_abstractDeclarator_ == child)
        {
            _abstractDeclarator_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_typeSpecifier_ == oldChild)
        {
            setTypeSpecifier((PTypeSpecifier) newChild);
            return;
        }

        if(_abstractDeclarator_ == oldChild)
        {
            setAbstractDeclarator((PAbstractDeclarator) newChild);
            return;
        }

    }
}