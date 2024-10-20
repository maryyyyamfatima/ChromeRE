package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh0 */
/* loaded from: classes.dex */
public final class C11511xh0 implements InterfaceC7182l33 {
    public final C7526m33 a;
    public final /* synthetic */ C11854yh0 g;

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        int i = 0;
        while (true) {
            C11854yh0 c11854yh0 = this.g;
            int size = c11854yh0.e.size();
            PC1 pc1 = c11854yh0.e;
            C7526m33 c7526m33 = this.a;
            if (i >= size) {
                pc1.h.e();
                pc1.i.k(GD1.w, c7526m33.e());
                return;
            }
            OC1 oc1 = (OC1) pc1.get(i);
            boolean d = c7526m33.d(oc1);
            oc1.c = d && !oc1.b;
            oc1.b = d;
            pc1.B(i, oc1);
            i++;
        }
    }

    public C11511xh0(C11854yh0 c11854yh0, C7526m33 c7526m33) {
        this.g = c11854yh0;
        this.a = c7526m33;
        c7526m33.a(this);
    }
}
