package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hh0 */
/* loaded from: classes.dex */
public final class C0946Hh0 extends GridLayoutManager {
    public final /* synthetic */ C1336Kh0 M;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final boolean F0() {
        return false;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final void g0(b bVar, LK2 lk2) {
        C1336Kh0 c1336Kh0 = this.M;
        C0556Eh0 c0556Eh0 = c1336Kh0.i;
        int width = c0556Eh0.getWidth();
        WeakHashMap weakHashMap = Ec4.a;
        int paddingStart = ((width - c0556Eh0.getPaddingStart()) - c0556Eh0.getPaddingEnd()) - (c1336Kh0.f * 2);
        int i = c1336Kh0.c - c1336Kh0.d;
        int i2 = paddingStart / i;
        if ((paddingStart - (i2 * i)) / i > 0.5d) {
            i2++;
        }
        u1(Math.max(1, i2));
        super.g0(bVar, lk2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0946Hh0(C1336Kh0 c1336Kh0) {
        super(1, 1, false);
        this.M = c1336Kh0;
        this.K = new C0816Gh0(this);
    }
}
