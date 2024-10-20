package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L32 implements TextWatcher {
    public final /* synthetic */ NewTabPageLayout a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public L32(NewTabPageLayout newTabPageLayout) {
        this.a = newTabPageLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            return;
        }
        NewTabPageLayout newTabPageLayout = this.a;
        ((C9927t32) newTabPageLayout.q).b(editable.toString(), false);
        newTabPageLayout.j.a.o(BZ2.j, "");
    }
}
