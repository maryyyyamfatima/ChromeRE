package defpackage;

import J.N;
import android.view.View;
import android.view.ViewStub;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.NewTabButton;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.TabSwitcherModeTopToolbar;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cD3 */
/* loaded from: classes2.dex */
public final class C4146cD3 {
    public final ViewStub a;
    public View.OnClickListener c;
    public View.OnClickListener d;
    public C10226tv3 e;
    public InterfaceC10590uz3 f;
    public C10501uk1 g;
    public LS1 h;
    public boolean i;
    public TabSwitcherModeTopToolbar j;
    public TabSwitcherModeTopToolbar k;
    public TabSwitcherModeTopToolbar l;
    public C3803bD3 m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final InterfaceC7913nB q;
    public ViewStub b = null;
    public final ES3 r = new ES3(new DS3() { // from class: aD3
        @Override // defpackage.DS3
        public final void a(boolean z) {
            TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = C4146cD3.this.j;
            if (tabSwitcherModeTopToolbar != null) {
                tabSwitcherModeTopToolbar.m.setEnabled(z);
                tabSwitcherModeTopToolbar.n.setEnabled(z);
            }
        }
    });

    public C4146cD3(ViewStub viewStub, LS1 ls1, boolean z, boolean z2, boolean z3, JP3 jp3) {
        this.a = viewStub;
        this.h = ls1;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = jp3;
    }

    public final void a(TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar, boolean z) {
        boolean z2 = this.n;
        tabSwitcherModeTopToolbar.v = z2;
        tabSwitcherModeTopToolbar.w = z;
        boolean z3 = true;
        tabSwitcherModeTopToolbar.x = z2 && this.p;
        tabSwitcherModeTopToolbar.k = this.q;
        NewTabButton newTabButton = tabSwitcherModeTopToolbar.n;
        if (newTabButton.n != z2) {
            newTabButton.n = z2;
            newTabButton.d();
            newTabButton.invalidate();
        }
        NewTabButton newTabButton2 = tabSwitcherModeTopToolbar.n;
        if (newTabButton2.o) {
            newTabButton2.o = false;
            newTabButton2.d();
            newTabButton2.invalidate();
        }
        tabSwitcherModeTopToolbar.e(tabSwitcherModeTopToolbar.j());
        if (tabSwitcherModeTopToolbar.v && tabSwitcherModeTopToolbar.k.a()) {
            z3 = false;
        }
        ToggleTabStackButton toggleTabStackButton = tabSwitcherModeTopToolbar.o;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.setVisibility(z3 ? 0 : 8);
        }
        tabSwitcherModeTopToolbar.k();
        LS1 ls1 = this.h;
        MenuButton menuButton = (MenuButton) tabSwitcherModeTopToolbar.findViewById(R.id.menu_button_wrapper);
        ls1.e = menuButton;
        UD2 ud2 = ls1.f;
        if (ud2 != null) {
            ud2.b();
        }
        ls1.f = UD2.a(ls1.b, menuButton, new VS1());
        View.OnClickListener onClickListener = this.c;
        ToggleTabStackButton toggleTabStackButton2 = tabSwitcherModeTopToolbar.o;
        if (toggleTabStackButton2 != null) {
            toggleTabStackButton2.u = onClickListener;
        }
        tabSwitcherModeTopToolbar.g = this.d;
        C10226tv3 c10226tv3 = this.e;
        tabSwitcherModeTopToolbar.h = c10226tv3;
        if (toggleTabStackButton2 != null) {
            toggleTabStackButton2.t = c10226tv3;
            c10226tv3.a(toggleTabStackButton2);
        }
        IncognitoToggleTabLayout incognitoToggleTabLayout = tabSwitcherModeTopToolbar.l;
        if (incognitoToggleTabLayout != null) {
            incognitoToggleTabLayout.h0 = c10226tv3;
            c10226tv3.a(incognitoToggleTabLayout);
        }
        InterfaceC10590uz3 interfaceC10590uz3 = this.f;
        tabSwitcherModeTopToolbar.i = interfaceC10590uz3;
        IncognitoToggleTabLayout incognitoToggleTabLayout2 = tabSwitcherModeTopToolbar.l;
        if (incognitoToggleTabLayout2 != null) {
            incognitoToggleTabLayout2.y(interfaceC10590uz3);
        }
        C10501uk1 c10501uk1 = this.g;
        tabSwitcherModeTopToolbar.j = c10501uk1;
        c10501uk1.a(tabSwitcherModeTopToolbar);
        NewTabButton newTabButton3 = tabSwitcherModeTopToolbar.n;
        if (newTabButton3 != null) {
            C10501uk1 c10501uk12 = tabSwitcherModeTopToolbar.j;
            newTabButton3.l = c10501uk12;
            c10501uk12.a(newTabButton3);
        }
        if (this.i) {
            NewTabButton newTabButton4 = tabSwitcherModeTopToolbar.n;
            if (newTabButton4 != null) {
                newTabButton4.d();
            }
            tabSwitcherModeTopToolbar.m();
        }
    }

    public final boolean b() {
        if (this.n) {
            C7928nE c7928nE = UN.a;
            if (AbstractC8293oI0.a() && this.q.a() && !N.MMltG$kc("TabGridLayoutAndroid", "tab_grid_layout_android_new_tab").equals("false")) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (this.f == null || this.j == null || !b() || this.m != null) {
            return;
        }
        C3803bD3 c3803bD3 = new C3803bD3(this);
        this.m = c3803bD3;
        ((AbstractC11276wz3) this.f).g.a(c3803bD3);
    }

    public final void d() {
        if (this.f == null || this.j == null || !b()) {
            return;
        }
        this.j.c(((AbstractC11276wz3) this.f).j(true).getCount() != 0);
    }
}
