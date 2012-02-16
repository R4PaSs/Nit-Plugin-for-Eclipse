/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwreadable extends Token
{
    public TKwreadable()
    {
        super.setText("readable");
    }

    public TKwreadable(int line, int pos)
    {
        super.setText("readable");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwreadable(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwreadable(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwreadable text.");
    }
}
