package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Xe4 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final InterfaceC2938Wp3 a;
    public boolean i;
    public final HashMap h = new HashMap();
    public final HashSet g = new HashSet();

    public Xe4(InterfaceC2938Wp3 interfaceC2938Wp3) {
        this.a = interfaceC2938Wp3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        a();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        a();
    }

    public final void a() {
        boolean z;
        HashMap hashMap = this.h;
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            boolean isAttachedToWindow = view.isAttachedToWindow();
            We4 we4 = We4.INVISIBLE;
            if (isAttachedToWindow) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    int width = rect.width();
                    int width2 = view.getWidth();
                    We4 we42 = We4.PARTIAL;
                    if (width == width2 && rect.height() == view.getHeight()) {
                        TK0 tk0 = (TK0) this.a;
                        tk0.getClass();
                        Rect rect2 = new Rect();
                        View findViewById = tk0.a.findViewById(R.id.toolbar);
                        if (findViewById != null) {
                            findViewById.getGlobalVisibleRect(rect2);
                        }
                        if (!rect2.contains(rect)) {
                            if (!Rect.intersects(rect, rect2)) {
                                we4 = We4.VISIBLE;
                            }
                        }
                    }
                    we4 = we42;
                }
            }
            if (we4 != hashMap.get(view)) {
                this.i = true;
                hashMap.put(view, we4);
            }
        }
        if (this.i) {
            boolean z2 = false;
            this.i = false;
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                C3678as c3678as = (C3678as) it2.next();
                c3678as.getClass();
                AbstractC0952Hi1 b = AbstractC0952Hi1.b(hashMap);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                C14 it3 = ((RL2) b.keySet()).iterator();
                View view2 = null;
                while (true) {
                    AbstractC11277x abstractC11277x = (AbstractC11277x) it3;
                    if (!abstractC11277x.hasNext()) {
                        break;
                    }
                    View view3 = (View) abstractC11277x.next();
                    if (c3678as.d.containsKey(view3)) {
                        int ordinal = ((We4) ((TL2) b).get(view3)).ordinal();
                        HashMap hashMap2 = c3678as.e;
                        HashSet hashSet = c3678as.f;
                        HashSet hashSet2 = c3678as.g;
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                z = ordinal == 3 ? false : false;
                            } else {
                                if (hashSet.contains(view3)) {
                                    Ga4 ga4 = (Ga4) hashMap2.get(view3);
                                    if (ga4 != null) {
                                        ((Ha4) ga4).a(1);
                                    }
                                    hashSet.remove(view3);
                                }
                                hashSet2.add(view3);
                                view3.getLocationOnScreen(iArr2);
                                int i = iArr[0];
                                int i2 = iArr2[0];
                                int i3 = i - i2;
                                int i4 = iArr[1];
                                int i5 = iArr2[1];
                                int i6 = i4 - i5;
                                if (view2 == null || i6 > 0 || (i6 == 0 && i3 > 0)) {
                                    z = false;
                                    iArr[0] = i2;
                                    iArr[1] = i5;
                                    view2 = view3;
                                }
                            }
                            z = false;
                        } else {
                            hashSet.add(view3);
                        }
                        if (hashSet2.contains(view3)) {
                            Ga4 ga42 = (Ga4) hashMap2.get(view3);
                            if (ga42 != null) {
                                ((Ha4) ga42).a(2);
                            }
                            hashSet2.remove(view3);
                        }
                    } else {
                        z = z2;
                    }
                    z2 = z;
                }
                boolean z3 = z2;
                c3678as.i = view2;
                if (c3678as.k) {
                    c3678as.c(view2);
                }
                z2 = z3;
            }
        }
    }
}
