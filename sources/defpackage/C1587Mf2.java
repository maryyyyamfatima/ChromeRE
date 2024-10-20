package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListView;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelWrapper;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mf2 */
/* loaded from: classes.dex */
public final class C1587Mf2 extends AbstractC2976Wx1 implements InterfaceC1818Nz3 {
    public final C1458Lf2 A;
    public AccessibilityTabModelWrapper v;
    public final float w;
    public final C0770Fy x;
    public final SceneLayer y;
    public final JC z;

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 2;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int p() {
        return 0;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean r() {
        return true;
    }

    public C1587Mf2(Context context, C9897sy1 c9897sy1, CompositorViewHolder compositorViewHolder, CC cc) {
        super(context, c9897sy1, compositorViewHolder);
        this.x = new C0770Fy(context);
        this.w = context.getResources().getDisplayMetrics().density;
        this.y = new SceneLayer();
        this.z = cc;
        this.A = new C1458Lf2(this);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void d() {
        JC jc = this.z;
        if (jc != null) {
            ((CC) jc).g(this.A);
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void a(ViewGroup viewGroup) {
        if (this.v == null) {
            AccessibilityTabModelWrapper accessibilityTabModelWrapper = (AccessibilityTabModelWrapper) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e001e, (ViewGroup) null);
            this.v = accessibilityTabModelWrapper;
            accessibilityTabModelWrapper.m = Y50.b(accessibilityTabModelWrapper.getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012b);
            accessibilityTabModelWrapper.o = ColorStateList.valueOf(AbstractC10957w33.b(accessibilityTabModelWrapper.getContext()));
            accessibilityTabModelWrapper.n = Y50.b(accessibilityTabModelWrapper.getContext(), R.color.0_resource_name_obfuscated_res_0x7f0708d4);
            accessibilityTabModelWrapper.p = Y50.b(accessibilityTabModelWrapper.getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012c);
            ChromeImageView chromeImageView = new ChromeImageView(accessibilityTabModelWrapper.getContext());
            accessibilityTabModelWrapper.k = chromeImageView;
            chromeImageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0900cc);
            accessibilityTabModelWrapper.k.setScaleY(-1.0f);
            accessibilityTabModelWrapper.k.setContentDescription(accessibilityTabModelWrapper.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140174));
            ChromeImageView chromeImageView2 = new ChromeImageView(accessibilityTabModelWrapper.getContext());
            accessibilityTabModelWrapper.l = chromeImageView2;
            chromeImageView2.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f090352);
            accessibilityTabModelWrapper.l.setScaleY(-1.0f);
            accessibilityTabModelWrapper.l.setContentDescription(accessibilityTabModelWrapper.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140172));
            accessibilityTabModelWrapper.setDividerDrawable(null);
            ((ListView) accessibilityTabModelWrapper.findViewById(R.id.list_view)).setDivider(null);
            accessibilityTabModelWrapper.g = accessibilityTabModelWrapper.findViewById(R.id.tab_wrapper);
            TabLayout tabLayout = (TabLayout) accessibilityTabModelWrapper.findViewById(R.id.tab_layout);
            accessibilityTabModelWrapper.h = tabLayout;
            C0249Bx3 m = tabLayout.m();
            m.f = accessibilityTabModelWrapper.k;
            m.e();
            accessibilityTabModelWrapper.i = m;
            accessibilityTabModelWrapper.h.c(m);
            C0249Bx3 m2 = accessibilityTabModelWrapper.h.m();
            m2.f = accessibilityTabModelWrapper.l;
            m2.e();
            accessibilityTabModelWrapper.j = m2;
            accessibilityTabModelWrapper.h.c(m2);
            accessibilityTabModelWrapper.h.b(new D1(accessibilityTabModelWrapper));
            accessibilityTabModelWrapper.a = (AccessibilityTabModelListView) accessibilityTabModelWrapper.findViewById(R.id.list_view);
            accessibilityTabModelWrapper.a().i = this;
            AccessibilityTabModelWrapper accessibilityTabModelWrapper2 = this.v;
            InterfaceC10590uz3 interfaceC10590uz3 = this.l;
            boolean z = accessibilityTabModelWrapper2.s;
            C1 c1 = accessibilityTabModelWrapper2.r;
            if (z) {
                ((AbstractC11276wz3) accessibilityTabModelWrapper2.q).s(c1);
            }
            accessibilityTabModelWrapper2.q = interfaceC10590uz3;
            if (accessibilityTabModelWrapper2.s) {
                ((AbstractC11276wz3) interfaceC10590uz3).c(c1);
            }
            accessibilityTabModelWrapper2.b();
            Q();
        }
        if (viewGroup == null || this.v.getParent() != null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.overview_list_layout_holder);
        viewGroup2.setVisibility(0);
        viewGroup2.addView(this.v);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void s() {
        Q();
    }

