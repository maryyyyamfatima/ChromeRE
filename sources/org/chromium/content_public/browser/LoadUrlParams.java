package org.chromium.content_public.browser;

import defpackage.C3498aL2;
import java.util.Locale;
import java.util.Map;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LoadUrlParams {
    public String a;
    public Origin b;
    public int c;
    public int d;
    public C3498aL2 e;
    public Map f;
    public String g;
    public int h;
    public ResourceRequestBody i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;

    public LoadUrlParams(GURL gurl) {
        this(gurl.i(), 0);
    }

    public LoadUrlParams(GURL gurl, int i) {
        this(gurl.i(), 2);
    }

    public LoadUrlParams(String str, int i) {
        this.a = str;
        this.d = i;
        this.c = 0;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public final String a() {
        if (this.f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f.entrySet()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(((String) entry.getKey()).toLowerCase(Locale.US));
            sb.append(":");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    public final void b(ResourceRequestBody resourceRequestBody) {
        this.i = resourceRequestBody;
        if (resourceRequestBody != null) {
            this.c = 1;
        }
    }
}
