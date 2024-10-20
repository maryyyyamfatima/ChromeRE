package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Kn4 {
    public final PC a;
    public Xj4 b;

    public static Kn4 c(PC pc) {
        if (pc == null) {
            return null;
        }
        return new Kn4(pc);
    }

    public Kn4(PC pc) {
        this.a = pc;
    }

    public final String i() {
        return f().a;
    }

    public final String s() {
        return f().b;
    }

    public final String o() {
        return f().c;
    }

    public String n() {
        return f().e;
    }

    public String p() {
        return f().f;
    }

    public final int d() {
        return f().g;
    }

    public final boolean j() {
        return !TextUtils.isEmpty(t());
    }

    public final String t() {
        return e().a;
    }

    public final long r() {
        if (this.a.j().f()) {
            return r0.j().d();
        }
        return 2147483648L;
    }

    public final long b() {
        if (f().j != null) {
            return r0.intValue();
        }
        return 2147483648L;
    }

    public Jn4 g() {
        return f().d;
    }

    public boolean k() {
        return f().m;
    }

    public boolean l() {
        return f().l;
    }

    public final String m() {
        return e().e;
    }

    public String a() {
        return e().h;
    }

    public Map h() {
        return e().j;
    }

    public final List q() {
        return e().m;
    }

    public final In4 f() {
        return this.a.F();
    }

    public final Xj4 e() {
        Xj4 xj4 = this.b;
        if (xj4 != null) {
            return xj4;
        }
        Xj4 E = this.a.E();
        this.b = E;
        if (E == null) {
            this.b = new Xj4(null, new Jn4(), false, 0, null, null, null, null, 2, new HashMap(), null, false, new ArrayList(), 0);
        }
        return this.b;
    }
}
