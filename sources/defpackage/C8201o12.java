package defpackage;

import android.app.Activity;
import java.util.Objects;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o12 */
/* loaded from: classes.dex */
public final class C8201o12 {
    public final Activity a;
    public final QB b;
    public final CC c;
    public final InterfaceC0079Ap3 d;
    public final InterfaceC0079Ap3 e;
    public final I5 f;
    public final InterfaceC10590uz3 g;
    public final InterfaceC0079Ap3 h;
    public final WindowAndroid i;
    public final InterfaceC0079Ap3 j;
    public final InterfaceC7913nB k;
    public final InterfaceC6092ht1 l;
    public final InterfaceC0079Ap3 m;
    public final C4270cc0 n;
    public R32 o;
    public C7513m12 p;

    public C8201o12(Activity activity, QB qb, CC cc, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, I5 i5, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC0079Ap3 interfaceC0079Ap33, WindowAndroid windowAndroid, InterfaceC0079Ap3 interfaceC0079Ap34, InterfaceC7913nB interfaceC7913nB, InterfaceC6092ht1 interfaceC6092ht1, InterfaceC0079Ap3 interfaceC0079Ap35, C4270cc0 c4270cc0) {
        this.a = activity;
        this.b = qb;
        this.c = cc;
        this.d = interfaceC0079Ap3;
        this.e = interfaceC0079Ap32;
        this.f = i5;
        this.g = interfaceC10590uz3;
        this.h = interfaceC0079Ap33;
        this.i = windowAndroid;
        this.j = interfaceC0079Ap34;
        this.k = interfaceC7913nB;
        this.l = interfaceC6092ht1;
        this.m = interfaceC0079Ap35;
        this.n = c4270cc0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [i12] */
    public final C7513m12 a() {
        if (this.p == null) {
            this.p = new C7513m12(this.a, new InterfaceC0079Ap3() { // from class: i12
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    C8201o12 c8201o12 = C8201o12.this;
                    if (c8201o12.o == null) {
                        boolean a = c8201o12.k.a();
                        Activity activity222 = c8201o12.a;
                        Objects.requireNonNull(activity222);
                        C6481j12 c6481j12 = new InterfaceC0079Ap3() { // from class: j12
                            public final /* synthetic */ Activity a;

                            public /* synthetic */ C6481j12(Activity activity2222) {
                                r1 = activity2222;
                            }

                            @Override // defpackage.InterfaceC0079Ap3
                            public final Object get() {
                                return r1.getIntent();
                            }

                            @Override // defpackage.InterfaceC0079Ap3
                            public final /* synthetic */ boolean i() {
                                return AbstractC12248zp3.a(this);
                            }
                        };
                        InterfaceC0079Ap3 interfaceC0079Ap3 = c8201o12.j;
                        InterfaceC10590uz3 interfaceC10590uz3 = c8201o12.g;
                        R32 r32 = new R32(interfaceC10590uz3, interfaceC0079Ap3, a, c6481j12);
                        c8201o12.o = r32;
                        Q32 q32 = new Q32();
                        r32.e = q32;
                        ((AbstractC11276wz3) interfaceC10590uz3).c(q32);
                    }
                    return c8201o12.o;
                }
            }, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.m, this.n);
        }
        return this.p;
    }
}
