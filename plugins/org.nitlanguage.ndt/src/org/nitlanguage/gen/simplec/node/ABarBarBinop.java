/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ABarBarBinop extends PBinop
{
    private TBarBar _barBar_;

    public ABarBarBinop()
    {
    }

    public ABarBarBinop(
        TBarBar _barBar_)
    {
        setBarBar(_barBar_);

    }
    public Object clone()
    {
        return new ABarBarBinop(
            (TBarBar) cloneNode(_barBar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABarBarBinop(this);
    }

    public TBarBar getBarBar()
    {
        return _barBar_;
    }

    public void setBarBar(TBarBar node)
    {
        if(_barBar_ != null)
        {
            _barBar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _barBar_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_barBar_);
    }

    void removeChild(Node child)
    {
        if(_barBar_ == child)
        {
            _barBar_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_barBar_ == oldChild)
        {
            setBarBar((TBarBar) newChild);
            return;
        }

    }
}
