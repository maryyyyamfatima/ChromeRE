package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fV3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5267fV3 implements InterfaceC9395rX {
    public final InterfaceC9790sg0 a;
    public final boolean b = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [XU3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [YU3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ZU3] */
    /* JADX WARN: Type inference failed for: r6v3, types: [cV3] */
    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final WU3 wu3 = (WU3) obj;
        InterfaceC1377Kp1 interfaceC1377Kp1 = wu3.k;
        if (interfaceC1377Kp1 == null) {
            throw new NullPointerException("source is null");
        }
        return new C12149zZ(new C8033nZ(new C0404Dc3(new C1184Jc3(new C1184Jc3(new C3781b92(new E92(new J92(interfaceC1377Kp1), new DV0() { // from class: XU3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                Object obj3;
                final C9047qV3 c9047qV3 = (C9047qV3) obj2;
                C5267fV3 c5267fV3 = C5267fV3.this;
                c5267fV3.getClass();
                int i = c9047qV3.k;
                if (i == 2) {
                    C5499g92 a = c5267fV3.a.a(i == 2 ? (String) c9047qV3.l : "");
                    a.getClass();
                    return new C1184Jc3(new C8935q92(a, null), new DV0() { // from class: eV3
                        @Override // defpackage.DV0
                        public final Object apply(Object obj4) {
                            ZD zd;
                            AbstractC9095qe2 abstractC9095qe2 = (AbstractC9095qe2) obj4;
                            String str = C9047qV3.this.m;
                            if (abstractC9095qe2.c() && ((byte[]) abstractC9095qe2.b()).length > 0) {
                                zd = AbstractC4147cE.d((byte[]) abstractC9095qe2.b());
                            } else {
                                zd = AbstractC4147cE.g;
                            }
                            return new C12204zi1(str, zd);
                        }
                    });
                }
                if (!(i == 3)) {
                    throw new AssertionError();
                }
                String str = c9047qV3.m;
                if (i == 3) {
                    obj3 = (AbstractC4147cE) c9047qV3.l;
                } else {
                    obj3 = AbstractC4147cE.g;
                }
                return new C0924Hc3(new C12204zi1(str, obj3));
            }
        }), new RV0(new DV0() { // from class: ZU3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                return (AbstractC4147cE) ((Map.Entry) obj2).getValue();
            }
        }, new DV0() { // from class: YU3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                return (String) ((Map.Entry) obj2).getKey();
            }
        })), new DV0() { // from class: aV3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                Map map = (Map) obj2;
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((C2924Wn) AbstractC9053qX.this).e;
                C7673mV3 c7673mV3 = (C7673mV3) C8361oV3.n.j();
                if (c7673mV3.h) {
                    c7673mV3.l();
                    c7673mV3.h = false;
                }
                C8361oV3 c8361oV3 = (C8361oV3) c7673mV3.g;
                OL1 ol1 = c8361oV3.k;
                if (!ol1.a) {
                    c8361oV3.k = ol1.c();
                }
                c8361oV3.k.putAll(map);
                if (senderStateOuterClass$SenderState != null) {
                    if (c7673mV3.h) {
                        c7673mV3.l();
                        c7673mV3.h = false;
                    }
                    C8361oV3 c8361oV32 = (C8361oV3) c7673mV3.g;
                    c8361oV32.getClass();
                    c8361oV32.l = senderStateOuterClass$SenderState;
                    c8361oV32.j |= 1;
                }
                return (C8361oV3) c7673mV3.i();
            }
        }), new DV0() { // from class: bV3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                C8361oV3 c8361oV3 = (C8361oV3) obj2;
                C5267fV3 c5267fV3 = C5267fV3.this;
                c5267fV3.getClass();
                C4739dx0 c4739dx0 = wu3.l;
                if (c4739dx0 == null) {
                    c4739dx0 = C4739dx0.j;
                }
                try {
                    C3709ax0 a = EkoProcessor.a(c4739dx0.toByteArray(), c8361oV3.toByteArray(), c5267fV3.b);
                    Status status = a.a;
                    if (!status.b()) {
                        throw new C10239ty0("Eko processor error: " + status.getDescription());
                    }
                    return a.b;
                } catch (IOException e) {
                    throw new C10239ty0("Invalid eko template", e);
                }
            }
        }), new InterfaceC11303x40() { // from class: cV3
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj2) {
                C5267fV3 c5267fV3 = C5267fV3.this;
                c5267fV3.getClass();
                String str = wu3.m;
                c5267fV3.a.b(str, (byte[]) obj2);
            }
        })), new InterfaceC11303x40() { // from class: dV3
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj2) {
                WU3 wu32 = WU3.this;
                int i = wu32.j;
                HashSet hashSet = new HashSet();
                for (C9047qV3 c9047qV3 : wu32.k) {
                    int i2 = c9047qV3.j;
                    hashSet.add(c9047qV3.m);
                }
            }
        }, TV0.d, TV0.c);
    }

    public C5267fV3(InterfaceC9790sg0 interfaceC9790sg0) {
        this.a = interfaceC9790sg0;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return WU3.p;
    }
}
