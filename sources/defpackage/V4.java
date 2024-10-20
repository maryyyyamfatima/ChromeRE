package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V4 extends C10406uT1 {
    public final /* synthetic */ C4097c5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(C4097c5 c4097c5, Context context, SubMenuC0074Ao3 subMenuC0074Ao3, View view) {
        super(context, subMenuC0074Ao3, view, false);
        this.m = c4097c5;
        if (!((subMenuC0074Ao3.A.x & 32) == 32)) {
            View view2 = c4097c5.n;
            this.f = view2 == null ? (View) c4097c5.m : view2;
        }
        C3754b5 c3754b5 = c4097c5.B;
        this.i = c3754b5;
        AbstractC9720sT1 abstractC9720sT1 = this.j;
        if (abstractC9720sT1 != null) {
            abstractC9720sT1.h(c3754b5);
        }
    }

    @Override // defpackage.C10406uT1
    public final void c() {
        this.m.y = null;
        super.c();
    }
}
