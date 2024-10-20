package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AE2 {
    public static final AE2 e = new AE2(0, "", "", new String[0]);
    public final String a;
    public final int b;
    public final String c;
    public final String[] d;

    public AE2(int i, String str, String str2, String[] strArr) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = strArr;
    }

    public static AE2 a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        if (host == null) {
            host = "";
        }
        return new AE2(proxyInfo.getPort(), host, Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }
}
