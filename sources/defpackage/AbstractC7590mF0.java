package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7590mF0 extends O0 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View i;
    public C7246lF0 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public abstract boolean r(int i, int i2);

    public abstract void s(int i, AccessibilityEvent accessibilityEvent);

    public abstract void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i);

    static {
        new C6558jF0();
        new C6902kF0();
    }

    public AbstractC7590mF0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = Ec4.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.O0
    public C8541p1 b(View view) {
        if (this.j == null) {
            this.j = new C7246lF0(this);
        }
        return this.j;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n2 = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != n2) {
                this.m = n2;
                v(n2, 128);
                v(i2, 256);
            }
            return n2 != Integer.MIN_VALUE;
        }
        if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.m = Integer.MIN_VALUE;
            v(Integer.MIN_VALUE, 128);
            v(i, 256);
        }
        return true;
    }

    public final void v(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public final void p() {
        View view;
        ViewParent parent;
        if (!this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent k = k(-1, 2048);
        k.setContentChangeTypes(1);
        parent.requestSendAccessibilityEvent(view, k);
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat q = q(i);
        obtain2.getText().add(q.i());
        obtain2.setContentDescription(q.e());
        AccessibilityNodeInfo accessibilityNodeInfo = q.a;
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        s(i, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    @Override // defpackage.O0
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final boolean u(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        v(i, 8);
        return true;
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        v(i, 8);
        return true;
    }

    @Override // defpackage.O0
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
    }

    public final AccessibilityNodeInfoCompat q(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        WeakHashMap weakHashMap = Ec4.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompat.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public final AccessibilityNodeInfoCompat l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        accessibilityNodeInfoCompat.m("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoCompat.l(rect);
        obtain.setBoundsInScreen(rect);
        accessibilityNodeInfoCompat.b = -1;
        View view = this.i;
        obtain.setParent(view);
        t(accessibilityNodeInfoCompat, i);
        if (accessibilityNodeInfoCompat.i() == null && accessibilityNodeInfoCompat.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoCompat.c = i;
        obtain.setSource(view, i);
        boolean z = false;
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z2 = this.l == i;
        if (z2) {
            accessibilityNodeInfoCompat.a(2);
        } else if (obtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        boolean equals = rect3.equals(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
        if (equals) {
            accessibilityNodeInfoCompat.l(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (accessibilityNodeInfoCompat.b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                int i2 = accessibilityNodeInfoCompat.b;
                while (true) {
                    accessibilityNodeInfo = accessibilityNodeInfoCompat2.a;
                    if (i2 == -1) {
                        break;
                    }
                    accessibilityNodeInfoCompat2.b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfoCompat2.l(rect);
                    t(accessibilityNodeInfoCompat2, i2);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                    i2 = accessibilityNodeInfoCompat2.b;
                }
                accessibilityNodeInfo.recycle();
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            accessibilityNodeInfo2.setBoundsInScreen(rect4);
            accessibilityNodeInfo2.getBoundsInScreen(rect3);
        }
        Rect rect6 = this.f;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    accessibilityNodeInfo2.setVisibleToUser(true);
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }
}
