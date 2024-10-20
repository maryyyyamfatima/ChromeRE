package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8367oX implements InterfaceC8710pX {
    public final AbstractC0562Ei1 a;
    public final Map b = Collections.synchronizedMap(new HashMap());

    public C8367oX(AbstractC0562Ei1 abstractC0562Ei1) {
        this.a = abstractC0562Ei1;
    }

    @Override // defpackage.InterfaceC8710pX
    public final C2794Vn a(C2794Vn c2794Vn) {
        C0172Bi1 listIterator = this.a.listIterator(0);
        C2794Vn c2794Vn2 = c2794Vn;
        while (listIterator.hasNext()) {
            c2794Vn2 = ((InterfaceC8710pX) listIterator.next()).a(c2794Vn);
        }
        synchronized (this.b) {
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                c2794Vn2 = ((InterfaceC8710pX) it.next()).a(c2794Vn);
            }
        }
        return c2794Vn2;
    }
}
