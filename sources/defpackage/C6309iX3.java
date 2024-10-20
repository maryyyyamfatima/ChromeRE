package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iX3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6309iX3 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final StringBuilder c = new StringBuilder();
    public String d;

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Encoding not available.", e);
        }
    }

    public static C5965hX3 e() {
        return new C5965hX3(new C6309iX3());
    }

    public final String d(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (obj == null) {
            return null;
        }
        obj.toString();
        return null;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, a(hashMap2.get(str).toString()));
        }
        return hashMap;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.b;
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, a(hashMap2.get(str).toString()));
        }
        return hashMap;
    }
}
