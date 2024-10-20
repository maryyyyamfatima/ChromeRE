package org.chromium.chrome.browser.toolbar.top;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import defpackage.Y50;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.NewTabButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class StartSurfaceToolbarView extends RelativeLayout {
    public LinearLayout a;
    public NewTabButton g;
    public boolean h;
    public LogoView i;
    public View j;
    public IncognitoToggleTabLayout k;
    public ImageButton l;
    public ColorStateList m;
    public boolean n;
    public boolean o;

    public StartSurfaceToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LinearLayout) findViewById(R.id.new_tab_view);
        this.g = (NewTabButton) findViewById(R.id.new_tab_button);
        this.k = (IncognitoToggleTabLayout) ((ViewStub) findViewById(R.id.incognito_tabs_stub)).inflate();
        this.i = (LogoView) findViewById(R.id.logo);
        this.l = (ImageButton) findViewById(R.id.identity_disc_button);
        this.j = findViewById(R.id.start_tab_switcher_button);
        b(false);
        NewTabButton newTabButton = this.g;
        if (newTabButton.o) {
            return;
        }
        newTabButton.o = true;
        newTabButton.d();
        newTabButton.invalidate();
    }

    public final void a() {
        if (!this.o) {
            this.g.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        this.g.setVisibility(this.h ? 8 : 0);
        this.a.setVisibility(this.h ? 0 : 8);
        if (this.h) {
            ViewParent parent = this.a.getParent();
            LinearLayout linearLayout = this.a;
            parent.requestChildFocus(linearLayout, linearLayout);
        } else {
            ViewParent parent2 = this.a.getParent();
            NewTabButton newTabButton = this.g;
            parent2.requestChildFocus(newTabButton, newTabButton);
        }
    }

    public final void b(boolean z) {
        setBackgroundColor(AbstractC11746yN.b(getContext(), z));
        if (this.m == null) {
            this.m = Y50.b(getContext(), R.color.f17820_resource_name_obfuscated_res_0x7f070122);
            Y50.b(getContext(), R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
        }
    }
}
