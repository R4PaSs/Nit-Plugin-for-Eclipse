/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwbreak extends Token
{
    public TKwbreak()
    {
        super.setText("break");
    }

    public TKwbreak(int line, int pos)
    {
        super.setText("break");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwbreak(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwbreak(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwbreak text.");
    }
}
