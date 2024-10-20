package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ps1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041Ps1 extends AbstractC11620y {
    public final /* synthetic */ Iterator h;
    public final /* synthetic */ InterfaceC6808jy2 i;

    public C2041Ps1(Iterator it, InterfaceC6808jy2 interfaceC6808jy2) {
        this.h = it;
        this.i = interfaceC6808jy2;
    }

    @Override // defpackage.AbstractC11620y
    public final Object a() {
        Object next;
        do {
            Iterator it = this.h;
            if (!it.hasNext()) {
                this.a = 3;
                return null;
            }
            next = it.next();
        } while (!this.i.apply(next));
        return next;
    }
}
