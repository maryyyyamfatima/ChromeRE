package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AN3 implements AutoCloseable {
    public final String a;
    public final int g;
    public long h;

    public AN3(String str, int i) {
        this.a = str;
        this.g = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.h;
        if (j == 0) {
            return;
        }
        this.h = 0L;
        String str = this.a;
        int i = this.g;
        if (i == 0) {
            EI2.n(SystemClock.uptimeMillis() - j, str);
        } else if (i == 1) {
            EI2.k(SystemClock.uptimeMillis() - j, str);
        } else {
            if (i != 2) {
                return;
            }
            EI2.n(SystemClock.currentThreadTimeMillis() - j, str);
        }
    }
}
