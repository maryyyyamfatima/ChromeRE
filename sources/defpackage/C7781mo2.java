package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mo2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7781mo2 implements InterfaceC6749jo2 {
    public final Set a;
    public final ArrayList b = new ArrayList();
    public final InterfaceC6749jo2 c;
    public boolean d;
    public final /* synthetic */ C8125no2 e;

    public C7781mo2(C8125no2 c8125no2, HashSet hashSet, InterfaceC6749jo2 interfaceC6749jo2) {
        this.e = c8125no2;
        this.a = hashSet;
        this.c = interfaceC6749jo2;
    }

    @Override // defpackage.InterfaceC6749jo2
    public final InterfaceC7437lo2 e() {
        return this.c.e();
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void b(boolean z) {
        if (!z || this.d) {
            return;
        }
        this.d = true;
        this.c.b(true);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void g(PaymentApp paymentApp) {
        this.b.add(paymentApp);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void c(String str, int i) {
        this.c.c(str, i);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void d(InterfaceC7093ko2 interfaceC7093ko2) {
        Set set = this.a;
        set.remove(interfaceC7093ko2);
        if (set.isEmpty()) {
            boolean z = this.d;
            InterfaceC6749jo2 interfaceC6749jo2 = this.c;
            if (!z) {
                interfaceC6749jo2.b(false);
            }
            ArrayList arrayList = this.b;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                hashMap.put(((PaymentApp) arrayList.get(i)).l, (PaymentApp) arrayList.get(i));
            }
            for (int i2 = 0; i2 < size; i2++) {
                hashMap.remove(((PaymentApp) arrayList.get(i2)).l());
            }
            HashSet hashSet = new HashSet(hashMap.values());
            Iterator it = hashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaymentApp paymentApp = (PaymentApp) it.next();
                if (paymentApp.w()) {
                    hashSet.clear();
                    hashSet.add(paymentApp);
                    break;
                }
                Set m = paymentApp.m();
                if (m != null) {
                    Iterator it2 = m.iterator();
                    while (it2.hasNext()) {
                        if (hashMap.containsKey((String) it2.next())) {
                            hashSet.remove(paymentApp);
                        }
                    }
                }
            }
            arrayList.clear();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                interfaceC6749jo2.g((PaymentApp) it3.next());
            }
            interfaceC6749jo2.d(this.e);
        }
    }
}
