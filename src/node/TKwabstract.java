/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwabstract extends Token
{
    public TKwabstract()
    {
        super.setText("abstract");
    }

    public TKwabstract(int line, int pos)
    {
        super.setText("abstract");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwabstract(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwabstract(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwabstract text.");
    }
}
