/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwis extends Token
{
    public TKwis()
    {
        super.setText("is");
    }

    public TKwis(int line, int pos)
    {
        super.setText("is");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwis(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwis(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwis text.");
    }
}
