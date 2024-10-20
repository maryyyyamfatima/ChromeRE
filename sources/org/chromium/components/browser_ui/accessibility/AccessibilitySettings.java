package org.chromium.components.browser_ui.accessibility;

import J.N;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC3027Xh2;
import defpackage.C10021tL;
import defpackage.C2241Rg1;
import defpackage.C8307oL;
import defpackage.C8993qL;
import defpackage.C9335rL;
import defpackage.C9912t1;
import defpackage.EI2;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.T60;
import defpackage.V60;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.accessibility.AccessibilitySettings;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccessibilitySettings extends AbstractC0123Ay2 implements InterfaceC9213qy2 {
    public static final /* synthetic */ int s0 = 0;
    public TextScalePreference j0;
    public PageZoomPreference k0;
    public ChromeSwitchPreference l0;
    public ChromeBaseCheckBoxPreference m0;
    public boolean n0;
    public C9335rL o0;
    public C8993qL p0;
    public FontSizePrefs q0;
    public final C9912t1 r0 = new C9912t1(this);

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.f113710_resource_name_obfuscated_res_0x7f180001);
        this.j0 = (TextScalePreference) M0("text_scale");
        this.k0 = (PageZoomPreference) M0("page_zoom_default_zoom");
        this.l0 = (ChromeSwitchPreference) M0("page_zoom_always_show");
        this.o0.getClass();
        double[] dArr = AbstractC3027Xh2.a;
        if (N.Mudil8Bg("AccessibilityPageZoom")) {
            this.j0.S(false);
            PageZoomPreference pageZoomPreference = this.k0;
            this.o0.getClass();
            pageZoomPreference.T = AbstractC3027Xh2.b(N.MNitnPWj(Profile.d()));
            this.k0.j = this;
            this.l0.W(T60.a.getBoolean("Chrome.PageZoom.AlwaysShowMenuItem", false));
            this.l0.j = this;
        } else {
            this.k0.S(false);
            this.l0.S(false);
            TextScalePreference textScalePreference = this.j0;
            textScalePreference.j = this;
            FontSizePrefs fontSizePrefs = this.q0;
            float Maawwu0p = N.Maawwu0p(fontSizePrefs.a, fontSizePrefs);
            float a = this.q0.a();
            textScalePreference.U = Maawwu0p;
            textScalePreference.T = a;
        }
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference = (ChromeBaseCheckBoxPreference) M0("force_enable_zoom");
        this.m0 = chromeBaseCheckBoxPreference;
        chromeBaseCheckBoxPreference.j = this;
        FontSizePrefs fontSizePrefs2 = this.q0;
        chromeBaseCheckBoxPreference.W(N.MYwzxNqz(fontSizePrefs2.a, fontSizePrefs2));
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference2 = (ChromeBaseCheckBoxPreference) M0("reader_for_accessibility");
        this.o0.getClass();
        C8993qL c8993qL = new C8993qL();
        this.p0 = c8993qL;
        chromeBaseCheckBoxPreference2.W(c8993qL.a());
        chromeBaseCheckBoxPreference2.j = this;
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference3 = (ChromeBaseCheckBoxPreference) M0("accessibility_tab_switcher");
        this.o0.getClass();
        C8307oL c8307oL = !C10021tL.f().c() ? null : new C8307oL();
        if (c8307oL != null) {
            chromeBaseCheckBoxPreference3.W(c8307oL.a());
        } else {
            N0().b0(chromeBaseCheckBoxPreference3);
        }
        M0("captions").k = new InterfaceC9555ry2() { // from class: s1
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                int i = AccessibilitySettings.s0;
                AccessibilitySettings accessibilitySettings = AccessibilitySettings.this;
                accessibilitySettings.getClass();
                Intent intent = new Intent("android.settings.CAPTIONING_SETTINGS");
                intent.addFlags(268435456);
                accessibilitySettings.J0(intent);
                return true;
            }
        };
        this.o0.getClass();
        C2241Rg1.a().getClass();
        if (C10021tL.f().d()) {
            L0(R.xml.f113990_resource_name_obfuscated_res_0x7f18001d);
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        this.q0.b.a(this.r0);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void u0() {
        this.q0.b.d(this.r0);
        if (this.n0) {
            EI2.m((int) (this.q0.a() * 100.0f), "Accessibility.Android.UserFontSizePref.Change");
            this.n0 = false;
        }
        super.u0();
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        if ("text_scale".equals(preference.q)) {
            this.n0 = true;
            FontSizePrefs fontSizePrefs = this.q0;
            float floatValue = ((Float) obj).floatValue();
            fontSizePrefs.getClass();
            T60.a.edit().putFloat("user_font_scale_factor", floatValue).apply();
            fontSizePrefs.b(V60.a.getResources().getConfiguration().fontScale * floatValue);
        } else if ("force_enable_zoom".equals(preference.q)) {
            this.q0.c(((Boolean) obj).booleanValue(), true);
        } else if ("reader_for_accessibility".equals(preference.q)) {
            C8993qL c8993qL = this.p0;
            if (c8993qL != null) {
                c8993qL.b(((Boolean) obj).booleanValue());
            }
        } else if ("page_zoom_default_zoom".equals(preference.q)) {
            this.o0.getClass();
            N.MNh9C30M(Profile.d(), AbstractC3027Xh2.a(((Integer) obj).intValue()));
        } else if ("page_zoom_always_show".equals(preference.q)) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            double[] dArr = AbstractC3027Xh2.a;
            T60.a.edit().putBoolean("Chrome.PageZoom.AlwaysShowMenuItem", booleanValue).apply();
        }
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        getActivity().setTitle(V60.a.getString(R.string.f81800_resource_name_obfuscated_res_0x7f140844));
        P0(null);
    }
}
