package org.chromium.mojo.system.impl;

import J.N;
import defpackage.AbstractC10624v51;
import defpackage.C7215l90;
import defpackage.InterfaceC10281u51;
import defpackage.Qj4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WatcherImpl {
    public long a = N.MXGgOw9k(this);
    public Qj4 b;

    public final void a(InterfaceC10281u51 interfaceC10281u51, C7215l90 c7215l90, Qj4 qj4) {
        long j = this.a;
        if (j != 0 && (interfaceC10281u51 instanceof AbstractC10624v51) && N.MOmBVeTt(this, j, ((AbstractC10624v51) interfaceC10281u51).a, c7215l90.a) == 0) {
            this.b = qj4;
        }
    }

    public final void onHandleReady(int i) {
        this.b.a(i);
    }
}
