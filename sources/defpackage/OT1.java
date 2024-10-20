package defpackage;

import android.content.Context;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OT1 {
    public final Context a;
    public final WindowAndroid b;
    public final WT1 c;
    public final int d;
    public final WH0 e;
    public final int f;
    public final InterfaceC7697ma2 g;
    public PropertyModel h;
    public WebContents i;
    public Q50 j;
    public NT1 k;
    public LT1 l;

    public OT1(a aVar, C10285u6 c10285u6, WT1 wt1, InterfaceC7697ma2 interfaceC7697ma2, WH0 wh0) {
        this.a = aVar;
        this.b = c10285u6;
        this.c = wt1;
        this.d = (int) (aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080803) / c10285u6.i.d);
        this.e = wh0;
        this.f = aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080687);
        this.g = interfaceC7697ma2;
    }

    public final void a(GURL gurl) {
        WebContents webContents = this.i;
        if (webContents != null) {
            webContents.i().d(new LoadUrlParams(gurl.i(), 0));
        }
    }
}
