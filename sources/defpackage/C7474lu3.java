package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.download.DownloadInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lu3 */
/* loaded from: classes.dex */
public final class C7474lu3 {
    public C2690Us0 a;

    public final void a(C7130ku3 c7130ku3) {
        C9682sL3 c9682sL3 = AbstractC9339rL3.a;
        C6161i50 c6161i50 = c7130ku3.b.z;
        RunnableC6786ju3 runnableC6786ju3 = new Runnable() { // from class: ju3
            public final /* synthetic */ C7130ku3 g;

            public /* synthetic */ RunnableC6786ju3(C7130ku3 c7130ku32) {
                r2 = c7130ku32;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 589
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC6786ju3.run():void");
            }
        };
        C5049er2 c5049er2 = new C5049er2(c6161i50, c7130ku32.c, runnableC6786ju3);
        c9682sL3.getClass();
        C5049er2 b = c9682sL3.b(c6161i50);
        if (b != null) {
            c5049er2.d = b.d;
        }
        if (c9682sL3.c) {
            c9682sL3.a.add(c5049er2);
            return;
        }
        c9682sL3.c = true;
        runnableC6786ju3.run();
        c9682sL3.b.postDelayed(new RunnableC8997qL3(c9682sL3), 350L);
    }

    public final void c(C6161i50 c6161i50) {
        AbstractC9339rL3.a.b(c6161i50);
        C2690Us0 b = b();
        C4372ct0 c4372ct0 = b.d;
        C3685at0 b2 = c4372ct0.b(c6161i50);
        if (b2 == null) {
            return;
        }
        Context context = V60.a;
        C11914yr0 c11914yr0 = b.e;
        int i = b2.a;
        c11914yr0.d(3, i, null, context);
        b.b.a.b(i, null);
        c4372ct0.c(c6161i50);
        b.a.remove(c6161i50);
    }

    public final C2690Us0 b() {
        if (this.a == null) {
            this.a = AbstractC2560Ts0.a;
        }
        return this.a;
    }

    public final void d(DownloadInfo downloadInfo) {
        if (downloadInfo.H != null) {
            return;
        }
        a(new C7130ku3(3, downloadInfo, 0));
    }

    public final void e(DownloadInfo downloadInfo, long j, boolean z, boolean z2) {
        if (downloadInfo.H != null) {
            return;
        }
        C7130ku3 c7130ku3 = new C7130ku3(2, downloadInfo, 0);
        c7130ku3.e = j;
        c7130ku3.f = z;
        c7130ku3.g = z2;
        a(c7130ku3);
    }
}
