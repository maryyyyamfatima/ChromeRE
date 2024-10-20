package defpackage;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.android.chrome.R;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zZ1 */
/* loaded from: classes.dex */
public final class C12151zZ1 implements InterfaceC10436uZ1 {
    public static final Rect E = new Rect();
    public G14 A;
    public final FW3 B;
    public final C3471aG0 C;
    public int D;
    public final C3487aJ1 a;
    public final C3487aJ1 b;
    public final HashMap c;
    public long[] d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final C7849n00 i;
    public final C11703yE1 j;
    public int n;
    public int o;
    public int p;
    public C0772Fy1 q;
    public C0772Fy1 r;
    public final int s;
    public final int t;
    public final C11122wZ1 u;
    public final C9788sf4 v;
    public final C3471aG0 w;
    public final HashSet x;
    public final C8509ov0 y;
    public C10093tZ1 z;
    public final C3487aJ1 h = new C3487aJ1();
    public final Rect k = new Rect();
    public final C11808yZ1 l = new C11808yZ1();
    public final C11465xZ1 m = new C11465xZ1();

    public static void t(C11122wZ1 c11122wZ1) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        Object obj = c11122wZ1.e;
        if (obj instanceof C8274oE1) {
            C(c11122wZ1.a, c10926vy1, ((C8274oE1) obj).a);
            return;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }

