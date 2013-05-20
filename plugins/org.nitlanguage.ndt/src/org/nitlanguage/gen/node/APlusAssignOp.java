/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class APlusAssignOp extends PAssignOp
{
    private TPluseq _pluseq_;

    public APlusAssignOp()
    {
        // Constructor
    }

    public APlusAssignOp(
        @SuppressWarnings("hiding") TPluseq _pluseq_)
    {
        // Constructor
        setPluseq(_pluseq_);

    }

    @Override
    public Object clone()
    {
        return new APlusAssignOp(
            cloneNode(this._pluseq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusAssignOp(this);
    }

    public TPluseq getPluseq()
    {
        return this._pluseq_;
    }

    public void setPluseq(TPluseq node)
    {
        if(this._pluseq_ != null)
        {
            this._pluseq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pluseq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pluseq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pluseq_ == child)
        {
            this._pluseq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pluseq_ == oldChild)
        {
            setPluseq((TPluseq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
