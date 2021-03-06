/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class X1PArglistTail extends XPArglistTail
{
    private XPArglistTail _xPArglistTail_;
    private PArglistTail _pArglistTail_;

    public X1PArglistTail()
    {
    }

    public X1PArglistTail(
        XPArglistTail _xPArglistTail_,
        PArglistTail _pArglistTail_)
    {
        setXPArglistTail(_xPArglistTail_);
        setPArglistTail(_pArglistTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPArglistTail getXPArglistTail()
    {
        return _xPArglistTail_;
    }

    public void setXPArglistTail(XPArglistTail node)
    {
        if(_xPArglistTail_ != null)
        {
            _xPArglistTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPArglistTail_ = node;
    }

    public PArglistTail getPArglistTail()
    {
        return _pArglistTail_;
    }

    public void setPArglistTail(PArglistTail node)
    {
        if(_pArglistTail_ != null)
        {
            _pArglistTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pArglistTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPArglistTail_ == child)
        {
            _xPArglistTail_ = null;
        }

        if(_pArglistTail_ == child)
        {
            _pArglistTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPArglistTail_) +
            toString(_pArglistTail_);
    }
}
