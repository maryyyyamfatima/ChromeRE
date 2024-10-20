package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.android.chrome.R;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k91 */
/* loaded from: classes.dex */
public final class C6872k91 extends AbstractC5426fx {
    public X81 l;
    public final String m;

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "history";
    }

    public C6872k91(Activity activity, C7857n12 c7857n12, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, boolean z, InterfaceC0079Ap3 interfaceC0079Ap3, String str) {
        super(c7857n12);
        Uri parse = Uri.parse(str);
        this.l = new X81(activity, false, viewOnClickListenerC1069If3, z, interfaceC0079Ap3, parse.getPath().contains("journeys"), parse.getQueryParameter("q"), new BrowsingHistoryBridge(Profile.d()));
        this.m = c7857n12.a().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14062a);
        d(this.l.k);
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.m;
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        this.l.p();
        this.l = null;
        super.destroy();
    }
}
