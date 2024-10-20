package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import org.chromium.chrome.browser.history.HistoryItemView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ug0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2630Ug0 extends AbstractC8305oK2 {
    public int i;
    public final TreeSet j = new TreeSet(new C1201Jg0());

    static {
        UE.b();
    }

    public final void S() {
        this.i = 0;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            C2370Sg0 c2370Sg0 = (C2370Sg0) it.next();
            Iterator it2 = c2370Sg0.b.iterator();
            while (it2.hasNext()) {
                ((AbstractC2500Tg0) it2.next()).a = -1;
            }
            int i = this.i;
            boolean z = c2370Sg0.c;
            ArrayList arrayList = c2370Sg0.b;
            if (!z) {
                c2370Sg0.c = true;
                Collections.sort(arrayList, new C2240Rg0(c2370Sg0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((AbstractC2500Tg0) arrayList.get(i2)).a = i;
                arrayList.size();
                i++;
            }
            this.i = arrayList.size() + this.i;
        }
    }

    public final void R() {
        if (Q()) {
            TreeSet treeSet = this.j;
            treeSet.remove(treeSet.first());
            S();
            t();
        }
    }

    public final boolean Q() {
        TreeSet treeSet = this.j;
        return !treeSet.isEmpty() && ((C2370Sg0) treeSet.first()).c() == 1;
    }

    public final boolean P() {
        TreeSet treeSet = this.j;
        return !treeSet.isEmpty() && ((C2370Sg0) treeSet.last()).c() == 4;
    }

    public final Pair O(int i) {
        Pair N = N(i);
        C2370Sg0 c2370Sg0 = (C2370Sg0) N.first;
        Date date = c2370Sg0.a;
        int intValue = ((Integer) N.second).intValue();
        boolean z = c2370Sg0.c;
        ArrayList arrayList = c2370Sg0.b;
        if (!z) {
            c2370Sg0.c = true;
            Collections.sort(arrayList, new C2240Rg0(c2370Sg0));
        }
        return new Pair(date, (AbstractC2500Tg0) arrayList.get(intValue));
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        Pair N = N(i);
        return ((C2370Sg0) N.first).b(((Integer) N.second).intValue());
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i != -2 && i != -1) {
            if (i == 0) {
                return new C1590Mg0(AbstractC9192qu3.a(recyclerView, R.layout.f56930_resource_name_obfuscated_res_0x7f0e00be, recyclerView, false));
            }
            if (i != 1) {
                return null;
            }
            C4117c81 c4117c81 = (C4117c81) this;
            View a = AbstractC9192qu3.a(recyclerView, R.layout.f57840_resource_name_obfuscated_res_0x7f0e0122, recyclerView, false);
            O81 o81 = c4117c81.k;
            o81.getClass();
            C7526m33 c7526m33 = o81.q;
            V23 v23 = new V23(a, c7526m33);
            HistoryItemView historyItemView = (HistoryItemView) a;
            boolean e = true ^ c7526m33.e();
            historyItemView.M = e;
            if (AbstractC8650pL.a("history.deleting_enabled")) {
                historyItemView.F.setVisibility(e ? 0 : 4);
            }
            historyItemView.I = c4117c81.m;
            c4117c81.l.add(historyItemView);
            return v23;
        }
        return new C1331Kg0(AbstractC9192qu3.a(recyclerView, R.layout.f56900_resource_name_obfuscated_res_0x7f0e00bb, recyclerView, false));
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        Pair N = N(i);
        int b = ((C2370Sg0) N.first).b(((Integer) N.second).intValue());
        Pair O = O(i);
        if (b == -2) {
            View view = ((C1720Ng0) O.second).d;
            View view2 = ((C1331Kg0) dVar).a;
            ((ViewGroup) view2).removeAllViews();
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            ((ViewGroup) view2).addView(view);
            return;
        }
        if (b == -1) {
            View view3 = ((C1980Pg0) O.second).d;
            View view4 = ((C1331Kg0) dVar).a;
            ((ViewGroup) view4).removeAllViews();
            if (view3.getParent() != null) {
                ((ViewGroup) view3.getParent()).removeView(view3);
            }
            ((ViewGroup) view4).addView(view3);
            return;
        }
        if (b == 0) {
            ((C1590Mg0) dVar).z.setText(AbstractC11550xn3.a((Date) O.first));
        } else {
            if (b != 1) {
                if (b != 2) {
                    return;
                }
                HI2.a(dVar);
                throw null;
            }
            Q81 q81 = (Q81) ((AbstractC2500Tg0) O.second);
            O81 o81 = ((C4117c81) this).k;
            o81.getClass();
            q81.j = o81;
            ((V23) dVar).z.k(q81);
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.i;
    }

    public final Pair N(int i) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            C2370Sg0 c2370Sg0 = (C2370Sg0) it.next();
            if (i >= c2370Sg0.b.size()) {
                i -= c2370Sg0.b.size();
            } else {
                return new Pair(c2370Sg0, Integer.valueOf(i));
            }
        }
        return null;
    }

    public static int M(Date date, Date date2) {
        Calendar a = UE.a();
        Calendar a2 = UE.a();
        a.setTime(date);
        a2.setTime(date2);
        if (a.get(1) == a2.get(1) && a.get(6) == a2.get(6)) {
            return 0;
        }
        return a.before(a2) ? 1 : -1;
    }

    @Override // defpackage.AbstractC8305oK2
    public final long r(int i) {
        if (!this.g) {
            return -1L;
        }
        Pair O = O(i);
        Object obj = O.second;
        if (obj != null) {
            return ((AbstractC2500Tg0) obj).a();
        }
        Date date = (Date) O.first;
        UE.a().setTime(date);
        return (r0.get(1) << 16) + r0.get(6);
    }
}
