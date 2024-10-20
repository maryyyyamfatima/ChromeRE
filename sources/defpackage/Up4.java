package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Up4 {
    public static final C5389fq4 b;
    public final C5389fq4 a;

    public void d(View view) {
    }

    public C3065Xp0 e() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C2141Qm1[] c2141Qm1Arr) {
    }

    public void p(C5389fq4 c5389fq4) {
    }

    public void q(C2141Qm1 c2141Qm1) {
    }

    public Up4(C5389fq4 c5389fq4) {
        this.a = c5389fq4;
    }

    public C5389fq4 c() {
        return this.a;
    }

    public C5389fq4 b() {
        return this.a;
    }

    public C5389fq4 a() {
        return this.a;
    }

    public C2141Qm1 j() {
        return C2141Qm1.e;
    }

    public C2141Qm1 h() {
        return C2141Qm1.e;
    }

    public C2141Qm1 i() {
        return j();
    }

    public C2141Qm1 g() {
        return j();
    }

    public C2141Qm1 k() {
        return j();
    }

    public C5389fq4 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public C2141Qm1 f(int i) {
        return C2141Qm1.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Up4)) {
            return false;
        }
        Up4 up4 = (Up4) obj;
        return n() == up4.n() && m() == up4.m() && Objects.equals(j(), up4.j()) && Objects.equals(h(), up4.h()) && Objects.equals(e(), up4.e());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    static {
        Hp4 c11563xp4;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c11563xp4 = new Gp4();
        } else if (i >= 29) {
            c11563xp4 = new Ep4();
        } else {
            c11563xp4 = new C11563xp4();
        }
        b = c11563xp4.b().a.a().a.b().a.c();
    }
}
