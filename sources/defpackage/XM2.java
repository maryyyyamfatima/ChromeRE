package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.rename.RenameDialogCustomView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XM2 implements TextWatcher {
    public final /* synthetic */ RenameDialogCustomView a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        RenameDialogCustomView renameDialogCustomView = this.a;
        Callback callback = renameDialogCustomView.h;
        if (callback == null) {
            return;
        }
        callback.onResult(Boolean.valueOf(renameDialogCustomView.g.getText().toString().isEmpty()));
    }

    public XM2(RenameDialogCustomView renameDialogCustomView) {
        this.a = renameDialogCustomView;
    }
}
