package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.chrome.R;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListView;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10941w1 extends BaseAdapter {
    public final Context a;
    public InterfaceC1548Lx3 g;
    public TabModel h;
    public C1587Mf2 i;
    public final AccessibilityTabModelListView j;
    public AccessibilityTabModelListItem l;
    public int k = -1;
    public final ViewOnAttachStateChangeListenerC10255u1 m = new ViewOnAttachStateChangeListenerC10255u1(this);
    public final C10598v1 n = new C10598v1(this);

    public C10941w1(Context context, AccessibilityTabModelListView accessibilityTabModelListView) {
        this.a = context;
        this.j = accessibilityTabModelListView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        InterfaceC1548Lx3 interfaceC1548Lx3 = this.g;
        if (interfaceC1548Lx3 != null) {
            return interfaceC1548Lx3.getCount();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return new Object();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        InterfaceC1548Lx3 interfaceC1548Lx3 = this.g;
        if (interfaceC1548Lx3 == null || interfaceC1548Lx3.getTabAt(i) == null) {
            return -1L;
        }
        return this.g.getTabAt(i).getId();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AccessibilityTabModelListItem accessibilityTabModelListItem;
        int itemId = (int) getItemId(i);
        if (view instanceof AccessibilityTabModelListItem) {
            accessibilityTabModelListItem = (AccessibilityTabModelListItem) view;
        } else {
            accessibilityTabModelListItem = (AccessibilityTabModelListItem) LayoutInflater.from(this.a).inflate(R.layout.f55450_resource_name_obfuscated_res_0x7f0e001f, (ViewGroup) null, false);
        }
        Tab c = AbstractC1558Lz3.c(this.g, itemId);
        boolean v = this.h.v();
        boolean z = AbstractC1558Lz3.a(this.g).getId() == itemId;
        Tab tab = accessibilityTabModelListItem.z;
        A1 a1 = accessibilityTabModelListItem.L;
        if (tab != null) {
            tab.w(a1);
        }
        accessibilityTabModelListItem.z = c;
        c.v(a1);
        accessibilityTabModelListItem.A = v;
        accessibilityTabModelListItem.B = z;
        accessibilityTabModelListItem.g();
        accessibilityTabModelListItem.f();
        accessibilityTabModelListItem.C = this.n;
        accessibilityTabModelListItem.F = this.j;
        accessibilityTabModelListItem.setTranslationX(0.0f);
        accessibilityTabModelListItem.setAlpha(1.0f);
        accessibilityTabModelListItem.setScaleX(1.0f);
        accessibilityTabModelListItem.setScaleY(1.0f);
        accessibilityTabModelListItem.setHeight(accessibilityTabModelListItem.E);
        accessibilityTabModelListItem.a();
        Handler handler = accessibilityTabModelListItem.I;
        RunnableC11284x1 runnableC11284x1 = accessibilityTabModelListItem.H;
        handler.removeCallbacks(runnableC11284x1);
        C10598v1 c10598v1 = accessibilityTabModelListItem.C;
        if (c10598v1 != null) {
            boolean z2 = c10598v1.a.h.z(accessibilityTabModelListItem.z.getId());
            accessibilityTabModelListItem.e(z2);
            if (z2) {
                handler.postDelayed(runnableC11284x1, accessibilityTabModelListItem.h);
            }
        } else {
            accessibilityTabModelListItem.e(false);
        }
        if (itemId == this.k) {
            if (accessibilityTabModelListItem.isAttachedToWindow()) {
                accessibilityTabModelListItem.requestFocus();
                this.k = -1;
            } else {
                this.l = accessibilityTabModelListItem;
                accessibilityTabModelListItem.addOnAttachStateChangeListener(this.m);
            }
        }
        return accessibilityTabModelListItem;
    }
}
