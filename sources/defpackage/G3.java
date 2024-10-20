package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G3 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ List i;
    public final /* synthetic */ MC2 j;
    public final /* synthetic */ I3 k;

    public G3(I3 i3, String str, List list, MC2 mc2) {
        this.k = i3;
        this.h = str;
        this.i = list;
        this.j = mc2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.j.b((String) obj);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        this.k.a.getClass();
        String a = H3.a(this.h);
        while (a != null && B4.d(a, this.i) == null) {
            a = H3.a(a);
        }
        return a;
    }
}
