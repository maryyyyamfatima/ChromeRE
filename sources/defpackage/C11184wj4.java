package defpackage;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wj4 */
/* loaded from: classes4.dex */
public final class C11184wj4 extends WindowAndroid implements InterfaceC11179wj {
    public final InterfaceC0079Ap3 C;

    @Override // org.chromium.ui.base.WindowAndroid
    public final int y(PendingIntent pendingIntent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        return -1;
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final int z(Intent intent, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        return -1;
    }

    public C11184wj4(ChromeActivity chromeActivity, C6697jf4 c6697jf4, C8385oa2 c8385oa2) {
        super(chromeActivity, c6697jf4);
        this.C = c8385oa2;
        ApplicationStatus.e(this, chromeActivity);
        this.q = new C10841vj4();
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final WeakReference k() {
        return new WeakReference(V60.a((Context) this.j.get()));
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final ZX1 s() {
        return (ZX1) this.C.get();
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 5) {
            long j = this.h;
            if (j == 0) {
                return;
            }
            N.MMLuxHp6(j, this);
            return;
        }
        if (i == 2) {
            long j2 = this.h;
            if (j2 == 0) {
                return;
            }
            N.MbyUPhMo(j2, this);
        }
    }
}
