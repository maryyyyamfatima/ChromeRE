package defpackage;

import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yO */
/* loaded from: classes.dex */
public abstract class AbstractC11751yO {
    public static void a(C7980nO1 c7980nO1) {
        SparseArray sparseArray = AbstractC8667pO1.a;
        int i = c7980nO1.k;
        C6948kO1 c6948kO1 = (C6948kO1) sparseArray.get(i);
        if (c6948kO1 == null) {
            c6948kO1 = new C6948kO1(new C11408xO(i));
            sparseArray.put(i, c6948kO1);
        }
        C6604jO1 c6604jO1 = c6948kO1.h;
        C7980nO1 c7980nO12 = c6604jO1.d;
        if (c7980nO12 == null) {
            c7980nO12 = c6604jO1.a.f;
        }
        if (C6948kO1.e(c7980nO12, c7980nO1)) {
            return;
        }
        if (c6604jO1.c == null) {
            c6604jO1.a(c7980nO1);
        } else {
            c6604jO1.d = c7980nO1;
        }
    }
}
