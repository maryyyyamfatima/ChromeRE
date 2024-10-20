package defpackage;

import java.util.Random;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.LauncherThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3490aK {
    public static C3490aK f;
    public boolean a;
    public ComponentCallbacks2C2974Wx b;
    public final C5348fk c = new C5348fk(0);
    public final Random d = new Random();
    public final WJ e = new Runnable() { // from class: WJ
        /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0088 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.WJ.run():void");
        }
    };

    public static C3490aK a() {
        if (f == null) {
            final C3490aK c3490aK = new C3490aK();
            f = c3490aK;
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: XJ
                @Override // java.lang.Runnable
                public final void run() {
                    final C3490aK c3490aK2 = C3490aK.this;
                    c3490aK2.getClass();
                    boolean z = true;
                    if (ApplicationStatus.getStateForApplication() != 1 && ApplicationStatus.getStateForApplication() != 2) {
                        z = false;
                    }
                    c3490aK2.a = z;
                    ApplicationStatus.d(new InterfaceC11522xj() { // from class: YJ
                        @Override // defpackage.InterfaceC11522xj
                        public final void n(int i) {
                            final C3490aK c3490aK3 = C3490aK.this;
                            c3490aK3.getClass();
                            if (i != 0) {
                                if (i == 1 || i == 2) {
                                    if (c3490aK3.a) {
                                        return;
                                    }
                                    c3490aK3.a = true;
                                    LauncherThread.b.postDelayed(c3490aK3.e, Math.round(Math.log(c3490aK3.d.nextDouble()) * (-1.0d) * 60000));
                                    return;
                                }
                                if (c3490aK3.a) {
                                    c3490aK3.a = false;
                                    LauncherThread.a(new Runnable() { // from class: ZJ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            LauncherThread.b.removeCallbacks(C3490aK.this.e);
                                        }
                                    });
                                }
                            }
                        }
                    });
                    if (c3490aK2.a) {
                        LauncherThread.b.postDelayed(c3490aK2.e, Math.round(Math.log(c3490aK2.d.nextDouble()) * (-1.0d) * 60000));
                    }
                }
            });
        }
        return f;
    }
}
