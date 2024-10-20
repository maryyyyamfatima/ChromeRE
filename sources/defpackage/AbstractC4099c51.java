package defpackage;

import android.util.SparseIntArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4099c51 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public abstract int c(int i);

    public final void d() {
        this.a.clear();
    }

    public int b(int i, int i2) {
        int c = c(i);
        if (c == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int c2 = c(i4);
            i3 += c2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = c2;
            }
        }
        if (c + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public final int a(int i, int i2) {
        int c = c(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int c2 = c(i5);
            i3 += c2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = c2;
            }
        }
        return i3 + c > i2 ? i4 + 1 : i4;
    }
}
