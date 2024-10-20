package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class XD2 {
    public final HashSet a;
    public final int g;

    public XD2() {
        this(Integer.MIN_VALUE);
    }

    public XD2(int i) {
        this.a = new HashSet();
        this.g = i;
    }

    public final void b(InterfaceC9646sE2 interfaceC9646sE2) {
        this.a.add(interfaceC9646sE2);
    }

    public final void c(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9646sE2) it.next()).a(this.g, obj);
        }
    }
}
