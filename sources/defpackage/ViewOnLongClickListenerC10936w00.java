package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC10936w00 implements View.OnLongClickListener {
    public C6206iD0 a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C6206iD0 c6206iD0 = this.a;
        if (c6206iD0 == null) {
            return false;
        }
        LK3.a();
        if (AbstractC4830eD0.c == null) {
            AbstractC4830eD0.c = new EI1();
        }
        AbstractC4830eD0.c.a = view;
        Object c = c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.c);
        AbstractC4830eD0.c.a = null;
        return c != null && ((Boolean) c).booleanValue();
    }
}
