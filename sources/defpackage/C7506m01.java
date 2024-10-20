package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m01 */
/* loaded from: classes.dex */
public final class C7506m01 implements InterfaceC5131f52, InterfaceC0494Du3, InterfaceC11522xj {
    public final C0624Eu3 g;
    public final Q83 h;
    public final C4403cy2 i;
    public Boolean k;
    public boolean m;
    public final C12157za2 a = new C12157za2();
    public final RunnableC6818k01 j = new Runnable() { // from class: k01
        @Override // java.lang.Runnable
        public final void run() {
            C7506m01.this.e();
        }
    };
    public final C7162l01 l = new P83() { // from class: l01
        @Override // defpackage.P83
        public final void a(String str) {
            C7506m01 c7506m01 = C7506m01.this;
            c7506m01.getClass();
            if (TextUtils.equals(str, "ui_theme_setting")) {
                c7506m01.e();
            }
        }
    };

    @Override // defpackage.InterfaceC5131f52
    public final /* synthetic */ boolean d() {
        return true;
    }

    public final void e() {
        boolean z = this.i.d;
        int f = O83.a.f(-1, "ui_theme_setting");
        int i = 1;
        if (f == -1) {
            f = Build.VERSION.SDK_INT < 29 ? 1 : 0;
        }
        boolean z2 = (f == 0 && (z || this.g.b)) || f == 2;
        Boolean bool = this.k;
        if (bool == null || z2 != bool.booleanValue()) {
            Boolean valueOf = Boolean.valueOf(z2);
            this.k = valueOf;
            Cif.m(valueOf.booleanValue() ? 2 : 1);
            Iterator it = this.a.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((InterfaceC4787e52) c11814ya2.next()).R();
                }
            }
            EI2.b("Android.DarkTheme.EnabledState", this.k.booleanValue());
            EI2.h(f, 3, "Android.DarkTheme.Preference.State");
            if (this.k.booleanValue()) {
                if (f == 2) {
                    i = 0;
                } else if (!z) {
                    i = 2;
                }
                EI2.h(i, 3, "Android.DarkTheme.EnabledReason");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k01] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l01] */
    public C7506m01(C0624Eu3 c0624Eu3, C4403cy2 c4403cy2, Q83 q83) {
        this.g = c0624Eu3;
        this.h = q83;
        this.i = c4403cy2;
        e();
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            c();
        }
        ApplicationStatus.d(this);
    }

    @Override // defpackage.InterfaceC5131f52
    public final boolean h() {
        Boolean bool = this.k;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC5131f52
    public final void b(InterfaceC4787e52 interfaceC4787e52) {
        this.a.a(interfaceC4787e52);
    }

    @Override // defpackage.InterfaceC5131f52
    public final void j(InterfaceC4787e52 interfaceC4787e52) {
        this.a.d(interfaceC4787e52);
    }

    @Override // defpackage.InterfaceC0494Du3
    public final void a() {
        e();
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        if (i == 1) {
            c();
            return;
        }
        if (i == 3 && this.m) {
            this.m = false;
            this.g.a.d(this);
            this.i.a.d(this.j);
            this.h.o(this.l);
        }
    }

    public final void c() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.g.a.a(this);
        this.i.a.a(this.j);
        this.h.a(this.l);
        e();
    }
}
