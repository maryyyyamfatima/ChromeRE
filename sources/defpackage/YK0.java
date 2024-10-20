package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YK0 implements InterfaceC2173Qs3 {
    public final /* synthetic */ ZK0 a;

    @Override // defpackage.InterfaceC2173Qs3
    public final void a() {
        Iterator it = this.a.M.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC2173Qs3) c11814ya2.next()).a();
            }
        }
    }

    public YK0(ZK0 zk0) {
        this.a = zk0;
    }
}
