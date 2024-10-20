package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bT3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3883bT3 {
    public final C0154Be3 a;
    public final C5578gP0 b;

    public C3883bT3(C0154Be3 c0154Be3, C5578gP0 c5578gP0) {
        SystemClock.elapsedRealtime();
        this.b = c5578gP0;
        this.a = c0154Be3;
        c0154Be3.j(new Callback() { // from class: ZS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final C3883bT3 c3883bT3 = C3883bT3.this;
                c3883bT3.getClass();
                SystemClock.elapsedRealtime();
                if (!booleanValue) {
                    O83.a.p("Chrome.FirstRun.SkippedByPolicy", false);
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: aT3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3883bT3 c3883bT32 = C3883bT3.this;
                        C5578gP0 c5578gP02 = c3883bT32.b;
                        C5234fP0 c5234fP0 = c5578gP02.f;
                        if (c5234fP0 != null) {
                            c5234fP0.a(true);
                        }
                        c5578gP02.d.clear();
                        c5578gP02.e.clear();
                        c3883bT32.a.a();
                    }
                });
            }
        });
    }
}
