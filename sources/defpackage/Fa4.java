package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Fa4 {
    public final Ls4 a;
    public final Q94 b;
    public final Ss4 c;
    public InterfaceC9989tE2 d;

    public Fa4(Ss4 ss4, Ls4 ls4, Q94 q94) {
        this.c = ss4;
        this.a = ls4;
        this.b = q94;
    }

    public final Ks4 a(Activity activity, ViewGroup viewGroup, C7017kb4 c7017kb4) {
        C6673jb4 c6673jb4;
        if (((R94) this.b).a(c7017kb4)) {
            if (c7017kb4.k == 1) {
                Ss4 ss4 = (Ss4) this.d.get();
                if (c7017kb4.k == 1) {
                    c6673jb4 = (C6673jb4) c7017kb4.l;
                } else {
                    c6673jb4 = C6673jb4.l;
                }
                C6673jb4 c6673jb42 = c6673jb4;
                C3697av0 c3697av0 = new C3697av0(c7017kb4.n);
                this.a.getClass();
                return Ls4.b(ss4, activity, c6673jb42, false, c3697av0, viewGroup);
            }
        }
        return null;
    }
}