    public final void Q() {
        FrameLayout.LayoutParams layoutParams;
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null || (layoutParams = (FrameLayout.LayoutParams) accessibilityTabModelWrapper.getLayoutParams()) == null) {
            return;
        }
        layoutParams.bottomMargin = (int) (this.i * this.w);
        layoutParams.topMargin = ((CC) this.z).t;
        this.v.setLayoutParams(layoutParams);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void z(int i) {
        J(i, false);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void y(int i, int i2, boolean z, boolean z2, float f, float f2) {
        J(i, false);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void B(long j) {
        I(j, false);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void A() {
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null) {
            return;
        }
        accessibilityTabModelWrapper.b();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean b() {
        return DeviceFormFactor.a(this.j);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        AccessibilityTabModelListItem accessibilityTabModelListItem;
        super.I(j, z);
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null) {
            return;
        }
        accessibilityTabModelWrapper.b();
        g();
        ((CC) this.z).d(this.A);
        Q();
        Tab a = AbstractC1558Lz3.a(((AbstractC11276wz3) this.l).g());
        int id = a == null ? -1 : a.getId();
        AccessibilityTabModelWrapper accessibilityTabModelWrapper2 = this.v;
        accessibilityTabModelWrapper2.a.smoothScrollToPosition(AbstractC1558Lz3.d(((AbstractC11276wz3) accessibilityTabModelWrapper2.q).g(), id));
        C10941w1 a2 = accessibilityTabModelWrapper2.a();
        if (a2.k != -1 && (accessibilityTabModelListItem = a2.l) != null) {
            accessibilityTabModelListItem.removeOnAttachStateChangeListener(a2.m);
            a2.l = null;
        }
        a2.k = id;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void J(int i, boolean z) {
        ((CC) this.z).g(this.A);
        super.J(i, z);
        f();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void e() {
        ViewGroup viewGroup;
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        if (interfaceC10590uz3 != null) {
            ((C0129Az3) interfaceC10590uz3).f();
        }
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null || (viewGroup = (ViewGroup) accessibilityTabModelWrapper.getParent()) == null) {
            return;
        }
        viewGroup.setVisibility(8);
        viewGroup.removeView(this.v);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void H(InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager) {
        super.H(interfaceC10590uz3, tabContentManager);
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null) {
            return;
        }
        boolean z = accessibilityTabModelWrapper.s;
        C1 c1 = accessibilityTabModelWrapper.r;
        if (z) {
            ((AbstractC11276wz3) accessibilityTabModelWrapper.q).s(c1);
        }
        accessibilityTabModelWrapper.q = interfaceC10590uz3;
        if (accessibilityTabModelWrapper.s) {
            ((AbstractC11276wz3) interfaceC10590uz3).c(c1);
        }
        accessibilityTabModelWrapper.b();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void D(boolean z) {
        if (z) {
            ((C0129Az3) this.l).t(!z);
        }
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null) {
            return;
        }
        accessibilityTabModelWrapper.b();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void x() {
        this.v.b();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return this.x;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.y;
    }

    @Override // defpackage.InterfaceC1818Nz3
    public final void o(boolean z) {
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.v;
        if (accessibilityTabModelWrapper == null) {
            return;
        }
        int i = !z ? 0 : 4;
        if (accessibilityTabModelWrapper.getImportantForAccessibility() != i) {
            this.v.setImportantForAccessibility(i);
            this.v.sendAccessibilityEvent(2048);
        }
    }
}
