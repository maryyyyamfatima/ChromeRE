package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.elements.converters.EnvironmentEntitiesDataSource;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentElement;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.ComponentState;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.DevResourceManager;
import com.google.android.libraries.elements.interfaces.EntitiesObserverConfig;
import com.google.android.libraries.elements.interfaces.EntitiesProcessorResolver;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import defpackage.AbstractC12203zi0;
import defpackage.C0070Ao;
import defpackage.C10239ty0;
import defpackage.C10488ui0;
import defpackage.C2590Ty0;
import defpackage.C3184Yn;
import defpackage.C3235Yx0;
import defpackage.C4883eN3;
import defpackage.C5105f10;
import defpackage.C5155f92;
import defpackage.C5277fX3;
import defpackage.C5427fx0;
import defpackage.C7188l43;
import defpackage.C7849n00;
import defpackage.EnumC7791mq0;
import defpackage.InterfaceC12058zG3;
import defpackage.KF;
import defpackage.KV0;
import defpackage.OF;
import defpackage.U80;
import io.grpc.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5105f10 implements InterfaceC6462iy0 {
    public static final XF0 t;
    public final InterfaceC9790sg0 a;
    public final AbstractC9095qe2 b;
    public final AbstractC9896sy0 c;
    public final DG3 d;
    public final InterfaceC10686vG3 e;
    public final InterfaceC3241Yy1 f;
    public final C10663vC0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ComponentConfig l;
    public final boolean m;
    public final AbstractC9095qe2 n;
    public final AbstractC9095qe2 o;
    public final boolean p;
    public final InterfaceC9989tE2 q;
    public final InterfaceC11517xi0 r;
    public final boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [xG3] */
    @Override // defpackage.InterfaceC6462iy0
    public final TZ a(final C7849n00 c7849n00, final U80 u80, AbstractC11362xE3 abstractC11362xE3, final String str, final UF0 uf0, C8367oX c8367oX, List list) {
        final R00 r00 = (R00) abstractC11362xE3;
        C11029wG3 c11029wG3 = InterfaceC11372xG3.a;
        ?? r15 = ((C3184Yn) u80).e;
        if (r15 != 0) {
            c11029wG3 = r15;
        }
        final InterfaceC12058zG3 a = c11029wG3.a();
        C5843h92 c5843h92 = new C5843h92(new Callable() { // from class: T00
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v4, types: [a10, DV0] */
            /* JADX WARN: Type inference failed for: r1v27, types: [b10] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] bArr;
                Object a2;
                X82 c9413ra2;
                final C7849n00 c7849n002 = c7849n00;
                final U80 u802 = u80;
                final R00 r002 = r00;
                final String str2 = str;
                final UF0 uf02 = uf0;
                final InterfaceC12058zG3 interfaceC12058zG3 = a;
                final C5105f10 c5105f10 = C5105f10.this;
                final boolean z = c5105f10.i;
                final String h = c5105f10.r.debuggerEnabled() ? AbstractC12203zi0.h(uf02) : null;
                boolean z2 = c5105f10.j;
                if (!z || (z2 && !c5105f10.m)) {
                    if (z && z2) {
                        XF0 xf0 = new XF0();
                        OX0 ox0 = C5793h10.s;
                        xf0.a(ox0);
                        try {
                            ByteBuffer f = r002.f(14);
                            C0896Gx0 c0896Gx0 = C0896Gx0.o;
                            DV h2 = DV.h(f, false);
                            C0896Gx0 c0896Gx02 = new C0896Gx0();
                            try {
                                try {
                                    C7931nE2 c7931nE2 = C7931nE2.c;
                                    c7931nE2.getClass();
                                    QW2 b = c7931nE2.b(c0896Gx02.getClass());
                                    EV ev = h2.d;
                                    if (ev == null) {
                                        ev = new EV(h2);
                                    }
                                    b.e(c0896Gx02, ev, xf0);
                                    b.b(c0896Gx02);
                                    QX0.i(c0896Gx02);
                                    QX0.i(c0896Gx02);
                                    C8381oZ3 c8381oZ3 = c0896Gx02.k;
                                    if (c8381oZ3 == null) {
                                        c8381oZ3 = C8381oZ3.l;
                                    }
                                    c8381oZ3.getClass();
                                    c8381oZ3.v(ox0);
                                    C5563gM0 c5563gM0 = c8381oZ3.j;
                                    c5563gM0.getClass();
                                    NX0 nx0 = ox0.d;
                                    nx0.getClass();
                                    if (!(c5563gM0.a.get(nx0) != null)) {
                                        throw new C10239ty0("No ComponentType extension on Element");
                                    }
                                    C8381oZ3 c8381oZ32 = c0896Gx02.k;
                                    if (c8381oZ32 == null) {
                                        c8381oZ32 = C8381oZ3.l;
                                    }
                                    c8381oZ32.getClass();
                                    c8381oZ32.v(ox0);
                                    Object c = c8381oZ32.j.c(nx0);
                                    C5793h10 c5793h10 = (C5793h10) (c == null ? ox0.b : ox0.a(c));
                                    if (!((c5793h10.j & 2) != 0)) {
                                        throw new C10239ty0("Invalid ComponentType: null templateConfig");
                                    }
                                    C9657sG3 c9657sG3 = c5793h10.l;
                                    if (c9657sG3 == null) {
                                        c9657sG3 = C9657sG3.l;
                                    }
                                    bArr = c9657sG3.toByteArray();
                                } catch (IOException e) {
                                    if (e.getCause() instanceof C1127Ir1) {
                                        throw ((C1127Ir1) e.getCause());
                                    }
                                    throw new C1127Ir1(e);
                                } catch (RuntimeException e2) {
                                    if (e2.getCause() instanceof C1127Ir1) {
                                        throw ((C1127Ir1) e2.getCause());
                                    }
                                    throw e2;
                                }
                            } catch (C1127Ir1 e3) {
                                if (e3.g) {
                                    throw new C1127Ir1(e3);
                                }
                                throw e3;
                            } catch (C6827k14 e4) {
                                throw e4.a();
                            }
                        } catch (C1127Ir1 e5) {
                            throw new C10239ty0("Error parsing element proto", e5);
                        }
                    } else {
                        ByteBuffer f2 = r002.f(6);
                        if (f2 == null) {
                            throw new C10239ty0("Invalid ComponentType: null templateConfig");
                        }
                        int b2 = r002.b(6);
                        bArr = new byte[b2 != 0 ? r002.g(b2) : 0];
                        f2.get(bArr);
                    }
                    final byte[] bArr2 = bArr;
                    C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
                    OL2 ol2 = OL2.j;
                    if (z2) {
                        try {
                            XF0 d = XF0.d();
                            int length = bArr2.length;
                            C9657sG3 c9657sG32 = C9657sG3.l;
                            C9657sG3 c9657sG33 = new C9657sG3();
                            try {
                                try {
                                    try {
                                        C7931nE2 c7931nE22 = C7931nE2.c;
                                        c7931nE22.getClass();
                                        QW2 b3 = c7931nE22.b(c9657sG33.getClass());
                                        b3.f(c9657sG33, bArr2, 0, length + 0, new C2254Rj(d));
                                        b3.b(c9657sG33);
                                        if (c9657sG33.a != 0) {
                                            throw new RuntimeException();
                                        }
                                        QX0.i(c9657sG33);
                                        ArrayList arrayList = new ArrayList();
                                        OX0 ox02 = S24.n;
                                        ox02.getClass();
                                        c9657sG33.v(ox02);
                                        C5563gM0 c5563gM02 = c9657sG33.j;
                                        NX0 nx02 = ox02.d;
                                        Object c2 = c5563gM02.c(nx02);
                                        if (c2 == null) {
                                            a2 = ox02.b;
                                        } else {
                                            nx02.getClass();
                                            a2 = ox02.a(c2);
                                        }
                                        String str3 = ((S24) a2).k;
                                        ol2 = arrayList;
                                        if (!str3.isEmpty()) {
                                            arrayList.add(str3);
                                            ol2 = arrayList;
                                        }
                                    } catch (C1127Ir1 e6) {
                                        if (e6.g) {
                                            throw new C1127Ir1(e6);
                                        }
                                        throw e6;
                                    } catch (IndexOutOfBoundsException unused) {
                                        throw C1127Ir1.h();
                                    }
                                } catch (IOException e7) {
                                    if (e7.getCause() instanceof C1127Ir1) {
                                        throw ((C1127Ir1) e7.getCause());
                                    }
                                    throw new C1127Ir1(e7);
                                }
                            } catch (C6827k14 e8) {
                                throw e8.a();
                            }
                        } catch (C1127Ir1 e9) {
                            throw new C10239ty0("Failed to parse a TemplateConfig", e9);
                        }
                    }
                    final OL2 ol22 = ol2;
                    final DG3 dg3 = c5105f10.d;
                    X82 h92 = ol22.isEmpty() ? new H92(new Callable() { // from class: b10
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            InterfaceC12058zG3 interfaceC12058zG32 = InterfaceC12058zG3.this;
                            interfaceC12058zG32.i();
                            C5453g14 c5453g14 = (C5453g14) dg3;
                            c5453g14.getClass();
                            C5109f14 c5109f14 = new C5109f14(c5453g14, bArr2, uf02, str2);
                            interfaceC12058zG32.a();
                            return c5109f14;
                        }
                    }) : new O92(new C10649v92(new O92(new J92(ol22), new DV0() { // from class: c10
                        @Override // defpackage.DV0
                        public final Object apply(Object obj) {
                            C5105f10 c5105f102 = C5105f10.this;
                            c5105f102.getClass();
                            return c5105f102.a.a("/system/template/" + ((String) obj));
                        }
                    }), Integer.MAX_VALUE, BQ0.a), new DV0() { // from class: d10
                        @Override // defpackage.DV0
                        public final Object apply(Object obj) {
                            C5105f10 c5105f102 = C5105f10.this;
                            if (c5105f102.j) {
                                UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) c5105f102.f.get();
                                for (String str4 : ol22) {
                                    ((C10343uG3) c5105f102.e).getClass();
                                    unifiedTemplateResolver.jni_setTemplateConfig(str4, AbstractC8868py0.a);
                                }
                            }
                            InterfaceC12058zG3 interfaceC12058zG32 = interfaceC12058zG3;
                            interfaceC12058zG32.i();
                            C5453g14 c5453g14 = (C5453g14) dg3;
                            c5453g14.getClass();
                            C5109f14 c5109f14 = new C5109f14(c5453g14, bArr2, uf02, str2);
                            interfaceC12058zG32.a();
                            return c5109f14;
                        }
                    });
                    ?? r10 = new DV0() { // from class: a10
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
                        @Override // defpackage.DV0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object apply(java.lang.Object r12) {
                            /*
                                Method dump skipped, instructions count: 261
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3387a10.apply(java.lang.Object):java.lang.Object");
                        }
                    };
                    int i = BQ0.a;
                    Q82.b(i, "bufferSize");
                    if (h92 instanceof InterfaceCallableC10760vV2) {
                        Object call = ((InterfaceCallableC10760vV2) h92).call();
                        c9413ra2 = call == null ? C9620s92.a : new C6665ja2(r10, call);
                    } else {
                        c9413ra2 = new C9413ra2(h92, r10, i);
                    }
                } else {
                    ByteBuffer f3 = r002.f(14);
                    int b4 = r002.b(16);
                    c9413ra2 = c5105f10.d(c7849n002, f3, u802, interfaceC12058zG3, h, (b4 == 0 || r002.b.get(b4 + r002.a) == 0) ? false : true);
                }
                M92 m92 = new M92(new C7561m92(c9413ra2, new InterfaceC11303x40() { // from class: X00
                    @Override // defpackage.InterfaceC11303x40
                    public final void accept(Object obj) {
                        InterfaceC12058zG3.this.d();
                    }
                }, TV0.c), new QR2(new InterfaceC11303x40() { // from class: Y00
                    @Override // defpackage.InterfaceC11303x40
                    public final void accept(Object obj) {
                        InterfaceC12058zG3.this.f();
                    }
                }));
                Objects.requireNonNull(interfaceC12058zG3);
                return new C7561m92(m92, TV0.d, new H4() { // from class: Z00
                    @Override // defpackage.H4
                    public final void run() {
                        InterfaceC12058zG3.this.clear();
                    }
                });
            }
        });
        int i = S00.P;
        P00 p00 = new P00();
        S00 s00 = new S00();
        p00.m(c7849n00, 0, 0, s00);
        p00.i = s00;
        BitSet bitSet = p00.k;
        bitSet.clear();
        p00.i.D = u80;
        bitSet.set(0);
        p00.i.I = c5843h92;
        bitSet.set(5);
        p00.i.f11466J = this.c;
        bitSet.set(6);
        p00.i.K = a;
        bitSet.set(7);
        p00.i.E = this.k;
        bitSet.set(1);
        p00.i.L = new C11628y10(r00, uf0);
        bitSet.set(8);
        p00.i.H = this.j;
        bitSet.set(4);
        p00.i.G = this.r;
        bitSet.set(3);
        p00.i.F = this.q;
        bitSet.set(2);
        return p00;
    }

    static {
        XF0 xf0 = new XF0();
        xf0.a(S24.n);
        xf0.a(C5793h10.s);
        t = xf0;
    }

    public C5105f10(C5453g14 c5453g14, InterfaceC9790sg0 interfaceC9790sg0, C3242Yy2 c3242Yy2, AbstractC9896sy0 abstractC9896sy0, InterfaceC3241Yy1 interfaceC3241Yy1, C10663vC0 c10663vC0, C0806Gf0 c0806Gf0, InterfaceC11517xi0 interfaceC11517xi0, C3242Yy2 c3242Yy22) {
        C10343uG3 c10343uG3 = InterfaceC10686vG3.a;
        C5785h c5785h = C5785h.a;
        this.d = c5453g14;
        this.a = interfaceC9790sg0;
        this.b = c3242Yy2;
        this.c = abstractC9896sy0;
        this.e = c10343uG3;
        this.g = c10663vC0;
        Boolean bool = Boolean.FALSE;
        this.j = bool.booleanValue();
        this.k = bool.booleanValue();
        this.h = Boolean.TRUE.booleanValue();
        this.i = ((Boolean) c3242Yy22.a).booleanValue();
        this.f = interfaceC3241Yy1;
        Integer num = 0;
        this.l = new ComponentConfig(bool.booleanValue(), num.intValue(), bool.booleanValue(), bool.booleanValue());
        this.m = bool.booleanValue();
        this.n = c5785h;
        this.q = c0806Gf0;
        this.r = interfaceC11517xi0;
        this.o = c5785h;
        this.p = bool.booleanValue();
        this.s = bool.booleanValue();
    }

    public final C5499g92 d(final C7849n00 c7849n00, final ByteBuffer byteBuffer, final U80 u80, final InterfaceC12058zG3 interfaceC12058zG3, final String str, boolean z) {
        InterfaceC9989tE2 interfaceC9989tE2 = (InterfaceC9989tE2) this.b.e();
        if (interfaceC9989tE2 == null) {
            throw new IllegalStateException("Cannot use SharedComponentType without a Store provided.");
        }
        ByteStore byteStore = (ByteStore) interfaceC9989tE2.get();
        EnvironmentEntitiesDataSource environmentEntitiesDataSource = z ? new EnvironmentEntitiesDataSource(this.g.c(u80)) : null;
        InterfaceC9989tE2 interfaceC9989tE22 = (InterfaceC9989tE2) this.n.e();
        final DevResourceManager devResourceManager = (this.j && this.m && interfaceC9989tE22 != null) ? (DevResourceManager) interfaceC9989tE22.get() : null;
        final EntitiesProcessorResolver entitiesProcessorResolver = (EntitiesProcessorResolver) EntitiesProcessorResolver.create(byteStore, environmentEntitiesDataSource, new EntitiesObserverConfig(this.p, this.s ? Integer.valueOf(((C3184Yn) u80).x) : null)).d(new KV0() { // from class: e10
            @Override // defpackage.KV0
            public final C10239ty0 a(C2008Pl3 c2008Pl3) {
                return new C10239ty0("Error creating EntitiesProcessorResolver", c2008Pl3);
            }
        });
        InterfaceC9989tE2 interfaceC9989tE23 = (InterfaceC9989tE2) this.o.e();
        if (interfaceC9989tE23 != null) {
            X5.a(interfaceC9989tE23.get());
            throw null;
        }
        final ComponentElement create = ComponentElement.create(byteBuffer);
        if (create == null) {
            throw new C10239ty0("Failed to create C++ Component");
        }
        return new C5499g92(new T92() { // from class: com.google.android.libraries.elements.converters.e
            @Override // defpackage.T92
            public final void a(final C5155f92 c5155f92) {
                ComponentState componentState;
                final C5105f10 c5105f10 = C5105f10.this;
                C7849n00 c7849n002 = c7849n00;
                final U80 u802 = u80;
                ComponentElement componentElement = create;
                DevResourceManager devResourceManager2 = devResourceManager;
                EntitiesProcessorResolver entitiesProcessorResolver2 = entitiesProcessorResolver;
                String str2 = str;
                final InterfaceC12058zG3 interfaceC12058zG32 = interfaceC12058zG3;
                final ByteBuffer byteBuffer2 = byteBuffer;
                c5105f10.f.get();
                C5277fX3 c5277fX3 = c7849n002.k;
                C2590Ty0 c2590Ty0 = (C2590Ty0) (c5277fX3 == null ? null : c5277fX3.a(C2590Ty0.class));
                if (c2590Ty0 != null) {
                    String str3 = ((C3184Yn) u802).m;
                    synchronized (c2590Ty0) {
                        componentState = (ComponentState) c2590Ty0.h.get(str3);
                    }
                    if (componentState == null) {
                        componentState = ComponentState.create();
                    }
                } else {
                    componentState = null;
                }
                try {
                    final Component component = (Component) Component.createWithElement(componentElement, devResourceManager2, entitiesProcessorResolver2, c5105f10.l, componentState).d(new KV0() { // from class: U00
                        @Override // defpackage.KV0
                        public final C10239ty0 a(C2008Pl3 c2008Pl3) {
                            return new C10239ty0("Error creating Component", c2008Pl3);
                        }
                    });
                    if (c2590Ty0 != null && componentState != null && !componentState.isEmpty()) {
                        String str4 = ((C3184Yn) u802).m;
                        synchronized (c2590Ty0) {
                            c2590Ty0.h.put(str4, componentState);
                        }
                    }
                    final C10488ui0 c10488ui0 = c5105f10.r.debuggerEnabled() ? new C10488ui0(str2, component) : null;
                    String templateUri = component.getTemplateUri();
                    interfaceC12058zG32.b(templateUri);
                    StringBuilder sb = ((C3184Yn) u802).l;
                    if (sb != null && !TextUtils.isEmpty(templateUri)) {
                        sb.append(templateUri);
                        sb.append("|");
                    }
                    final C10488ui0 c10488ui02 = c10488ui0;
                    ComponentObserver componentObserver = new ComponentObserver() { // from class: com.google.android.libraries.elements.converters.ComponentTypeConverter$1
                        @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
                        public synchronized void componentDidUpdate(Component component2) {
                            C3235Yx0 b;
                            C4883eN3 c = C5105f10.this.r.liveUpdateEnabled() ? AbstractC12203zi0.c(u802) : null;
                            C5427fx0 c5427fx0 = null;
                            try {
                                C5105f10.c(C5105f10.this, interfaceC12058zG32, c, byteBuffer2);
                                StatusOr materialize = component.materialize(true);
                                byte[] bArr = (byte[]) materialize.c();
                                if (bArr == null) {
                                    ((C5155f92) c5155f92).b(new C10239ty0("Error materializing SharedComponentType: ".concat(String.valueOf(materialize.b())), materialize.b().asException()));
                                    C5105f10.b(C5105f10.this, interfaceC12058zG32, c, component, null, u802);
                                    return;
                                }
                                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                C5427fx0 c5427fx02 = new C5427fx0();
                                C5427fx0.j(wrap, c5427fx02);
                                try {
                                    C5105f10 c5105f102 = C5105f10.this;
                                    Component component3 = component;
                                    C10488ui0 c10488ui03 = c10488ui02;
                                    if (c5105f102.r.debuggerEnabled() && c10488ui03 != null && (b = AbstractC12203zi0.b(c5427fx02, C7188l43.a(component3.latestModel()), component3.latestEntitiesConfig(), c10488ui03.c)) != null) {
                                        synchronized (c10488ui03.e) {
                                            c10488ui03.d = b;
                                        }
                                    }
                                    C0070Ao c0070Ao = new C0070Ao(c5427fx02, c10488ui02);
                                    C5105f10.b(C5105f10.this, interfaceC12058zG32, c, component, c5427fx02, u802);
                                    ((C5155f92) c5155f92).c(c0070Ao);
                                } catch (Throwable th) {
                                    th = th;
                                    c5427fx0 = c5427fx02;
                                    C5105f10.b(C5105f10.this, interfaceC12058zG32, c, component, c5427fx0, u802);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    };
                    component.setObserver(componentObserver);
                    componentObserver.componentDidUpdate(component);
                    EnumC7791mq0.e(c5155f92, new OF(new KF() { // from class: V00
                        @Override // defpackage.KF
                        public final void cancel() {
                            C5105f10 c5105f102 = C5105f10.this;
                            C10488ui0 c10488ui03 = c10488ui0;
                            Component component2 = component;
                            U80 u803 = u802;
                            c5105f102.getClass();
                            if (c10488ui03 != null) {
                                synchronized (c10488ui03.e) {
                                    c10488ui03.b = null;
                                }
                            }
                            Status dispose = component2.dispose();
                            if (dispose.b()) {
                                return;
                            }
                            c5105f102.c.d(EnumC11438xU.A, "Error disposing Component", u803, new C2008Pl3(dispose));
                        }
                    }));
                } catch (C10239ty0 e) {
                    c5155f92.b(e);
                }
            }
        });
    }

    public static void c(C5105f10 c5105f10, InterfaceC12058zG3 interfaceC12058zG3, C4883eN3 c4883eN3, ByteBuffer byteBuffer) {
        c5105f10.getClass();
        interfaceC12058zG3.e();
        if (c4883eN3 != null) {
            C6945kN3 c6945kN3 = (C6945kN3) C7289lN3.m.j();
            if (c6945kN3.h) {
                c6945kN3.l();
                c6945kN3.h = false;
            }
            C7289lN3 c7289lN3 = (C7289lN3) c6945kN3.g;
            c7289lN3.getClass();
            c7289lN3.k = c4883eN3;
            c7289lN3.j |= 1;
            String e = e(byteBuffer);
            if (c6945kN3.h) {
                c6945kN3.l();
                c6945kN3.h = false;
            }
            C7289lN3 c7289lN32 = (C7289lN3) c6945kN3.g;
            c7289lN32.getClass();
            e.getClass();
            c7289lN32.j |= 2;
            c7289lN32.l = e;
            C7289lN3 c7289lN33 = (C7289lN3) c6945kN3.j();
            DebuggerClient debuggerClient = (DebuggerClient) c5105f10.q.get();
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
            c7289lN33.getClass();
            c7977nN32.l = c7289lN33;
            c7977nN32.k = 2;
            debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
        }
    }

    public static void b(C5105f10 c5105f10, InterfaceC12058zG3 interfaceC12058zG3, C4883eN3 c4883eN3, Component component, C5427fx0 c5427fx0, U80 u80) {
        C3235Yx0 b;
        c5105f10.getClass();
        interfaceC12058zG3.c();
        if (c4883eN3 != null) {
            C6259iN3 c6259iN3 = (C6259iN3) C6601jN3.n.j();
            if (c6259iN3.h) {
                c6259iN3.l();
                c6259iN3.h = false;
            }
            C6601jN3 c6601jN3 = (C6601jN3) c6259iN3.g;
            c6601jN3.getClass();
            c6601jN3.k = c4883eN3;
            c6601jN3.j |= 1;
            if (c5427fx0 != null && (b = AbstractC12203zi0.b(c5427fx0, C7188l43.a(component.latestModel()), component.latestEntitiesConfig(), ((C3184Yn) u80).s)) != null) {
                if (c6259iN3.h) {
                    c6259iN3.l();
                    c6259iN3.h = false;
                }
                C6601jN3 c6601jN32 = (C6601jN3) c6259iN3.g;
                c6601jN32.getClass();
                c6601jN32.l = b;
                c6601jN32.j |= 2;
            }
            DebuggerClient debuggerClient = (DebuggerClient) c5105f10.q.get();
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
            C6601jN3 c6601jN33 = (C6601jN3) c6259iN3.j();
            c7977nN32.getClass();
            c6601jN33.getClass();
            c7977nN32.l = c6601jN33;
            c7977nN32.k = 3;
            debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
        }
    }

    public static String e(ByteBuffer byteBuffer) {
        Object a;
        Object a2;
        if (byteBuffer == null) {
            return "Unknown template";
        }
        try {
            XF0 xf0 = t;
            C0896Gx0 c0896Gx0 = C0896Gx0.o;
            DV h = DV.h(byteBuffer, false);
            C0896Gx0 c0896Gx02 = new C0896Gx0();
            try {
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c0896Gx02.getClass());
                            EV ev = h.d;
                            if (ev == null) {
                                ev = new EV(h);
                            }
                            b.e(c0896Gx02, ev, xf0);
                            b.b(c0896Gx02);
                            QX0.i(c0896Gx02);
                            QX0.i(c0896Gx02);
                            C8381oZ3 c8381oZ3 = c0896Gx02.k;
                            if (c8381oZ3 == null) {
                                c8381oZ3 = C8381oZ3.l;
                            }
                            OX0 ox0 = C5793h10.s;
                            c8381oZ3.getClass();
                            ox0.getClass();
                            c8381oZ3.v(ox0);
                            C5563gM0 c5563gM0 = c8381oZ3.j;
                            NX0 nx0 = ox0.d;
                            Object c = c5563gM0.c(nx0);
                            if (c == null) {
                                a = ox0.b;
                            } else {
                                nx0.getClass();
                                a = ox0.a(c);
                            }
                            C9657sG3 c9657sG3 = ((C5793h10) a).l;
                            if (c9657sG3 == null) {
                                c9657sG3 = C9657sG3.l;
                            }
                            OX0 ox02 = S24.n;
                            c9657sG3.getClass();
                            ox02.getClass();
                            c9657sG3.v(ox02);
                            C5563gM0 c5563gM02 = c9657sG3.j;
                            NX0 nx02 = ox02.d;
                            Object c2 = c5563gM02.c(nx02);
                            if (c2 == null) {
                                a2 = ox02.b;
                            } else {
                                nx02.getClass();
                                a2 = ox02.a(c2);
                            }
                            S24 s24 = (S24) a2;
                            return (s24.j & 1) != 0 ? s24.k : "Unknown template";
                        } catch (RuntimeException e) {
                            if (e.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e.getCause());
                            }
                            throw e;
                        }
                    } catch (C6827k14 e2) {
                        throw e2.a();
                    }
                } catch (IOException e3) {
                    if (e3.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e3.getCause());
                    }
                    throw new C1127Ir1(e3);
                }
            } catch (C1127Ir1 e4) {
                if (e4.g) {
                    throw new C1127Ir1(e4);
                }
                throw e4;
            }
        } catch (C1127Ir1 unused) {
            return "Unknown template";
        }
    }
}
