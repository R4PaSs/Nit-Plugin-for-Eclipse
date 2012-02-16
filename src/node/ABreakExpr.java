/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ABreakExpr extends PExpr
{
    private TKwbreak _kwbreak_;
    private PLabel _label_;
    private PExpr _expr_;

    public ABreakExpr()
    {
        // Constructor
    }

    public ABreakExpr(
        @SuppressWarnings("hiding") TKwbreak _kwbreak_,
        @SuppressWarnings("hiding") PLabel _label_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setKwbreak(_kwbreak_);

        setLabel(_label_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new ABreakExpr(
            cloneNode(this._kwbreak_),
            cloneNode(this._label_),
            cloneNode(this._expr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABreakExpr(this);
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

    public PLabel getLabel()
    {
        return this._label_;
    }

    public void setLabel(PLabel node)
    {
        if(this._label_ != null)
        {
            this._label_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._label_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwbreak_)
            + toString(this._label_)
            + toString(this._expr_);
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

        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
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

        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
