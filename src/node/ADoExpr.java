/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADoExpr extends PExpr
{
    private TKwdo _kwdo_;
    private PExpr _block_;
    private PLabel _label_;

    public ADoExpr()
    {
        // Constructor
    }

    public ADoExpr(
        @SuppressWarnings("hiding") TKwdo _kwdo_,
        @SuppressWarnings("hiding") PExpr _block_,
        @SuppressWarnings("hiding") PLabel _label_)
    {
        // Constructor
        setKwdo(_kwdo_);

        setBlock(_block_);

        setLabel(_label_);

    }

    @Override
    public Object clone()
    {
        return new ADoExpr(
            cloneNode(this._kwdo_),
            cloneNode(this._block_),
            cloneNode(this._label_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADoExpr(this);
    }

    public TKwdo getKwdo()
    {
        return this._kwdo_;
    }

    public void setKwdo(TKwdo node)
    {
        if(this._kwdo_ != null)
        {
            this._kwdo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwdo_ = node;
    }

    public PExpr getBlock()
    {
        return this._block_;
    }

    public void setBlock(PExpr node)
    {
        if(this._block_ != null)
        {
            this._block_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._block_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwdo_)
            + toString(this._block_)
            + toString(this._label_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwdo_ == child)
        {
            this._kwdo_ = null;
            return;
        }

        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwdo_ == oldChild)
        {
            setKwdo((TKwdo) newChild);
            return;
        }

        if(this._block_ == oldChild)
        {
            setBlock((PExpr) newChild);
            return;
        }

        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
