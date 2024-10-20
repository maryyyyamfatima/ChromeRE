package defpackage;

import android.gesture.GesturePoint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.gesturenav.NavigationBubble;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f91 */
/* loaded from: classes.dex */
public final class C5154f91 implements InterfaceC1621Mm1, InterfaceC3657ao2 {
    public final RunnableC4123c91 a = new Runnable() { // from class: c91
        @Override // java.lang.Runnable
        public final void run() {
            C5154f91 c5154f91 = C5154f91.this;
            boolean z = c5154f91.n;
            boolean b = c5154f91.b();
            c5154f91.n = b;
            if (b != z) {
                c5154f91.h();
            }
        }
    };
    public ViewGroup g;
    public ViewGroupOnHierarchyChangeListenerC6528j91 h;
    public C1751Nm1 i;
    public C10452uc0 j;
    public I5 k;
    public C7932nE3 l;
    public Tab m;
    public boolean n;
    public F12 o;
    public C1198Jf2 p;
    public Callback q;
    public Callback r;

    @Override // defpackage.InterfaceC1621Mm1
    public final void a(Rect rect) {
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null || !viewGroup.isAttachedToWindow()) {
            return this.n;
        }
        Insets systemGestureInsets = this.g.getRootWindowInsets().getSystemGestureInsets();
        return systemGestureInsets.left == 0 && systemGestureInsets.right == 0;
    }

    @Override // defpackage.InterfaceC1621Mm1
    public final void d() {
        boolean z = this.n;
        boolean b = b();
        this.n = b;
        if (b != z) {
            h();
        }
    }

    public final void h() {
        if (this.n) {
            Tab tab = this.m;
            WebContents b = tab != null ? tab.b() : null;
            if (this.m == null || b != null) {
                if (this.o == null) {
                    PropertyModel propertyModel = new PropertyModel(PropertyModel.e(AbstractC10087tY0.h));
                    UD2.a(propertyModel, this.h, new TD2() { // from class: d91
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            boolean z;
                            PropertyModel propertyModel2 = (PropertyModel) wd2;
                            ViewGroupOnHierarchyChangeListenerC6528j91 viewGroupOnHierarchyChangeListenerC6528j91 = (ViewGroupOnHierarchyChangeListenerC6528j91) obj;
                            FD2 fd2 = (FD2) obj2;
                            MD2 md2 = AbstractC10087tY0.d;
                            if (md2 == fd2) {
                                float g = propertyModel2.g(md2);
                                X93 x93 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                if (x93 == null) {
                                    return;
                                }
                                float f = g - x93.n;
                                if (x93.isEnabled() && x93.o) {
                                    float f2 = x93.g;
                                    float f3 = f2 / 3.0f;
                                    x93.n += Math.max(-f3, Math.min(f3, f));
                                    float a = x93.a();
                                    float f4 = a - f2;
                                    if (a > x93.i) {
                                        x93.i = a;
                                    }
                                    double max = Math.max(0.0f, Math.min(f4, f2 * 2.0f) / f2) / 4.0f;
                                    float pow = ((float) (max - Math.pow(max, 2.0d))) * 2.0f;
                                    NavigationBubble navigationBubble = x93.p;
                                    if (navigationBubble.getVisibility() != 0) {
                                        navigationBubble.setVisibility(0);
                                    }
                                    float min = Math.min(1.0f, Math.abs(a / f2));
                                    boolean z2 = x93.a() > 3.0f * f2;
                                    if (z2 != x93.x) {
                                        int i = navigationBubble.h;
                                        int i2 = navigationBubble.g;
                                        int i3 = z2 ? i : i2;
                                        if (z2) {
                                            i = i2;
                                        }
                                        A12 a12 = navigationBubble.k;
                                        a12.a = i3;
                                        a12.g = i;
                                        navigationBubble.a.start();
                                        if (z2) {
                                            x93.performHapticFeedback(3);
                                        }
                                    }
                                    x93.x = z2;
                                    int i4 = x93.w;
                                    if (i4 != 0) {
                                        if (z2) {
                                            navigationBubble.b(i4);
                                            x93.q = navigationBubble.getMeasuredWidth();
                                        } else {
                                            navigationBubble.b(0);
                                            x93.q = x93.h;
                                        }
                                    }
                                    int i5 = (int) ((f2 * min) + (pow * f2 * 2.0f));
                                    int i6 = x93.s;
                                    if (x93.v) {
                                        i5 = -i5;
                                    }
                                    navigationBubble.offsetLeftAndRight((i6 + i5) - x93.m);
                                    x93.m = navigationBubble.getLeft();
                                    return;
                                }
                                return;
                            }
                            MD2 md22 = AbstractC10087tY0.e;
                            if (md22 == fd2) {
                                viewGroupOnHierarchyChangeListenerC6528j91.a().a(propertyModel2.g(md22));
                                return;
                            }
                            ND2 nd2 = AbstractC10087tY0.a;
                            if (nd2 == fd2) {
                                switch (propertyModel2.h(nd2)) {
                                    case 1:
                                        boolean j = propertyModel2.j(AbstractC10087tY0.b);
                                        int h = propertyModel2.h(AbstractC10087tY0.f);
                                        if (viewGroupOnHierarchyChangeListenerC6528j91.i == null) {
                                            X93 x932 = new X93(viewGroupOnHierarchyChangeListenerC6528j91.getContext());
                                            viewGroupOnHierarchyChangeListenerC6528j91.i = x932;
                                            x932.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                            X93 x933 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                            x933.j = new C5498g91(viewGroupOnHierarchyChangeListenerC6528j91, x933);
                                            x933.k = new C5498g91(viewGroupOnHierarchyChangeListenerC6528j91, x933);
                                        }
                                        viewGroupOnHierarchyChangeListenerC6528j91.i.setEnabled(true);
                                        X93 x934 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        x934.v = j;
                                        int i7 = j ? R.drawable.0_resource_name_obfuscated_res_0x7f0901c1 : R.drawable.0_resource_name_obfuscated_res_0x7f0901be;
                                        NavigationBubble navigationBubble2 = x934.p;
                                        navigationBubble2.m.setVisibility(0);
                                        navigationBubble2.m.setImageResource(i7);
                                        A12 a122 = navigationBubble2.k;
                                        a122.a = navigationBubble2.g;
                                        a122.g = navigationBubble2.h;
                                        navigationBubble2.a.start();
                                        X93 x935 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        x935.w = h;
                                        RunnableC6186i91 runnableC6186i91 = viewGroupOnHierarchyChangeListenerC6528j91.l;
                                        if (runnableC6186i91 != null) {
                                            x935.removeCallbacks(runnableC6186i91);
                                            viewGroupOnHierarchyChangeListenerC6528j91.l = null;
                                        }
                                        X93 x936 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        if ((x936 == null || x936.getParent() == null) != false) {
                                            viewGroupOnHierarchyChangeListenerC6528j91.addView(viewGroupOnHierarchyChangeListenerC6528j91.i);
                                        }
                                        X93 x937 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        if (!x937.isEnabled() || x937.l || x937.j == null) {
                                            return;
                                        }
                                        x937.n = 0.0f;
                                        x937.i = 0.0f;
                                        x937.o = true;
                                        x937.x = false;
                                        int width = x937.v ? ((View) x937.getParent()).getWidth() : -x937.q;
                                        x937.s = width;
                                        x937.m = width;
                                        x937.p.a();
                                        return;
                                    case 2:
                                        GesturePoint gesturePoint = (GesturePoint) propertyModel2.i(AbstractC10087tY0.g);
                                        viewGroupOnHierarchyChangeListenerC6528j91.a().b(gesturePoint.x, gesturePoint.y);
                                        return;
                                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                        boolean j2 = propertyModel2.j(AbstractC10087tY0.c);
                                        X93 x938 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        if (x938 == null) {
                                            return;
                                        }
                                        RunnableC5842h91 runnableC5842h91 = viewGroupOnHierarchyChangeListenerC6528j91.k;
                                        if (runnableC5842h91 != null) {
                                            x938.removeCallbacks(runnableC5842h91);
                                            viewGroupOnHierarchyChangeListenerC6528j91.k = null;
                                        }
                                        X93 x939 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        if (x939.o) {
                                            x939.o = false;
                                            byte b2 = x939.i >= ((float) (x939.q / 3));
                                            if (b2 != false) {
                                                EI2.h(x939.v ? 1 : 0, 2, "GestureNavigation.Activated");
                                            }
                                            if (x939.isEnabled()) {
                                                if ((x939.a() > x939.g * 3.0f) != false) {
                                                    U93 u93 = x939.y;
                                                    if (!j2) {
                                                        x939.l = false;
                                                        x939.c(u93);
                                                        return;
                                                    }
                                                    if (!x939.l) {
                                                        x939.l = true;
                                                        x939.c(u93);
                                                    }
                                                    EI2.h(x939.v ? 1 : 0, 2, "GestureNavigation.Completed");
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    long j3 = X93.A;
                                                    if (j3 > 0 && currentTimeMillis - j3 < 3000 && (z = x939.v) != X93.B) {
                                                        EI2.h(z ? 1 : 0, 2, "GestureNavigation.Reversed");
                                                    }
                                                    X93.A = currentTimeMillis;
                                                    X93.B = x939.v;
                                                    return;
                                                }
                                            }
                                            x939.l = false;
                                            x939.r = x939.m;
                                            V93 v93 = x939.z;
                                            v93.reset();
                                            v93.setDuration(500L);
                                            v93.setInterpolator(x939.a);
                                            NavigationBubble navigationBubble3 = x939.p;
                                            navigationBubble3.clearAnimation();
                                            navigationBubble3.startAnimation(v93);
                                            if (b2 == true) {
                                                EI2.h(x939.v ? 1 : 0, 2, "GestureNavigation.Cancelled");
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 4:
                                        viewGroupOnHierarchyChangeListenerC6528j91.a().c();
                                        return;
                                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                        X93 x9310 = viewGroupOnHierarchyChangeListenerC6528j91.i;
                                        if (x9310 == null) {
                                            return;
                                        }
                                        RunnableC5842h91 runnableC5842h912 = viewGroupOnHierarchyChangeListenerC6528j91.k;
                                        if (runnableC5842h912 != null) {
                                            x9310.removeCallbacks(runnableC5842h912);
                                            viewGroupOnHierarchyChangeListenerC6528j91.k = null;
                                        }
                                        viewGroupOnHierarchyChangeListenerC6528j91.i.b();
                                        return;
                                    case 6:
                                        viewGroupOnHierarchyChangeListenerC6528j91.a().d();
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    });
                    F12 f12 = new F12(propertyModel, this.h, this.l);
                    this.o = f12;
                    this.q.onResult(f12);
                }
                F12 f122 = this.o;
                Tab tab2 = this.m;
                f122.g = tab2 == null || tab2.b() == null || tab2.b().Q0() == null ? null : this.m;
            }
        }
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        this.g.post(this.a);
    }
}
