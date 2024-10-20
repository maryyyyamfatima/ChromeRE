package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;
import java.util.Collections;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4500dF3 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Set g = Collections.emptySet();
    public final XP2 h = XP2.a;
    public Bundle i;

    public abstract Task a();

    public abstract AbstractC4500dF3 c(boolean z);

    public abstract AbstractC4500dF3 d(int i);

    public abstract AbstractC4500dF3 e(boolean z);

    public abstract AbstractC4500dF3 f();

    public abstract AbstractC4500dF3 g(String str);

    public abstract AbstractC4500dF3 h(boolean z);

    public void b() {
        C11111wX0.h(this.c);
        if (this.e) {
            Task.c(this.i);
        }
        Set<Uri> set = this.g;
        if (!set.isEmpty() && this.a == 2) {
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
        for (Uri uri : set) {
            if (uri == null) {
                throw new IllegalArgumentException("Null URI");
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if ("tcp".equals(scheme)) {
                    if (port <= 0 || port > 65535) {
                        throw new IllegalArgumentException(AbstractC9076qb1.a("Invalid required URI port: ", uri.getPort()));
                    }
                } else {
                    if (!"ping".equals(scheme)) {
                        throw new IllegalArgumentException(AbstractC4809e90.a("Unsupported required URI scheme: ", scheme));
                    }
                    if (port != -1) {
                        throw new IllegalArgumentException("Ping does not support port numbers");
                    }
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(AbstractC4809e90.a("Invalid port number: ", e.getMessage()));
            }
        }
    }
}
