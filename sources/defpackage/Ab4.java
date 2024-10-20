package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ab4 {
    public static void a(InterfaceC6525j84 interfaceC6525j84, C10409uU c10409uU, Vb4 vb4) {
        if (c10409uU == null || !(interfaceC6525j84 instanceof C2801Vo1)) {
            return;
        }
        C2801Vo1 c2801Vo1 = (C2801Vo1) interfaceC6525j84;
        Set<C2664Un> singleton = Collections.singleton(new C2664Un(Cb4.a, vb4));
        c2801Vo1.getClass();
        VT vt = c10409uU.l;
        if (vt == null) {
            vt = VT.v;
        }
        Ef4 ef4 = (Ef4) Ff4.y.j();
        if (ef4.h) {
            ef4.l();
            ef4.h = false;
        }
        Ff4 ff4 = (Ff4) ef4.g;
        ff4.k |= 16;
        ff4.p = 1;
        if (ef4.h) {
            ef4.l();
            ef4.h = false;
        }
        Ff4 ff42 = (Ff4) ef4.g;
        ff42.getClass();
        ff42.l = vt;
        ff42.k |= 1;
        for (C2664Un c2664Un : singleton) {
            ef4.p(c2664Un.a, c2664Un.b);
        }
        c2801Vo1.a(c10409uU, ef4, null);
    }
}
