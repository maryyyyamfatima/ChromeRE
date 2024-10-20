package defpackage;

import J.N;
import android.content.Context;
import java.lang.ref.WeakReference;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class OA2 {
    public static boolean a(int i, Context context, SettingsLauncher settingsLauncher, boolean z, QB qb) {
        int M1vrjld5;
        if (!z && (M1vrjld5 = N.M1vrjld5()) != 0) {
            if (M1vrjld5 != 1) {
                if (M1vrjld5 != 2) {
                    return false;
                }
                NA2 na2 = new NA2(context);
                na2.show();
                new WeakReference(na2);
                return true;
            }
            C7928nE c7928nE = UN.a;
            boolean M6bsIDpc = N.M6bsIDpc("PrivacySandboxSettings3", "new-notice", false);
            if (i == 1 && M6bsIDpc) {
                if (qb == null) {
                    return false;
                }
                KA2 ka2 = new KA2(context, qb, settingsLauncher);
                ka2.j = false;
                m mVar = (m) qb;
                if (!mVar.p(ka2, true)) {
                    mVar.l(ka2, false, 0);
                    ka2.destroy();
                } else {
                    N.Mq9orIwX(0);
                    mVar.a(ka2.g);
                }
            } else if (i == 0 && !M6bsIDpc) {
                PA2 pa2 = new PA2(context, settingsLauncher);
                pa2.show();
                new WeakReference(pa2);
            }
            return true;
        }
        return false;
    }
}
