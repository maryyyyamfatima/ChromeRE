package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gE2 */
/* loaded from: classes.dex */
public final class C5525gE2 implements InterfaceC3299Zk {
    public final List a;
    public final Executor b;

    @Override // defpackage.InterfaceC3299Zk
    public final RD1 apply(Object obj) {
        final C8832pr4 c8832pr4 = (C8832pr4) obj;
        List list = this.a;
        final int size = list.size();
        final ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        final C4231cU3 b = AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: cE2
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj2) {
                final MessageLite messageLite = (MessageLite) obj2;
                final C5525gE2 c5525gE2 = this;
                c5525gE2.getClass();
                final List list2 = arrayList;
                AbstractC0562Ei1 n = AbstractC0562Ei1.n(list2);
                final int i = size;
                return new C7335lX(n, false, c5525gE2.b, AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: eE2
                    @Override // defpackage.InterfaceC2909Wk
                    public final RD1 call() {
                        C5525gE2 c5525gE22 = c5525gE2;
                        c5525gE22.getClass();
                        RD1 c = AbstractC5957hW0.c(messageLite);
                        for (int i2 = 0; i2 < i; i2++) {
                            if (((Boolean) AbstractC5957hW0.b((Future) list2.get(i2))).booleanValue()) {
                                X5.a(c5525gE22.a.get(i2));
                                c = AbstractC5957hW0.e(c, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: fE2
                                    @Override // defpackage.InterfaceC3299Zk
                                    public final RD1 apply(Object obj3) {
                                        throw null;
                                    }
                                }), EnumC6747jo0.a);
                            }
                        }
                        return c;
                    }
                }));
            }
        });
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        C5869hE2 c5869hE2 = c8832pr4.a;
        c5869hE2.i.b();
        return AbstractC5957hW0.e(AbstractC5957hW0.e(AbstractC5957hW0.d(c5869hE2.f.a()), AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: or4
            public final /* synthetic */ Executor c = EnumC6747jo0.a;

            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj2) {
                C3003Xc3 c3003Xc3 = (C3003Xc3) C8832pr4.this.a.c;
                return c3003Xc3.i.a(AbstractC4575dU3.a(new C2483Tc3(c3003Xc3, c3003Xc3.a(), b, this.c)), EnumC6747jo0.a);
            }
        }), enumC6747jo0), AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: dE2
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj2) {
                C5525gE2 c5525gE2 = this;
                c5525gE2.getClass();
                int i = size;
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) AbstractC5957hW0.b((Future) arrayList.get(i2))).booleanValue()) {
                        X5.a(c5525gE2.a.get(i2));
                        throw null;
                    }
                }
                return new C7335lX(AbstractC0562Ei1.n(arrayList2), true, (Executor) EnumC6747jo0.a, new Callable() { // from class: YE
                    public final /* synthetic */ Object a = null;

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a;
                    }
                });
            }
        }), enumC6747jo0);
    }

    public C5525gE2(AbstractC0562Ei1 abstractC0562Ei1, Executor executor) {
        this.a = abstractC0562Ei1;
        this.b = executor;
    }
}
