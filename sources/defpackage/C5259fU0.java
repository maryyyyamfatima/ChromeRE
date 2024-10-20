package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fU0 */
/* loaded from: classes.dex */
public final class C5259fU0 extends AbstractC3898bW3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Object h = null;
    public final /* synthetic */ ArrayList i = null;
    public final /* synthetic */ Object j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ C6633jU0 l;

    public C5259fU0(C6633jU0 c6633jU0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.l = c6633jU0;
        this.a = obj;
        this.g = arrayList;
        this.j = obj2;
        this.k = arrayList2;
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void a(QV3 qv3) {
        C6633jU0 c6633jU0 = this.l;
        Object obj = this.a;
        if (obj != null) {
            c6633jU0.s(obj, this.g, null);
        }
        Object obj2 = this.h;
        if (obj2 != null) {
            c6633jU0.s(obj2, this.i, null);
        }
        Object obj3 = this.j;
        if (obj3 != null) {
            c6633jU0.s(obj3, this.k, null);
        }
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        qv3.w(this);
    }
}
