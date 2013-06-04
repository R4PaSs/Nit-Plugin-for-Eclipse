/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class TColumn extends Token
{
    public TColumn()
    {
        super.setText(":");
    }

    public TColumn(int line, int pos)
    {
        super.setText(":");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TColumn(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTColumn(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TColumn text.");
    }
}
