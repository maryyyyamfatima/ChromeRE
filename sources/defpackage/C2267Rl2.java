package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_edit_dialog.PasswordEditDialogWithDetailsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267Rl2 implements TextWatcher {
    public final /* synthetic */ PasswordEditDialogWithDetailsView a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Callback callback = this.a.j;
        if (callback == null) {
            return;
        }
        callback.onResult(charSequence.toString());
    }

    public C2267Rl2(PasswordEditDialogWithDetailsView passwordEditDialogWithDetailsView) {
        this.a = passwordEditDialogWithDetailsView;
    }
}
