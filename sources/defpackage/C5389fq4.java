package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fq4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5389fq4 {
    public static final C5389fq4 b;
    public final Up4 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = Tp4.q;
        } else {
            b = Up4.b;
        }
    }

    public C5389fq4(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new Tp4(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new Rp4(this, windowInsets);
        } else if (i >= 28) {
            this.a = new Mp4(this, windowInsets);
        } else {
            this.a = new Jp4(this, windowInsets);
        }
    }

    public C5389fq4() {
        this.a = new Up4(this);
    }

    public static C5389fq4 g(View view, WindowInsets windowInsets) {
        C5389fq4 c5389fq4 = new C5389fq4(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (view.isAttachedToWindow()) {
                C5389fq4 f = Ec4.f(view);
                Up4 up4 = c5389fq4.a;
                up4.p(f);
                up4.d(view.getRootView());
            }
        }
        return c5389fq4;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5389fq4)) {
            return false;
        }
        return Objects.equals(this.a, ((C5389fq4) obj).a);
    }

    public final int hashCode() {
        Up4 up4 = this.a;
        if (up4 == null) {
            return 0;
        }
        return up4.hashCode();
    }

    public final WindowInsets f() {
        Up4 up4 = this.a;
        if (up4 instanceof Ip4) {
            return ((Ip4) up4).c;
        }
        return null;
    }

    public static C2141Qm1 e(C2141Qm1 c2141Qm1, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c2141Qm1.a - i);
        int max2 = Math.max(0, c2141Qm1.b - i2);
        int max3 = Math.max(0, c2141Qm1.c - i3);
        int max4 = Math.max(0, c2141Qm1.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c2141Qm1 : C2141Qm1.b(max, max2, max3, max4);
    }
}
