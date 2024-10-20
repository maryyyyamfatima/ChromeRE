package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X53 implements N74 {
    public static final X53 a = new X53();
    public static final C2826Vt1 b = C2826Vt1.a("c", "v", "i", "o");

    @Override // defpackage.N74
    public final Object a(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        if (abstractC3086Xt1.u() == 1) {
            abstractC3086Xt1.b();
        }
        abstractC3086Xt1.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (abstractC3086Xt1.i()) {
            int C = abstractC3086Xt1.C(b);
            if (C == 0) {
                z = abstractC3086Xt1.j();
            } else if (C == 1) {
                arrayList = AbstractC4036bu1.c(abstractC3086Xt1, f);
            } else if (C == 2) {
                arrayList2 = AbstractC4036bu1.c(abstractC3086Xt1, f);
            } else if (C == 3) {
                arrayList3 = AbstractC4036bu1.c(abstractC3086Xt1, f);
            } else {
                abstractC3086Xt1.F();
                abstractC3086Xt1.I();
            }
        }
        abstractC3086Xt1.f();
        if (abstractC3086Xt1.u() == 2) {
            abstractC3086Xt1.e();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new W53(new PointF(), false, Collections.emptyList());
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i2 = i - 1;
            arrayList4.add(new C8051nc0(CX1.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), CX1.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i3 = size - 1;
            arrayList4.add(new C8051nc0(CX1.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), CX1.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new W53(pointF, z, arrayList4);
    }
}
