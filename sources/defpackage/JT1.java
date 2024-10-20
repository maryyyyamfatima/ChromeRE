package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.a;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JT1 implements View.OnLayoutChangeListener {
    public final Context a;
    public final QB g;
    public final View h;
    public final WT1 i;
    public final OT1 j;
    public IT1 k;
    public ET1 l;
    public int m;
    public C6930kK3 n;
    public C6542jC o;
    public PropertyModel p;
    public UD2 q;
    public final C2021Po1 r;

    public JT1(a aVar, C10285u6 c10285u6, m mVar, View view, WT1 wt1, C2021Po1 c2021Po1, InterfaceC7697ma2 interfaceC7697ma2) {
        this.a = aVar;
        this.g = mVar;
        this.h = view;
        this.i = wt1;
        this.r = c2021Po1;
        this.j = new OT1(aVar, c10285u6, wt1, interfaceC7697ma2, new WH0());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int f;
        if (this.l == null || (f = ((m) this.g).f()) == 0 || this.m == f) {
            return;
        }
        C6930kK3 c6930kK3 = this.n;
        c6930kK3.getClass();
        c6930kK3.getLayoutParams().height = ((int) (f * 0.9f)) - this.o.a;
        C6930kK3 c6930kK32 = this.n;
        c6930kK32.getClass();
        c6930kK32.requestLayout();
        this.m = f;
    }
}
