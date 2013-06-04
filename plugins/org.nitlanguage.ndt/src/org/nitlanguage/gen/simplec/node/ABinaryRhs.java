/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ABinaryRhs extends PRhs
{
    private PBinaryExpression _binaryExpression_;

    public ABinaryRhs()
    {
    }

    public ABinaryRhs(
        PBinaryExpression _binaryExpression_)
    {
        setBinaryExpression(_binaryExpression_);

    }
    public Object clone()
    {
        return new ABinaryRhs(
            (PBinaryExpression) cloneNode(_binaryExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinaryRhs(this);
    }

    public PBinaryExpression getBinaryExpression()
    {
        return _binaryExpression_;
    }

    public void setBinaryExpression(PBinaryExpression node)
    {
        if(_binaryExpression_ != null)
        {
            _binaryExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _binaryExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_binaryExpression_);
    }

    void removeChild(Node child)
    {
        if(_binaryExpression_ == child)
        {
            _binaryExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_binaryExpression_ == oldChild)
        {
            setBinaryExpression((PBinaryExpression) newChild);
            return;
        }

    }
}
