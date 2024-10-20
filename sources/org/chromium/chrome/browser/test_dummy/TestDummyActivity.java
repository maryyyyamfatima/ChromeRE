package org.chromium.chrome.browser.test_dummy;

import androidx.appcompat.app.a;
import defpackage.AX;
import defpackage.C10431uY1;
import defpackage.C7432ln3;
import defpackage.InterfaceC2401Sm1;
import defpackage.MG3;
import defpackage.NG3;
import org.chromium.chrome.browser.test_dummy.TestDummyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TestDummyActivity extends a {
    public static final /* synthetic */ int y = 0;

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AX.e().g("enable-test-dummy-module")) {
            C10431uY1 c10431uY1 = MG3.a;
            if (c10431uY1.g()) {
                n0(true);
                return;
            }
            C7432ln3 b = C7432ln3.b();
            try {
                c10431uY1.d(new InterfaceC2401Sm1() { // from class: KG3
                    @Override // defpackage.InterfaceC2401Sm1
                    public final void a(boolean z) {
                        int i = TestDummyActivity.y;
                        TestDummyActivity.this.n0(z);
                    }
                });
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        finish();
    }

    public final void n0(boolean z) {
        if (!z) {
            throw new RuntimeException("Failed to install module");
        }
        ((NG3) MG3.a.b()).a().a(this, getIntent());
    }
}
