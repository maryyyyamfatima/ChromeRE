package defpackage;

import J.N;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.password_manager.AccountChooserDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11633y2 extends ClickableSpan {
    public final /* synthetic */ AccountChooserDialog a;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AccountChooserDialog accountChooserDialog = this.a;
        long j = accountChooserDialog.o;
        if (j != 0) {
            N.MOFoPxaU(j, accountChooserDialog);
        }
        accountChooserDialog.p.dismiss();
    }

    public C11633y2(AccountChooserDialog accountChooserDialog) {
        this.a = accountChooserDialog;
    }
}
