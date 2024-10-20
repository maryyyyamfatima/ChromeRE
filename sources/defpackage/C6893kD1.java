package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6893kD1 implements InterfaceC11007wC1, InterfaceC12197zh0 {
    public InterfaceC11007wC1 a;

    @Override // defpackage.InterfaceC12197zh0
    public final void c() {
    }

    @Override // defpackage.InterfaceC12197zh0
    public final void reset() {
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        InterfaceC11007wC1 interfaceC11007wC1 = this.a;
        if (interfaceC11007wC1 == null) {
            return;
        }
        interfaceC11007wC1.b(arrayList);
    }

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.a = interfaceC11007wC1;
        return interfaceC11007wC1;
    }
}
