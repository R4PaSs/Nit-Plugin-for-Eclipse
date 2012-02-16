/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMainMethPropdef extends PPropdef
{
    private TKwredef _kwredef_;
    private PExpr _block_;

    public AMainMethPropdef()
    {
        // Constructor
    }

    public AMainMethPropdef(
        @SuppressWarnings("hiding") TKwredef _kwredef_,
        @SuppressWarnings("hiding") PExpr _block_)
    {
        // Constructor
        setKwredef(_kwredef_);

        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new AMainMethPropdef(
            cloneNode(this._kwredef_),
            cloneNode(this._block_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainMethPropdef(this);
    }

    public TKwredef getKwredef()
    {
        return this._kwredef_;
    }

    public void setKwredef(TKwredef node)
    {
        if(this._kwredef_ != null)
        {
            this._kwredef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwredef_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwredef_)
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwredef_ == child)
        {
            this._kwredef_ = null;
            return;
        }

        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwredef_ == oldChild)
        {
            setKwredef((TKwredef) newChild);
            return;
        }

        if(this._block_ == oldChild)
        {
            setBlock((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
