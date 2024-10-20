package org.chromium.chrome.browser.download.settings;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractC9826sm0;
import defpackage.C0461Do0;
import defpackage.C7453lr0;
import defpackage.InterfaceC7109kr0;
import defpackage.ViewOnClickListenerC3679as0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadLocationPreference extends AbstractC9826sm0 implements InterfaceC7109kr0 {
    public final ViewOnClickListenerC3679as0 Z;

    public DownloadLocationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = R.layout.0_resource_name_obfuscated_res_0x7f0e00d9;
        ViewOnClickListenerC3679as0 viewOnClickListenerC3679as0 = new ViewOnClickListenerC3679as0(context, this);
        this.Z = viewOnClickListenerC3679as0;
        viewOnClickListenerC3679as0.b();
    }

    @Override // defpackage.InterfaceC7109kr0
    public final void a() {
        W();
    }

    public final void W() {
        ViewOnClickListenerC3679as0 viewOnClickListenerC3679as0 = this.Z;
        int i = viewOnClickListenerC3679as0.a;
        if (i < 0) {
            return;
        }
        C0461Do0 c0461Do0 = (C0461Do0) viewOnClickListenerC3679as0.getItem(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c0461Do0.a);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) c0461Do0.b);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, c0461Do0.a.length(), 33);
        P(spannableStringBuilder);
    }

    @Override // defpackage.InterfaceC7109kr0
    public final void d() {
        ViewOnClickListenerC3679as0 viewOnClickListenerC3679as0 = this.Z;
        int i = viewOnClickListenerC3679as0.a;
        int i2 = C7453lr0.m;
        if (i == -1) {
            viewOnClickListenerC3679as0.c();
        }
        W();
    }
}
