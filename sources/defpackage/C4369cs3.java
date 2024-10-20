package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cs3 */
/* loaded from: classes.dex */
public final class C4369cs3 extends AbstractC3965bi2 {
    public final h c;
    public C10547us d = null;
    public c e = null;
    public boolean f;
    public final ArrayList g;
    public final Integer h;
    public final EnumC3721az2 i;
    public TL2 j;

    @Override // defpackage.AbstractC3965bi2
    public final /* bridge */ /* synthetic */ void k() {
    }

    @Override // defpackage.AbstractC3965bi2
    public final /* bridge */ /* synthetic */ void l() {
    }

    @Override // defpackage.AbstractC3965bi2
    public final int f() {
        return this.g.size();
    }

    public C4369cs3(h hVar, C2553Tq3 c2553Tq3, Integer num, boolean z, boolean z2, EnumC3721az2 enumC3721az2, int i) {
        int i2;
        int i3;
        this.c = hVar;
        ArrayList arrayList = new ArrayList(c2553Tq3.n.size());
        Iterator it = c2553Tq3.n.iterator();
        while (true) {
            int i4 = 5;
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            C4363cr3 c4363cr3 = (C4363cr3) it.next();
            int i5 = c4363cr3.p;
            if (i5 == 0) {
                i4 = 1;
            } else if (i5 == 1) {
                i4 = 2;
            } else if (i5 == 2) {
                i4 = 3;
            } else if (i5 == 3) {
                i4 = 4;
            } else if (i5 != 4) {
                i4 = 0;
            }
            int b = AbstractC2373Sg3.b(i4 == 0 ? 6 : i4);
            if (b == 1) {
                arrayList.add(new C3936bd3(c4363cr3));
            } else if (b == 2) {
                arrayList.add(new C4070c02(c4363cr3));
            } else if (b == 3) {
                arrayList.add(new C3478aH2(c4363cr3));
            } else if (b == 4) {
                arrayList.add(new C2097Qd2(c4363cr3));
            }
        }
        if (OP0.c(J61.a(OP0.b))) {
            if (enumC3721az2 == EnumC3721az2.CARD) {
                C9168qq3 c9168qq3 = c2553Tq3.k;
                arrayList.add(new KJ3(c9168qq3 == null ? C9168qq3.o : c9168qq3));
            }
        } else {
            C9168qq3 c9168qq32 = c2553Tq3.k;
            arrayList.add(new KJ3(c9168qq32 == null ? C9168qq3.o : c9168qq32));
        }
        this.g = arrayList;
        if (!z || arrayList.isEmpty()) {
            i3 = i;
        } else {
            arrayList.remove(0);
            i3 = i - 1;
        }
        if (OP0.a() && i3 > 0) {
            arrayList.subList(0, i3).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        C0822Gi1 a = AbstractC0952Hi1.a();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC11574xr3 abstractC11574xr3 = (AbstractC11574xr3) it2.next();
            if (!AbstractC2373Sg3.a(abstractC11574xr3.a, 5)) {
                a.b(Integer.valueOf(abstractC11574xr3.b.l), Integer.valueOf(i2));
                i2++;
            }
        }
        this.j = a.a(true);
        if (this.g.isEmpty()) {
            throw new NullPointerException("Questions were missing!");
        }
        this.h = num;
        this.i = enumC3721az2;
    }

    @Override // defpackage.AbstractC3965bi2
    public final void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // defpackage.AbstractC3965bi2
    public final Object h(int i, ViewGroup viewGroup) {
        C10547us c10547us = this.d;
        h hVar = this.c;
        if (c10547us == null) {
            hVar.getClass();
            this.d = new C10547us(hVar);
        }
        long j = i;
        c B = hVar.B("android:switcher:" + viewGroup.getId() + ":" + j);
        if (B == null) {
            B = ((AbstractC11574xr3) this.g.get(i)).a(i, this.h);
            B.l.putInt("QuestionIndex", i);
            this.d.g(viewGroup.getId(), B, "android:switcher:" + viewGroup.getId() + ":" + j, 1);
        } else {
            C10547us c10547us2 = this.d;
            c10547us2.getClass();
            c10547us2.b(new TT0(7, B));
        }
        if (B != this.e) {
            B.G0(false);
            B.I0(false);
        }
        return B;
    }

    @Override // defpackage.AbstractC3965bi2
    public final void d(ViewGroup viewGroup, Object obj) {
        c cVar = (c) obj;
        if (this.d == null) {
            h hVar = this.c;
            hVar.getClass();
            this.d = new C10547us(hVar);
        }
        C10547us c10547us = this.d;
        c10547us.getClass();
        h hVar2 = cVar.x;
        if (hVar2 != null && hVar2 != c10547us.q) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
        }
        c10547us.b(new TT0(6, cVar));
        if (cVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.AbstractC3965bi2
    public final void m(Object obj) {
        c cVar = (c) obj;
        c cVar2 = this.e;
        if (cVar != cVar2) {
            if (cVar2 != null) {
                cVar2.G0(false);
                this.e.I0(false);
            }
            cVar.G0(true);
            cVar.I0(true);
            this.e = cVar;
        }
    }

    @Override // defpackage.AbstractC3965bi2
    public final void e() {
        C10547us c10547us = this.d;
        if (c10547us != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    if (c10547us.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c10547us.h = false;
                    c10547us.q.x(c10547us, true);
                } finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }

    @Override // defpackage.AbstractC3965bi2
    public final boolean i(View view, Object obj) {
        return ((c) obj).L == view;
    }
}
