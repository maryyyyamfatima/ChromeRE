package org.chromium.chrome.browser.vr;

import J.N;
import com.android.chrome.R;
import defpackage.AbstractC7403li4;
import defpackage.C10431uY1;
import defpackage.C9463ri4;
import defpackage.CY1;
import defpackage.DY1;
import defpackage.Hi4;
import defpackage.InterfaceC2401Sm1;
import defpackage.InterfaceC9121qi4;
import defpackage.Li4;
import defpackage.Mi4;
import defpackage.Oi4;
import defpackage.Pi4;
import java.util.ArrayList;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class VrModuleProvider implements CY1 {
    public static InterfaceC9121qi4 c;
    public static final ArrayList d = new ArrayList();
    public long a;
    public Tab b;

    public static boolean isModuleInstalled() {
        return Mi4.a.g();
    }

    public static void e() {
        if (BundleUtils.c()) {
            C10431uY1 c10431uY1 = Mi4.a;
            if (!c10431uY1.g() && b().n()) {
                c10431uY1.e();
            }
        }
    }

    public static AbstractC7403li4 b() {
        return c().b();
    }

    public static Hi4 d() {
        return c().a();
    }

    public static void f(Li4 li4) {
        d.add(li4);
    }

    public static void g(Li4 li4) {
        d.remove(li4);
    }

    public static InterfaceC9121qi4 c() {
        if (c == null) {
            C10431uY1 c10431uY1 = Mi4.a;
            if (!c10431uY1.g()) {
                c = new C9463ri4();
            } else {
                c = (InterfaceC9121qi4) c10431uY1.b();
            }
        }
        return c;
    }

    public static VrModuleProvider create(long j) {
        return new VrModuleProvider(j);
    }

    @Override // defpackage.CY1
    public final void a(boolean z) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        if (z) {
            installModule(this.b);
        } else {
            N.Mmw1DU8y(j, this, false);
        }
    }

    public VrModuleProvider(long j) {
        this.a = j;
    }

    public final void onNativeDestroy() {
        this.a = 0L;
    }

    public final void installModule(Tab tab) {
        this.b = tab;
        final DY1 dy1 = new DY1(new Pi4(this), R.string.0_resource_name_obfuscated_res_0x7f140bb0, this);
        dy1.b();
        Mi4.a.d(new Oi4(new InterfaceC2401Sm1() { // from class: Ni4
            @Override // defpackage.InterfaceC2401Sm1
            public final void a(boolean z) {
                VrModuleProvider vrModuleProvider = VrModuleProvider.this;
                if (vrModuleProvider.a != 0) {
                    DY1 dy12 = dy1;
                    if (!z) {
                        dy12.a();
                    } else {
                        dy12.c();
                        N.Mmw1DU8y(vrModuleProvider.a, vrModuleProvider, z);
                    }
                }
            }
        }));
    }
}
