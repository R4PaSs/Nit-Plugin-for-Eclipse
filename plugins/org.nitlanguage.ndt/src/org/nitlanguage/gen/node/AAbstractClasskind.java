/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class AAbstractClasskind extends PClasskind
{
    private TKwabstract _kwabstract_;
    private TKwclass _kwclass_;

    public AAbstractClasskind()
    {
        // Constructor
    }

    public AAbstractClasskind(
        @SuppressWarnings("hiding") TKwabstract _kwabstract_,
        @SuppressWarnings("hiding") TKwclass _kwclass_)
    {
        // Constructor
        setKwabstract(_kwabstract_);

        setKwclass(_kwclass_);

    }

    @Override
    public Object clone()
    {
        return new AAbstractClasskind(
            cloneNode(this._kwabstract_),
            cloneNode(this._kwclass_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAbstractClasskind(this);
    }

    public TKwabstract getKwabstract()
    {
        return this._kwabstract_;
    }

    public void setKwabstract(TKwabstract node)
    {
        if(this._kwabstract_ != null)
        {
            this._kwabstract_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwabstract_ = node;
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
            + toString(this._kwabstract_)
            + toString(this._kwclass_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwabstract_ == child)
        {
            this._kwabstract_ = null;
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
        if(this._kwabstract_ == oldChild)
        {
            setKwabstract((TKwabstract) newChild);
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
