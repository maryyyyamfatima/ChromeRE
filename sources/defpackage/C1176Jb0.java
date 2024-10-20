package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import com.google.android.gms.ocr.CreditCardOcrResult;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176Jb0 extends C0916Hb0 implements InterfaceC4352cp4 {
    public C1176Jb0(WebContents webContents, InterfaceC0786Gb0 interfaceC0786Gb0) {
        super(webContents, interfaceC0786Gb0);
    }

    @Override // defpackage.C0916Hb0
    public final boolean a() {
        return new C0526Eb0(V60.a).b() != null;
    }

    @Override // defpackage.C0916Hb0
    public final void c() {
        WindowAndroid Q0 = this.g.Q0();
        if (Q0 == null) {
            this.a.a();
            return;
        }
        Context context = V60.a;
        Intent b = new C0526Eb0(context).b();
        if (AbstractC4983eg2.c(context, "com.google.android.gms") >= 13000000) {
            b.putExtra("com.google.android.gms.ocr.THEME", 2);
        }
        Q0.B(b, this, Integer.valueOf(R.string.f76620_resource_name_obfuscated_res_0x7f1405dd));
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        CreditCardOcrResult creditCardOcrResult;
        InterfaceC0786Gb0 interfaceC0786Gb0 = this.a;
        if (i != -1) {
            interfaceC0786Gb0.a();
            return;
        }
        if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            creditCardOcrResult = null;
        } else {
            intent.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
            creditCardOcrResult = (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
        }
        String str = creditCardOcrResult.a;
        if (str == null) {
            str = "";
        }
        interfaceC0786Gb0.b(creditCardOcrResult.g, creditCardOcrResult.h, str);
    }
}
