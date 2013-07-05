/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class APointerAbstractPointer extends PAbstractPointer
{
    private TStar _star_;
    private PAbstractPointer _abstractPointer_;

    public APointerAbstractPointer()
    {
    }

    public APointerAbstractPointer(
        TStar _star_,
        PAbstractPointer _abstractPointer_)
    {
        setStar(_star_);

        setAbstractPointer(_abstractPointer_);

    }
    public Object clone()
    {
        return new APointerAbstractPointer(
            (TStar) cloneNode(_star_),
            (PAbstractPointer) cloneNode(_abstractPointer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPointerAbstractPointer(this);
    }

    public TStar getStar()
    {
        return _star_;
    }

    public void setStar(TStar node)
    {
        if(_star_ != null)
        {
            _star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _star_ = node;
    }

    public PAbstractPointer getAbstractPointer()
    {
        return _abstractPointer_;
    }

    public void setAbstractPointer(PAbstractPointer node)
    {
        if(_abstractPointer_ != null)
        {
            _abstractPointer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _abstractPointer_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_star_)
            + toString(_abstractPointer_);
    }

    void removeChild(Node child)
    {
        if(_star_ == child)
        {
            _star_ = null;
            return;
        }

        if(_abstractPointer_ == child)
        {
            _abstractPointer_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        if(_abstractPointer_ == oldChild)
        {
            setAbstractPointer((PAbstractPointer) newChild);
            return;
        }

    }
}