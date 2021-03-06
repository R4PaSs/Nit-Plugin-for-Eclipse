/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class AExternClasskind extends PClasskind
{
    private TKwextern _kwextern_;
    private TKwclass _kwclass_;

    public AExternClasskind()
    {
        // Constructor
    }

    public AExternClasskind(
        @SuppressWarnings("hiding") TKwextern _kwextern_,
        @SuppressWarnings("hiding") TKwclass _kwclass_)
    {
        // Constructor
        setKwextern(_kwextern_);

        setKwclass(_kwclass_);

    }

    @Override
    public Object clone()
    {
        return new AExternClasskind(
            cloneNode(this._kwextern_),
            cloneNode(this._kwclass_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternClasskind(this);
    }

    public TKwextern getKwextern()
    {
        return this._kwextern_;
    }

    public void setKwextern(TKwextern node)
    {
        if(this._kwextern_ != null)
        {
            this._kwextern_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwextern_ = node;
    }

    public TKwclass getKwclass()
    {
        return this._kwclass_;
    }

    public void setKwclass(TKwclass node)
    {
        if(this._kwclass_ != null)
        {
            this._kwclass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwclass_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwextern_)
            + toString(this._kwclass_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwextern_ == child)
        {
            this._kwextern_ = null;
            return;
        }

        if(this._kwclass_ == child)
        {
            this._kwclass_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwextern_ == oldChild)
        {
            setKwextern((TKwextern) newChild);
            return;
        }

        if(this._kwclass_ == oldChild)
        {
            setKwclass((TKwclass) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
