package defpackage;

import java.security.AccessControlException;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10570uv4 implements InterfaceC4719dt4 {
    public final /* synthetic */ Hs4 a;

    public /* synthetic */ C10570uv4(Hs4 hs4) {
        this.a = hs4;
    }

    @Override // defpackage.InterfaceC4719dt4
    public final void a(boolean z) {
        if (!this.a.c0.a.isEmpty() && !z) {
            throw new AccessControlException("Permission denied: unauthorized usage of Ad Events API");
        }
    }

    @Override // defpackage.InterfaceC4719dt4
    public final void b(Zt4 zt4) {
        Wv4 wv4 = this.a.c0;
        synchronized (wv4) {
            Iterator it = new HashSet(wv4.a).iterator();
            while (it.hasNext()) {
                ((InterfaceC4719dt4) it.next()).b(zt4);
            }
        }
    }
}
