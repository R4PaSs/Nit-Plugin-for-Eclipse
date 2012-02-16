/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AParam extends PParam
{
    private TId _id_;
    private PType _type_;
    private TDotdotdot _dotdotdot_;

    public AParam()
    {
        // Constructor
    }

    public AParam(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TDotdotdot _dotdotdot_)
    {
        // Constructor
        setId(_id_);

        setType(_type_);

        setDotdotdot(_dotdotdot_);

    }

    @Override
    public Object clone()
    {
        return new AParam(
            cloneNode(this._id_),
            cloneNode(this._type_),
            cloneNode(this._dotdotdot_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParam(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TDotdotdot getDotdotdot()
    {
        return this._dotdotdot_;
    }

    public void setDotdotdot(TDotdotdot node)
    {
        if(this._dotdotdot_ != null)
        {
            this._dotdotdot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dotdotdot_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._type_)
            + toString(this._dotdotdot_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._dotdotdot_ == child)
        {
            this._dotdotdot_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._dotdotdot_ == oldChild)
        {
            setDotdotdot((TDotdotdot) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
