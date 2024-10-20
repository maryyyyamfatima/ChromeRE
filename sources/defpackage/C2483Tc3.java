package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2483Tc3 implements InterfaceC2909Wk {
    public final /* synthetic */ C3003Xc3 a;
    public final /* synthetic */ RD1 b;
    public final /* synthetic */ InterfaceC3299Zk c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ C2483Tc3(C3003Xc3 c3003Xc3, RD1 rd1, InterfaceC3299Zk interfaceC3299Zk, Executor executor) {
        this.a = c3003Xc3;
        this.b = rd1;
        this.c = interfaceC3299Zk;
        this.d = executor;
    }

    @Override // defpackage.InterfaceC2909Wk
    public final RD1 call() {
        final C3003Xc3 c3003Xc3 = this.a;
        c3003Xc3.getClass();
        InterfaceC3299Zk interfaceC3299Zk = new InterfaceC3299Zk() { // from class: Oc3
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj) {
                RD1 rd1;
                C3003Xc3 c3003Xc32 = C3003Xc3.this;
                synchronized (c3003Xc32.h) {
                    rd1 = c3003Xc32.j;
                }
                return rd1;
            }
        };
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        final C0 e = AbstractC5957hW0.e(this.b, interfaceC3299Zk, enumC6747jo0);
        final C0 e2 = AbstractC5957hW0.e(e, this.c, this.d);
        return AbstractC5957hW0.e(e2, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: Mc3
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj) {
                final C3003Xc3 c3003Xc32 = C3003Xc3.this;
                RD1 rd1 = e;
                final RD1 rd12 = e2;
                c3003Xc32.getClass();
                rd1.isDone();
                Object a = AbstractC7515m14.a(rd1);
                rd12.isDone();
                if (a.equals(AbstractC7515m14.a(rd12))) {
                    return C9803si1.g;
                }
                C0 e3 = AbstractC5957hW0.e(rd12, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: Pc3
                    @Override // defpackage.InterfaceC3299Zk
                    public final RD1 apply(Object obj2) {
                        C3003Xc3 c3003Xc33 = C3003Xc3.this;
                        RD1 rd13 = rd12;
                        c3003Xc33.c((Uri) AbstractC5957hW0.b(c3003Xc33.b), obj2);
                        synchronized (c3003Xc33.h) {
                            c3003Xc33.j = rd13;
                        }
                        return C9803si1.g;
                    }
                }), c3003Xc32.d);
                synchronized (c3003Xc32.h) {
                }
                return e3;
            }
        }), enumC6747jo0);
    }
}
