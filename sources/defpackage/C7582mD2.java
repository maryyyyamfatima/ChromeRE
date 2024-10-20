package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.elements.converters.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mD2 */
/* loaded from: classes.dex */
public final class C7582mD2 implements InterfaceC7238lD2 {
    public static final AbstractC1472Li1 h = AbstractC1472Li1.t(224886694, 287553821, Integer.valueOf(C11174wi0.p.d.a), Integer.valueOf(C7950nI1.p.d.a), 316055719, 268941992, 258411896, 338763089);
    public final SparseArray a;
    public final SparseArray b;
    public final TL2 c;
    public final AbstractC1472Li1 d;
    public final AbstractC9896sy0 e;
    public final AbstractC9095qe2 f;
    public final boolean g;

    public final void c(C7849n00 c7849n00, U80 u80, String str, UF0 uf0, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        AbstractC9896sy0 abstractC9896sy0;
        UF0 uf02 = uf0;
        if (uf02 == null) {
            return;
        }
        TF0 tf0 = (TF0) WP0.a.b();
        HashSet hashSet = new HashSet();
        hashSet.addAll(b(c7849n00, u80, str, uf0, interfaceC8177nx0, this.a, tf0, c8367oX));
        hashSet.addAll(b(c7849n00, u80, str, uf0, interfaceC8177nx0, this.b, tf0, c8367oX));
        HashSet hashSet2 = new HashSet();
        int i = 0;
        while (i < uf0.i()) {
            uf02.h(tf0, i);
            int j = tf0.j();
            boolean z = true;
            if (tf0.k() != 1) {
                if (tf0.k() == 0) {
                    hashSet2.add(Integer.valueOf(j));
                } else {
                    InterfaceC9298rD2 interfaceC9298rD2 = (InterfaceC9298rD2) this.c.get(Integer.valueOf(j));
                    AbstractC9896sy0 abstractC9896sy02 = this.e;
                    if (interfaceC9298rD2 == null) {
                        if (!h.contains(Integer.valueOf(j))) {
                            AbstractC9095qe2 abstractC9095qe2 = this.f;
                            if (!abstractC9095qe2.c() || !((InterfaceC6808jy2) abstractC9095qe2.b()).apply(Integer.valueOf(j))) {
                                z = false;
                            }
                        }
                        if (!z) {
                            String a = AbstractC9076qb1.a("No proto converter found for extension ", j);
                            if (this.d.contains(Integer.valueOf(j))) {
                                a = AbstractC7848n0.a(a, " due to having duplicate converter bindings.");
                            }
                            abstractC9896sy02.d(EnumC11438xU.z, a, u80, null);
                        }
                    } else {
                        try {
                            abstractC9896sy0 = abstractC9896sy02;
                            try {
                                interfaceC9298rD2.e(c7849n00, u80, str, AbstractC5180fE1.a(tf0.f(6), interfaceC9298rD2.a().c.h(), j == 168774585 ? XF0.c() : XF0.d()), interfaceC8177nx0, c8367oX);
                            } catch (C1127Ir1 e) {
                                e = e;
                                abstractC9896sy0.d(EnumC11438xU.y, AbstractC9076qb1.a("Failed to set PB Property Extension in PropertiesConverterFlat. Extension id: ", j), u80, e);
                                i++;
                                uf02 = uf0;
                            } catch (Exception e2) {
                                e = e2;
                                abstractC9896sy0.d(EnumC11438xU.H, "Property error", u80, e);
                                if (this.g) {
                                    throw new RuntimeException(AbstractC9307rF1.a("THIS IS NOT A PRODUCTION CRASH!\nConverter for property ", tf0.j(), " threw an exception."), e);
                                }
                                i++;
                                uf02 = uf0;
                            }
                        } catch (C1127Ir1 e3) {
                            e = e3;
                            abstractC9896sy0 = abstractC9896sy02;
                        } catch (Exception e4) {
                            e = e4;
                            abstractC9896sy0 = abstractC9896sy02;
                        }
                    }
                }
            }
            i++;
            uf02 = uf0;
        }
        hashSet.addAll(hashSet2);
        if (!hashSet.isEmpty()) {
            throw new C10239ty0(AbstractC4809e90.a("Extensions with unknown format: ", hashSet.toString()));
        }
        WP0.a.a(tf0);
    }

