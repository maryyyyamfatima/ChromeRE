package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: no2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8125no2 implements InterfaceC7093ko2 {
    public static C8125no2 b;
    public final HashMap a = new HashMap();

    @Override // defpackage.InterfaceC7093ko2
    public final void a(InterfaceC6749jo2 interfaceC6749jo2) {
        HashMap hashMap = this.a;
        C7781mo2 c7781mo2 = new C7781mo2(this, new HashSet(hashMap.values()), interfaceC6749jo2);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC7093ko2) it.next()).a(c7781mo2);
        }
    }

    public final void b(InterfaceC7093ko2 interfaceC7093ko2, String str) {
        if (interfaceC7093ko2 == null) {
            return;
        }
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, interfaceC7093ko2);
    }
}
