package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jt3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6780jt3 implements Callback {
    public final /* synthetic */ SyncConsentFragmentBase a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.R0((List) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
