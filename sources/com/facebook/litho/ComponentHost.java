package com.facebook.litho;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.android.chrome.R;
import defpackage.AbstractC10250u00;
import defpackage.AbstractC4830eD0;
import defpackage.Ad4;
import defpackage.B10;
import defpackage.C00;
import defpackage.C0596Ep0;
import defpackage.C10926vy1;
import defpackage.C11122wZ1;
import defpackage.C11703yE1;
import defpackage.C1593Mg3;
import defpackage.C3975bk0;
import defpackage.C4913eT3;
import defpackage.C5036ep1;
import defpackage.C5257fT3;
import defpackage.C6206iD0;
import defpackage.C7849n00;
import defpackage.C8274oE1;
import defpackage.C9564s00;
import defpackage.E10;
import defpackage.Ec4;
import defpackage.InterfaceC0981Ho0;
import defpackage.InterfaceC4105c61;
import defpackage.J1;
import defpackage.J91;
import defpackage.KT3;
import defpackage.LK3;
import defpackage.TG3;
import defpackage.ViewOnClickListenerC7505m00;
import defpackage.ViewOnFocusChangeListenerC9221r00;
import defpackage.ViewOnLongClickListenerC10936w00;
import defpackage.WZ;
import defpackage.YZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ComponentHost extends J91 implements InterfaceC0981Ho0, InterfaceC4105c61 {
    public static boolean C = false;
    public C5257fT3 A;
    public boolean B;
    public C1593Mg3 a;
    public C1593Mg3 g;
    public C1593Mg3 h;
    public C1593Mg3 i;
    public C1593Mg3 j;
    public C1593Mg3 k;
    public ArrayList l;
    public CharSequence m;
    public SparseArray n;
    public final C9564s00 o;
    public int[] p;
    public boolean q;
    public boolean r;
    public YZ s;
    public boolean t;
    public ViewOnClickListenerC7505m00 u;
    public ViewOnLongClickListenerC10936w00 v;
    public ViewOnFocusChangeListenerC9221r00 w;
    public C00 x;
    public C0596Ep0 y;
    public C6206iD0 z;

    public void m(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public final void q(int i, C11122wZ1 c11122wZ1) {
        Object obj = c11122wZ1.a;
        if (obj instanceof Drawable) {
            if (this.j == null) {
                this.j = new C1593Mg3();
            }
            Drawable drawable = (Drawable) obj;
            LK3.a();
            drawable.setCallback(null);
            invalidate(drawable.getBounds());
            o();
            AbstractC10250u00.d(i, this.j, this.k);
        } else if (obj instanceof View) {
            r((View) obj);
            if (this.h == null) {
                this.h = new C1593Mg3();
            }
            AbstractC10250u00.d(i, this.h, this.i);
            this.q = true;
            k(i, c11122wZ1);
        }
        g();
        AbstractC10250u00.d(i, this.a, this.g);
        o();
        s(c11122wZ1.d.b.j);
    }

    @Override // defpackage.J91
    public final void f(C11122wZ1 c11122wZ1, int i, int i2) {
        C5257fT3 c5257fT3;
        Ad4 ad4 = c11122wZ1.d.b.j.h;
        if (ad4 != null) {
            Rect rect = ad4.d;
            if (((rect == null || rect.isEmpty()) ? null : ad4.d) != null && (c5257fT3 = this.A) != null) {
                C1593Mg3 c1593Mg3 = c5257fT3.a;
                if (c1593Mg3.d(i2) != null) {
                    if (c5257fT3.b == null) {
                        c5257fT3.b = new C1593Mg3(4);
                    }
                    AbstractC10250u00.e(i2, c1593Mg3, c5257fT3.b);
                }
                AbstractC10250u00.c(i, i2, c1593Mg3, c5257fT3.b);
                C1593Mg3 c1593Mg32 = c5257fT3.b;
                if (c1593Mg32 != null && c1593Mg32.i() == 0) {
                    c5257fT3.b = null;
                }
            }
        }
        if (this.h == null) {
            this.h = new C1593Mg3();
        }
        Object obj = c11122wZ1.a;
        if (!(obj instanceof Drawable)) {
            if (obj instanceof View) {
                this.q = true;
                if (this.h.d(i2) != null) {
                    if (this.i == null) {
                        this.i = new C1593Mg3(4);
                    }
                    AbstractC10250u00.e(i2, this.h, this.i);
                }
                AbstractC10250u00.c(i, i2, this.h, this.i);
            }
        } else {
            LK3.a();
            if (this.j == null) {
                this.j = new C1593Mg3();
            }
            if (this.j.d(i2) != null) {
                if (this.k == null) {
                    this.k = new C1593Mg3(4);
                }
                AbstractC10250u00.e(i2, this.j, this.k);
            }
            AbstractC10250u00.c(i, i2, this.j, this.k);
            invalidate();
            o();
        }
        g();
        if (this.a.d(i2) != null) {
            if (this.g == null) {
                this.g = new C1593Mg3(4);
            }
            AbstractC10250u00.e(i2, this.a, this.g);
        }
        AbstractC10250u00.c(i, i2, this.a, this.g);
        o();
    }

    public final void l(int i, C11122wZ1 c11122wZ1, Rect rect) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        Object obj = c11122wZ1.a;
        if (!(obj instanceof Drawable)) {
            if (obj instanceof View) {
                if (this.h == null) {
                    this.h = new C1593Mg3();
                }
                this.h.g(i, c11122wZ1);
                View view = (View) obj;
                int i2 = c10926vy1.m;
                view.setDuplicateParentStateEnabled((i2 & 1) == 1);
                if (view instanceof ComponentHost) {
                    ((ComponentHost) view).setAddStatesFromChildren((i2 & 16) == 16);
                }
                this.q = true;
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.r) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
                Ad4 ad4 = c11122wZ1.d.b.j.h;
                if (ad4 != null) {
                    Rect rect2 = ad4.d;
                    if (((rect2 == null || rect2.isEmpty()) ? null : ad4.d) != null && !equals(obj)) {
                        if (this.A == null) {
                            C5257fT3 c5257fT3 = new C5257fT3(this);
                            this.A = c5257fT3;
                            setTouchDelegate(c5257fT3);
                        }
                        C5257fT3 c5257fT32 = this.A;
                        c5257fT32.getClass();
                        c5257fT32.a.g(i, new C4913eT3((View) obj, c11122wZ1));
                    }
                }
            }
        } else {
            LK3.a();
            if (this.j == null) {
                this.j = new C1593Mg3();
            }
            this.j.g(i, c11122wZ1);
            Drawable drawable = (Drawable) obj;
            C10926vy1 c10926vy12 = c11122wZ1.d.b.j;
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setCallback(this);
            if (c11122wZ1.e instanceof C8274oE1) {
                AbstractC10250u00.b(this, drawable, c10926vy12.m, c10926vy12.g);
            }
            invalidate(rect);
        }
        g();
        this.a.g(i, c11122wZ1);
        s(c10926vy1);
    }

    public final void g() {
        if (this.a == null) {
            this.a = new C1593Mg3();
        }
    }

    public ComponentHost(C7849n00 c7849n00) {
        super(c7849n00.a);
        this.o = new C9564s00(this);
        this.p = new int[0];
        this.t = false;
        this.B = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        n(J1.a((AccessibilityManager) c7849n00.a.getSystemService("accessibility")));
        this.a = new C1593Mg3();
        this.h = new C1593Mg3();
        this.j = new C1593Mg3();
        this.l = new ArrayList();
    }

    public final void k(int i, C11122wZ1 c11122wZ1) {
        boolean z;
        if (this.A == null || equals(c11122wZ1.a)) {
            return;
        }
        C5257fT3 c5257fT3 = this.A;
        C1593Mg3 c1593Mg3 = c5257fT3.b;
        if (c1593Mg3 == null || ((C4913eT3) c1593Mg3.d(i)) == null) {
            z = false;
        } else {
            c5257fT3.b.h(i);
            z = true;
        }
        if (z) {
            return;
        }
        c5257fT3.a.h(i);
    }

    @Override // defpackage.J91
    public final int e() {
        C1593Mg3 c1593Mg3 = this.a;
        if (c1593Mg3 == null) {
            return 0;
        }
        return c1593Mg3.i();
    }

    @Override // defpackage.J91
    public final C11122wZ1 d(int i) {
        return (C11122wZ1) this.a.j(i);
    }

    public TextContent getTextContent() {
        List list;
        g();
        C1593Mg3 c1593Mg3 = this.a;
        int i = c1593Mg3.i();
        if (i == 1) {
            list = Collections.singletonList(((C11122wZ1) c1593Mg3.j(0)).a);
        } else {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(((C11122wZ1) c1593Mg3.j(i2)).a);
            }
            list = arrayList;
        }
        return AbstractC10250u00.a(list);
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        return this.m;
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        if (!TextUtils.isEmpty(charSequence)) {
            WeakHashMap weakHashMap = Ec4.a;
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
        }
        j();
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i != R.id.component_node_info || obj == null) {
            return;
        }
        n(J1.a((AccessibilityManager) getContext().getSystemService("accessibility")));
        YZ yz = this.s;
        if (yz != null) {
            yz.p = (C3975bk0) obj;
        }
    }

    @Override // defpackage.InterfaceC4105c61
    public final C0596Ep0 b() {
        return this.y;
    }

    @Override // defpackage.InterfaceC4105c61
    public final void c(C0596Ep0 c0596Ep0) {
        this.y = c0596Ep0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6206iD0 c6206iD0;
        C0596Ep0 c0596Ep0 = this.y;
        if (c0596Ep0 != null && (c6206iD0 = c0596Ep0.a) != null) {
            AbstractC4830eD0.a(c6206iD0, this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6206iD0 c6206iD0 = this.z;
        if (c6206iD0 != null) {
            LK3.a();
            if (AbstractC4830eD0.f == null) {
                AbstractC4830eD0.f = new C5036ep1();
            }
            AbstractC4830eD0.f.getClass();
            AbstractC4830eD0.f.getClass();
            Object c = c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.f);
            AbstractC4830eD0.f.getClass();
            AbstractC4830eD0.f.getClass();
            return c != null && ((Boolean) c).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void s(C10926vy1 c10926vy1) {
        if (c10926vy1.d()) {
            WZ wz = c10926vy1.i;
            wz.getClass();
            if (wz instanceof TG3) {
                this.B = true;
            }
        }
        j();
        if (e() == 0) {
            this.B = false;
        }
    }

    public final void j() {
        YZ yz;
        if (!(this.t && this.B) || (yz = this.s) == null) {
            return;
        }
        yz.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        YZ yz = this.s;
        return (yz != null && this.B && yz.m(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public final ArrayList h() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        C1593Mg3 c1593Mg3 = this.j;
        int i = c1593Mg3 == null ? 0 : c1593Mg3.i();
        for (int i2 = 0; i2 < i; i2++) {
            C3975bk0 c3975bk0 = ((C11122wZ1) this.j.j(i2)).d.b.j.g;
            if (c3975bk0 != null && (charSequence = c3975bk0.a) != null) {
                arrayList.add(charSequence);
            }
        }
        CharSequence contentDescription = getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription);
        }
        return arrayList;
    }

    public final void r(View view) {
        this.q = true;
        if (this.r) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LK3.a();
        boolean z = false;
        if (isEnabled()) {
            C1593Mg3 c1593Mg3 = this.j;
            int i = (c1593Mg3 == null ? 0 : c1593Mg3.i()) - 1;
            while (true) {
                if (i < 0) {
                    break;
                }
                C11122wZ1 c11122wZ1 = (C11122wZ1) this.j.j(i);
                Object obj = c11122wZ1.a;
                if (obj instanceof KT3) {
                    if (!((c11122wZ1.d.b.j.m & 2) == 2)) {
                        KT3 kt3 = (KT3) obj;
                        if (kt3.a(motionEvent) && kt3.b(this, motionEvent)) {
                            z = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i--;
            }
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            r0 = 1
            r5.r = r0
            int r0 = r9 - r7
            int r1 = r10 - r8
            if (r1 <= 0) goto L15
            if (r0 > 0) goto Lc
            goto L15
        Lc:
            int r2 = defpackage.B10.j
            if (r1 >= r2) goto L12
            if (r0 < r2) goto L17
        L12:
            java.lang.String r2 = "TextureTooBig"
            goto L18
        L15:
            boolean r2 = defpackage.B10.a
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L1b
            goto L43
        L1b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "abnormally sized litho layout ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.HashMap r0 = r5.i(r0, r1)
            YC0 r1 = defpackage.XC0.a()
            xH1 r4 = defpackage.EnumC11375xH1.ERROR
            r1.c(r4, r2, r3, r0)
        L43:
            r5.m(r6, r7, r8, r9, r10)
            r6 = 0
            r5.r = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        for (ViewParent viewParent = this; viewParent instanceof ComponentHost; viewParent = viewParent.getParent()) {
            if (!((ComponentHost) viewParent).p()) {
                return;
            }
        }
        super.requestLayout();
    }

    public boolean p() {
        return !this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1593Mg3 c1593Mg3 = this.j;
        int i = c1593Mg3 == null ? 0 : c1593Mg3.i();
        for (int i2 = 0; i2 < i; i2++) {
            C11122wZ1 c11122wZ1 = (C11122wZ1) this.j.j(i2);
            C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
            AbstractC10250u00.b(this, (Drawable) c11122wZ1.a, c10926vy1.m, c10926vy1.g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C1593Mg3 c1593Mg3 = this.j;
        int i = c1593Mg3 == null ? 0 : c1593Mg3.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((Drawable) ((C11122wZ1) this.j.j(i2)).a).jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        LK3.a();
        super.setVisibility(i);
        C1593Mg3 c1593Mg3 = this.j;
        int i2 = c1593Mg3 == null ? 0 : c1593Mg3.i();
        for (int i3 = 0; i3 < i2; i3++) {
            ((Drawable) ((C11122wZ1) this.j.j(i3)).a).setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.n;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    public final void n(boolean z) {
        if (z == this.t) {
            return;
        }
        if (z && this.s == null) {
            boolean isFocusable = isFocusable();
            WeakHashMap weakHashMap = Ec4.a;
            this.s = new YZ(this, null, isFocusable, getImportantForAccessibility());
        }
        Ec4.m(this, z ? this.s : null);
        this.t = z;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof ComponentHost) {
                    ((ComponentHost) childAt).n(true);
                } else {
                    C3975bk0 c3975bk0 = (C3975bk0) childAt.getTag(R.id.component_node_info);
                    if (c3975bk0 != null) {
                        Ec4.m(childAt, new YZ(childAt, c3975bk0, childAt.isFocusable(), childAt.getImportantForAccessibility()));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.t = false;
    }

    @Override // defpackage.J91, android.view.ViewGroup
    public final void setClipChildren(boolean z) {
        super.setClipChildren(z);
    }

    @Override // defpackage.J91, android.view.ViewGroup
    public final boolean getClipChildren() {
        return super.getClipChildren();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        boolean z = false;
        if (this.q) {
            int childCount = getChildCount();
            if (this.p.length < childCount) {
                this.p = new int[childCount + 5];
            }
            C1593Mg3 c1593Mg3 = this.h;
            int i3 = c1593Mg3 == null ? 0 : c1593Mg3.i();
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                this.p[i5] = indexOfChild((View) ((C11122wZ1) this.h.j(i4)).a);
                i4++;
                i5++;
            }
            ArrayList arrayList = this.l;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = ((C11122wZ1) this.l.get(i6)).a;
                if (obj instanceof View) {
                    this.p[i5] = indexOfChild((View) obj);
                    i5++;
                }
            }
            this.q = false;
        }
        C9564s00 c9564s00 = this.o;
        if (c9564s00.a != null && c9564s00.b < c9564s00.c) {
            z = true;
        }
        if (z) {
            C9564s00.a(c9564s00);
        }
        return this.p[i2];
    }

    public final void o() {
        C1593Mg3 c1593Mg3 = this.g;
        if (c1593Mg3 != null && c1593Mg3.i() == 0) {
            this.g = null;
        }
        C1593Mg3 c1593Mg32 = this.i;
        if (c1593Mg32 == null || c1593Mg32.i() != 0) {
            return;
        }
        this.i = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C9564s00 c9564s00 = this.o;
        c9564s00.a = canvas;
        c9564s00.b = 0;
        C1593Mg3 c1593Mg3 = c9564s00.d.a;
        c9564s00.c = c1593Mg3 == null ? 0 : c1593Mg3.i();
        super.dispatchDraw(canvas);
        if (c9564s00.a != null && c9564s00.b < c9564s00.c) {
            C9564s00.a(c9564s00);
        }
        c9564s00.a = null;
        ArrayList arrayList = this.l;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C11122wZ1) this.l.get(i)).a;
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
        }
        boolean z = B10.a;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        CharSequence join;
        if (i == 512 || i == 256) {
            if (!TextUtils.isEmpty(getContentDescription())) {
                join = getContentDescription();
            } else if (!h().isEmpty()) {
                join = TextUtils.join(", ", h());
            } else {
                join = !getTextContent().getTextItems().isEmpty() ? TextUtils.join(", ", getTextContent().getTextItems()) : null;
            }
            if (join == null) {
                return false;
            }
            this.m = join;
            super.setContentDescription(join);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (B10.i && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int i = B10.k;
            if (width <= i && getHeight() <= i) {
                return super.hasOverlappingRendering();
            }
        }
        return false;
    }

    public HashMap i(int i, int i2) {
        char c;
        HashMap hashMap = new HashMap();
        hashMap.put("uptimeMs", Long.valueOf(SystemClock.uptimeMillis()));
        hashMap.put("identity", Integer.toHexString(System.identityHashCode(this)));
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        int layerType = getLayerType();
        hashMap.put("layerType", layerType != 0 ? layerType != 1 ? layerType != 2 ? "unknown" : "hw" : "sw" : "none");
        Map[] mapArr = new Map[e()];
        for (int i3 = 0; i3 < e(); i3++) {
            C11122wZ1 d = d(i3);
            Object obj = d.a;
            C10926vy1 c10926vy1 = d.d.b.j;
            Rect rect = new Rect();
            c10926vy1.b(rect);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("class", obj.getClass().getName());
            hashMap2.put("identity", Integer.toHexString(System.identityHashCode(obj)));
            if (obj instanceof View) {
                int layerType2 = ((View) obj).getLayerType();
                c = 2;
                hashMap2.put("layerType", layerType2 != 0 ? layerType2 != 1 ? layerType2 != 2 ? "unknown" : "hw" : "sw" : "none");
            } else {
                c = 2;
            }
            hashMap2.put("left", Integer.valueOf(rect.left));
            hashMap2.put("right", Integer.valueOf(rect.right));
            hashMap2.put("top", Integer.valueOf(rect.top));
            hashMap2.put("bottom", Integer.valueOf(rect.bottom));
            mapArr[i3] = hashMap2;
        }
        hashMap.put("mountItems", mapArr);
        StringBuilder sb = new StringBuilder();
        for (ViewParent viewParent = this; viewParent != null; viewParent = viewParent.getParent()) {
            sb.append(viewParent.getClass().getName());
            sb.append(',');
            if ((viewParent instanceof C11703yE1) && !hashMap.containsKey("lithoViewDimens")) {
                C11703yE1 c11703yE1 = (C11703yE1) viewParent;
                hashMap.put("lithoViewDimens", "(" + c11703yE1.getWidth() + ", " + c11703yE1.getHeight() + ")");
            }
        }
        hashMap.put("ancestors", sb.toString());
        return hashMap;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (f != 0.0f && f != 1.0f) {
            int width = getWidth();
            int i = B10.l;
            if (width >= i || getHeight() >= i) {
                if (C) {
                    return;
                }
                C = true;
                E10.a(2, "PartialAlphaTextureTooBig", "Partial alpha (" + f + ") with large view (" + getWidth() + ", " + getHeight() + ")");
            }
        }
        super.setAlpha(f);
    }
}
