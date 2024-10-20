package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.chrome.browser.omnibox.g;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fG3 */
/* loaded from: classes2.dex */
public final class C5192fG3 implements TextWatcher {
    public final /* synthetic */ C6566jG3 a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5192fG3(C6566jG3 c6566jG3) {
        this.a = c6566jG3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            return;
        }
        ((g) this.a.a).Z(editable.toString(), 7, true);
        FI2.a("TasksSurface.FakeBox.LongPressed");
        editable.clear();
    }
}
