package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.chromium.chrome.browser.bookmarks.BookmarkTextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OA implements TextWatcher {
    public final /* synthetic */ BookmarkTextInputLayout a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public OA(BookmarkTextInputLayout bookmarkTextInputLayout) {
        this.a = bookmarkTextInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        BookmarkTextInputLayout bookmarkTextInputLayout = this.a;
        String str = bookmarkTextInputLayout.D0;
        if (str != null) {
            if (!TextUtils.isEmpty(bookmarkTextInputLayout.C())) {
                str = null;
            }
            bookmarkTextInputLayout.l(str);
        }
    }
}
