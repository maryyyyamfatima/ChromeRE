package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gZ2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C5630gZ2 implements Callback {
    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Intent a = C1761No1.a(((Tab) obj).getId(), 2);
        a.addFlags(268435456);
        try {
            V60.a.startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
