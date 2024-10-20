package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i73 */
/* loaded from: classes2.dex */
public final class C6176i73 {
    public final WindowAndroid a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public ArrayList f;
    public InterfaceC6518j73 g;

    public C6176i73(WindowAndroid windowAndroid, String str, String str2) {
        this.a = windowAndroid;
        this.d = str2;
        this.b = str;
    }

    public final C6862k73 a() {
        if (!TextUtils.isEmpty(this.d)) {
            String str = this.d;
            if (!TextUtils.isEmpty(str)) {
                str = ((GURL) N.M1WDPiaY(str)).i();
            }
            this.d = str;
        }
        return new C6862k73(this.a, this.b, this.c, null, this.d, this.e, this.f, null, null, null, this.g, null, null, null);
    }
}
