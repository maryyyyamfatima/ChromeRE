package defpackage;

import android.app.Activity;
import java.util.Objects;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bd0 */
/* loaded from: classes.dex */
public final class C3933bd0 {
    public final Activity a;
    public final C5313fe0 b;
    public final C9360rQ c;
    public final InterfaceC3241Yy1 d;
    public final InterfaceC3241Yy1 e;
    public final PC f;
    public final InterfaceC10912vv3 g;
    public final InterfaceC0079Ap3 h;
    public final InterfaceC0079Ap3 i;
    public final InterfaceC3241Yy1 j;
    public C5319ff0 k;

    public C3933bd0(Activity activity, C5313fe0 c5313fe0, C9360rQ c9360rQ, InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC3241Yy1 interfaceC3241Yy12, PC pc, InterfaceC3241Yy1 interfaceC3241Yy13, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32) {
        this.a = activity;
        this.b = c5313fe0;
        this.c = c9360rQ;
        this.d = interfaceC3241Yy1;
        this.e = interfaceC3241Yy12;
        this.f = pc;
        this.j = interfaceC3241Yy13;
        this.g = interfaceC10912vv3;
        this.h = interfaceC0079Ap3;
        this.i = interfaceC0079Ap32;
    }

    public final void b() {
        C5319ff0 c5319ff0 = this.k;
        InterfaceC3241Yy1 interfaceC3241Yy1 = this.d;
        Objects.requireNonNull(interfaceC3241Yy1);
        C3260Zc0 c3260Zc0 = new InterfaceC0079Ap3() { // from class: Zc0
            public /* synthetic */ C3260Zc0() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return (WindowAndroid) InterfaceC3241Yy1.this.get();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        };
        InterfaceC10912vv3 interfaceC10912vv3 = this.g;
        C9360rQ c9360rQ = this.c;
        C10505ul c10505ul = (C10505ul) this.j.get();
        c5319ff0.getClass();
        c5319ff0.b = new C0129Az3(c3260Zc0, interfaceC10912vv3, c9360rQ, new InterfaceC3751b42() { // from class: ef0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return 1;
            }
        }, c10505ul, false, 1);
        c5319ff0.c = this.b;
        C9284rA3 c9284rA3 = new C9284rA3(c5319ff0.c, c5319ff0.b, interfaceC10912vv3);
        c5319ff0.a = c9284rA3;
        c9284rA3.e.a(new C9219qz3(c5319ff0));
        c5319ff0.d = true;
    }

    public final AbstractC11276wz3 c() {
        if (this.k == null) {
            this.k = new C5319ff0();
        }
        if (this.k.b == null) {
            b();
        }
        return this.k.b;
    }

    public final C8332oQ a(boolean z) {
        Activity activity = this.a;
        WindowAndroid windowAndroid = (WindowAndroid) this.d.get();
        final InterfaceC3241Yy1 interfaceC3241Yy1 = this.e;
        Objects.requireNonNull(interfaceC3241Yy1);
        return new C8332oQ(activity, windowAndroid, new InterfaceC0079Ap3() { // from class: ad0
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return (InterfaceC11941yv3) InterfaceC3241Yy1.this.get();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, z, null, AbstractC10848vl.a, this.h, this.i);
    }
}
