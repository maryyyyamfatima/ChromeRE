package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7286lN0 {
    public static File a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        return new File(uri.getPath());
    }
}
