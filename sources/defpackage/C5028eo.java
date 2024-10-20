package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5028eo {
    public String a;
    public Integer b;
    public HA0 c;
    public long d;
    public long e;
    public Map f;
    public byte g;

    public final void c(HA0 ha0) {
        if (ha0 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.c = ha0;
    }

    public final void a(String str, String str2) {
        Map map = this.f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final C5372fo b() {
        String str;
        HA0 ha0;
        Map map;
        if (this.g != 3 || (str = this.a) == null || (ha0 = this.c) == null || (map = this.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" transportName");
            }
            if (this.c == null) {
                sb.append(" encodedPayload");
            }
            if ((this.g & 1) == 0) {
                sb.append(" eventMillis");
            }
            if ((this.g & 2) == 0) {
                sb.append(" uptimeMillis");
            }
            if (this.f == null) {
                sb.append(" autoMetadata");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C5372fo(str, this.b, ha0, this.d, this.e, map);
    }
}
