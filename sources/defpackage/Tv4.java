package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Tv4 implements InterfaceC2248Rh3 {
    public final InterfaceC6107hv4 a;
    public final InterfaceC6107hv4 b;
    public final InterfaceC6107hv4 c;

    public Tv4(InterfaceC6107hv4 interfaceC6107hv4, InterfaceC6107hv4 interfaceC6107hv42, InterfaceC6107hv4 interfaceC6107hv43) {
        this.a = interfaceC6107hv4;
        this.b = interfaceC6107hv42;
        this.c = interfaceC6107hv43;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 a(List list) {
        return h().a(list);
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set b() {
        return h().b();
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final void c(InterfaceC2768Vh3 interfaceC2768Vh3) {
        h().c(interfaceC2768Vh3);
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 d(List list) {
        return h().d(list);
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 e(C2638Uh3 c2638Uh3) {
        return h().e(c2638Uh3);
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set f() {
        return h().f();
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final void g(InterfaceC2768Vh3 interfaceC2768Vh3) {
        h().g(interfaceC2768Vh3);
    }

    public final InterfaceC2248Rh3 h() {
        return (InterfaceC2248Rh3) ((C6449iv4) (((C6449iv4) this.c).a() == null ? this.a : this.b)).a();
    }
}
