package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DP2 {
    public abstract void c(int i);

    public abstract void d(Typeface typeface);

    public final void a(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: CP2
            @Override // java.lang.Runnable
            public final void run() {
                DP2.this.c(i);
            }
        });
    }

    public final void b(final Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: BP2
            @Override // java.lang.Runnable
            public final void run() {
                DP2.this.d(typeface);
            }
        });
    }
}
