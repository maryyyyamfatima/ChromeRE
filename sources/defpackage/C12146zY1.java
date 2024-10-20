package defpackage;

import android.app.Activity;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zY1 */
/* loaded from: classes2.dex */
public final class C12146zY1 implements InterfaceC2271Rm1 {
    public InterfaceC2271Rm1 a;
    public final C7226lB0 b;
    public final String c;

    public C12146zY1(String str) {
        C7226lB0 c7226lB0 = new C7226lB0();
        this.c = str;
        this.b = c7226lB0;
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final boolean d(String str) {
        if (BundleUtils.d(V60.a, str)) {
            return true;
        }
        try {
            C7432ln3 c = C7432ln3.c();
            try {
                V60.a.getClassLoader().loadClass(this.c);
                c.close();
                return true;
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (ClassNotFoundException unused2) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final void a(Activity activity) {
        InterfaceC2271Rm1 c0169Bh3;
        if (this.a == null) {
            this.b.getClass();
            if (!BundleUtils.c()) {
                c0169Bh3 = new C0670Fe();
            } else {
                c0169Bh3 = new C0169Bh3();
            }
            this.a = c0169Bh3;
        }
        this.a.a(activity);
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final void b(String str, InterfaceC2401Sm1 interfaceC2401Sm1) {
        InterfaceC2271Rm1 c0169Bh3;
        if (this.a == null) {
            this.b.getClass();
            if (!BundleUtils.c()) {
                c0169Bh3 = new C0670Fe();
            } else {
                c0169Bh3 = new C0169Bh3();
            }
            this.a = c0169Bh3;
        }
        this.a.b(str, interfaceC2401Sm1);
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final void c(String str) {
        InterfaceC2271Rm1 c0169Bh3;
        if (this.a == null) {
            this.b.getClass();
            if (!BundleUtils.c()) {
                c0169Bh3 = new C0670Fe();
            } else {
                c0169Bh3 = new C0169Bh3();
            }
            this.a = c0169Bh3;
        }
        this.a.c(str);
    }
}
