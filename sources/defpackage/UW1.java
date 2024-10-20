package defpackage;

import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UW1 {
    public final SparseArray a;
    public C0646Ez0 b;

    public UW1(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(C0646Ez0 c0646Ez0, int i, int i2) {
        int a = c0646Ez0.a(i);
        SparseArray sparseArray = this.a;
        UW1 uw1 = sparseArray == null ? null : (UW1) sparseArray.get(a);
        if (uw1 == null) {
            uw1 = new UW1(1);
            sparseArray.put(c0646Ez0.a(i), uw1);
        }
        if (i2 > i) {
            uw1.a(c0646Ez0, i + 1, i2);
        } else {
            uw1.b = c0646Ez0;
        }
    }
}
