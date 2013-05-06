/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.*;

@SuppressWarnings("nls")
public final class AEnumClasskind extends PClasskind
{
    private TKwenum _kwenum_;

    public AEnumClasskind()
    {
        // Constructor
    }

    public AEnumClasskind(
        @SuppressWarnings("hiding") TKwenum _kwenum_)
    {
        // Constructor
        setKwenum(_kwenum_);

    }

    @Override
    public Object clone()
    {
        return new AEnumClasskind(
            cloneNode(this._kwenum_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumClasskind(this);
    }

    public TKwenum getKwenum()
    {
        return this._kwenum_;
    }

    public void setKwenum(TKwenum node)
    {
        if(this._kwenum_ != null)
        {
            this._kwenum_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwenum_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwenum_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwenum_ == child)
        {
            this._kwenum_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwenum_ == oldChild)
        {
            setKwenum((TKwenum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}