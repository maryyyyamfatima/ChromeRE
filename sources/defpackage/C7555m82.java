package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m82 */
/* loaded from: classes.dex */
public final class C7555m82 implements InterfaceC11350xC1 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public int d;

    public final AbstractC6867k82 b(int i) {
        return (AbstractC6867k82) this.a.get(i);
    }

    public final int a(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((AbstractC6867k82) arrayList.get(i)).a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final boolean g(ArrayList arrayList, int i, int i2) {
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        int i6;
        HashSet hashSet = new HashSet();
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            hashSet.add(((AbstractC6867k82) arrayList.get(i8)).a);
        }
        HashMap hashMap = new HashMap();
        int i9 = i;
        while (true) {
            i3 = i + i2;
            if (i9 >= i3) {
                break;
            }
            AbstractC6867k82 b = b(i9);
            hashMap.put(b.a, b);
            i9++;
        }
        int i10 = i3 - 1;
        boolean z = false;
        while (true) {
            arrayList2 = this.b;
            arrayList3 = this.a;
            if (i10 < i) {
                break;
            }
            int i11 = i10;
            while (i11 >= i) {
                String str = b(i11).a;
                if (hashSet.contains(str)) {
                    break;
                }
                hashMap.remove(str);
                i11--;
            }
            if (i11 != i10) {
                int i12 = i11 + 1;
                int i13 = i10 - i11;
                arrayList3.subList(i12, i12 + i13).clear();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((InterfaceC11693yC1) it.next()).n(i12, i13);
                }
                z = true;
                i10 = i11;
            } else {
                i10--;
            }
        }
        while (i7 < arrayList.size()) {
            AbstractC6867k82 abstractC6867k82 = (AbstractC6867k82) arrayList.get(i7);
            if (hashMap.containsKey(abstractC6867k82.a)) {
                int a = a(abstractC6867k82.a);
                int i14 = i7 + i;
                if (a != i14) {
                    if (a < i14) {
                        i4 = -1;
                        i6 = a;
                        i5 = i14;
                    } else if (a > i14) {
                        i4 = 1;
                        i5 = a;
                        i6 = i14;
                    }
                    Collections.rotate(arrayList3.subList(i6, i5 + 1), i4);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC11693yC1) it2.next()).e(a, i14);
                    }
                }
                i7++;
                z = true;
            } else {
                int i15 = i7 + 1;
                while (i15 < arrayList.size() && !hashMap.containsKey(((AbstractC6867k82) arrayList.get(i15)).a)) {
                    i15++;
                }
                int i16 = i7 + i;
                List subList = arrayList.subList(i7, i15);
                arrayList3.addAll(i16, subList);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC11693yC1) it3.next()).a(i16, subList.size());
                }
                z = true;
                i7 = i15;
            }
        }
        return z;
    }

    public final boolean f(int i) {
        return ((AbstractC6867k82) this.a.get(i)).b();
    }

    public final HashMap c(int i) {
        C7954nJ0 a;
        HashMap hashMap = this.c;
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size() && (a = ((AbstractC6867k82) arrayList.get(i)).a()) != null) {
                HashMap hashMap2 = new HashMap(hashMap);
                hashMap2.put("LoggingParameters", a);
                return hashMap2;
            }
        }
        return hashMap;
    }

    public final int d() {
        return this.a.size();
    }

    public final FrameLayout e(int i, RecyclerView recyclerView) {
        C7211l82 c7211l82;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                c7211l82 = null;
                break;
            }
            AbstractC6867k82 abstractC6867k82 = (AbstractC6867k82) arrayList.get(i2);
            if (abstractC6867k82.b()) {
                c7211l82 = (C7211l82) abstractC6867k82;
                if (c7211l82.d == i) {
                    break;
                }
            }
            i2++;
        }
        c7211l82.getClass();
        Context context = recyclerView.getContext();
        if (c7211l82.b == null) {
            c7211l82.b = LayoutInflater.from(context).inflate(c7211l82.c, (ViewGroup) recyclerView, false);
        }
        AbstractC8540p04.i(c7211l82.b);
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-1, -2)));
        int i3 = c7211l82.e;
        frameLayout.setPadding(i3, 0, i3, 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.addView(c7211l82.b);
        return frameLayout;
    }
}
