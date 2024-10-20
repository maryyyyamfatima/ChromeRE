package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC9221r00 implements View.OnFocusChangeListener {
    public C6206iD0 a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C6206iD0 c6206iD0 = this.a;
        if (c6206iD0 != null) {
            LK3.a();
            if (AbstractC4830eD0.b == null) {
                AbstractC4830eD0.b = new C3870bR0();
            }
            C3870bR0 c3870bR0 = AbstractC4830eD0.b;
            c3870bR0.a = view;
            c3870bR0.b = z;
            c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.b);
            AbstractC4830eD0.b.a = null;
        }
    }
}
