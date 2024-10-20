package org.chromium.chrome.browser.tasks.tab_management;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC5241fQ2;
import defpackage.C10242ty3;
import defpackage.C1024Hw3;
import defpackage.C10999wA3;
import defpackage.C1284Jw3;
import defpackage.C1521Ls1;
import defpackage.C1553Ly3;
import defpackage.C1813Ny3;
import defpackage.C2188Qv3;
import defpackage.C4273cc3;
import defpackage.C4617dc3;
import defpackage.C4828eC3;
import defpackage.C5091ey3;
import defpackage.C7502lz3;
import defpackage.C7928nE;
import defpackage.C8871py3;
import defpackage.C9537rv0;
import defpackage.C9556ry3;
import defpackage.ComponentCallbacksC6809jy3;
import defpackage.GK2;
import defpackage.IG3;
import defpackage.InterfaceC0128Az2;
import defpackage.InterfaceC0186Bl0;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC1424Ky3;
import defpackage.InterfaceC7960nK1;
import defpackage.TD2;
import defpackage.UN;
import defpackage.ViewOnLayoutChangeListenerC2588Tx3;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC2458Sx3;
import defpackage.XC3;
import defpackage.ZC3;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.SelectableTabGridView;
import org.chromium.chrome.browser.tasks.tab_management.b;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c implements InterfaceC0128Az2, InterfaceC0186Bl0 {
    public final C1553Ly3 a;
    public final TabListRecyclerView g;
    public final C4617dc3 h;
    public final int i;
    public final Rect j = new Rect();
    public final Context k;
    public final C1813Ny3 l;
    public final int m;
    public final ViewGroup n;
    public boolean o;
    public final ViewTreeObserverOnGlobalLayoutListenerC2458Sx3 p;
    public final ViewOnLayoutChangeListenerC2588Tx3 q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Sx3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Tx3] */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public c(int i, final Context context, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC1424Ky3 interfaceC1424Ky3, C4828eC3 c4828eC3, boolean z, ZC3 zc3, C2188Qv3 c2188Qv3, int i2, C10999wA3 c10999wA3, XC3 xc3, final ViewGroup viewGroup, boolean z2, String str, ViewGroup viewGroup2) {
        GK2 gk2;
        boolean z3;
        boolean z4;
        int i3;
        this.i = i;
        this.m = i2;
        this.k = context;
        C1813Ny3 c1813Ny3 = new C1813Ny3();
        this.l = c1813Ny3;
        C4617dc3 c4617dc3 = new C4617dc3(c1813Ny3);
        this.h = c4617dc3;
        this.n = viewGroup2;
        if (i == 0 || i == 2) {
            c4617dc3.Q(0, new InterfaceC7960nK1() { // from class: Nx3
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup3) {
                    ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0265, viewGroup, false);
                    viewGroup4.setClickable(true);
                    return viewGroup4;
                }
            }, new TD2() { // from class: Ux3
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    ViewGroup viewGroup3 = (ViewGroup) obj;
                    FD2 fd2 = (FD2) obj2;
                    if (fd2 == null) {
                        b.e(0, propertyModel, (ViewLookupCachingFrameLayout) viewGroup3);
                        return;
                    }
                    ViewLookupCachingFrameLayout viewLookupCachingFrameLayout = (ViewLookupCachingFrameLayout) viewGroup3;
                    b.b(propertyModel, viewLookupCachingFrameLayout, fd2);
                    b.c(propertyModel, viewLookupCachingFrameLayout, fd2);
                }
            });
            c4617dc3.Q(1, new InterfaceC7960nK1() { // from class: Vx3
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup3) {
                    c cVar = c.this;
                    cVar.getClass();
                    Context context2 = context;
                    ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context2).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e008a, viewGroup, false);
                    if (cVar.i == 2) {
                        viewGroup4.getLayoutParams().width = context2.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08077e);
                    }
                    viewGroup4.setClickable(true);
                    return viewGroup4;
                }
            }, new TD2() { // from class: Wx3
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    ViewGroup viewGroup3 = (ViewGroup) obj;
                    FD2 fd2 = (FD2) obj2;
                    if (fd2 == null) {
                        b.e(1, propertyModel, (ViewLookupCachingFrameLayout) viewGroup3);
                        return;
                    }
                    ViewLookupCachingFrameLayout viewLookupCachingFrameLayout = (ViewLookupCachingFrameLayout) viewGroup3;
                    b.b(propertyModel, viewLookupCachingFrameLayout, fd2);
                    b.a(propertyModel, viewLookupCachingFrameLayout, fd2);
                }
            });
            gk2 = new GK2() { // from class: Xx3
                @Override // defpackage.GK2
                public final void a(d dVar) {
                    ImageView imageView;
                    int i4 = dVar.k;
                    if ((i4 == 1 || i4 == 0) && (imageView = (ImageView) ((ViewLookupCachingFrameLayout) dVar.a).c(R.id.tab_thumbnail)) != null) {
                        if (AbstractC5177fD3.c()) {
                            imageView.setImageDrawable(null);
                        } else if (AbstractC5177fD3.f()) {
                            imageView.setMinimumHeight(Math.min(imageView.getHeight(), (int) ((imageView.getWidth() * 1.0d) / AbstractC7239lD3.c(context))));
                            imageView.setImageDrawable(null);
                        } else {
                            imageView.setImageDrawable(null);
                            imageView.setMinimumHeight(imageView.getWidth());
                        }
                    }
                }
            };
        } else {
            if (i == 1) {
                c4617dc3.Q(2, new InterfaceC7960nK1() { // from class: Yx3
                    @Override // defpackage.InterfaceC7960nK1
                    public final View a(ViewGroup viewGroup3) {
                        return (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02af, viewGroup, false);
                    }
                }, new TD2() { // from class: Zx3
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        UA3.a((PropertyModel) wd2, (ViewGroup) obj, (FD2) obj2);
                    }
                });
            } else if (i == 3) {
                c4617dc3.Q(1, new InterfaceC7960nK1() { // from class: Ox3
                    @Override // defpackage.InterfaceC7960nK1
                    public final View a(ViewGroup viewGroup3) {
                        ViewLookupCachingFrameLayout viewLookupCachingFrameLayout = (ViewLookupCachingFrameLayout) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e008b, viewGroup, false);
                        viewLookupCachingFrameLayout.setClickable(true);
                        ImageView imageView = (ImageView) viewLookupCachingFrameLayout.c(R.id.end_button);
                        imageView.setVisibility(0);
                        Resources resources = viewLookupCachingFrameLayout.getResources();
                        int dimension = (int) resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08078a);
                        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.0_resource_name_obfuscated_res_0x7f0900c5);
                        Bitmap.createScaledBitmap(decodeResource, dimension, dimension, true);
                        imageView.setImageBitmap(decodeResource);
                        return viewLookupCachingFrameLayout;
                    }
                }, new TD2() { // from class: Px3
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        AbstractC2723Uy3.a((PropertyModel) wd2, (ViewLookupCachingFrameLayout) obj, (FD2) obj2);
                    }
                });
                c4617dc3.Q(0, new InterfaceC7960nK1() { // from class: Qx3
                    @Override // defpackage.InterfaceC7960nK1
                    public final View a(ViewGroup viewGroup3) {
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0266, viewGroup, false);
                        viewGroup4.setClickable(true);
                        return viewGroup4;
                    }
                }, new TD2() { // from class: Rx3
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        ColorStateList colorStateList;
                        final PropertyModel propertyModel = (PropertyModel) wd2;
                        ViewGroup viewGroup3 = (ViewGroup) obj;
                        FD2 fd2 = (FD2) obj2;
                        AbstractC2723Uy3.a(propertyModel, viewGroup3, fd2);
                        final int h = propertyModel.h(AbstractC9627sA3.a);
                        int integer = viewGroup3.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0043);
                        int integer2 = viewGroup3.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0045);
                        final SelectableTabGridView selectableTabGridView = (SelectableTabGridView) viewGroup3.findViewById(R.id.content_view);
                        if (AbstractC9627sA3.m == fd2) {
                            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Sy3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ((InterfaceC0904Gy3) PropertyModel.this.i(AbstractC9627sA3.m)).a(h);
                                    selectableTabGridView.j();
                                }
                            };
                            View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: Ty3
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    ((InterfaceC0904Gy3) PropertyModel.this.i(AbstractC9627sA3.m)).a(h);
                                    SelectableTabGridView selectableTabGridView2 = selectableTabGridView;
                                    return selectableTabGridView2.onLongClick(selectableTabGridView2);
                                }
                            };
                            selectableTabGridView.setOnClickListener(onClickListener);
                            selectableTabGridView.setOnLongClickListener(onLongClickListener);
                            ImageView imageView = (ImageView) selectableTabGridView.findViewById(R.id.end_button);
                            imageView.setOnClickListener(onClickListener);
                            imageView.setOnLongClickListener(onLongClickListener);
                            return;
                        }
                        PD2 pd2 = AbstractC9627sA3.n;
                        if (pd2 == fd2) {
                            selectableTabGridView.m((C7526m33) propertyModel.i(pd2));
                            selectableTabGridView.k(Integer.valueOf(h));
                            return;
                        }
                        LD2 ld2 = AbstractC9627sA3.i;
                        if (ld2 == fd2) {
                            boolean j = propertyModel.j(ld2);
                            ImageView imageView2 = (ImageView) viewGroup3.findViewById(R.id.end_button);
                            Drawable background = imageView2.getBackground();
                            if (j) {
                                integer = integer2;
                            }
                            background.setLevel(integer);
                            Drawable mutate = imageView2.getBackground().mutate();
                            if (j) {
                                colorStateList = (ColorStateList) propertyModel.i(AbstractC9627sA3.s);
                            } else {
                                colorStateList = (ColorStateList) propertyModel.i(AbstractC9627sA3.r);
                            }
                            mutate.setTintList(colorStateList);
                            imageView2.getDrawable().setAlpha(j ? 255 : 0);
                            imageView2.setImageTintList(j ? (ColorStateList) propertyModel.i(AbstractC9627sA3.j) : null);
                            if (j) {
                                ((C6674jc) imageView2.getDrawable()).start();
                            }
                        }
                    }
                });
            } else {
                throw new IllegalArgumentException("Attempting to create a tab list UI with invalid mode");
            }
            gk2 = null;
        }
        GK2 gk22 = gk2;
        C1553Ly3 c1553Ly3 = new C1553Ly3(context, c1813Ny3, i, interfaceC10590uz3, interfaceC1424Ky3, c4828eC3, new C5091ey3(context, i == 1), z, c10999wA3, zc3, c2188Qv3, xc3, str, i2);
        this.a = c1553Ly3;
        TraceEvent i4 = TraceEvent.i("TabListCoordinator.setupRecyclerView", null);
        try {
            if (!z2) {
                z3 = false;
                this.g = (TabListRecyclerView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02ac, viewGroup, false);
                z4 = true;
            } else {
                z3 = false;
                z4 = true;
                LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02ac, viewGroup, true);
                this.g = (TabListRecyclerView) viewGroup.findViewById(R.id.tab_list_view);
            }
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                layoutParams.height = -2;
                this.g.setLayoutParams(layoutParams);
            }
            this.g.n0(c4617dc3);
            TabListRecyclerView tabListRecyclerView = this.g;
            tabListRecyclerView.z = z4;
            if (gk22 != null) {
                tabListRecyclerView.t = gk22;
            }
            if (i == 0) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
                this.g.q0(gridLayoutManager);
                ComponentCallbacksC6809jy3 componentCallbacksC6809jy3 = new ComponentCallbacksC6809jy3(c1553Ly3, gridLayoutManager);
                c1553Ly3.r = componentCallbacksC6809jy3;
                context.registerComponentCallbacks(componentCallbacksC6809jy3);
                c1553Ly3.w = gridLayoutManager;
                c1553Ly3.q(gridLayoutManager, context.getResources().getConfiguration().orientation, context.getResources().getConfiguration().screenWidthDp);
                TabListRecyclerView tabListRecyclerView2 = this.g;
                if (AbstractC5177fD3.d(context)) {
                    c1553Ly3.F = new d(c1553Ly3, tabListRecyclerView2);
                }
            } else {
                if (i == z4 || i == 2) {
                    i3 = 3;
                } else {
                    i3 = 3;
                    if (i == 3) {
                    }
                }
                tabListRecyclerView.q0(new LinearLayoutManager(i == i3 ? z4 : z3, z3));
            }
            if (i4 != null) {
                i4.close();
            }
            if (i == 0 && c10999wA3 == null) {
                this.p = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Sx3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        c.this.l();
                    }
                };
                if (AbstractC5177fD3.h(context)) {
                    this.q = new View.OnLayoutChangeListener() { // from class: Tx3
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                            int i13 = i7 - i5;
                            c cVar = c.this;
                            GridLayoutManager gridLayoutManager2 = (GridLayoutManager) cVar.g.s;
                            Context context2 = cVar.k;
                            cVar.a.q(gridLayoutManager2, context2.getResources().getConfiguration().orientation, context2.getResources().getConfiguration().screenWidthDp);
                            int i14 = i13 / gridLayoutManager2.F;
                            int d = AbstractC7239lD3.d(context2) + ((int) ((i14 - ((((int) AbstractC5521gD3.c(context2)) + ((int) context2.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080787))) * 2)) / AbstractC7239lD3.c(context2)));
                            int i15 = 0;
                            while (true) {
                                C1813Ny3 c1813Ny32 = cVar.l;
                                if (i15 >= c1813Ny32.size()) {
                                    return;
                                }
                                ((C7272lK1) c1813Ny32.get(i15)).b.o(AbstractC9627sA3.f, new Size(i14, d));
                                i15++;
                            }
                        }
                    };
                }
            }
        } catch (Throwable th) {
            if (i4 != null) {
                try {
                    i4.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void d(C9537rv0 c9537rv0) {
        float f;
        C1553Ly3 c1553Ly3 = this.a;
        Context context = this.k;
        if (this.o) {
            return;
        }
        TraceEvent i = TraceEvent.i("TabListCoordinator.initWithNative", null);
        try {
            this.o = true;
            Profile d = Profile.d();
            c1553Ly3.j(d);
            TabListRecyclerView tabListRecyclerView = this.g;
            if (c9537rv0 != null) {
                tabListRecyclerView.getClass();
                f fVar = new f(tabListRecyclerView, tabListRecyclerView);
                tabListRecyclerView.U0 = fVar;
                C7928nE c7928nE = UN.a;
                try {
                    f = Float.valueOf(N.MMltG$kc("TabToGTSAnimation", "downsampling-scale")).floatValue();
                } catch (NumberFormatException unused) {
                    f = 0.5f;
                }
                if (fVar.k != f) {
                    fVar.f(null);
                }
                fVar.k = f;
                tabListRecyclerView.T0 = c9537rv0;
            }
            int i2 = this.i;
            if ((i2 == 0 || i2 == 3) && this.m != 0) {
                float dimension = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080777);
                float dimension2 = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080797);
                float dimension3 = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08009c);
                a aVar = c1553Ly3.s;
                aVar.k = dimension;
                aVar.l = dimension2;
                aVar.m = dimension3;
                aVar.v = d;
                aVar.p = (n.t(aVar.j) && aVar.n) ^ true ? 51 : 0;
                new C1521Ls1(aVar).j(tabListRecyclerView);
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public final int b() {
        Context context = this.k;
        if (!AbstractC5241fQ2.d(context)) {
            return 0;
        }
        Rect rect = new Rect();
        this.g.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        this.n.getGlobalVisibleRect(rect2);
        rect.offset(0, (-rect2.top) - ((int) context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080803)));
        return rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:            if (r0 == 0) goto L441;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.util.ArrayList r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tasks.tab_management.c.k(java.util.ArrayList, boolean, boolean):boolean");
    }

    public final void h() {
        C9537rv0 c9537rv0;
        TabListRecyclerView tabListRecyclerView = this.g;
        ViewTreeObserverOnGlobalLayoutListenerC2458Sx3 viewTreeObserverOnGlobalLayoutListenerC2458Sx3 = this.p;
        if (viewTreeObserverOnGlobalLayoutListenerC2458Sx3 != null) {
            tabListRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2458Sx3);
        }
        ViewOnLayoutChangeListenerC2588Tx3 viewOnLayoutChangeListenerC2588Tx3 = this.q;
        if (viewOnLayoutChangeListenerC2588Tx3 != null) {
            tabListRecyclerView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2588Tx3);
        }
        f fVar = tabListRecyclerView.U0;
        if (fVar != null) {
            fVar.j.b();
            if (tabListRecyclerView.V0 && (c9537rv0 = tabListRecyclerView.T0) != null) {
                c9537rv0.e(tabListRecyclerView.P0);
                tabListRecyclerView.V0 = false;
            }
        }
        this.a.a = false;
    }

    public final void a(int i, int i2, PropertyModel propertyModel) {
        this.a.b(i, i2, propertyModel);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C1553Ly3 c1553Ly3 = this.a;
        C9556ry3 c9556ry3 = c1553Ly3.B;
        if (c9556ry3 != null) {
            c1553Ly3.e.a.d(c9556ry3);
        }
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c1553Ly3.g;
        TabModel g = abstractC11276wz3.g();
        if (g != null) {
            for (int i = 0; i < g.getCount(); i++) {
                g.getTabAt(i).w(c1553Ly3.z);
            }
        }
        C7502lz3 c7502lz3 = abstractC11276wz3.c;
        C8871py3 c8871py3 = c1553Ly3.A;
        if (c8871py3 != null) {
            c7502lz3.f(c8871py3);
        }
        if (c1553Ly3.E != null) {
            ((C1024Hw3) c7502lz3.e(false)).f0(c1553Ly3.E);
            ((C1024Hw3) c7502lz3.e(true)).f0(c1553Ly3.E);
        }
        ComponentCallbacksC6809jy3 componentCallbacksC6809jy3 = c1553Ly3.r;
        if (componentCallbacksC6809jy3 != null) {
            c1553Ly3.d.unregisterComponentCallbacks(componentCallbacksC6809jy3);
        }
        C10242ty3 c10242ty3 = c1553Ly3.D;
        if (c10242ty3 != null) {
            AbstractC11276wz3 abstractC11276wz32 = (AbstractC11276wz3) c10242ty3.a;
            abstractC11276wz32.c.f(c10242ty3.b);
            C7502lz3 c7502lz32 = abstractC11276wz32.c;
            C1024Hw3 c1024Hw3 = (C1024Hw3) c7502lz32.e(false);
            C1284Jw3 c1284Jw3 = c10242ty3.c;
            c1024Hw3.f0(c1284Jw3);
            ((C1024Hw3) c7502lz32.e(true)).f0(c1284Jw3);
        }
        if (c1553Ly3.C != null) {
            IG3.a().h(c1553Ly3.C);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2458Sx3 viewTreeObserverOnGlobalLayoutListenerC2458Sx3 = this.p;
        TabListRecyclerView tabListRecyclerView = this.g;
        if (viewTreeObserverOnGlobalLayoutListenerC2458Sx3 != null) {
            tabListRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2458Sx3);
        }
        ViewOnLayoutChangeListenerC2588Tx3 viewOnLayoutChangeListenerC2588Tx3 = this.q;
        if (viewOnLayoutChangeListenerC2588Tx3 != null) {
            tabListRecyclerView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2588Tx3);
        }
        tabListRecyclerView.t = null;
    }

    public final void l() {
        Rect rect;
        C1553Ly3 c1553Ly3 = this.a;
        int i = c1553Ly3.t;
        if (i == -1) {
            i = ((AbstractC11276wz3) c1553Ly3.g).i();
        }
        int G = c1553Ly3.e.G(i);
        if (c1553Ly3.t == -1) {
            ((AbstractC11276wz3) c1553Ly3.g).i();
        }
        TabListRecyclerView tabListRecyclerView = this.g;
        C4273cc3 c4273cc3 = (C4273cc3) tabListRecyclerView.G(G);
        if (c4273cc3 == null || G == -1) {
            rect = null;
        } else {
            View c = ((ViewLookupCachingFrameLayout) c4273cc3.a).c(R.id.tab_thumbnail);
            Rect rect2 = new Rect();
            rect = new Rect();
            tabListRecyclerView.getGlobalVisibleRect(rect2);
            c.getGlobalVisibleRect(rect);
            rect.offset(-rect2.left, -rect2.top);
        }
        if (rect == null) {
            return;
        }
        rect.offset(0, b());
        this.j.set(rect);
    }

    public final void j(int i, int i2) {
        int J2;
        C1813Ny3 c1813Ny3 = this.a.e;
        if (i != 3 && i != 6) {
            J2 = -1;
        } else {
            if (i2 == 5) {
                while (c1813Ny3.I() != -1) {
                    c1813Ny3.y(c1813Ny3.I());
                }
                return;
            }
            J2 = c1813Ny3.J(i2);
        }
        if (J2 == -1) {
            return;
        }
        c1813Ny3.y(J2);
    }
}
