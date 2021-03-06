/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class TBarBar extends Token
{
    public TBarBar()
    {
        super.setText("||");
    }

    public TBarBar(int line, int pos)
    {
        super.setText("||");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TBarBar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBarBar(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TBarBar text.");
    }
}
