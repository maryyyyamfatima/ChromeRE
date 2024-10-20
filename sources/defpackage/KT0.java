package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KT0 {
    public HT0 a;
    public IT0 b;
    public JT0 c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ LT0 f;

    public final void b(boolean z) {
        int i;
        c cVar;
        GT0 gt0;
        LT0 lt0 = this.f;
        if (!lt0.j.J() && this.d.q.k == 0) {
            C3487aJ1 c3487aJ1 = lt0.k;
            if ((c3487aJ1.k() == 0) || lt0.q() == 0 || (i = this.d.i) >= lt0.q()) {
                return;
            }
            long j = i;
            if ((j != this.e || z) && (cVar = (c) c3487aJ1.d(j)) != null && cVar.W()) {
                this.e = j;
                h hVar = lt0.j;
                hVar.getClass();
                C10547us c10547us = new C10547us(hVar);
                ArrayList arrayList = new ArrayList();
                c cVar2 = null;
                int i2 = 0;
                while (true) {
                    int k = c3487aJ1.k();
                    gt0 = lt0.o;
                    if (i2 >= k) {
                        break;
                    }
                    long h = c3487aJ1.h(i2);
                    c cVar3 = (c) c3487aJ1.l(i2);
                    if (cVar3.W()) {
                        if (h != this.e) {
                            c10547us.k(cVar3, EnumC11683yA1.STARTED);
                            arrayList.add(gt0.a());
                        } else {
                            cVar2 = cVar3;
                        }
                        cVar3.G0(h == this.e);
                    }
                    i2++;
                }
                if (cVar2 != null) {
                    c10547us.k(cVar2, EnumC11683yA1.RESUMED);
                    arrayList.add(gt0.a());
                }
                if (c10547us.a.isEmpty()) {
                    return;
                }
                c10547us.f();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    gt0.getClass();
                    GT0.b(list);
                }
            }
        }
    }

    public KT0(LT0 lt0) {
        this.f = lt0;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }
}
