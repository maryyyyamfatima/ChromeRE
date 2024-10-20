package defpackage;

import J.N;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715Fn extends ClickableSpan {
    public final /* synthetic */ AutoSigninFirstRunDialog a;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AutoSigninFirstRunDialog autoSigninFirstRunDialog = this.a;
        N.MQjsefF9(autoSigninFirstRunDialog.a, autoSigninFirstRunDialog);
        autoSigninFirstRunDialog.g.dismiss();
    }

    public C0715Fn(AutoSigninFirstRunDialog autoSigninFirstRunDialog) {
        this.a = autoSigninFirstRunDialog;
    }
}
