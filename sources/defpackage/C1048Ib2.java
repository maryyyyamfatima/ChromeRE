package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import org.chromium.base.Callback;
import org.chromium.base.ContentUriUtils;
import org.chromium.chrome.browser.util.ChromeFileProvider;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ib2 */
/* loaded from: classes.dex */
public final class C1048Ib2 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ File j;
    public final /* synthetic */ WindowAndroid k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Callback m;

    public C1048Ib2(File file, String str, String str2, String str3, Callback callback, WindowAndroid windowAndroid) {
        this.h = str;
        this.i = str2;
        this.j = file;
        this.k = windowAndroid;
        this.l = str3;
        this.m = callback;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Uri uri = (Uri) obj;
        String str = this.l;
        WindowAndroid windowAndroid = this.k;
        if (!"content".equals(uri.getScheme())) {
            uri = null;
        }
        Uri uri2 = uri;
        String str2 = this.i;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2)) {
            str2 = ((GURL) N.M1WDPiaY(str2)).i();
        }
        this.m.onResult(new C6862k73(windowAndroid, str, null, null, str2, null, null, null, uri2, null, null, null, null, null));
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String str = this.h;
        if (ContentUriUtils.e(str)) {
            return Uri.parse(str);
        }
        boolean isEmpty = str.isEmpty();
        String str2 = this.i;
        if (isEmpty) {
            return Uri.parse(str2);
        }
        try {
            File file = this.j;
            Object obj = ChromeFileProvider.j;
            return VM0.b(V60.a, V60.a.getPackageName() + ".FileProvider", file);
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("OfflinePageUtils", "Couldn't generate URI for sharing page: " + e, new Object[0]);
            return Uri.parse(str2);
        }
    }
}
