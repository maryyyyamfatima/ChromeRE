package org.chromium.components.browser_ui.bottomsheet;

import defpackage.InterfaceC7458ls;
import defpackage.InterfaceC7697ma2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class k implements InterfaceC7458ls {
    public final /* synthetic */ m a;

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a.r;
    }

    public k(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        Boolean bool = Boolean.TRUE;
        m mVar = this.a;
        if (bool.equals(mVar.a.u.o().g)) {
            mVar.a.u.onBackPressed();
        } else {
            mVar.a.t(mVar.a.i(), 2, true);
        }
    }
}
