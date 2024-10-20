package defpackage;

import java.util.HashSet;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U04 implements InterfaceC0186Bl0 {
    public final InterfaceC10590uz3 g;
    public final InterfaceC7697ma2 h;
    public C9897sy1 i;
    public T04 j;
    public S04 k;
    public Integer l;
    public Boolean m;
    public R04 o;
    public final boolean p;
    public final HashSet a = new HashSet();
    public boolean n = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [R04, org.chromium.base.Callback] */
    public U04(AbstractC11276wz3 abstractC11276wz3, C8385oa2 c8385oa2, boolean z) {
        this.h = c8385oa2;
        this.g = abstractC11276wz3;
        this.p = z;
        this.k = new S04(this, abstractC11276wz3);
        ?? r2 = new Callback() { // from class: R04
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9897sy1 c9897sy1 = (C9897sy1) obj;
                U04 u04 = U04.this;
                u04.i = c9897sy1;
                T04 t04 = new T04(u04);
                u04.j = t04;
                c9897sy1.e(t04);
            }
        };
        this.o = r2;
        c8385oa2.m(r2);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.k.a();
        ((C8385oa2) this.h).n(this.o);
        this.i.L(this.j);
    }

    public static void a(U04 u04) {
        Integer num;
        TabModel g = ((AbstractC11276wz3) u04.g).g();
        if (g == null || (num = u04.l) == null) {
            return;
        }
        g.q(AbstractC1558Lz3.d(g, num.intValue()), 5, false);
        u04.b();
    }

    public final void b() {
        this.l = null;
        this.m = null;
    }
}
