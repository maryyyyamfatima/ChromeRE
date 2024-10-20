package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.share.send_tab_to_self.TargetDeviceInfo;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I33 {
    public final Context a;
    public final WindowAndroid b;
    public final String c;
    public final String d;
    public final QB e;
    public final Profile f;

    public I33(Activity activity, WindowAndroid windowAndroid, String str, String str2, QB qb, Profile profile) {
        this.a = activity;
        this.b = windowAndroid;
        this.c = str;
        this.d = str2;
        this.e = qb;
        this.f = profile;
    }

    public final void a() {
        String str = this.c;
        Profile profile = this.f;
        AbstractC9095qe2 a = C33.a(str, profile);
        boolean c = a.c();
        Context context = this.a;
        QB qb = this.e;
        if (!c) {
            ((m) qb).p(new C10968w52(context), true);
            return;
        }
        int intValue = ((Integer) a.b()).intValue();
        if (intValue == 0) {
            List asList = Arrays.asList((TargetDeviceInfo[]) N.MVujpkId(profile));
            QB qb2 = this.e;
            ((m) qb2).p(new C2525Tl0(this.a, this.c, this.d, qb2, asList, this.f), true);
            return;
        }
        if (intValue == 1) {
            new C4085c3(this.b, qb, new G33(new Runnable() { // from class: D33
                public /* synthetic */ D33() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    I33 i33 = I33.this;
                    i33.getClass();
                    new H33(i33.e, i33.c, new Runnable() { // from class: E33
                        public /* synthetic */ E33() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            I33 i332 = I33.this;
                            m mVar = (m) i332.e;
                            mVar.l(mVar.h(), true, 0);
                            i332.a();
                        }
                    }, i33.f);
                }
            }, profile));
        } else {
            if (intValue != 2) {
                return;
            }
            ((m) qb).p(new C10968w52(context), true);
        }
    }
}
