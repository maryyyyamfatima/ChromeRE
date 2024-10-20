package defpackage;

import android.content.Intent;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.components.gcm_driver.GCMDriver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6987kW0 extends AbstractC0819Gh3 {
    @Override // defpackage.AbstractC0819Gh3
    public final void a(Intent intent) {
        final C10763vW0 a = C10763vW0.a(intent.getExtras(), new C8706pW0());
        if (a == null) {
            AbstractC4851eH1.a("GCMBackgroundService", "The received bundle containing message data could not be validated.", new Object[0]);
        } else {
            PostTask.f(AbstractC5103f04.a, new Runnable() { // from class: jW0
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj = ThreadUtils.a;
                    C7629mN.a().d(false);
                    GCMDriver.a(C10763vW0.this);
                }
            });
        }
    }
}
