/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class TDefault extends Token
{
    public TDefault()
    {
        super.setText("default");
    }

    public TDefault(int line, int pos)
    {
        super.setText("default");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TDefault(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDefault(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TDefault text.");
    }
}
