package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class qw4 implements Runnable {
    public final /* synthetic */ C8771ph3 a;

    public qw4(C8771ph3 c8771ph3) {
        this.a = c8771ph3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
