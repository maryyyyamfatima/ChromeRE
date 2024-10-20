package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4881eN1 implements InterfaceC3857bO2 {
    public final /* synthetic */ C6257iN1 a;

    public C4881eN1(C6257iN1 c6257iN1) {
        this.a = c6257iN1;
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void a(long j, int i, C5913hN1 c5913hN1) {
        if (i != 0) {
            this.a.v.a(new IOException("storing session is timeout"));
        }
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void b(long j) {
        this.a.v.b(null);
    }
}
