package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.LocationRequest;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TG1 extends RG1 {
    public final C4502dG0 c;

    public TG1(C4502dG0 c4502dG0) {
        this.c = c4502dG0;
    }

    @Override // defpackage.RG1
    public final boolean a() {
        Context context = V60.a;
        this.c.getClass();
        int d = C4502dG0.d(context);
        return ((d == 1 || d == 9) || d()) ? false : true;
    }

    @Override // defpackage.RG1
    public final Intent c() {
        if (!AbstractC4774e31.a(V60.a)) {
            Intent intent = new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
            if (AbstractC3017Xf2.b(intent, 65536).isEmpty()) {
                intent = null;
            } else {
                intent.setFlags(268435456);
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
                if (b != null) {
                    intent.putExtra("account", b);
                }
            }
            if (intent != null) {
                return intent;
            }
        }
        return super.c();
    }

    @Override // defpackage.RG1
    public final boolean d() {
        return super.d() && AbstractC4774e31.a(V60.a);
    }

    @Override // defpackage.RG1
    public final void e(int i, WindowAndroid windowAndroid, NG1 ng1) {
        LocationRequest locationRequest = SG1.k;
        windowAndroid.getClass();
        C9571s11 c9571s11 = new C9571s11(V60.a);
        c9571s11.a(MG1.a);
        N11 b = c9571s11.b();
        SG1 sg1 = new SG1(i, windowAndroid, ng1, b);
        b.j(sg1);
        b.k(sg1);
        b.o();
    }
}
