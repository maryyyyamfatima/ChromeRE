package defpackage;

import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Comparator;
import java.util.PriorityQueue;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sD3 */
/* loaded from: classes.dex */
public final class C9642sD3 implements Comparator {
    public static final int[] k = {0, 2, 1};
    public static final SparseIntArray l = new SparseIntArray();
    public TabImpl g;
    public View h;
    public EC i;
    public final Rect j = new Rect();
    public final PriorityQueue a = new PriorityQueue(3, this);

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SparseIntArray sparseIntArray = l;
        return sparseIntArray.get(((InterfaceC9985tD3) obj).N()) - sparseIntArray.get(((InterfaceC9985tD3) obj2).N());
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = k;
            if (i >= iArr.length) {
                return;
            }
            l.put(iArr[i], i);
            i++;
        }
    }

    public C9642sD3(TabImpl tabImpl) {
        this.g = tabImpl;
    }

    public final boolean b(InterfaceC9985tD3 interfaceC9985tD3) {
        InterfaceC9985tD3 interfaceC9985tD32 = (InterfaceC9985tD3) this.a.peek();
        return interfaceC9985tD32 != null && interfaceC9985tD32 == interfaceC9985tD3;
    }

    public final void a(InterfaceC9985tD3 interfaceC9985tD3) {
        PriorityQueue priorityQueue = this.a;
        if (priorityQueue.contains(interfaceC9985tD3)) {
            return;
        }
        InterfaceC9985tD3 interfaceC9985tD32 = (InterfaceC9985tD3) priorityQueue.peek();
        priorityQueue.add(interfaceC9985tD3);
        d(interfaceC9985tD32);
    }

    public final void c(InterfaceC9985tD3 interfaceC9985tD3) {
        PriorityQueue priorityQueue = this.a;
        InterfaceC9985tD3 interfaceC9985tD32 = (InterfaceC9985tD3) priorityQueue.peek();
        priorityQueue.remove(interfaceC9985tD3);
        d(interfaceC9985tD32);
    }

    public final void d(InterfaceC9985tD3 interfaceC9985tD3) {
        InterfaceC9985tD3 interfaceC9985tD32;
        View view;
        if (this.g == null || (interfaceC9985tD32 = (InterfaceC9985tD3) this.a.peek()) == interfaceC9985tD3) {
            return;
        }
        if (interfaceC9985tD32 != null) {
            view = interfaceC9985tD32.a();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
        } else {
            view = null;
        }
        this.h = view;
        if (this.g.O() != null && !this.g.O().m() && this.i == null) {
            EC ec = new EC(this.g.O().k1());
            this.i = ec;
            ec.m(new Callback() { // from class: rD3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Rect rect = (Rect) obj;
                    C9642sD3 c9642sD3 = C9642sD3.this;
                    if (rect == null) {
                        c9642sD3.getClass();
                    } else {
                        c9642sD3.j.set(rect);
                        c9642sD3.e();
                    }
                }
            });
            Rect rect = (Rect) this.i.g;
            if (rect != null) {
                this.j.set(rect);
                e();
            }
        }
        e();
        TabImpl tabImpl = this.g;
        tabImpl.n = this.h;
        tabImpl.W();
        if (interfaceC9985tD3 != null) {
            interfaceC9985tD3.v();
        }
        if (interfaceC9985tD32 != null) {
            interfaceC9985tD32.d();
        }
    }

    public final void e() {
        if (this.h == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Rect rect = this.j;
        layoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
        this.h.setLayoutParams(layoutParams);
    }
}
