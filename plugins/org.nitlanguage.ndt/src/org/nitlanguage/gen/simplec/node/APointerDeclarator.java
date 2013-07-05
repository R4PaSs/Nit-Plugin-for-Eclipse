/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class APointerDeclarator extends PDeclarator
{
    private PPointer _pointer_;

    public APointerDeclarator()
    {
    }

    public APointerDeclarator(
        PPointer _pointer_)
    {
        setPointer(_pointer_);

    }
    public Object clone()
    {
        return new APointerDeclarator(
            (PPointer) cloneNode(_pointer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPointerDeclarator(this);
    }

    public PPointer getPointer()
    {
        return _pointer_;
    }

    public void setPointer(PPointer node)
    {
        if(_pointer_ != null)
        {
            _pointer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pointer_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_pointer_);
    }

    void removeChild(Node child)
    {
        if(_pointer_ == child)
        {
            _pointer_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_pointer_ == oldChild)
        {
            setPointer((PPointer) newChild);
            return;
        }

    }
}