package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lA3 */
/* loaded from: classes.dex */
public final class C7224lA3 extends AbstractC0185Bl {
    public C8599pA3 h;
    public final /* synthetic */ C9284rA3 i;

    @Override // defpackage.AbstractC0185Bl
    public final void l() {
        C9284rA3 c9284rA3 = this.i;
        if (c9284rA3.m || h()) {
            return;
        }
        try {
            this.h = c9284rA3.t();
        } catch (IOException unused) {
            this.h = null;
        }
    }

    public C7224lA3(C9284rA3 c9284rA3) {
        this.i = c9284rA3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C9284rA3 c9284rA3 = this.i;
        if (c9284rA3.m || h()) {
            this.h = null;
            return;
        }
        if (c9284rA3.l != this) {
            return;
        }
        c9284rA3.l = null;
        Iterator it = c9284rA3.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                this.h = null;
                return;
            }
            ((C9219qz3) c11814ya2.next()).getClass();
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        if (this.h == null || h()) {
            return null;
        }
        this.i.q(this.h.a);
        return null;
    }
}
