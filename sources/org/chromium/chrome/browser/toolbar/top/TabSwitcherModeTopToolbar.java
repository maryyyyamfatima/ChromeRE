package org.chromium.chrome.browser.toolbar.top;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC5647gc2;
import defpackage.AbstractC8142nr1;
import defpackage.C10226tv3;
import defpackage.C10501uk1;
import defpackage.C1096Il0;
import defpackage.C4490dD3;
import defpackage.InterfaceC10158tk1;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC7913nB;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.NewTabButton;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.widget.OptimizedFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TabSwitcherModeTopToolbar extends OptimizedFrameLayout implements View.OnClickListener, InterfaceC10158tk1 {
    public View.OnClickListener g;
    public C10226tv3 h;
    public InterfaceC10590uz3 i;
    public C10501uk1 j;
    public InterfaceC7913nB k;
    public IncognitoToggleTabLayout l;
    public View m;
    public NewTabButton n;
    public ToggleTabStackButton o;
    public MenuButton p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public ObjectAnimator u;
    public boolean v;
    public boolean w;
    public boolean x;

    public TabSwitcherModeTopToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.n = (NewTabButton) findViewById(R.id.new_tab_button);
        this.m = findViewById(R.id.new_tab_view);
        this.o = (ToggleTabStackButton) findViewById(R.id.tab_switcher_mode_tab_switcher_button);
        this.p = (MenuButton) findViewById(R.id.menu_button_wrapper);
        this.n.setOnClickListener(this);
        this.m.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.n == view || this.m == view) {
            view.setEnabled(false);
            View.OnClickListener onClickListener = this.g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public final void f(boolean z) {
        if (!z) {
            IncognitoToggleTabLayout incognitoToggleTabLayout = this.l;
            if (incognitoToggleTabLayout != null) {
                incognitoToggleTabLayout.setClickable(false);
            }
        } else {
            NewTabButton newTabButton = this.n;
            if (newTabButton != null) {
                newTabButton.setEnabled(true);
            }
            View view = this.m;
            if (view != null) {
                view.setEnabled(true);
            }
        }
        if (this.w) {
            return;
        }
        ObjectAnimator objectAnimator = this.u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setVisibility(0);
        setAlpha(z ? 0.0f : 1.0f);
        long j = this.x ? 150L : 200L;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<TabSwitcherModeTopToolbar, Float>) property, fArr);
        this.u = ofFloat;
        ofFloat.setDuration(j);
        if (this.x && z) {
            this.u.setStartDelay(j);
        }
        this.u.setInterpolator(AbstractC8142nr1.f);
        this.u.addListener(new C4490dD3(this, z));
        this.u.start();
        if (C1096Il0.a(getContext())) {
            this.u.end();
        }
    }

    @Override // defpackage.InterfaceC10158tk1
    public final void b(boolean z) {
        this.s = z;
        m();
    }

    public final void c(boolean z) {
        e(z);
        boolean z2 = DeviceFormFactor.a(getContext()) ? true : true ^ z;
        if (z2 == this.t) {
            return;
        }
        this.t = z2;
        k();
    }

    public final void k() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(this.t ? 0 : 8);
        }
        NewTabButton newTabButton = this.n;
        if (newTabButton != null) {
            newTabButton.setVisibility(this.t ? 8 : 0);
        }
    }

    public final void m() {
        int b = (C1096Il0.a(getContext()) || this.v) ? AbstractC11746yN.b(getContext(), this.s) : 0;
        if (this.q != b) {
            this.q = b;
            setBackgroundColor(b);
        }
        int a = b == 0 ? 3 : AbstractC5647gc2.a(b, getContext(), this.s);
        if (this.r == a) {
            return;
        }
        this.r = a;
        ToggleTabStackButton toggleTabStackButton = this.o;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.s.c(AbstractC3494aK3.c(toggleTabStackButton.getContext(), a));
        }
        ColorStateList c = AbstractC3494aK3.c(getContext(), a);
        View view = this.m;
        if (view != null) {
            ((ImageView) view.findViewById(R.id.new_tab_view_button)).setImageTintList(c);
            ((TextView) this.m.findViewById(R.id.new_tab_view_desc)).setTextColor(c.getDefaultColor());
        }
        MenuButton menuButton = this.p;
        if (menuButton != null) {
            menuButton.c(a, c);
        }
    }

    public final void e(boolean z) {
        if (j()) {
            IncognitoToggleTabLayout incognitoToggleTabLayout = this.l;
            if (incognitoToggleTabLayout != null) {
                incognitoToggleTabLayout.setVisibility(z ? 0 : 8);
                return;
            }
            if (z) {
                IncognitoToggleTabLayout incognitoToggleTabLayout2 = (IncognitoToggleTabLayout) ((ViewStub) findViewById(R.id.incognito_tabs_stub)).inflate();
                this.l = incognitoToggleTabLayout2;
                C10226tv3 c10226tv3 = this.h;
                if (c10226tv3 != null) {
                    incognitoToggleTabLayout2.h0 = c10226tv3;
                    c10226tv3.a(incognitoToggleTabLayout2);
                }
                InterfaceC10590uz3 interfaceC10590uz3 = this.i;
                if (interfaceC10590uz3 != null) {
                    this.l.y(interfaceC10590uz3);
                }
            }
        }
    }

    public final boolean j() {
        return this.v && this.k.a() && (!DeviceFormFactor.a(getContext()) || this.w);
    }
}
