/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AProtectedVisibility extends PVisibility
{
    private TKwprotected _kwprotected_;

    public AProtectedVisibility()
    {
        // Constructor
    }

    public AProtectedVisibility(
        @SuppressWarnings("hiding") TKwprotected _kwprotected_)
    {
        // Constructor
        setKwprotected(_kwprotected_);

    }

    @Override
    public Object clone()
    {
        return new AProtectedVisibility(
            cloneNode(this._kwprotected_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProtectedVisibility(this);
    }

    public TKwprotected getKwprotected()
    {
        return this._kwprotected_;
    }

    public void setKwprotected(TKwprotected node)
    {
        if(this._kwprotected_ != null)
        {
            this._kwprotected_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwprotected_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwprotected_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwprotected_ == child)
        {
            this._kwprotected_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwprotected_ == oldChild)
        {
            setKwprotected((TKwprotected) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}