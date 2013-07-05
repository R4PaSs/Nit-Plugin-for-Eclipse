/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ADoubleSpecifier extends PDoubleSpecifier
{
    private TDouble _double_;

    public ADoubleSpecifier()
    {
    }

    public ADoubleSpecifier(
        TDouble _double_)
    {
        setDouble(_double_);

    }
    public Object clone()
    {
        return new ADoubleSpecifier(
            (TDouble) cloneNode(_double_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADoubleSpecifier(this);
    }

    public TDouble getDouble()
    {
        return _double_;
    }

    public void setDouble(TDouble node)
    {
        if(_double_ != null)
        {
            _double_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _double_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_double_);
    }

    void removeChild(Node child)
    {
        if(_double_ == child)
        {
            _double_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_double_ == oldChild)
        {
            setDouble((TDouble) newChild);
            return;
        }

    }
}