package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.chrome.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class X73 implements InterfaceC11001wB0 {
    public final /* synthetic */ Y73 a;

    @Override // defpackage.InterfaceC11001wB0
    public final void a() {
    }

    public X73(Y73 y73) {
        this.a = y73;
    }

    @Override // defpackage.InterfaceC11001wB0
    public final void b(Bitmap bitmap) {
        if (bitmap != null) {
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
            Y73 y73 = this.a;
            final String string = y73.a.getString(R.string.f85590_resource_name_obfuscated_res_0x7f1409c3, format);
            AbstractC5832h73.d(string, bitmap, new Callback() { // from class: W73
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str = string;
                    Uri uri = (Uri) obj;
                    Y73 y732 = X73.this.a;
                    WindowAndroid windowAndroid = y732.d;
                    ArrayList arrayList = new ArrayList(Collections.singletonList(uri));
                    y732.d.getClass();
                    String type = V60.a.getContentResolver().getType(uri);
                    String str2 = "";
                    if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
                        str2 = ((GURL) N.M1WDPiaY("")).i();
                    }
                    C6862k73 c6862k73 = new C6862k73(windowAndroid, str, null, null, str2, type, arrayList, null, null, null, null, null, null, null);
                    EP ep = new EP(false, false, false, null, new GURL(y732.e), false, false, false, null, 4);
                    long currentTimeMillis = System.currentTimeMillis();
                    O73 o73 = (O73) y732.f;
                    o73.p = true;
                    o73.m(c6862k73, ep, currentTimeMillis);
                }
            });
            y73.b.run();
        }
    }
}
