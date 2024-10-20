package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.autofill.OtpVerificationDialogBridge;
import org.chromium.chrome.browser.ui.autofill.OtpVerificationDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qe2 */
/* loaded from: classes2.dex */
public final class C2102Qe2 {
    public final C2362Se2 a;
    public final Context b;
    public final OtpVerificationDialogView c;

    public C2102Qe2(Context context, ZX1 zx1, OtpVerificationDialogView otpVerificationDialogView, OtpVerificationDialogBridge otpVerificationDialogBridge) {
        this.b = context;
        this.c = otpVerificationDialogView;
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.h, otpVerificationDialogView);
        bd2.e(AbstractC4249cY1.c, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14024d));
        PD2 pd2 = AbstractC4249cY1.e;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        bd2.e(pd2, resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0901a3, theme));
        bd2.e(AbstractC4249cY1.n, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14024a));
        bd2.e(AbstractC4249cY1.j, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14024c));
        bd2.b(AbstractC4249cY1.m, true);
        this.a = new C2362Se2(zx1, bd2, otpVerificationDialogBridge);
    }
}
