package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C23 implements S03 {
    public final /* synthetic */ SelectLanguageFragment a;

    @Override // defpackage.S03
    public final void a() {
    }

    public C23(SelectLanguageFragment selectLanguageFragment) {
        this.a = selectLanguageFragment;
    }

    @Override // defpackage.S03
    public final void onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SelectLanguageFragment selectLanguageFragment = this.a;
        if (TextUtils.equals(str, selectLanguageFragment.c0)) {
            return;
        }
        selectLanguageFragment.c0 = str;
        D23 d23 = selectLanguageFragment.e0;
        d23.getClass();
        boolean isEmpty = TextUtils.isEmpty(str);
        SelectLanguageFragment selectLanguageFragment2 = d23.r;
        if (isEmpty) {
            d23.R(selectLanguageFragment2.f0);
            return;
        }
        Locale locale = Locale.getDefault();
        String lowerCase = str.trim().toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        for (C10230tw1 c10230tw1 : selectLanguageFragment2.f0) {
            if (c10230tw1.b.toLowerCase(locale).contains(lowerCase)) {
                arrayList.add(c10230tw1);
            }
        }
        d23.R(arrayList);
    }
}
