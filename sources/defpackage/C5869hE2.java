package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.n;
import com.google.common.util.concurrent.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hE2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5869hE2 {
    public final String a;
    public final RD1 b;
    public final InterfaceC9175qr4 c;
    public final InterfaceC5544gI1 d;
    public final C8273oE0 e;
    public final C11146wd2 f;
    public final C11146wd2 g;
    public final Object h;
    public final AbstractC10997wA1 i;
    public List j;

    public C5869hE2(final C3003Xc3 c3003Xc3, InterfaceC5544gI1 interfaceC5544gI1, C0 c0, boolean z) {
        C8145nr4 c8145nr4 = new C8145nr4(this);
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        this.g = new C11146wd2(c8145nr4, enumC6747jo0);
        Object obj = new Object();
        this.h = obj;
        this.j = new ArrayList();
        this.c = c3003Xc3;
        this.d = interfaceC5544gI1;
        this.b = c0;
        this.a = c3003Xc3.a;
        this.f = new C11146wd2(new InterfaceC2909Wk() { // from class: Rc3
            @Override // defpackage.InterfaceC2909Wk
            public final RD1 call() {
                final C3003Xc3 c3003Xc32 = C3003Xc3.this;
                c3003Xc32.getClass();
                return AbstractC5957hW0.d(AbstractC5957hW0.e(c3003Xc32.b, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: Sc3
                    @Override // defpackage.InterfaceC3299Zk
                    public final RD1 apply(Object obj2) {
                        Uri uri = (Uri) obj2;
                        C3694au3 c3694au3 = C3003Xc3.this.e;
                        Uri a = T24.a(uri, ".bak");
                        try {
                            C1837Od2 a2 = c3694au3.a(a);
                            if (a2.a.b(a2.d)) {
                                c3694au3.b(a, uri);
                            }
                            return C9803si1.g;
                        } catch (IOException e) {
                            return new v(e);
                        }
                    }
                }), c3003Xc32.d));
            }
        }, enumC6747jo0);
        this.e = new C8273oE0();
        if (z) {
            this.i = new C10654vA1();
        } else {
            this.i = new C10311uA1();
        }
        InterfaceC3299Zk interfaceC3299Zk = new InterfaceC3299Zk() { // from class: hr4
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj2) {
                return C5869hE2.this.f.a();
            }
        };
        synchronized (obj) {
            this.j.add(interfaceC3299Zk);
        }
    }

    public final RD1 a() {
        RD1 rd1;
        AbstractC10997wA1 abstractC10997wA1 = this.i;
        abstractC10997wA1.b();
        C11146wd2 c11146wd2 = this.g;
        if (!c11146wd2.f.isDone()) {
            RunnableC9793sg3 a = abstractC10997wA1.a("Get " + this.a);
            try {
                C0 e = AbstractC5957hW0.e(c11146wd2.a(), AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: gr4
                    @Override // defpackage.InterfaceC3299Zk
                    public final RD1 apply(Object obj) {
                        return ((C3003Xc3) C5869hE2.this.c).a();
                    }
                }), EnumC6747jo0.a);
                a.b(e);
                a.close();
                rd1 = e;
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } else {
            rd1 = ((C3003Xc3) this.c).a();
        }
        AbstractC5957hW0.d(this.b);
        this.d.getClass();
        return AbstractC5957hW0.d(rd1);
    }

    public final RD1 b(final CV0 cv0, final InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1) {
        final C4231cU3 b = AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: ir4
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj) {
                return AbstractC5957hW0.c(CV0.this.apply(obj));
            }
        });
        C8273oE0 c8273oE0 = this.e;
        RunnableC9793sg3 a = this.i.a("Update " + this.a);
        try {
            final n a2 = this.g.a();
            InterfaceC2909Wk interfaceC2909Wk = new InterfaceC2909Wk() { // from class: jr4
                @Override // defpackage.InterfaceC2909Wk
                public final RD1 call() {
                    return a2;
                }
            };
            EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
            c8273oE0.a(interfaceC2909Wk, enumC6747jo0);
            RD1 a3 = c8273oE0.a(AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: kr4
                @Override // defpackage.InterfaceC2909Wk
                public final RD1 call() {
                    final C5869hE2 c5869hE2 = C5869hE2.this;
                    c5869hE2.getClass();
                    final InterfaceC3299Zk interfaceC3299Zk = b;
                    final Executor executor = interfaceScheduledExecutorServiceC4493dE1;
                    return AbstractC5957hW0.e(a2, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: lr4
                        @Override // defpackage.InterfaceC3299Zk
                        public final RD1 apply(Object obj) {
                            C3003Xc3 c3003Xc3 = (C3003Xc3) C5869hE2.this.c;
                            return c3003Xc3.i.a(AbstractC4575dU3.a(new C2483Tc3(c3003Xc3, c3003Xc3.a(), interfaceC3299Zk, executor)), EnumC6747jo0.a);
                        }
                    }), EnumC6747jo0.a);
                }
            }), enumC6747jo0);
            if (!a2.isDone()) {
                if (!a3.isDone()) {
                    RunnableC5613gW0 runnableC5613gW0 = new RunnableC5613gW0(a3, a2);
                    a3.f(runnableC5613gW0, enumC6747jo0);
                    a2.f(runnableC5613gW0, enumC6747jo0);
                } else if (a3 instanceof n) {
                    ((n) a3).q(a2);
                } else if (a3.isCancelled()) {
                    a2.cancel(false);
                }
            }
            InterfaceC5544gI1 interfaceC5544gI1 = this.d;
            AbstractC5957hW0.d(this.b);
            interfaceC5544gI1.getClass();
            a.b(a3);
            a.close();
            return a3;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
