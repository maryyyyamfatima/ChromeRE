package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8157nt4 {
    public final HashSet a = new HashSet();

    public final synchronized void a(Zs4 zs4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10160tk3) it.next()).a(zs4);
        }
    }
}
