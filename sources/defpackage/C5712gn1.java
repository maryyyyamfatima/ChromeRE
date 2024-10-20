package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5712gn1 {
    public int a;
    public final C7774mn1 b;
    public final ArrayList c;
    public int d;
    public final /* synthetic */ C6056hn1 e;

    public C5712gn1(C6056hn1 c6056hn1, int i, C7774mn1 c7774mn1) {
        this.e = c6056hn1;
        this.a = i;
        this.b = c7774mn1;
        ArrayList arrayList = new ArrayList(Collections.nCopies(this.a, null));
        this.c = arrayList;
        if (this.a == 0) {
            C6056hn1.c(c6056hn1, arrayList, this.d, c7774mn1);
        }
    }

    public final void a(WL2 wl2, int i, int i2) {
        ArrayList arrayList = this.c;
        arrayList.set(i, wl2);
        this.d += i2;
        int i3 = this.a - 1;
        this.a = i3;
        if (i3 == 0) {
            arrayList.removeAll(Collections.singleton(null));
            C6056hn1.c(this.e, arrayList, this.d, this.b);
        }
    }
}
