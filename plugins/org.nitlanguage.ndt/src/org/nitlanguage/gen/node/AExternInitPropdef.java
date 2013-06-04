/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class AExternInitPropdef extends PPropdef
{
    private PDoc _doc_;
    private TKwredef _kwredef_;
    private PVisibility _visibility_;
    private TKwnew _kwnew_;
    private PMethid _methid_;
    private PSignature _signature_;
    private TString _extern_;
    private PExternCalls _externCalls_;
    private PExternCodeBlock _externCodeBlock_;

    public AExternInitPropdef()
    {
        // Constructor
    }

    public AExternInitPropdef(
        @SuppressWarnings("hiding") PDoc _doc_,
        @SuppressWarnings("hiding") TKwredef _kwredef_,
        @SuppressWarnings("hiding") PVisibility _visibility_,
        @SuppressWarnings("hiding") TKwnew _kwnew_,
        @SuppressWarnings("hiding") PMethid _methid_,
        @SuppressWarnings("hiding") PSignature _signature_,
        @SuppressWarnings("hiding") TString _extern_,
        @SuppressWarnings("hiding") PExternCalls _externCalls_,
        @SuppressWarnings("hiding") PExternCodeBlock _externCodeBlock_)
    {
        // Constructor
        setDoc(_doc_);

        setKwredef(_kwredef_);

        setVisibility(_visibility_);

        setKwnew(_kwnew_);

        setMethid(_methid_);

        setSignature(_signature_);

        setExtern(_extern_);

        setExternCalls(_externCalls_);

        setExternCodeBlock(_externCodeBlock_);

    }

    @Override
    public Object clone()
    {
        return new AExternInitPropdef(
            cloneNode(this._doc_),
            cloneNode(this._kwredef_),
            cloneNode(this._visibility_),
            cloneNode(this._kwnew_),
            cloneNode(this._methid_),
            cloneNode(this._signature_),
            cloneNode(this._extern_),
            cloneNode(this._externCalls_),
            cloneNode(this._externCodeBlock_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternInitPropdef(this);
    }

    public PDoc getDoc()
    {
        return this._doc_;
    }

    public void setDoc(PDoc node)
    {
        if(this._doc_ != null)
        {
            this._doc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doc_ = node;
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

    public TKwnew getKwnew()
    {
        return this._kwnew_;
    }

    public void setKwnew(TKwnew node)
    {
        if(this._kwnew_ != null)
        {
            this._kwnew_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwnew_ = node;
    }

    public PMethid getMethid()
    {
        return this._methid_;
    }

    public void setMethid(PMethid node)
    {
        if(this._methid_ != null)
        {
            this._methid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._methid_ = node;
    }

    public PSignature getSignature()
    {
        return this._signature_;
    }

    public void setSignature(PSignature node)
    {
        if(this._signature_ != null)
        {
            this._signature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signature_ = node;
    }

    public TString getExtern()
    {
        return this._extern_;
    }

    public void setExtern(TString node)
    {
        if(this._extern_ != null)
        {
            this._extern_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extern_ = node;
    }

    public PExternCalls getExternCalls()
    {
        return this._externCalls_;
    }

    public void setExternCalls(PExternCalls node)
    {
        if(this._externCalls_ != null)
        {
            this._externCalls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._externCalls_ = node;
    }

    public PExternCodeBlock getExternCodeBlock()
    {
        return this._externCodeBlock_;
    }

    public void setExternCodeBlock(PExternCodeBlock node)
    {
        if(this._externCodeBlock_ != null)
        {
            this._externCodeBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._externCodeBlock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._doc_)
            + toString(this._kwredef_)
            + toString(this._visibility_)
            + toString(this._kwnew_)
            + toString(this._methid_)
            + toString(this._signature_)
            + toString(this._extern_)
            + toString(this._externCalls_)
            + toString(this._externCodeBlock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._doc_ == child)
        {
            this._doc_ = null;
            return;
        }

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

        if(this._kwnew_ == child)
        {
            this._kwnew_ = null;
            return;
        }

        if(this._methid_ == child)
        {
            this._methid_ = null;
            return;
        }

        if(this._signature_ == child)
        {
            this._signature_ = null;
            return;
        }

        if(this._extern_ == child)
        {
            this._extern_ = null;
            return;
        }

        if(this._externCalls_ == child)
        {
            this._externCalls_ = null;
            return;
        }

        if(this._externCodeBlock_ == child)
        {
            this._externCodeBlock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._doc_ == oldChild)
        {
            setDoc((PDoc) newChild);
            return;
        }

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

        if(this._kwnew_ == oldChild)
        {
            setKwnew((TKwnew) newChild);
            return;
        }

        if(this._methid_ == oldChild)
        {
            setMethid((PMethid) newChild);
            return;
        }

        if(this._signature_ == oldChild)
        {
            setSignature((PSignature) newChild);
            return;
        }

        if(this._extern_ == oldChild)
        {
            setExtern((TString) newChild);
            return;
        }

        if(this._externCalls_ == oldChild)
        {
            setExternCalls((PExternCalls) newChild);
            return;
        }

        if(this._externCodeBlock_ == oldChild)
        {
            setExternCodeBlock((PExternCodeBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
