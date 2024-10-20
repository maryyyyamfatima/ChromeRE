package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.intersectionobserver.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10200tr1 implements InterfaceC7833mx0, InterfaceC6457ix0 {
    public final String a;
    public final AbstractC9896sy0 b;
    public final U80 c;
    public final AtomicReference d;
    public final List e;
    public final ArrayList f = new ArrayList();

    public C10200tr1(AtomicReference atomicReference, ArrayList arrayList, String str, AbstractC9896sy0 abstractC9896sy0, U80 u80) {
        this.d = atomicReference;
        this.e = arrayList;
        this.a = str;
        this.b = abstractC9896sy0;
        this.c = u80;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [yr1, java.lang.Object] */
    public final void d(View view) {
        InterfaceC9061qY2 interfaceC9061qY2 = (InterfaceC9061qY2) this.d.get();
        U80 u80 = this.c;
        if (interfaceC9061qY2 == null) {
            this.b.d(EnumC11438xU.A, "[IntersectionListener.onVisible] scrollStrategyListenerHolder is unavailable", u80, null);
            return;
        }
        String str = this.a;
        view.setTag(333384171, str);
        InterfaceC7103kq0 interfaceC7103kq0 = ((C3184Yn) u80).f;
        if (interfaceC7103kq0 != null) {
            interfaceC7103kq0.a(new C9857sr1(this));
        }
        for (IntersectionObserver intersectionObserver : this.e) {
            C9403rY2 c9403rY2 = ((C9746sY2) interfaceC9061qY2).a;
            HashMap hashMap = c9403rY2.b;
            if (hashMap == null) {
                hashMap = new HashMap();
                c9403rY2.b = hashMap;
            }
            C5348fk c5348fk = c9403rY2.c;
            if (c5348fk == null) {
                c5348fk = new C5348fk(0);
                c9403rY2.c = c5348fk;
            }
            Class<?> cls = intersectionObserver.getClass();
            final AbstractC8375oY2 abstractC8375oY2 = (AbstractC8375oY2) hashMap.get(cls);
            if (abstractC8375oY2 == null) {
                InterfaceC9989tE2 interfaceC9989tE2 = null;
                for (Class<?> cls2 = cls; cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                    interfaceC9989tE2 = (InterfaceC9989tE2) c9403rY2.a.get(cls2);
                    if (interfaceC9989tE2 != null) {
                        break;
                    }
                }
                if (interfaceC9989tE2 == null) {
                    throw new C10239ty0("Cannot find Provider<CollectionScrollStrategy> for ".concat(String.valueOf(cls)));
                }
                abstractC8375oY2 = (AbstractC8375oY2) interfaceC9989tE2.get();
                hashMap.put(cls, abstractC8375oY2);
                c5348fk.add(abstractC8375oY2);
            }
            if (abstractC8375oY2.a == null) {
                abstractC8375oY2.a = Collections.newSetFromMap(new WeakHashMap());
            }
            final IntersectionSubscription subscribe = ((IntersectionEngine) ((C12258zr1) abstractC8375oY2).b.get()).subscribe(str, intersectionObserver);
            final ?? r6 = new InterfaceC8718pY2() { // from class: yr1
                @Override // defpackage.InterfaceC8718pY2
                public final void cancel() {
                    IntersectionSubscription intersectionSubscription = IntersectionSubscription.this;
                    if (intersectionSubscription != null) {
                        intersectionSubscription.cancel();
                    }
                }
            };
            Set set = abstractC8375oY2.a;
            if (set != null) {
                set.add(r6);
            }
            this.f.add(new InterfaceC8718pY2() { // from class: nY2
                @Override // defpackage.InterfaceC8718pY2
                public final void cancel() {
                    AbstractC8375oY2 abstractC8375oY22 = AbstractC8375oY2.this;
                    abstractC8375oY22.getClass();
                    InterfaceC8718pY2 interfaceC8718pY2 = r6;
                    interfaceC8718pY2.cancel();
                    Set set2 = abstractC8375oY22.a;
                    if (set2 != null) {
                        set2.remove(interfaceC8718pY2);
                    }
                }
            });
            intersectionObserver.onViewDiscovered(view);
        }
    }

    @Override // defpackage.InterfaceC6457ix0
    public final void a(View view) {
        InterfaceC9061qY2 interfaceC9061qY2 = (InterfaceC9061qY2) this.d.get();
        if (interfaceC9061qY2 != null) {
            String str = this.a;
            C9746sY2 c9746sY2 = (C9746sY2) interfaceC9061qY2;
            Set<AbstractC8375oY2> set = c9746sY2.a.c;
            if (set == null) {
                int i = AbstractC1472Li1.h;
                set = UL2.o;
            }
            for (AbstractC8375oY2 abstractC8375oY2 : set) {
                Set set2 = abstractC8375oY2.a;
                if ((set2 == null || set2.isEmpty()) ? false : true) {
                    ((IntersectionEngine) ((C12258zr1) abstractC8375oY2).b.get()).onSizeChange(str, c9746sY2.d, C9746sY2.e, c9746sY2.b, true);
                }
            }
        }
        c();
        view.setTag(333384171, null);
    }

    @Override // defpackage.InterfaceC7833mx0
    public final void b(View view, View view2) {
        d(view);
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((IntersectionObserver) it.next()).onViewInvalidated();
        }
        ArrayList arrayList = this.f;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC8718pY2) it2.next()).cancel();
            } catch (RuntimeException unused) {
                this.b.d(EnumC11438xU.A, "Error in cancelling intersection subscription.", this.c, null);
            }
        }
        arrayList.clear();
    }
}
