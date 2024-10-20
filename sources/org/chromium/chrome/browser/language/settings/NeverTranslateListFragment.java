package org.chromium.chrome.browser.language.settings;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import defpackage.C6151i32;
import defpackage.C9549rx1;
import defpackage.InterfaceC11945yw1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NeverTranslateListFragment extends LanguageItemListFragment {
    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final int M0() {
        return 3;
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final InterfaceC11945yw1 N0() {
        return new C6151i32();
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final String L0(Context context) {
        return context.getResources().getString(R.string.f76030_resource_name_obfuscated_res_0x7f1405a1);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void S0() {
        C9549rx1.h(7);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void R0() {
        C9549rx1.h(8);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void Q0() {
        C9549rx1.g(12);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void T0() {
        C9549rx1.g(11);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void O0(String str) {
        N.Mt0H9F3d(str, true);
    }

    @Override // org.chromium.chrome.browser.language.settings.LanguageItemListFragment
    public final void P0(String str) {
        N.Mt0H9F3d(str, false);
    }
}
