package defpackage;

import android.content.Context;
import android.content.Intent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Ji4 extends Hi4 {
    @Override // defpackage.Hi4
    public final void c(Intent intent) {
    }

    @Override // defpackage.Hi4
    public final Intent e(Intent intent) {
        return intent;
    }

    @Override // defpackage.Hi4
    public final Intent d(Context context, Intent intent) {
        VrModuleProvider.b().getClass();
        if (AbstractC7403li4.c()) {
            return intent;
        }
        Mi4.a.d(new Oi4(new InterfaceC2401Sm1() { // from class: Ii4
            @Override // defpackage.InterfaceC2401Sm1
            public final void a(boolean z) {
            }
        }));
        PostTask.b(AbstractC5103f04.a, new RunnableC10492ui4(context), 2000L);
        return null;
    }
}
