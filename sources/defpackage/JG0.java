package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class JG0 implements GG0 {
    public final Runnable a;
    public final long b;
    public final Handler c = new Handler(Looper.getMainLooper());

    public JG0(final long j, long j2) {
        this.a = new Runnable(j) { // from class: IG0
            public final long a;

            {
                this.a = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExternalSurfaceManager.nativeCallback(this.a);
            }
        };
        this.b = j2;
    }

    @Override // defpackage.GG0
    public final void b() {
        this.c.post(this.a);
    }

    @Override // defpackage.GG0
    public final void c() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.GG0
    public final void a() {
        this.c.removeCallbacks(this.a);
    }
}
