package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6108hw extends AbstractC12087zM2 {
    public final /* synthetic */ AbstractC6450iw a;

    public C6108hw(AbstractC6450iw abstractC6450iw) {
        this.a = abstractC6450iw;
    }

    @Override // defpackage.AbstractC12087zM2
    public final void l() {
        this.a.j();
    }

    @Override // defpackage.AbstractC12087zM2
    public final void b() {
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5764gw) it.next()).j();
        }
    }
}
