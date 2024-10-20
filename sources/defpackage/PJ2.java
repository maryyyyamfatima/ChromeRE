package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PJ2 implements OD1 {
    public final int a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final C2365Sf0 g;
    public final C2495Tf0 h;

    public PJ2(List list, List list2, C2365Sf0 c2365Sf0, C2495Tf0 c2495Tf0) {
        this.b = list;
        this.a = list != null ? list.size() : 0;
        this.c = list2;
        this.g = c2365Sf0;
        this.h = c2495Tf0;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        for (int i = 0; i < this.a; i++) {
            this.e.add(new NJ2(null, false));
            this.f.add(new C11198wm0(this.b.get(i), null));
        }
    }

    @Override // defpackage.OD1
    public final void c(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            NJ2 nj2 = new NJ2(null, true);
            this.e.add(i4, nj2);
            arrayList.add(nj2);
            C11198wm0 c11198wm0 = new C11198wm0(null, null);
            this.f.add(i4, c11198wm0);
            arrayList2.add(c11198wm0);
        }
        this.d.add(new OJ2(0, i, -1, arrayList, arrayList2));
    }

    @Override // defpackage.OD1
    public final void d(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.e.remove(i);
            arrayList.add((C11198wm0) this.f.remove(i));
        }
        this.d.add(new OJ2(2, i, i2, null, arrayList));
    }

    @Override // defpackage.OD1
    public final void b(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = this.e;
        arrayList2.add(i2, (NJ2) arrayList2.remove(i));
        ArrayList arrayList3 = this.f;
        C11198wm0 c11198wm0 = (C11198wm0) arrayList3.remove(i);
        arrayList.add(c11198wm0);
        arrayList3.add(i2, c11198wm0);
        this.d.add(new OJ2(3, i, i2, null, arrayList));
    }

    @Override // defpackage.OD1
    public final void a(Object obj, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            NJ2 nj2 = (NJ2) this.e.get(i4);
            nj2.b = true;
            arrayList.add(nj2);
            arrayList2.add((C11198wm0) this.f.get(i4));
        }
        this.d.add(new OJ2(1, i, -1, arrayList, arrayList2));
    }
}
