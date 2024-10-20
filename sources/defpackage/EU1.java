package defpackage;

import android.content.res.Resources;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class EU1 implements InterfaceC0079Ap3 {
    public final /* synthetic */ Resources a;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        Resources resources = this.a;
        return Float.valueOf(Math.min(resources.getDimensionPixelSize(R.dimen.f35760_resource_name_obfuscated_res_0x7f0804e5), resources.getDisplayMetrics().widthPixels / 2.0f));
    }
}
