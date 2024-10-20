package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2791Vm1 {
    public static final long e = TimeUnit.MINUTES.toMillis(3);
    public AbstractC0185Bl a;
    public Callback b;
    public final boolean c;
    public C0197Bn1 d;

    public C2791Vm1(C1148Iv2 c1148Iv2, C1018Hv2 c1018Hv2, String str, boolean z) {
        this.a = c1148Iv2;
        this.b = c1018Hv2;
        this.c = z;
        if (!z) {
            new Handler().postDelayed(new RunnableC2661Um1(this), e);
            return;
        }
        C0197Bn1 c0197Bn1 = new C0197Bn1(Looper.getMainLooper(), new C2531Tm1(this));
        this.d = c0197Bn1;
        c0197Bn1.c = str;
        RunnableC12234zn1 runnableC12234zn1 = new RunnableC12234zn1(c0197Bn1);
        c0197Bn1.a = runnableC12234zn1;
        runnableC12234zn1.a = SystemClock.elapsedRealtime();
        c0197Bn1.g = true;
        c0197Bn1.b.postDelayed(runnableC12234zn1, c0197Bn1.d);
    }

    public final void a(int i, int i2) {
        Callback callback = this.b;
        if (callback != null) {
            callback.onResult(Integer.valueOf(i != -21 ? i != 6 ? 1 : 0 : 2));
            if (this.c) {
                EI2.h(C1537Lv2.b(i), 16, "WebApk.Install.GooglePlayInstallResult");
                if (i != 6 && i2 != 0) {
                    EI2.m(Math.min(i2, 10000), "WebApk.Install.GooglePlayErrorCode");
                    if (i2 == 908) {
                        new Ok4().c(AbstractC0185Bl.e);
                    }
                }
            } else {
                EI2.h(C1537Lv2.b(i), 16, "WebApk.Update.GooglePlayUpdateResult");
            }
            this.b = null;
        }
        this.a = null;
    }
}
