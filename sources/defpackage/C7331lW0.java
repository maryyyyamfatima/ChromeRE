package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.components.gcm_driver.GCMDriver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lW0 */
/* loaded from: classes.dex */
public final class C7331lW0 implements InterfaceC2689Us {
    @Override // defpackage.InterfaceC2689Us
    public final void a() {
    }

    @Override // defpackage.InterfaceC2689Us
    public final boolean c(Context context, KF3 kf3) {
        return false;
    }

    @Override // defpackage.InterfaceC2689Us
    public final boolean b(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        C10763vW0 a = C10763vW0.a(kf3.b, new C8706pW0());
        if (a == null) {
            AbstractC4851eH1.a("GCMBackgroundTask", "The received bundle containing message data could not be validated.", new Object[0]);
            return false;
        }
        Object obj = ThreadUtils.a;
        C7629mN.a().d(false);
        GCMDriver.a(a);
        return false;
    }
}
