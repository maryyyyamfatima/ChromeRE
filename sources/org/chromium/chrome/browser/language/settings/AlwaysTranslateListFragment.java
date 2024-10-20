package org.chromium.chrome.browser.language.settings;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import defpackage.C9549rx1;
import defpackage.InterfaceC11945yw1;
import defpackage.O8;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AlwaysTranslateListFragment extends LanguageItemListFragment {
    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final int M0() {
        return 4;
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final InterfaceC11945yw1 N0() {
        return new O8();
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final String L0(Context context) {
        return context.getResources().getString(R.string.f76010_resource_name_obfuscated_res_0x7f14059e);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void S0() {
        C9549rx1.h(9);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void R0() {
        C9549rx1.h(10);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void Q0() {
        C9549rx1.g(14);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void T0() {
        C9549rx1.g(13);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void O0(String str) {
        N.M2Oi3mFV(str, true);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void P0(String str) {
        N.M2Oi3mFV(str, false);
    }
}
