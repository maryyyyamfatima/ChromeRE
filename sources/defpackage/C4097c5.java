package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4097c5 implements InterfaceC12121zT1 {
    public W4 A;
    public final Context a;
    public Context g;
    public BS1 h;
    public final LayoutInflater i;
    public InterfaceC11778yT1 j;
    public CT1 m;
    public Z4 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public C3410a5 x;
    public V4 y;
    public X4 z;
    public final int k = R.layout.f55190_resource_name_obfuscated_res_0x7f0e0003;
    public final int l = R.layout.f55180_resource_name_obfuscated_res_0x7f0e0002;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final C3754b5 B = new C3754b5(this);

    @Override // defpackage.InterfaceC12121zT1
    public final /* bridge */ /* synthetic */ boolean g(C6287iT1 c6287iT1) {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final /* bridge */ /* synthetic */ boolean i(C6287iT1 c6287iT1) {
        return false;
    }

    public C4097c5(Context context) {
        this.a = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void k(Context context, BS1 bs1) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = bs1;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.u = i;
        int i4 = this.s;
        if (this.q) {
            if (this.n == null) {
                Z4 z4 = new Z4(this, this.a);
                this.n = z4;
                if (this.p) {
                    z4.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12121zT1
    public final void j() {
        int i;
        boolean z;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            BS1 bs1 = this.h;
            if (bs1 != null) {
                bs1.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C6287iT1 c6287iT1 = (C6287iT1) l.get(i2);
                    if ((c6287iT1.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C6287iT1 d = childAt instanceof BT1 ? ((BT1) childAt).d() : null;
                        View a = a(c6287iT1, childAt, viewGroup);
                        if (c6287iT1 != d) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.m).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.m).requestLayout();
        BS1 bs12 = this.h;
        if (bs12 != null) {
            bs12.i();
            ArrayList arrayList2 = bs12.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC9250r5 abstractC9250r5 = ((C6287iT1) arrayList2.get(i3)).A;
            }
        }
        BS1 bs13 = this.h;
        if (bs13 != null) {
            bs13.i();
            arrayList = bs13.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C6287iT1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.n == null) {
                this.n = new Z4(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                Z4 z4 = this.n;
                actionMenuView.getClass();
                C5128f5 c5128f5 = new C5128f5();
                ((LinearLayout.LayoutParams) c5128f5).gravity = 16;
                c5128f5.a = true;
                actionMenuView.addView(z4, c5128f5);
            }
        } else {
            Z4 z42 = this.n;
            if (z42 != null) {
                Object parent = z42.getParent();
                Object obj = this.m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.n);
                }
            }
        }
        ((ActionMenuView) this.m).x = this.q;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void h(InterfaceC11778yT1 interfaceC11778yT1) {
        this.j = interfaceC11778yT1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [BT1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C6287iT1 c6287iT1, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = c6287iT1.getActionView();
        if (actionView == null || c6287iT1.e()) {
            if (!(view instanceof BT1)) {
                actionMenuItemView = (BT1) this.i.inflate(this.l, viewGroup, false);
            } else {
                actionMenuItemView = (BT1) view;
            }
            actionMenuItemView.c(c6287iT1);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.n = (ActionMenuView) this.m;
            if (this.A == null) {
                this.A = new W4(this);
            }
            actionMenuItemView2.p = this.A;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c6287iT1.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // defpackage.InterfaceC12121zT1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.SubMenuC0074Ao3 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            BS1 r2 = r0.z
            BS1 r3 = r8.h
            if (r2 == r3) goto L13
            r0 = r2
            Ao3 r0 = (defpackage.SubMenuC0074Ao3) r0
            goto L9
        L13:
            CT1 r2 = r8.m
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof defpackage.BT1
            if (r6 == 0) goto L35
            r6 = r5
            BT1 r6 = (defpackage.BT1) r6
            iT1 r6 = r6.d()
            iT1 r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            iT1 r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = r1
        L5f:
            V4 r2 = new V4
            android.content.Context r4 = r8.g
            r2.<init>(r8, r4, r9, r5)
            r8.y = r2
            r2.h = r0
            sT1 r2 = r2.j
            if (r2 == 0) goto L71
            r2.o(r0)
        L71:
            V4 r0 = r8.y
            boolean r2 = r0.b()
            if (r2 == 0) goto L7b
        L79:
            r1 = r3
            goto L84
        L7b:
            android.view.View r2 = r0.f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.d(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            yT1 r0 = r8.j
            if (r0 == 0) goto L8d
            r0.d(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4097c5.e(Ao3):boolean");
    }

    public final boolean l() {
        BS1 bs1;
        if (!this.q || d() || (bs1 = this.h) == null || this.m == null || this.z != null) {
            return false;
        }
        bs1.i();
        if (bs1.j.isEmpty()) {
            return false;
        }
        X4 x4 = new X4(this, new C3410a5(this, this.g, this.h, this.n));
        this.z = x4;
        ((View) this.m).post(x4);
        return true;
    }

    public final boolean b() {
        Object obj;
        X4 x4 = this.z;
        if (x4 != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(x4);
            this.z = null;
            return true;
        }
        C3410a5 c3410a5 = this.x;
        if (c3410a5 == null) {
            return false;
        }
        if (c3410a5.b()) {
            c3410a5.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void c(BS1 bs1, boolean z) {
        b();
        V4 v4 = this.y;
        if (v4 != null && v4.b()) {
            v4.j.dismiss();
        }
        InterfaceC11778yT1 interfaceC11778yT1 = this.j;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.c(bs1, z);
        }
    }

    public final boolean d() {
        C3410a5 c3410a5 = this.x;
        return c3410a5 != null && c3410a5.b();
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean f() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        C4097c5 c4097c5 = this;
        BS1 bs1 = c4097c5.h;
        if (bs1 != null) {
            arrayList = bs1.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = c4097c5.u;
        int i4 = c4097c5.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c4097c5.m;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C6287iT1 c6287iT1 = (C6287iT1) arrayList.get(i5);
            int i8 = c6287iT1.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (c4097c5.v && c6287iT1.C) {
                i3 = 0;
            }
            i5++;
        }
        if (c4097c5.q && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c4097c5.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C6287iT1 c6287iT12 = (C6287iT1) arrayList.get(i10);
            int i12 = c6287iT12.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = c6287iT12.b;
            if (z3) {
                View a = c4097c5.a(c6287iT12, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c6287iT12.f(z);
            } else if ((i12 & 1) == z ? z : false) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a2 = c4097c5.a(c6287iT12, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C6287iT1 c6287iT13 = (C6287iT1) arrayList.get(i14);
                        if (c6287iT13.b == i13) {
                            if ((c6287iT13.x & 32) == 32) {
                                i9++;
                            }
                            c6287iT13.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                c6287iT12.f(z5);
            } else {
                c6287iT12.f(false);
                i10++;
                i2 = 2;
                c4097c5 = this;
                z = true;
            }
            i10++;
            i2 = 2;
            c4097c5 = this;
            z = true;
        }
        return z;
    }
}
