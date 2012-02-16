/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AWriteAble extends PAble
{
    private TKwredef _kwredef_;
    private PVisibility _visibility_;
    private TKwwritable _kwwritable_;

    public AWriteAble()
    {
        // Constructor
    }

    public AWriteAble(
        @SuppressWarnings("hiding") TKwredef _kwredef_,
        @SuppressWarnings("hiding") PVisibility _visibility_,
        @SuppressWarnings("hiding") TKwwritable _kwwritable_)
    {
        // Constructor
        setKwredef(_kwredef_);

        setVisibility(_visibility_);

        setKwwritable(_kwwritable_);

    }

    @Override
    public Object clone()
    {
        return new AWriteAble(
            cloneNode(this._kwredef_),
            cloneNode(this._visibility_),
            cloneNode(this._kwwritable_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWriteAble(this);
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

    public PVisibility getVisibility()
    {
        return this._visibility_;
    }

    public void setVisibility(PVisibility node)
    {
        if(this._visibility_ != null)
        {
            this._visibility_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._visibility_ = node;
    }

    public TKwwritable getKwwritable()
    {
        return this._kwwritable_;
    }

    public void setKwwritable(TKwwritable node)
    {
        if(this._kwwritable_ != null)
        {
            this._kwwritable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwwritable_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwredef_)
            + toString(this._visibility_)
            + toString(this._kwwritable_);
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

        if(this._visibility_ == child)
        {
            this._visibility_ = null;
            return;
        }

        if(this._kwwritable_ == child)
        {
            this._kwwritable_ = null;
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

        if(this._visibility_ == oldChild)
        {
            setVisibility((PVisibility) newChild);
            return;
        }

        if(this._kwwritable_ == oldChild)
        {
            setKwwritable((TKwwritable) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
