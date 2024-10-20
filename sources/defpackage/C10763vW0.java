package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10763vW0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final String f;
    public final String[] g;

    public C10763vW0(String str, Bundle bundle) {
        if (!bundle.containsKey("subtype")) {
            throw new IllegalArgumentException("Received push message with no subtype");
        }
        this.a = str;
        this.b = bundle.getString("subtype");
        this.d = bundle.getString("collapse_key");
        this.e = bundle.getByteArray("rawData");
        this.f = bundle.getString("google.original_priority");
        this.c = bundle.getString("google.message_id");
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle.keySet()) {
            if (!str2.equals("subtype") && !str2.equals("from") && !str2.equals("collapse_key") && !str2.equals("rawData") && !str2.equals("google.original_priority") && !str2.startsWith("com.google.ipc.invalidation.gcmmplex.") && !str2.equals("google.message_id")) {
                Object obj = bundle.get(str2);
                if (obj instanceof String) {
                    arrayList.add(str2);
                    arrayList.add((String) obj);
                }
            }
        }
        this.g = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static C10763vW0 a(Object obj, InterfaceC10077tW0 interfaceC10077tW0) {
        if (!(interfaceC10077tW0.c(obj, "appId") && interfaceC10077tW0.c(obj, "collapseKey") && interfaceC10077tW0.c(obj, "data") && interfaceC10077tW0.c(obj, "rawData") && interfaceC10077tW0.c(obj, "senderId") && interfaceC10077tW0.c(obj, "originalPriority") && interfaceC10077tW0.c(obj, "messageId")) || interfaceC10077tW0.b(obj, "appId") == null || interfaceC10077tW0.b(obj, "senderId") == null) {
            return null;
        }
        return new C10763vW0(obj, interfaceC10077tW0);
    }

    public C10763vW0(Object obj, InterfaceC10077tW0 interfaceC10077tW0) {
        this.a = interfaceC10077tW0.b(obj, "senderId");
        this.b = interfaceC10077tW0.b(obj, "appId");
        this.d = interfaceC10077tW0.b(obj, "collapseKey");
        this.f = interfaceC10077tW0.b(obj, "originalPriority");
        this.c = interfaceC10077tW0.b(obj, "messageId");
        String b = interfaceC10077tW0.b(obj, "rawData");
        if (b != null) {
            if (b.length() > 0) {
                this.e = b.getBytes(Charset.forName("ISO-8859-1"));
            } else {
                this.e = new byte[0];
            }
        } else {
            this.e = null;
        }
        this.g = interfaceC10077tW0.a(obj);
    }

    public final int b() {
        String str = this.f;
        if (str == null) {
            return 0;
        }
        str.getClass();
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("high") ? 0 : 2;
    }

    public final Object c(InterfaceC10420uW0 interfaceC10420uW0) {
        Object b = interfaceC10420uW0.b();
        interfaceC10420uW0.a(b, "version", "v1");
        interfaceC10420uW0.a(b, "senderId", this.a);
        interfaceC10420uW0.a(b, "appId", this.b);
        interfaceC10420uW0.a(b, "collapseKey", this.d);
        interfaceC10420uW0.a(b, "originalPriority", this.f);
        interfaceC10420uW0.a(b, "messageId", this.c);
        byte[] bArr = this.e;
        if (bArr != null) {
            if (bArr.length > 0) {
                interfaceC10420uW0.a(b, "rawData", new String(bArr, Charset.forName("ISO-8859-1")));
            } else {
                interfaceC10420uW0.a(b, "rawData", "");
            }
        } else {
            interfaceC10420uW0.a(b, "rawData", null);
        }
        interfaceC10420uW0.c(b, this.g);
        return b;
    }
}
