/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ADoubleTypeSpecifier extends PTypeSpecifier
{
    private PDoubleSpecifier _doubleSpecifier_;

    public ADoubleTypeSpecifier()
    {
    }

    public ADoubleTypeSpecifier(
        PDoubleSpecifier _doubleSpecifier_)
    {
        setDoubleSpecifier(_doubleSpecifier_);

    }
    public Object clone()
    {
        return new ADoubleTypeSpecifier(
            (PDoubleSpecifier) cloneNode(_doubleSpecifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADoubleTypeSpecifier(this);
    }

    public PDoubleSpecifier getDoubleSpecifier()
    {
        return _doubleSpecifier_;
    }

    public void setDoubleSpecifier(PDoubleSpecifier node)
    {
        if(_doubleSpecifier_ != null)
        {
            _doubleSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _doubleSpecifier_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_doubleSpecifier_);
    }

    void removeChild(Node child)
    {
        if(_doubleSpecifier_ == child)
        {
            _doubleSpecifier_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_doubleSpecifier_ == oldChild)
        {
            setDoubleSpecifier((PDoubleSpecifier) newChild);
            return;
        }

    }
}
