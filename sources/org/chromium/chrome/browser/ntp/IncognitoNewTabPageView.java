package org.chromium.chrome.browser.ntp;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.C10495uj1;
import defpackage.C7928nE;
import defpackage.InterfaceC7406lj1;
import defpackage.UN;
import defpackage.ViewOnClickListenerC11181wj1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IncognitoNewTabPageView extends FrameLayout {
    public C10495uj1 a;
    public boolean g;
    public NewTabPageScrollView h;
    public InterfaceC7406lj1 i;
    public int j;
    public int k;
    public int l;

    public IncognitoNewTabPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        NewTabPageScrollView newTabPageScrollView = (NewTabPageScrollView) findViewById(R.id.ntp_scrollview);
        this.h = newTabPageScrollView;
        newTabPageScrollView.setBackgroundColor(getContext().getColor(R.color.f25490_resource_name_obfuscated_res_0x7f070803));
        setContentDescription(getResources().getText(R.string.f66000_resource_name_obfuscated_res_0x7f140145));
        this.h.setDescendantFocusability(131072);
        ViewStub viewStub = (ViewStub) findViewById(R.id.incognito_description_layout_stub);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("IncognitoNtpRevamp")) {
            viewStub.setLayoutResource(R.layout.f60460_resource_name_obfuscated_res_0x7f0e0250);
        } else {
            viewStub.setLayoutResource(R.layout.f57980_resource_name_obfuscated_res_0x7f0e0130);
        }
        InterfaceC7406lj1 interfaceC7406lj1 = (InterfaceC7406lj1) viewStub.inflate();
        this.i = interfaceC7406lj1;
        interfaceC7406lj1.c(new ViewOnClickListenerC11181wj1(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g) {
            this.a.a.getClass();
            this.g = false;
        }
    }
}
