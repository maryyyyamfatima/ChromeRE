package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lv0 */
/* loaded from: classes.dex */
public final class C7477lv0 implements InterfaceC9395rX {
    public final InterfaceC9790sg0 a;
    public final InterfaceC3241Yy1 b;
    public final boolean c = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final C7821mv0 c7821mv0 = (C7821mv0) obj;
        if (c7821mv0 == null) {
            throw new NullPointerException("item is null");
        }
        return new C0664Fc3(new C0924Hc3(c7821mv0), new DV0() { // from class: jv0
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                Object a;
                final C7477lv0 c7477lv0 = C7477lv0.this;
                c7477lv0.getClass();
                C9314rG3 c9314rG3 = (C9314rG3) C9657sG3.l.j();
                OX0 ox0 = C4396cx0.n;
                C4053bx0 c4053bx0 = (C4053bx0) C4396cx0.l.j();
                final C7821mv0 c7821mv02 = c7821mv0;
                C4739dx0 c4739dx0 = c7821mv02.l;
                if (c4739dx0 == null) {
                    c4739dx0 = C4739dx0.j;
                }
                ZD c = c4739dx0.c();
                if (c4053bx0.h) {
                    c4053bx0.l();
                    c4053bx0.h = false;
                }
                C4396cx0 c4396cx0 = (C4396cx0) c4053bx0.g;
                c4396cx0.getClass();
                c4396cx0.j |= 1;
                c4396cx0.k = c;
                c9314rG3.p(ox0, (C4396cx0) c4053bx0.j());
                C9657sG3 c9657sG3 = (C9657sG3) c9314rG3.j();
                C6137i10 c6137i10 = c7821mv02.k;
                if (c6137i10 == null) {
                    c6137i10 = C6137i10.l;
                }
                OX0 ox02 = C6823k10.o;
                c6137i10.getClass();
                ox02.getClass();
                c6137i10.v(ox02);
                C5563gM0 c5563gM0 = c6137i10.j;
                NX0 nx0 = ox02.d;
                Object c2 = c5563gM0.c(nx0);
                if (c2 == null) {
                    a = ox02.b;
                } else {
                    nx0.getClass();
                    a = ox02.a(c2);
                }
                int i = ((C6823k10) a).l;
                C5449g10 c5449g10 = (C5449g10) C5793h10.q.j();
                if (c5449g10.h) {
                    c5449g10.l();
                    c5449g10.h = false;
                }
                C5793h10 c5793h10 = (C5793h10) c5449g10.g;
                c5793h10.getClass();
                c9657sG3.getClass();
                c5793h10.l = c9657sG3;
                c5793h10.j |= 2;
                C6137i10 c6137i102 = c7821mv02.k;
                if (c6137i102 == null) {
                    c6137i102 = C6137i10.l;
                }
                if (c5449g10.h) {
                    c5449g10.l();
                    c5449g10.h = false;
                }
                C5793h10 c5793h102 = (C5793h10) c5449g10.g;
                c5793h102.getClass();
                c6137i102.getClass();
                c5793h102.n = c6137i102;
                c5793h102.j |= 16;
                try {
                    C8199o10 d = C7477lv0.d(i);
                    if (c5449g10.h) {
                        c5449g10.l();
                        c5449g10.h = false;
                    }
                    C5793h10 c5793h103 = (C5793h10) c5449g10.g;
                    c5793h103.getClass();
                    c5793h103.m = d;
                    c5793h103.j |= 8;
                    final C5793h10 c5793h104 = (C5793h10) c5449g10.j();
                    final InterfaceC9790sg0 interfaceC9790sg0 = c7477lv0.a;
                    C8935q92 g = new C5843h92(new Callable() { // from class: LB0
                        public final /* synthetic */ X82 h = null;

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C6823k10 c6823k10;
                            Object a2;
                            Object a3;
                            C5793h10 c5793h105 = C5793h10.this;
                            C8199o10 c8199o10 = c5793h105.m;
                            if (c8199o10 == null) {
                                c8199o10 = C8199o10.l;
                            }
                            ByteBuffer byteBuffer = C7188l43.d;
                            C7188l43 a4 = C7188l43.a(c8199o10.toByteArray());
                            int i2 = 0;
                            if (!((c5793h105.j & 16) != 0)) {
                                return C1025Hx.j(a4);
                            }
                            C6137i10 c6137i103 = c5793h105.n;
                            if (c6137i103 == null) {
                                c6137i103 = C6137i10.l;
                            }
                            OX0 ox03 = C6823k10.o;
                            c6137i103.getClass();
                            ox03.getClass();
                            c6137i103.v(ox03);
                            C5563gM0 c5563gM02 = c6137i103.j;
                            c5563gM02.getClass();
                            NX0 nx02 = ox03.d;
                            nx02.getClass();
                            C11349xC0 c11349xC0 = null;
                            if (c5563gM02.a.get(nx02) != null) {
                                c6137i103.v(ox03);
                                Object c3 = c6137i103.j.c(nx02);
                                if (c3 == null) {
                                    a3 = ox03.b;
                                } else {
                                    a3 = ox03.a(c3);
                                }
                                c6823k10 = (C6823k10) a3;
                            } else {
                                c6823k10 = null;
                            }
                            OX0 ox04 = C11349xC0.o;
                            ox04.getClass();
                            c6137i103.v(ox04);
                            C5563gM0 c5563gM03 = c6137i103.j;
                            c5563gM03.getClass();
                            NX0 nx03 = ox04.d;
                            nx03.getClass();
                            if (c5563gM03.a.get(nx03) != null) {
                                c6137i103.v(ox04);
                                Object c4 = c6137i103.j.c(nx03);
                                if (c4 == null) {
                                    a2 = ox04.b;
                                } else {
                                    a2 = ox04.a(c4);
                                }
                                c11349xC0 = (C11349xC0) a2;
                            }
                            if (c6823k10 != null || c11349xC0 != null) {
                                if (c6823k10 != null && c11349xC0 != null && c6823k10.l != c11349xC0.k) {
                                    throw new C10239ty0(AbstractC0800Ge.a("ComponentType localEntitiesConfig.resultField=", c6823k10.l, ", environmentEntitiesConfig.resultField=", c11349xC0.k));
                                }
                                C0822Gi1 a5 = AbstractC0952Hi1.a();
                                if (c6823k10 != null) {
                                    int i3 = c6823k10.l;
                                    C0822Gi1 a6 = AbstractC0952Hi1.a();
                                    for (C7167l10 c7167l10 : c6823k10.k) {
                                        if ((c7167l10.j & 1) != 0) {
                                            a6.b(c7167l10.k, Integer.valueOf(c7167l10.l));
                                        }
                                    }
                                    a5.c(a6.a(true).entrySet());
                                    i2 = i3;
                                }
                                if (c11349xC0 != null) {
                                    i2 = c11349xC0.k;
                                    a5.c(AbstractC0952Hi1.e("/environment", Integer.valueOf(c11349xC0.l)).entrySet());
                                }
                                return TB0.a(RB0.a(a4), i2, a5.a(true), interfaceC9790sg0, this.h);
                            }
                            return C1025Hx.j(a4);
                        }
                    }).g(C7188l43.e);
                    final AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                    return new C0664Fc3(g, new DV0() { // from class: kv0
                        @Override // defpackage.DV0
                        public final Object apply(Object obj3) {
                            C7188l43 c7188l43 = (C7188l43) obj3;
                            C7477lv0 c7477lv02 = C7477lv0.this;
                            InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) c7477lv02.b.get();
                            C4739dx0 c4739dx02 = c7821mv02.l;
                            if (c4739dx02 == null) {
                                c4739dx02 = C4739dx0.j;
                            }
                            try {
                                C3709ax0 a2 = EkoProcessor.a(c4739dx02.toByteArray(), RB0.a(c7188l43).a, c7477lv02.c);
                                Status status = a2.a;
                                if (!status.b()) {
                                    throw new C10239ty0("Eko processor error: " + status.getDescription());
                                }
                                byte[] bArr = a2.b;
                                XF0 d2 = XF0.d();
                                CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.l;
                                int length = bArr.length;
                                CommandOuterClass$Command commandOuterClass$Command2 = CommandOuterClass$Command.l;
                                CommandOuterClass$Command commandOuterClass$Command3 = new CommandOuterClass$Command();
                                try {
                                    try {
                                        try {
                                            C7931nE2 c7931nE2 = C7931nE2.c;
                                            c7931nE2.getClass();
                                            QW2 b = c7931nE2.b(commandOuterClass$Command3.getClass());
                                            b.f(commandOuterClass$Command3, bArr, 0, length + 0, new C2254Rj(d2));
                                            b.b(commandOuterClass$Command3);
                                            if (commandOuterClass$Command3.a != 0) {
                                                throw new RuntimeException();
                                            }
                                            QX0.i(commandOuterClass$Command3);
                                            return ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command3, abstractC9053qX2, 1);
                                        } catch (IOException e) {
                                            if (e.getCause() instanceof C1127Ir1) {
                                                throw ((C1127Ir1) e.getCause());
                                            }
                                            throw new C1127Ir1(e);
                                        } catch (C6827k14 e2) {
                                            throw e2.a();
                                        }
                                    } catch (C1127Ir1 e3) {
                                        if (e3.g) {
                                            throw new C1127Ir1(e3);
                                        }
                                        throw e3;
                                    }
                                } catch (IndexOutOfBoundsException unused) {
                                    throw C1127Ir1.h();
                                }
                            } catch (IOException e4) {
                                throw new C10239ty0("Invalid eko template", e4);
                            }
                        }
                    });
                } catch (IOException e) {
                    throw new C10239ty0("Invalid model creation", e);
                }
            }
        });
    }

    public C7477lv0(InterfaceC9790sg0 interfaceC9790sg0, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = interfaceC9790sg0;
        this.b = interfaceC3241Yy1;
    }

    public static C8199o10 d(int i) {
        byte[] bArr = new byte[6];
        boolean z = KV.b;
        HV hv = new HV(bArr, 6);
        hv.O(i, 2);
        hv.Q(0);
        try {
            C8199o10 c8199o10 = C8199o10.l;
            XF0 c = XF0.c();
            C8199o10 c8199o102 = C8199o10.l;
            C8199o10 c8199o103 = new C8199o10();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c8199o103.getClass());
                        b.f(c8199o103, bArr, 0, 6, new C2254Rj(c));
                        b.b(c8199o103);
                        if (c8199o103.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c8199o103);
                        return c8199o103;
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                }
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            throw new C10239ty0("Invalid model", e4);
        }
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C7821mv0.p;
    }
}
