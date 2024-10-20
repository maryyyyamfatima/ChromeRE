package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8320oN2 {
    public final SparseArray a = new SparseArray();
    public final HashMap b = new HashMap();
    public final boolean c;
    public final int d;
    public int e;

    public C8320oN2(int i, boolean z) {
        this.c = z;
        this.d = i;
        this.e = i + 1;
    }

    public final void a(InterfaceC7976nN2 interfaceC7976nN2) {
        int i;
        int i2;
        if (interfaceC7976nN2.g()) {
            InterfaceC9671sJ2.d.getClass();
            if ("AdapterProxyRenderInfo".equals(interfaceC7976nN2.getName())) {
                return;
            }
            boolean z = this.c;
            if (z && !interfaceC7976nN2.c()) {
                throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
            }
            if (!z && interfaceC7976nN2.c()) {
                throw new IllegalStateException("You must enable custom viewTypes to provide customViewType in ViewRenderInfo.");
            }
            if (!z || this.d != interfaceC7976nN2.f()) {
                interfaceC7976nN2.n();
                HashMap hashMap = this.b;
                if (hashMap.containsKey(null)) {
                    i2 = ((Integer) hashMap.get(null)).intValue();
                } else {
                    if (interfaceC7976nN2.c()) {
                        i = interfaceC7976nN2.f();
                    } else {
                        i = this.e;
                        this.e = i + 1;
                    }
                    this.a.put(i, null);
                    hashMap.put(null, Integer.valueOf(i));
                    i2 = i;
                }
                if (interfaceC7976nN2.c()) {
                    return;
                }
                interfaceC7976nN2.k(i2);
                return;
            }
            throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
        }
    }
}
