/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AUnionTypeSpecifier extends PTypeSpecifier
{
    private PUnionSpecifier _unionSpecifier_;

    public AUnionTypeSpecifier()
    {
    }

    public AUnionTypeSpecifier(
        PUnionSpecifier _unionSpecifier_)
    {
        setUnionSpecifier(_unionSpecifier_);

    }
    public Object clone()
    {
        return new AUnionTypeSpecifier(
            (PUnionSpecifier) cloneNode(_unionSpecifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnionTypeSpecifier(this);
    }

    public PUnionSpecifier getUnionSpecifier()
    {
        return _unionSpecifier_;
    }

    public void setUnionSpecifier(PUnionSpecifier node)
    {
        if(_unionSpecifier_ != null)
        {
            _unionSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unionSpecifier_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unionSpecifier_);
    }

    void removeChild(Node child)
    {
        if(_unionSpecifier_ == child)
        {
            _unionSpecifier_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unionSpecifier_ == oldChild)
        {
            setUnionSpecifier((PUnionSpecifier) newChild);
            return;
        }

    }
}