package defpackage;

import android.view.View;
import org.chromium.chrome.browser.download.home.rename.RenameDialogCustomView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YM2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ RenameDialogCustomView h;

    public YM2(RenameDialogCustomView renameDialogCustomView, int i) {
        this.h = renameDialogCustomView;
        this.a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i;
        if (z) {
            int i2 = this.a;
            RenameDialogCustomView renameDialogCustomView = this.h;
            if (i2 <= 0 || (i = this.g) > i2 || i2 >= renameDialogCustomView.g.getText().toString().length() - 1) {
                renameDialogCustomView.g.selectAll();
            } else {
                renameDialogCustomView.g.setSelection(i, i2);
            }
        }
    }
}
