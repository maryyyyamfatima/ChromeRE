package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cf2 */
/* loaded from: classes.dex */
public abstract class AbstractC0288Cf2 extends AbstractC11497xe4 {
    public AbstractC9101qf2 q;

    public AbstractC0288Cf2(AbstractC9101qf2 abstractC9101qf2, int i, int i2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(i, i2, context, viewGroup, c9537rv0);
        this.q = abstractC9101qf2;
    }

    @Override // defpackage.AbstractC11497xe4
    public void a() {
        super.a();
        this.q = null;
    }

    @Override // defpackage.AbstractC11497xe4
    public final int c() {
        AbstractC9101qf2 abstractC9101qf2 = this.q;
        return View.MeasureSpec.makeMeasureSpec(Math.round(abstractC9101qf2.t / abstractC9101qf2.a), 1073741824);
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("￼", " ").trim();
    }
}
