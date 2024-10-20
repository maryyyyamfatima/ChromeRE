package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3088Xt3 extends LongSparseArray {
    public final Object a;

    @Override // android.util.LongSparseArray
    public final void put(long j, Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        synchronized (this.a) {
            super.put(j, sparseArray);
        }
    }

    public C3088Xt3(int i, Object obj) {
        super(i);
        this.a = obj;
    }

    @Override // android.util.LongSparseArray
    public final Object get(long j) {
        synchronized (this.a) {
            SparseArray sparseArray = (SparseArray) super.get(j);
            if (sparseArray != null && !(sparseArray instanceof C3218Yt3)) {
                C3218Yt3 c3218Yt3 = new C3218Yt3(sparseArray);
                synchronized (this.a) {
                    super.put(j, c3218Yt3);
                }
                return c3218Yt3;
            }
            return sparseArray;
        }
    }
}