    public final void A(C11122wZ1 c11122wZ1, WZ wz, Object obj) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        this.y.c(wz, obj);
        C7849n00 c7849n00 = wz.r;
        if (c7849n00 == null) {
            c7849n00 = this.i;
        }
        try {
            wz.L(obj);
        } catch (Exception e) {
            try {
                UC0 uc0 = new UC0();
                uc0.a = e;
                A10.b(c7849n00, uc0);
            } catch (Exception e2) {
                throw A10.e(c7849n00, e2);
            }
        }
        c11122wZ1.c = false;
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final void c(C11122wZ1 c11122wZ1) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        c10926vy1.getClass();
        t(c11122wZ1);
        WZ wz = c11122wZ1.d.b.j.i;
        C7849n00 c7849n00 = wz.r;
        C7849n00 c7849n002 = this.i;
        if (c7849n00 == null) {
            c7849n00 = c7849n002;
        }
        boolean z = c11122wZ1.c;
        Object obj = c11122wZ1.a;
        if (z) {
            A(c11122wZ1, wz, obj);
        }
        if (this.D != 3) {
            try {
                wz.M(c7849n00, obj);
            } catch (Exception e) {
                try {
                    UC0 uc0 = new UC0();
                    uc0.a = e;
                    A10.b(c7849n00, uc0);
                } catch (Exception e2) {
                    throw A10.e(c7849n00, e2);
                }
            }
        }
        FW3 fw3 = this.B;
        if (fw3 != null) {
            fw3.h(this.C, c11122wZ1.d.b, c10926vy1);
        } else {
            C10093tZ1 c10093tZ1 = this.z;
            if (c10093tZ1 != null) {
                C9645sE1 c9645sE1 = c11122wZ1.d.b;
                c10093tZ1.e();
            }
        }
        try {
            Object obj2 = c11122wZ1.e;
            if (!(obj2 instanceof C8274oE1)) {
                throw new RuntimeException("MountData should not be null when using Litho's MountState.");
            }
            ((C8274oE1) obj2).b(c7849n002.a, c11122wZ1, this.D);
        } catch (C7930nE1 e3) {
            throw new RuntimeException(AbstractC8192o0.a(e3.getMessage(), " ", q(c11122wZ1)));
        }
    }

    public final void j(C11122wZ1 c11122wZ1, WZ wz, Object obj) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        C7849n00 c7849n00 = wz.r;
        if (c7849n00 == null) {
            c7849n00 = this.i;
        }
        wz.d(c7849n00, obj);
        this.y.b(wz, obj);
        c11122wZ1.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0080, code lost:            if ((r13 == r12 || (r12 != null && defpackage.AbstractC2955Wt0.a(r13.a, r12.a) && defpackage.AbstractC2955Wt0.a(r13.b, r12.b) && defpackage.EY.b(r13.c, r12.c) && defpackage.EY.b(r13.d, r12.d) && defpackage.EY.b(r13.e, r12.e) && r13.g == r12.g && defpackage.EY.b(r13.f, r12.f))) == false) goto L338;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(defpackage.C9006qN2 r23, defpackage.C11122wZ1 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12151zZ1.D(qN2, wZ1, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C(Object obj, C10926vy1 c10926vy1, int i) {
        C0596Ep0 b;
        C00 m;
        ViewOnFocusChangeListenerC9221r00 viewOnFocusChangeListenerC9221r00;
        ViewOnLongClickListenerC10936w00 l;
        ViewOnClickListenerC7505m00 k;
        WZ wz = c10926vy1.i;
        AtomicInteger atomicInteger = WZ.B;
        boolean z = wz instanceof K91;
        if (WZ.i0(wz)) {
            View view = (View) obj;
            int i2 = 1;
            C3975bk0 c3975bk0 = c10926vy1.g;
            if (c3975bk0 != null) {
                if (c3975bk0.s != null && (k = k(view)) != null) {
                    k.a = null;
                }
                if (c3975bk0.u != null && (l = l(view)) != null) {
                    l.a = null;
                }
                if (c3975bk0.t != null) {
                    if (view instanceof ComponentHost) {
                        viewOnFocusChangeListenerC9221r00 = ((ComponentHost) view).w;
                    } else {
                        viewOnFocusChangeListenerC9221r00 = (ViewOnFocusChangeListenerC9221r00) view.getTag(R.id.component_focus_change_listener);
                    }
                    if (viewOnFocusChangeListenerC9221r00 != null) {
                        viewOnFocusChangeListenerC9221r00.a = null;
                    }
                }
                if (c3975bk0.v != null && (m = m(view)) != null) {
                    m.a = null;
                }
                if (c3975bk0.w != null) {
                    if ((view instanceof InterfaceC4105c61) && (b = ((InterfaceC4105c61) view).b()) != null) {
                        b.a = null;
                    }
                    C00 m2 = m(view);
                    if (m2 != null) {
                        m2.g = null;
                    }
                }
                if (c3975bk0.x != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).z = null;
                }
                view.setTag(null);
                SparseArray sparseArray = c3975bk0.i;
                if (view instanceof ComponentHost) {
                    ((ComponentHost) view).n = null;
                } else if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        view.setTag(sparseArray.keyAt(i3), null);
                    }
                }
                if (c3975bk0.j != 0.0f) {
                    WeakHashMap weakHashMap = Ec4.a;
                    view.setElevation(0.0f);
                }
                if (c3975bk0.k != null) {
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                if (c3975bk0.l) {
                    view.setClipToOutline(false);
                }
                if (!c3975bk0.m && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(true);
                }
                if (!TextUtils.isEmpty(c3975bk0.a)) {
                    view.setContentDescription(null);
                }
                if ((c3975bk0.N & 524288) != 0) {
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                }
                if (((c3975bk0.N & 1048576) != 0) && view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                if (((c3975bk0.N & 2097152) != 0) && view.getRotation() != 0.0f) {
                    view.setRotation(0.0f);
                }
                if (((c3975bk0.N & 33554432) != 0) && view.getRotationX() != 0.0f) {
                    view.setRotationX(0.0f);
                }
                if (((c3975bk0.N & 67108864) != 0) && view.getRotationY() != 0.0f) {
                    view.setRotationY(0.0f);
                }
            }
            view.setClickable((i & 1) == 1);
            view.setLongClickable((i & 2) == 2);
            view.setFocusable((i & 4) == 4);
            view.setEnabled((i & 8) == 8);
            view.setSelected((i & 16) == 16);
            if (c10926vy1.n != 0) {
                WeakHashMap weakHashMap2 = Ec4.a;
                view.setImportantForAccessibility(0);
            }
            boolean z2 = view instanceof ComponentHost;
            if (z2 || view.getTag(R.id.component_node_info) != null) {
                view.setTag(R.id.component_node_info, null);
                if (!z2) {
                    Ec4.m(view, null);
                }
            }
            Ad4 ad4 = c10926vy1.h;
            if (ad4 != null) {
                if (ad4.f != null || ad4.g != 0) {
                    view.setStateListAnimator(null);
                }
                if ((8 & c10926vy1.m) != 0) {
                    if (ad4.a != null) {
                        view.setBackground(null);
                    }
                    if (ad4.b != null) {
                        view.setForeground(null);
                    }
                }
                if (!z) {
                    if (ad4.c != null) {
                        try {
                            view.setPadding(0, 0, 0, 0);
                        } catch (NullPointerException e) {
                            XC0.a().a("From component: " + c10926vy1.i.c0(), e);
                        }
                    }
                    if (ad4.a != null) {
                        view.setBackground(null);
                    }
                    if (ad4.b != null) {
                        view.setForeground(null);
                    }
                    view.setLayoutDirection(2);
                }
            }
            if ((i & 32) == 0) {
                i2 = -1;
            } else if ((i & 64) == 64) {
                i2 = 2;
            }
            if (i2 != -1) {
                view.setLayerType(i2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(Object obj, C10926vy1 c10926vy1) {
        ViewOnFocusChangeListenerC9221r00 viewOnFocusChangeListenerC9221r00;
        WZ wz = c10926vy1.i;
        if (WZ.i0(wz)) {
            View view = (View) obj;
            C3975bk0 c3975bk0 = c10926vy1.g;
            if (c3975bk0 != null) {
                C6206iD0 c6206iD0 = c3975bk0.s;
                if (c6206iD0 != null) {
                    ViewOnClickListenerC7505m00 k = k(view);
                    if (k == null) {
                        k = new ViewOnClickListenerC7505m00();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.u = k;
                            componentHost.setOnClickListener(k);
                        } else {
                            view.setOnClickListener(k);
                            view.setTag(R.id.component_click_listener, k);
                        }
                    }
                    k.a = c6206iD0;
                    view.setClickable(true);
                }
                C6206iD0 c6206iD02 = c3975bk0.u;
                if (c6206iD02 != null) {
                    ViewOnLongClickListenerC10936w00 l = l(view);
                    if (l == null) {
                        l = new ViewOnLongClickListenerC10936w00();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.v = l;
                            componentHost2.setOnLongClickListener(l);
                        } else {
                            view.setOnLongClickListener(l);
                            view.setTag(R.id.component_long_click_listener, l);
                        }
                    }
                    l.a = c6206iD02;
                    view.setLongClickable(true);
                }
                C6206iD0 c6206iD03 = c3975bk0.t;
                if (c6206iD03 != null) {
                    boolean z = view instanceof ComponentHost;
                    if (z) {
                        viewOnFocusChangeListenerC9221r00 = ((ComponentHost) view).w;
                    } else {
                        viewOnFocusChangeListenerC9221r00 = (ViewOnFocusChangeListenerC9221r00) view.getTag(R.id.component_focus_change_listener);
                    }
                    if (viewOnFocusChangeListenerC9221r00 == null) {
                        viewOnFocusChangeListenerC9221r00 = new ViewOnFocusChangeListenerC9221r00();
                        if (z) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.w = viewOnFocusChangeListenerC9221r00;
                            componentHost3.setOnFocusChangeListener(viewOnFocusChangeListenerC9221r00);
                        } else {
                            view.setOnFocusChangeListener(viewOnFocusChangeListenerC9221r00);
                            view.setTag(R.id.component_focus_change_listener, viewOnFocusChangeListenerC9221r00);
                        }
                    }
                    viewOnFocusChangeListenerC9221r00.a = c6206iD03;
                }
                C6206iD0 c6206iD04 = c3975bk0.v;
                if (c6206iD04 != null) {
                    C00 m = m(view);
                    if (m == null) {
                        m = new C00();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost4 = (ComponentHost) view;
                            componentHost4.x = m;
                            componentHost4.setOnTouchListener(m);
                        } else {
                            view.setOnTouchListener(m);
                            view.setTag(R.id.component_touch_listener, m);
                        }
                    }
                    m.a = c6206iD04;
                }
                C6206iD0 c6206iD05 = c3975bk0.w;
                if (c6206iD05 != null) {
                    if (view instanceof InterfaceC4105c61) {
                        InterfaceC4105c61 interfaceC4105c61 = (InterfaceC4105c61) view;
                        C0596Ep0 b = interfaceC4105c61.b();
                        if (b == null) {
                            b = new C0596Ep0();
                            interfaceC4105c61.c(b);
                        }
                        b.a = c6206iD05;
                    } else {
                        C00 m2 = m(view);
                        if (m2 == null) {
                            m2 = new C00();
                            if (view instanceof ComponentHost) {
                                ComponentHost componentHost5 = (ComponentHost) view;
                                componentHost5.x = m2;
                                componentHost5.setOnTouchListener(m2);
                            } else {
                                view.setOnTouchListener(m2);
                                view.setTag(R.id.component_touch_listener, m2);
                            }
                        }
                        m2.g = c6206iD05;
                    }
                }
                C6206iD0 c6206iD06 = c3975bk0.x;
                if (c6206iD06 != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).z = c6206iD06;
                }
                if ((view instanceof ComponentHost) || c3975bk0.d()) {
                    view.setTag(R.id.component_node_info, c3975bk0);
                }
                view.setTag(c3975bk0.g);
                SparseArray sparseArray = c3975bk0.i;
                if (sparseArray != null) {
                    if (view instanceof ComponentHost) {
                        ((ComponentHost) view).n = sparseArray;
                    } else {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            view.setTag(sparseArray.keyAt(i), sparseArray.valueAt(i));
                        }
                    }
                }
                float f = c3975bk0.j;
                if (f != 0.0f) {
                    WeakHashMap weakHashMap = Ec4.a;
                    view.setElevation(f);
                }
                ViewOutlineProvider viewOutlineProvider = c3975bk0.k;
                if (viewOutlineProvider != null) {
                    view.setOutlineProvider(viewOutlineProvider);
                }
                boolean z2 = c3975bk0.l;
                if (z2) {
                    view.setClipToOutline(z2);
                }
                if (((c3975bk0.N & 8388608) != 0) && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(c3975bk0.m);
                }
                CharSequence charSequence = c3975bk0.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i2 = c3975bk0.I;
                if (i2 == 1) {
                    view.setFocusable(true);
                } else if (i2 == 2) {
                    view.setFocusable(false);
                }
                int i3 = c3975bk0.f11493J;
                if (i3 == 1) {
                    view.setClickable(true);
                } else if (i3 == 2) {
                    view.setClickable(false);
                }
                int i4 = c3975bk0.K;
                if (i4 == 1) {
                    view.setEnabled(true);
                } else if (i4 == 2) {
                    view.setEnabled(false);
                }
                int i5 = c3975bk0.L;
                if (i5 == 1) {
                    view.setSelected(true);
                } else if (i5 == 2) {
                    view.setSelected(false);
                }
                if ((c3975bk0.N & 524288) != 0) {
                    float f2 = c3975bk0.n;
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                }
                if ((c3975bk0.N & 1048576) != 0) {
                    view.setAlpha(c3975bk0.o);
                }
                if ((c3975bk0.N & 2097152) != 0) {
                    view.setRotation(c3975bk0.p);
                }
                if ((c3975bk0.N & 33554432) != 0) {
                    view.setRotationX(c3975bk0.q);
                }
                if ((c3975bk0.N & 67108864) != 0) {
                    view.setRotationY(c3975bk0.r);
                }
                String str = c3975bk0.h;
                WeakHashMap weakHashMap2 = Ec4.a;
                view.setTransitionName(str);
            }
            int i6 = c10926vy1.n;
            if (i6 != 0) {
                WeakHashMap weakHashMap3 = Ec4.a;
                view.setImportantForAccessibility(i6);
            }
            Ad4 ad4 = c10926vy1.h;
            if (ad4 != null) {
                boolean z3 = wz instanceof K91;
                int i7 = ad4.h;
                if (i7 != -1) {
                    view.setLayerType(i7, ad4.i);
                }
                StateListAnimator stateListAnimator = ad4.f;
                int i8 = ad4.g;
                if (stateListAnimator != null || i8 != 0) {
                    if (stateListAnimator == null) {
                        stateListAnimator = AnimatorInflater.loadStateListAnimator(view.getContext(), i8);
                    }
                    view.setStateListAnimator(stateListAnimator);
                }
                if ((c10926vy1.m & 8) != 0) {
                    Drawable drawable = ad4.a;
                    if (drawable != null) {
                        view.setBackground(drawable);
                    }
                    Drawable drawable2 = ad4.b;
                    if (drawable2 != null) {
                        view.setForeground(drawable2);
                    }
                    if (z3) {
                        view.setPadding(0, 0, 0, 0);
                    }
                }
                if (z3) {
                    return;
                }
                Drawable drawable3 = ad4.a;
                if (drawable3 != null) {
                    view.setBackground(drawable3);
                }
                Rect rect = ad4.c;
                if (rect != null) {
                    view.setPadding(rect != null ? rect.left : 0, rect != null ? rect.top : 0, rect != null ? rect.right : 0, rect != null ? rect.bottom : 0);
                }
                Drawable drawable4 = ad4.b;
                if (drawable4 != null) {
                    view.setForeground(drawable4);
                }
                int ordinal = ad4.e.ordinal();
                view.setLayoutDirection(ordinal != 1 ? ordinal != 2 ? 2 : 1 : 0);
            }
        }
    }

    public C12151zZ1(C11703yE1 c11703yE1) {
        boolean z = B10.a;
        this.p = -1;
        this.s = -1;
        this.t = -1;
        this.x = new HashSet();
        this.y = new C8509ov0();
        this.D = 0;
        this.a = new C3487aJ1();
        this.b = new C3487aJ1();
        this.i = c11703yE1.F;
        this.j = c11703yE1;
        this.e = true;
        this.c = B10.b ? new HashMap() : null;
        Ad4 ad4 = new Ad4();
        ad4.e = EnumC9866ss4.g;
        C11122wZ1 c11122wZ1 = new C11122wZ1(C10926vy1.a(new C10926vy1(null, ad4, new K91(), null, c11703yE1.H, 0, 0, 0, 0L, 0, c11703yE1.getContext().getResources().getConfiguration().orientation, null), null, null), c11703yE1, c11703yE1);
        c11122wZ1.e = new C8274oE1(c11703yE1);
        this.u = c11122wZ1;
        C9788sf4 c9788sf4 = C9788sf4.a;
        this.v = c9788sf4;
        C3471aG0 c3471aG0 = new C3471aG0(new C10093tZ1(this), c9788sf4.a());
        this.w = c3471aG0;
        ((C9445rf4) c3471aG0.b).f = c11703yE1;
        FW3 fw3 = FW3.a;
        this.B = fw3;
        if (this.z == null) {
            this.z = new C10093tZ1(this);
        }
        this.z.b(fw3);
        this.C = n(fw3);
    }

    public static boolean z(C10926vy1 c10926vy1, C10926vy1 c10926vy12, boolean z) {
        int i = c10926vy1.t;
        WZ wz = c10926vy12.i;
        if (B10.h && c10926vy1.o != c10926vy12.o) {
            return true;
        }
        WZ wz2 = c10926vy1.i;
        if (wz2.r()) {
            Rect rect = c10926vy1.j;
            int width = rect.width();
            Rect rect2 = c10926vy12.j;
            if (!(width == rect2.width() && rect.height() == rect2.height())) {
                return true;
            }
        }
        C7849n00 c7849n00 = c10926vy1.a;
        C7849n00 c7849n002 = c10926vy12.a;
        if (z) {
            if (i == 1) {
                return (wz instanceof C0616Et0) && (wz2 instanceof C0616Et0) && wz.R(c7849n002, wz, c7849n00, wz2);
            }
            if (i == 2) {
                return true;
            }
        }
        return wz.R(c7849n002, wz, c7849n00, wz2);
    }

    public final void i(C11122wZ1 c11122wZ1) {
        FW3 fw3 = this.B;
        if (fw3 != null) {
            fw3.b(this.C, c11122wZ1.d.b, c11122wZ1.a);
            return;
        }
        C10093tZ1 c10093tZ1 = this.z;
        if (c10093tZ1 != null) {
            C9006qN2 c9006qN2 = c11122wZ1.d;
            c10093tZ1.d(c9006qN2.b, c11122wZ1.a, c9006qN2.c);
        }
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final void f(long j) {
        int l;
        C0772Fy1 c0772Fy1 = this.q;
        if (c0772Fy1 != null && (l = c0772Fy1.l(j)) >= 0 && o(l) == null) {
            C9006qN2 j2 = this.q.j(l);
            u(l, j2, j2.b.j, this.q);
        }
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final void b(long j) {
        C11122wZ1 c11122wZ1 = (C11122wZ1) this.a.d(j);
        if (c11122wZ1 == null) {
            return;
        }
        B(c11122wZ1.d.b.j.r, this.h);
    }

    public final void s(C5524gE1 c5524gE1, InterfaceC9173qr2 interfaceC9173qr2, boolean z) {
        C11465xZ1 c11465xZ1 = this.m;
        if (!c11465xZ1.n) {
            c5524gE1.getClass();
            if (interfaceC9173qr2 instanceof InterfaceC7948nI) {
                ((InterfaceC7948nI) interfaceC9173qr2).cancel();
                return;
            }
            return;
        }
        if (c11465xZ1.j == 0 || c11465xZ1.a.isEmpty()) {
            c5524gE1.getClass();
            if (interfaceC9173qr2 instanceof InterfaceC7948nI) {
                ((InterfaceC7948nI) interfaceC9173qr2).cancel();
                return;
            }
            return;
        }
        interfaceC9173qr2.f();
        interfaceC9173qr2.c();
        interfaceC9173qr2.b();
        interfaceC9173qr2.f();
        interfaceC9173qr2.c();
        interfaceC9173qr2.b();
        interfaceC9173qr2.c();
        interfaceC9173qr2.f();
        interfaceC9173qr2.c();
        interfaceC9173qr2.b();
        interfaceC9173qr2.h();
        interfaceC9173qr2.c();
        interfaceC9173qr2.b();
        interfaceC9173qr2.f();
        interfaceC9173qr2.d();
        c5524gE1.getClass();
        C5524gE1.a(interfaceC9173qr2);
    }

    public final int p() {
        return this.a.k();
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final int e() {
        LK3.a();
        long[] jArr = this.d;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final C11122wZ1 d(int i) {
        return o(i);
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final void g(G14 g14) {
        this.A = g14;
    }

    public final C3471aG0 n(AbstractC10779vZ1 abstractC10779vZ1) {
        if (abstractC10779vZ1 == this.v) {
            return this.w;
        }
        return this.z.c(abstractC10779vZ1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(int r21, defpackage.C9006qN2 r22, defpackage.C10926vy1 r23, defpackage.C0772Fy1 r24) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12151zZ1.u(int, qN2, vy1, Fy1):void");
    }

    public static ViewOnClickListenerC7505m00 k(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).u;
        }
        return (ViewOnClickListenerC7505m00) view.getTag(R.id.component_click_listener);
    }

    public static ViewOnLongClickListenerC10936w00 l(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).v;
        }
        return (ViewOnLongClickListenerC10936w00) view.getTag(R.id.component_long_click_listener);
    }

    public static C00 m(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).x;
        }
        return (C00) view.getTag(R.id.component_touch_listener);
    }

    public static void v(View view, boolean z) {
        LK3.a();
        if (view instanceof C11703yE1) {
            C11703yE1 c11703yE1 = (C11703yE1) view;
            if (c11703yE1.u()) {
                if (!z) {
                    c11703yE1.y(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    return;
                } else {
                    c11703yE1.x();
                    return;
                }
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                v(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final String q(C11122wZ1 c11122wZ1) {
        long j;
        WZ wz;
        String c0;
        C3487aJ1 c3487aJ1 = this.a;
        int g = c3487aJ1.g(c11122wZ1);
        int i = -1;
        if (g > -1) {
            j = c3487aJ1.h(g);
            int i2 = 0;
            while (true) {
                long[] jArr = this.d;
                if (i2 >= jArr.length) {
                    break;
                }
                if (j == jArr[i2]) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            j = -1;
        }
        ComponentTree componentTree = this.j.D;
        if (componentTree == null) {
            c0 = "<null_component_tree>";
        } else {
            synchronized (componentTree) {
                wz = componentTree.N;
            }
            c0 = wz.c0();
        }
        Object obj = c11122wZ1.a;
        String valueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        WZ wz2 = c11122wZ1.d.b.j.i;
        String c02 = wz2 != null ? wz2.c0() : "<null_component>";
        String valueOf2 = String.valueOf(c11122wZ1.d.b.j.p);
        J91 j91 = c11122wZ1.b;
        String valueOf3 = String.valueOf(j91 != null ? j91.getClass() : "<null_host>");
        boolean z = this.h.d(0L) == c11122wZ1.b;
        StringBuilder sb = new StringBuilder("rootComponent=");
        sb.append(c0);
        sb.append(", index=");
        sb.append(i);
        sb.append(", mapIndex=");
        sb.append(g);
        sb.append(", id=");
        sb.append(j);
        sb.append(", disappearRange=[");
        sb.append(this.s);
        sb.append(",");
        sb.append(this.t);
        sb.append("], contentType=");
        sb.append(valueOf);
        sb.append(", component=");
        AbstractC9972tB0.a(sb, c02, ", transitionId=", valueOf2, ", host=");
        sb.append(valueOf3);
        sb.append(", isRootHost=");
        sb.append(z);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r18, defpackage.C3487aJ1 r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12151zZ1.B(int, aJ1):void");
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final C11122wZ1 a() {
        C3487aJ1 c3487aJ1 = this.a;
        if (c3487aJ1 != null) {
            return (C11122wZ1) c3487aJ1.d(0L);
        }
        return null;
    }

    public final C11122wZ1 o(int i) {
        long[] jArr;
        LK3.a();
        C3487aJ1 c3487aJ1 = this.a;
        if (c3487aJ1 == null || (jArr = this.d) == null || i >= jArr.length) {
            return null;
        }
        return (C11122wZ1) c3487aJ1.d(jArr[i]);
    }

    @Override // defpackage.InterfaceC10436uZ1
    public final Object h(long j) {
        C11122wZ1 c11122wZ1;
        C3487aJ1 c3487aJ1 = this.a;
        if (c3487aJ1 == null || (c11122wZ1 = (C11122wZ1) c3487aJ1.d(j)) == null) {
            return null;
        }
        return c11122wZ1.a;
    }

    public final void w(C0772Fy1 c0772Fy1, InterfaceC9173qr2 interfaceC9173qr2) {
        C11808yZ1 c11808yZ1 = this.l;
        c11808yZ1.c = 0;
        c11808yZ1.b = 0;
        c11808yZ1.a = 0;
        long[] jArr = this.d;
        C3487aJ1 c3487aJ1 = this.h;
        if (jArr != null) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.d;
                if (i >= jArr2.length) {
                    break;
                }
                int l = c0772Fy1.l(jArr2[i]);
                C10926vy1 c10926vy1 = l < 0 ? null : c0772Fy1.j(l).b.j;
                int i2 = c10926vy1 == null ? -1 : c10926vy1.r;
                C11122wZ1 o = o(i);
                G14 g14 = this.A;
                if (!((g14 == null || o == null) ? false : ((FW3) g14).n(this.z.e, o))) {
                    if (i2 != -1) {
                        long j = c10926vy1.q;
                        if (o == null) {
                            c11808yZ1.a++;
                        } else if (o.b != c3487aJ1.d(j)) {
                            B(i, c3487aJ1);
                            c11808yZ1.a++;
                        } else if (i2 != i) {
                            o.b.f(o, i, i2);
                            c11808yZ1.b++;
                        } else {
                            c11808yZ1.c++;
                        }
                    } else {
                        B(i, c3487aJ1);
                        c11808yZ1.a++;
                    }
                }
                i++;
            }
        }
        if (interfaceC9173qr2 != null) {
            interfaceC9173qr2.f();
            interfaceC9173qr2.f();
            interfaceC9173qr2.f();
        }
        if (c3487aJ1.d(0L) == null) {
            c3487aJ1.i(0L, this.j);
            this.a.i(0L, this.u);
        }
        int k = c0772Fy1.k();
        long[] jArr3 = this.d;
        if (jArr3 == null || k != jArr3.length) {
            this.d = new long[k];
        }
        for (int i3 = 0; i3 < k; i3++) {
            this.d[i3] = c0772Fy1.j(i3).b.j.s;
        }
    }

    public final void x() {
        LK3.a();
        long[] jArr = this.d;
        if (jArr == null) {
            return;
        }
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            C11122wZ1 o = o(i);
            if (o != null && !o.c) {
                WZ wz = o.d.b.j.i;
                Object obj = o.a;
                j(o, wz, obj);
                if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                    View view = (View) obj;
                    if (view.isLayoutRequested()) {
                        int left = view.getLeft();
                        int top = view.getTop();
                        int right = view.getRight();
                        int bottom = view.getBottom();
                        LK3.a();
                        AbstractC7574mC.a(left, top, right, bottom, null, view, true);
                    }
                }
            }
        }
    }

    public final boolean r(C9006qN2 c9006qN2) {
        if (this.B == null) {
            return false;
        }
        C3471aG0 c3471aG0 = this.C;
        if (c3471aG0 == null) {
            throw new IllegalStateException("Need a state when using the TransitionsExtension.");
        }
        return c3471aG0.c(c9006qN2.b.j.s);
    }
}
