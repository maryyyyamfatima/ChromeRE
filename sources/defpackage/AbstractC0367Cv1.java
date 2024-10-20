package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cv1 */
/* loaded from: classes.dex */
public abstract class AbstractC0367Cv1 {
    public static final C2826Vt1 a = C2826Vt1.a("k");

    public static ArrayList a(AbstractC3086Xt1 abstractC3086Xt1, C8985qJ1 c8985qJ1, float f, N74 n74, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC3086Xt1.u() == 6) {
            c8985qJ1.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC3086Xt1.c();
        while (abstractC3086Xt1.i()) {
            if (abstractC3086Xt1.C(a) == 0) {
                if (abstractC3086Xt1.u() == 1) {
                    abstractC3086Xt1.b();
                    if (abstractC3086Xt1.u() == 7) {
                        arrayList.add(AbstractC0237Bv1.b(abstractC3086Xt1, c8985qJ1, f, n74, false, z));
                    } else {
                        while (abstractC3086Xt1.i()) {
                            arrayList.add(AbstractC0237Bv1.b(abstractC3086Xt1, c8985qJ1, f, n74, true, z));
                        }
                    }
                    abstractC3086Xt1.e();
                } else {
                    arrayList.add(AbstractC0237Bv1.b(abstractC3086Xt1, c8985qJ1, f, n74, false, z));
                }
            } else {
                abstractC3086Xt1.I();
            }
        }
        abstractC3086Xt1.f();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C12282zv1 c12282zv1 = (C12282zv1) arrayList.get(i2);
            i2++;
            C12282zv1 c12282zv12 = (C12282zv1) arrayList.get(i2);
            c12282zv1.h = Float.valueOf(c12282zv12.g);
            if (c12282zv1.c == null && (obj = c12282zv12.b) != null) {
                c12282zv1.c = obj;
                if (c12282zv1 instanceof C2407Sn2) {
                    ((C2407Sn2) c12282zv1).d();
                }
            }
        }
        C12282zv1 c12282zv13 = (C12282zv1) arrayList.get(i);
        if ((c12282zv13.b == null || c12282zv13.c == null) && arrayList.size() > 1) {
            arrayList.remove(c12282zv13);
        }
    }
}
