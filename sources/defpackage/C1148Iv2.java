package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148Iv2 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ C1537Lv2 j;

    public C1148Iv2(C1537Lv2 c1537Lv2, String str, Bundle bundle) {
        this.j = c1537Lv2;
        this.h = str;
        this.i = bundle;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            this.j.d(num.intValue(), 0, this.h);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        int i;
        int i2;
        String str = this.h;
        Bundle bundle = this.i;
        C1537Lv2 c1537Lv2 = this.j;
        InterfaceC2101Qe1 interfaceC2101Qe1 = c1537Lv2.b;
        if (interfaceC2101Qe1 != null) {
            try {
                Bundle a = ((C1841Oe1) interfaceC2101Qe1).a(bundle, c1537Lv2.a.getPackageName(), str);
                i = a.getInt("status_code");
                if (i == -4) {
                    Bundle bundle2 = a.getBundle("error");
                    String string = bundle2 != null ? bundle2.getString("reason") : null;
                    if ("install_policy_disabled".equals(string)) {
                        i2 = -22;
                    } else if ("unknown_account".equals(string)) {
                        i2 = -23;
                    } else if ("network_error".equals(string)) {
                        i2 = -24;
                    } else if ("error_resolving_webapk".equals(string)) {
                        i2 = -25;
                    } else if ("not_google_signed".equals(string)) {
                        i2 = -26;
                    }
                    i = i2;
                }
            } catch (RemoteException e) {
                AbstractC4851eH1.f("PlayInstall", "Failed to install WebAPK with package name : %s.", str, e);
            }
            return Integer.valueOf(i);
        }
        i = -20;
        return Integer.valueOf(i);
    }
}
