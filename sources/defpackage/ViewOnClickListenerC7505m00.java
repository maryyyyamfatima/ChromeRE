package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7505m00 implements View.OnClickListener {
    public C6206iD0 a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6206iD0 c6206iD0 = this.a;
        if (c6206iD0 != null) {
            try {
                LK3.a();
                if (AbstractC4830eD0.a == null) {
                    AbstractC4830eD0.a = new TT();
                }
                AbstractC4830eD0.a.a = view;
                c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.a);
                AbstractC4830eD0.a.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
