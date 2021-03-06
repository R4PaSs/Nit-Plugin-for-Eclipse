/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class X1PDeclarationOrDefinition extends XPDeclarationOrDefinition
{
    private XPDeclarationOrDefinition _xPDeclarationOrDefinition_;
    private PDeclarationOrDefinition _pDeclarationOrDefinition_;

    public X1PDeclarationOrDefinition()
    {
    }

    public X1PDeclarationOrDefinition(
        XPDeclarationOrDefinition _xPDeclarationOrDefinition_,
        PDeclarationOrDefinition _pDeclarationOrDefinition_)
    {
        setXPDeclarationOrDefinition(_xPDeclarationOrDefinition_);
        setPDeclarationOrDefinition(_pDeclarationOrDefinition_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPDeclarationOrDefinition getXPDeclarationOrDefinition()
    {
        return _xPDeclarationOrDefinition_;
    }

    public void setXPDeclarationOrDefinition(XPDeclarationOrDefinition node)
    {
        if(_xPDeclarationOrDefinition_ != null)
        {
            _xPDeclarationOrDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPDeclarationOrDefinition_ = node;
    }

    public PDeclarationOrDefinition getPDeclarationOrDefinition()
    {
        return _pDeclarationOrDefinition_;
    }

    public void setPDeclarationOrDefinition(PDeclarationOrDefinition node)
    {
        if(_pDeclarationOrDefinition_ != null)
        {
            _pDeclarationOrDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pDeclarationOrDefinition_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPDeclarationOrDefinition_ == child)
        {
            _xPDeclarationOrDefinition_ = null;
        }

        if(_pDeclarationOrDefinition_ == child)
        {
            _pDeclarationOrDefinition_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPDeclarationOrDefinition_) +
            toString(_pDeclarationOrDefinition_);
    }
}
