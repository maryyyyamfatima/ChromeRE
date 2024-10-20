package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mB3 */
/* loaded from: classes.dex */
public final class C7573mB3 implements InterfaceC0186Bl0 {
    public static final long[] q;
    public final C7229lB3 a;
    public final I5 g;
    public final SharedPreferences h;
    public final LinkedList i;
    public LinkedList j;
    public C6448iv3 k;
    public final InterfaceC10590uz3 l;
    public final C12157za2 m;
    public int n;
    public long o;
    public final int p;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        q = new long[]{timeUnit.toMillis(1L), timeUnit.toMillis(30L), timeUnit2.toMillis(1L), timeUnit2.toMillis(2L), timeUnit2.toMillis(12L), timeUnit3.toMillis(1L), timeUnit3.toMillis(2L), timeUnit3.toMillis(7L), timeUnit3.toMillis(10L)};
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C7229lB3 c7229lB3 = this.a;
        ((AbstractC11276wz3) c7229lB3.c).c.f(c7229lB3.b);
        c7229lB3.a.destroy();
        this.g.c(this);
    }

    public C7573mB3(Activity activity, InterfaceC10590uz3 interfaceC10590uz3, I5 i5) {
        SharedPreferences sharedPreferences = V60.a.getSharedPreferences("TabsuggestionsPreferences", 0);
        this.j = new LinkedList();
        this.p = 30000;
        this.l = interfaceC10590uz3;
        LinkedList linkedList = new LinkedList();
        this.i = linkedList;
        linkedList.add(new C4823eB3());
        linkedList.add(new C8261oB3(activity));
        this.m = new C12157za2();
        this.a = new C7229lB3(this, interfaceC10590uz3);
        this.g = i5;
        i5.b(this);
        this.h = sharedPreferences;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            VA3 va3 = (VA3) it.next();
            int i = va3.b;
            List list = va3.a;
            if (i != 0) {
                if (i == 1) {
                    if (list.size() >= 3) {
                        linkedList2.add(va3);
                    }
                } else {
                    Log.e("TabSuggestDetailed", String.format("Unknown action: %d", Integer.valueOf(i)));
                }
            } else if (!list.isEmpty()) {
                linkedList2.add(va3);
            }
        }
        Collections.sort(linkedList2, new Comparator() { // from class: kB3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((VA3) obj).b, ((VA3) obj2).b);
            }
        });
        return linkedList2;
    }
}
