package defpackage;

import android.os.SystemClock;
import android.util.SparseLongArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jh3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6708jh3 {
    public final boolean a;
    public final SparseLongArray b;

    public C6708jh3(boolean z) {
        SparseLongArray sparseLongArray = new SparseLongArray();
        this.b = sparseLongArray;
        this.a = z;
        sparseLongArray.put(0, SystemClock.uptimeMillis());
    }
}
