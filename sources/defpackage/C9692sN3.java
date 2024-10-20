package defpackage;

import android.os.SystemClock;
import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sN3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9692sN3 implements Closeable {
    public static C9692sN3 g;
    public static long h;
    public final long a = SystemClock.uptimeMillis();

    public C9692sN3() {
        if (g == null) {
            g = this;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (g == this) {
            g = null;
            h = (SystemClock.uptimeMillis() - this.a) + h;
        }
    }
}
