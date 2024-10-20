package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.k;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ug3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2633Ug3 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public abstract void b(ArrayList arrayList, boolean z);

    public static AbstractC2633Ug3 f(ViewGroup viewGroup, C8691pT0 c8691pT0) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AbstractC2633Ug3) {
            return (AbstractC2633Ug3) tag;
        }
        c8691pT0.getClass();
        C1481Lk0 c1481Lk0 = new C1481Lk0(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c1481Lk0);
        return c1481Lk0;
    }

    public AbstractC2633Ug3(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final C1983Pg3 d(c cVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            C1983Pg3 c1983Pg3 = (C1983Pg3) it.next();
            if (c1983Pg3.c.equals(cVar) && !c1983Pg3.f) {
                return c1983Pg3;
            }
        }
        return null;
    }

    public final void a(int i, int i2, k kVar) {
        synchronized (this.b) {
            QF qf = new QF();
            C1983Pg3 d = d(kVar.c);
            if (d != null) {
                d.c(i, i2);
                return;
            }
            C1983Pg3 c1983Pg3 = new C1983Pg3(i, i2, kVar, qf);
            this.b.add(c1983Pg3);
            c1983Pg3.d.add(new RunnableC1723Ng3(this, c1983Pg3));
            c1983Pg3.d.add(new RunnableC1853Og3(this, c1983Pg3));
        }
    }

    public final void g() {
        synchronized (this.b) {
            h();
            this.e = false;
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1983Pg3 c1983Pg3 = (C1983Pg3) this.b.get(size);
                int c = AbstractC2503Tg3.c(c1983Pg3.c.L);
                if (c1983Pg3.a == 2 && c != 2) {
                    NS0 ns0 = c1983Pg3.c.O;
                    this.e = false;
                    break;
                }
            }
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = Ec4.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1983Pg3 c1983Pg3 = (C1983Pg3) it.next();
                    c1983Pg3.a();
                    if (!c1983Pg3.g) {
                        this.c.add(c1983Pg3);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C1983Pg3) it2.next()).d();
                }
                b(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final void e() {
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = Ec4.a;
        viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            h();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((C1983Pg3) it.next()).d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                ((C1983Pg3) it2.next()).a();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                ((C1983Pg3) it3.next()).a();
            }
        }
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            C1983Pg3 c1983Pg3 = (C1983Pg3) it.next();
            if (c1983Pg3.b == 2) {
                c1983Pg3.c(AbstractC2503Tg3.b(c1983Pg3.c.C0().getVisibility()), 1);
            }
        }
    }
}
