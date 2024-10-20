package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qe4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9097qe4 implements InterfaceC5041eq0 {
    public final int a;
    public final int g;
    public final View h;
    public final ViewOnAttachStateChangeListenerC5385fq0 i;
    public final QZ3 j;
    public int k;

    public C9097qe4(View view, QZ3 qz3, int i, int i2) {
        this.h = view;
        this.a = i;
        this.g = i2;
        this.j = qz3;
        this.i = new ViewOnAttachStateChangeListenerC5385fq0(view, qz3, this);
    }

    public final void b() {
        ViewOnAttachStateChangeListenerC5385fq0 viewOnAttachStateChangeListenerC5385fq0 = this.i;
        viewOnAttachStateChangeListenerC5385fq0.i.a(viewOnAttachStateChangeListenerC5385fq0);
    }

    @Override // defpackage.InterfaceC5041eq0
    public final void a(PZ3 pz3) {
        this.k = pz3.a;
        int c = c();
        View view = this.h;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        WeakHashMap weakHashMap = Ec4.a;
        view.setPaddingRelative(c, paddingTop, c, paddingBottom);
    }

    public int c() {
        if (this.k != 2) {
            return this.a;
        }
        return Math.max(this.g, (int) (((r0.getConfiguration().screenWidthDp - 600) / 2.0f) * this.j.c.getResources().getDisplayMetrics().density));
    }
}
