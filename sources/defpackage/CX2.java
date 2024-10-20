package defpackage;

import J.N;
import android.content.Context;
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
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CX2 {
    public final PropertyModel a;
    public final Context b;
    public final Runnable c;
    public final Runnable d;
    public final Callback e;
    public final QO f;
    public final WindowAndroid g;
    public final String h;

    public CX2(Context context, PropertyModel propertyModel, RunnableC12142zX2 runnableC12142zX2, RunnableC11799yX2 runnableC11799yX2, WindowAndroid windowAndroid, String str, QO qo, Callback callback) {
        this.d = runnableC12142zX2;
        this.c = runnableC11799yX2;
        this.b = context;
        this.a = propertyModel;
        this.g = windowAndroid;
        this.h = str;
        this.f = qo;
        this.e = callback;
        propertyModel.o(EX2.a, new Callback() { // from class: AX2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final CX2 cx2 = CX2.this;
                cx2.getClass();
                int intValue = ((Integer) obj).intValue();
                Runnable runnable = cx2.d;
                if (1 == intValue) {
                    EI2.h(1, 4, "Sharing.ScreenshotFallback.Action");
                    Bitmap bitmap = (Bitmap) cx2.a.i(EX2.b);
                    final String string = cx2.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1409c3, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis())));
                    AbstractC5832h73.d(string, bitmap, new Callback() { // from class: BX2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            String str2 = string;
                            Uri uri = (Uri) obj2;
                            CX2 cx22 = CX2.this;
                            WindowAndroid windowAndroid2 = cx22.g;
                            ArrayList arrayList = new ArrayList(Collections.singletonList(uri));
                            cx22.g.getClass();
                            String type = V60.a.getContentResolver().getType(uri);
                            String str3 = "";
                            if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
                                str3 = ((GURL) N.M1WDPiaY("")).i();
                            }
                            C6862k73 c6862k73 = new C6862k73(windowAndroid2, str2, null, null, str3, type, arrayList, null, null, null, null, null, null, null);
                            EP ep = new EP(false, false, false, null, new GURL(cx22.h), false, false, false, null, 4);
                            long currentTimeMillis = System.currentTimeMillis();
                            O73 o73 = (O73) cx22.f;
                            o73.p = true;
                            o73.m(c6862k73, ep, currentTimeMillis);
                        }
                    });
                    runnable.run();
                    return;
                }
                if (2 == intValue) {
                    EI2.h(2, 4, "Sharing.ScreenshotFallback.Action");
                    cx2.c.run();
                } else if (3 == intValue) {
                    EI2.h(3, 4, "Sharing.ScreenshotFallback.Action");
                    runnable.run();
                } else if (4 == intValue) {
                    EI2.h(0, 4, "Sharing.ScreenshotFallback.Action");
                    cx2.e.onResult(runnable);
                }
            }
        });
    }
}
