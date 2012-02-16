/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ABreakClosureId extends PClosureId
{
    private TKwbreak _kwbreak_;

    public ABreakClosureId()
    {
        // Constructor
    }

    public ABreakClosureId(
        @SuppressWarnings("hiding") TKwbreak _kwbreak_)
    {
        // Constructor
        setKwbreak(_kwbreak_);

    }

    @Override
    public Object clone()
    {
        return new ABreakClosureId(
            cloneNode(this._kwbreak_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABreakClosureId(this);
    }

    public TKwbreak getKwbreak()
    {
        return this._kwbreak_;
    }

    public void setKwbreak(TKwbreak node)
    {
        if(this._kwbreak_ != null)
        {
            this._kwbreak_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwbreak_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwbreak_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwbreak_ == child)
        {
            this._kwbreak_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwbreak_ == oldChild)
        {
            setKwbreak((TKwbreak) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
