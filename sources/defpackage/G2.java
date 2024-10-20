package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.sync.settings.AccountManagementFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class G2 implements Callback {
    public final /* synthetic */ AccountManagementFragment a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        AccountManagementFragment.R0(this.a, (List) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
