package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537Lv2 {
    public InterfaceC2101Qe1 b;
    public boolean d;
    public final HashMap e = new HashMap();
    public final Context a = V60.a;
    public final ServiceConnectionC1408Kv2 c = new ServiceConnectionC1408Kv2(this);

    public static int b(int i) {
        if (i == -4) {
            return 6;
        }
        if (i == -3) {
            return 5;
        }
        if (i == -2) {
            return 4;
        }
        if (i == -1) {
            return 3;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 8;
        }
        if (i == 6) {
            return 0;
        }
        switch (i) {
            case -26:
                return 15;
            case -25:
                return 14;
            case -24:
                return 13;
            case -23:
                return 12;
            case -22:
                return 11;
            case -21:
                return 10;
            case -20:
                return 2;
            default:
                return 9;
        }
    }

    public static void a(C1537Lv2 c1537Lv2) {
        c1537Lv2.getClass();
        Object obj = ThreadUtils.a;
        if (c1537Lv2.b != null) {
            c1537Lv2.a.unbindService(c1537Lv2.c);
            c1537Lv2.b = null;
        }
        c1537Lv2.d = false;
        Iterator it = new ArrayList(c1537Lv2.e.values()).iterator();
        while (it.hasNext()) {
            ((C2791Vm1) it.next()).a(1, 0);
        }
    }

    public final void c(String str, int i, String str2, String str3, Callback callback, boolean z) {
        Object obj = ThreadUtils.a;
        Bundle bundle = new Bundle();
        bundle.putInt("version_number", i);
        bundle.putString("title", str2);
        bundle.putParcelable("notification_intent", new Intent());
        bundle.putString("wam_token", str3);
        C2791Vm1 c2791Vm1 = new C2791Vm1(new C1148Iv2(this, str, bundle), new C1018Hv2(this, str, callback), str, z);
        this.e.put(str, c2791Vm1);
        InterfaceC2101Qe1 interfaceC2101Qe1 = this.b;
        if (interfaceC2101Qe1 != null) {
            c2791Vm1.a.c(AbstractC0185Bl.e);
            return;
        }
        boolean z2 = true;
        if (interfaceC2101Qe1 == null && !this.d) {
            Intent intent = new Intent("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
            intent.setPackage("com.android.vending");
            try {
                boolean bindService = this.a.bindService(intent, this.c, 1);
                this.d = bindService;
                if (bindService) {
                    z2 = bindService;
                }
            } catch (SecurityException e) {
                AbstractC4851eH1.f("PlayInstall", "Failed to connect to play install service.", e);
            }
            z2 = false;
        }
        if (z2) {
            return;
        }
        d(-20, 0, str);
    }

    public final void d(int i, int i2, String str) {
        C2791Vm1 c2791Vm1 = (C2791Vm1) this.e.get(str);
        if (c2791Vm1 == null) {
            return;
        }
        c2791Vm1.a(i, i2);
    }
}
