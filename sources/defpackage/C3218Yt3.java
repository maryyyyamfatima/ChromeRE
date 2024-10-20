package defpackage;

import android.graphics.Typeface;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3218Yt3 extends SparseArray {
    public final Object a = new Object();
    public final SparseArray g;

    @Override // android.util.SparseArray
    public final void put(int i, Object obj) {
        Typeface typeface = (Typeface) obj;
        synchronized (this.a) {
            this.g.put(i, typeface);
        }
    }

    public C3218Yt3(SparseArray sparseArray) {
        this.g = sparseArray;
    }

    @Override // android.util.SparseArray
    public final Object get(int i) {
        Typeface typeface;
        synchronized (this.a) {
            typeface = (Typeface) this.g.get(i);
        }
        return typeface;
    }
}
