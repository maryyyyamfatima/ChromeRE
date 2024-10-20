package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aY */
/* loaded from: classes.dex */
public final class C3560aY {
    public final InterfaceC9989tE2 a;
    public final EX b;

    public C3560aY(C0806Gf0 c0806Gf0, C9069qa0 c9069qa0) {
        this.a = c0806Gf0;
        this.b = c9069qa0;
    }

    public final C12149zZ b(VY vy, final CommandOuterClass$Command commandOuterClass$Command, final SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, final C4883eN3 c4883eN3, VF0 vf0) {
        EX ex = this.b;
        final FX a = (!ex.isEnabled() || vf0 == null) ? null : ex.a(((OX0) vf0).d.a);
        final FX fx = a;
        InterfaceC11303x40 interfaceC11303x40 = new InterfaceC11303x40() { // from class: XX
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj) {
                C3560aY c3560aY = C3560aY.this;
                c3560aY.getClass();
                FX fx2 = fx;
                if (fx2 != null) {
                    fx2.b();
                }
                C4883eN3 c4883eN32 = c4883eN3;
                if (c4883eN32 != null) {
                    ZM3 zm3 = (ZM3) C3509aN3.p.j();
                    if (zm3.h) {
                        zm3.l();
                        zm3.h = false;
                    }
                    C3509aN3 c3509aN3 = (C3509aN3) zm3.g;
                    c3509aN3.getClass();
                    CommandOuterClass$Command commandOuterClass$Command2 = commandOuterClass$Command;
                    commandOuterClass$Command2.getClass();
                    c3509aN3.l = commandOuterClass$Command2;
                    c3509aN3.j |= 2;
                    SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = senderStateOuterClass$SenderState;
                    if (senderStateOuterClass$SenderState2 == null) {
                        senderStateOuterClass$SenderState2 = SenderStateOuterClass$SenderState.l;
                    }
                    if (zm3.h) {
                        zm3.l();
                        zm3.h = false;
                    }
                    C3509aN3 c3509aN32 = (C3509aN3) zm3.g;
                    c3509aN32.getClass();
                    senderStateOuterClass$SenderState2.getClass();
                    c3509aN32.m = senderStateOuterClass$SenderState2;
                    c3509aN32.j |= 4;
                    if (zm3.h) {
                        zm3.l();
                        zm3.h = false;
                    }
                    C3509aN3 c3509aN33 = (C3509aN3) zm3.g;
                    c3509aN33.getClass();
                    c3509aN33.k = c4883eN32;
                    c3509aN33.j |= 1;
                    C3509aN3 c3509aN34 = (C3509aN3) zm3.j();
                    DebuggerClient debuggerClient = (DebuggerClient) c3560aY.a.get();
                    C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
                    C11064wN3 d = AbstractC12203zi0.d();
                    if (c7633mN3.h) {
                        c7633mN3.l();
                        c7633mN3.h = false;
                    }
                    C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
                    c7977nN3.getClass();
                    d.getClass();
                    c7977nN3.m = d;
                    c7977nN3.j |= 1;
                    if (c7633mN3.h) {
                        c7633mN3.l();
                        c7633mN3.h = false;
                    }
                    C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
                    c7977nN32.getClass();
                    c3509aN34.getClass();
                    c7977nN32.l = c3509aN34;
                    c7977nN32.k = 4;
                    debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
                }
            }
        };
        vy.getClass();
        NV0 nv0 = TV0.d;
        MV0 mv0 = TV0.c;
        return new C12149zZ(new C12149zZ(new C12149zZ(vy, interfaceC11303x40, nv0, mv0), nv0, new InterfaceC11303x40() { // from class: YX
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj) {
                C4883eN3 c4883eN32 = c4883eN3;
                FX fx2 = a;
                C3560aY.this.a(c4883eN32, fx2, (Throwable) obj);
            }
        }, mv0), nv0, nv0, new H4() { // from class: ZX
            @Override // defpackage.H4
            public final void run() {
                C3560aY.this.a(c4883eN3, a, null);
            }
        });
    }

    public final void a(C4883eN3 c4883eN3, FX fx, Throwable th) {
        if (fx != null) {
            fx.a(th != null);
        }
        if (c4883eN3 != null) {
            XM3 xm3 = (XM3) YM3.l.j();
            if (xm3.h) {
                xm3.l();
                xm3.h = false;
            }
            YM3 ym3 = (YM3) xm3.g;
            ym3.getClass();
            ym3.k = c4883eN3;
            ym3.j |= 1;
            YM3 ym32 = (YM3) xm3.j();
            DebuggerClient debuggerClient = (DebuggerClient) this.a.get();
            C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
            C11064wN3 d = AbstractC12203zi0.d();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
            c7977nN3.getClass();
            d.getClass();
            c7977nN3.m = d;
            c7977nN3.j = 1 | c7977nN3.j;
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
            c7977nN32.getClass();
            ym32.getClass();
            c7977nN32.l = ym32;
            c7977nN32.k = 5;
            debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
        }
    }
}
