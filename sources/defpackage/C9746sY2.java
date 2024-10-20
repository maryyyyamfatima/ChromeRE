package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sY2 */
/* loaded from: classes.dex */
public final class C9746sY2 implements InterfaceC9061qY2 {
    public static final Rect e = new Rect(0, 0, 0, 0);
    public final C9403rY2 a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final Rect d = new Rect();

    public C9746sY2(Map map) {
        this.a = new C9403rY2(map);
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        AbstractC12077zK2 abstractC12077zK2 = recyclerView.s;
        if (abstractC12077zK2 instanceof LinearLayoutManager) {
            Set<AbstractC8375oY2> set = this.a.c;
            if (set == null) {
                int i3 = AbstractC1472Li1.h;
                set = UL2.o;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC12077zK2;
            Rect rect = this.b;
            recyclerView.getGlobalVisibleRect(rect);
            int R0 = linearLayoutManager.R0();
            int T0 = linearLayoutManager.T0();
            for (AbstractC8375oY2 abstractC8375oY2 : set) {
                Set set2 = abstractC8375oY2.a;
                char c = 1;
                int i4 = 0;
                if ((set2 == null || set2.isEmpty()) ? false : true) {
                    int i5 = R0;
                    while (i5 <= T0) {
                        View r = abstractC12077zK2.r(i5);
                        if (r != null) {
                            ArrayList arrayList = new ArrayList();
                            C0172Bi1 listIterator = AbstractC8868py0.b.listIterator(i4);
                            while (listIterator.hasNext()) {
                                Object tag = r.getTag(((Integer) listIterator.next()).intValue());
                                if (tag instanceof String) {
                                    arrayList.add((String) tag);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Rect rect2 = this.c;
                                r.getGlobalVisibleRect(rect2);
                                int[] iArr = new int[2];
                                r.getLocationOnScreen(iArr);
                                int width = r.getWidth() + iArr[i4];
                                int i6 = rect2.right;
                                if (i6 <= rect.left || i6 >= rect.right) {
                                    i6 = width;
                                }
                                int height = r.getHeight() + iArr[c];
                                int i7 = rect2.bottom;
                                if (i7 > rect.top && i7 < rect.bottom) {
                                    height = i7;
                                }
                                i4 = 0;
                                this.d.set(iArr[0], iArr[c], i6, height);
                                AbstractC12077zK2 abstractC12077zK22 = recyclerView.s;
                                if (abstractC12077zK22 != null) {
                                    abstractC12077zK22.f();
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((IntersectionEngine) ((C12258zr1) abstractC8375oY2).b.get()).onScroll((String) it.next(), this.d, this.c, this.b, i, i2);
                                }
                            }
                        }
                        i5++;
                        c = 1;
                    }
                    ((IntersectionEngine) ((C12258zr1) abstractC8375oY2).b.get()).checkProminence();
                }
            }
        }
    }
}
