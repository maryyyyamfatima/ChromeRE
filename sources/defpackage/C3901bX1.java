package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3901bX1 implements InterfaceC9989tE2 {
    public static final Charset e;
    public static final ArrayList f;
    public final String c;
    public volatile InterfaceC2131Qk1 d;
    public final Object b = new Object();
    public final HashMap a = new HashMap(10);

    static {
        new C3901bX1("");
        e = Charset.forName("UTF-8");
        f = new ArrayList();
    }

    public C3901bX1(String str) {
        this.c = str;
    }

    public final V90 a(String str, C4188cM0... c4188cM0Arr) {
        synchronized (this.b) {
            V90 v90 = (V90) this.a.get(str);
            if (v90 != null) {
                v90.a(c4188cM0Arr);
                return v90;
            }
            V90 v902 = new V90(str, this, c4188cM0Arr);
            this.a.put(str, v902);
            return v902;
        }
    }

    public static long b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(e));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return this.d;
    }
}
