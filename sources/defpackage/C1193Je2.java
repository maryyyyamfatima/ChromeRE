package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Je2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1193Je2 {
    public final Uri a;

    public C1193Je2(Uri uri) {
        this.a = uri;
    }

    public static C1193Je2 b(String str) {
        return a(Uri.parse(str));
    }

    public static C1193Je2 a(Uri uri) {
        if (uri != null && uri.getScheme() != null && uri.getAuthority() != null) {
            String scheme = uri.getScheme();
            if (!scheme.equals("http") && !scheme.equals("https")) {
                return null;
            }
            int port = uri.getPort();
            if (scheme.equals("http") && port == 80) {
                port = -1;
            }
            if (scheme.equals("https") && port == 443) {
                port = -1;
            }
            String host = uri.getHost();
            if (port != -1) {
                host = host + ":" + port;
            }
            try {
                return new C1193Je2(uri.normalizeScheme().buildUpon().opaquePart("").fragment("").path("").encodedAuthority(host).clearQuery().build());
            } catch (UnsupportedOperationException unused) {
            }
        }
        return null;
    }

    public static C1193Je2 c(String str) {
        Uri parse = Uri.parse(str);
        C1193Je2 a = a(parse);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Could not parse: " + parse);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1193Je2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C1193Je2) obj).a);
    }
}