    public C7582mD2(ArrayList arrayList, C9390rW c9390rW, OL2 ol2, AbstractC9896sy0 abstractC9896sy0) {
        C5785h c5785h = C5785h.a;
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.e = abstractC9896sy0;
        this.f = c5785h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9641sD2 interfaceC9641sD2 = (InterfaceC9641sD2) it.next();
            this.a.put(interfaceC9641sD2.b(), interfaceC9641sD2);
        }
        Iterator it2 = c9390rW.iterator();
        while (true) {
            AbstractC11620y abstractC11620y = (AbstractC11620y) it2;
            if (!abstractC11620y.hasNext()) {
                break;
            }
            InterfaceC9641sD2 interfaceC9641sD22 = (InterfaceC9641sD2) abstractC11620y.next();
            this.b.put(interfaceC9641sD22.b(), interfaceC9641sD22);
        }
        HashSet hashSet = new HashSet();
        int i = AbstractC1472Li1.h;
        C1342Ki1 c1342Ki1 = new C1342Ki1();
        C0172Bi1 listIterator = ol2.listIterator(0);
        while (listIterator.hasNext()) {
            int i2 = ((InterfaceC9298rD2) listIterator.next()).a().d.a;
            if (!hashSet.add(Integer.valueOf(i2))) {
                c1342Ki1.f(Integer.valueOf(i2));
                abstractC9896sy0.a(EnumC11438xU.z, "Multiple property converters found and will be removed for extension " + i2);
            }
        }
        AbstractC1472Li1 g = c1342Ki1.g();
        this.d = g;
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        C0172Bi1 listIterator2 = ol2.listIterator(0);
        while (listIterator2.hasNext()) {
            InterfaceC9298rD2 interfaceC9298rD2 = (InterfaceC9298rD2) listIterator2.next();
            int i3 = interfaceC9298rD2.a().d.a;
            if (!g.contains(Integer.valueOf(i3))) {
                c0822Gi1.b(Integer.valueOf(i3), interfaceC9298rD2);
            }
        }
        this.c = c0822Gi1.a(true);
        this.g = Boolean.FALSE.booleanValue();
    }

    public final HashSet b(C7849n00 c7849n00, U80 u80, String str, UF0 uf0, InterfaceC8177nx0 interfaceC8177nx0, SparseArray sparseArray, TF0 tf0, C8367oX c8367oX) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < uf0.i(); i++) {
            uf0.h(tf0, i);
            if (tf0.k() == 1) {
                InterfaceC9641sD2 interfaceC9641sD2 = (InterfaceC9641sD2) sparseArray.get(tf0.j());
                if (interfaceC9641sD2 != null) {
                    try {
                        interfaceC9641sD2.e(c7849n00, u80, str, interfaceC9641sD2.d(tf0.f(6)), interfaceC8177nx0, c8367oX);
                    } catch (Exception e) {
                        this.e.d(EnumC11438xU.H, "Property error", u80, e);
                        if (this.g) {
                            throw new RuntimeException(AbstractC9307rF1.a("THIS IS NOT A PRODUCTION CRASH!\nConverter for property ", tf0.j(), " threw an exception."), e);
                        }
                    }
                }
            } else if (tf0.k() != 2) {
                hashSet.add(Integer.valueOf(tf0.j()));
            }
        }
        return hashSet;
    }

    public final void a(C7849n00 c7849n00, U80 u80, String str, h hVar, InterfaceC6115hx0 interfaceC6115hx0) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ((InterfaceC9641sD2) sparseArray.get(sparseArray.keyAt(i))).c(hVar);
            i++;
        }
    }
}
