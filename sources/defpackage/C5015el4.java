package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: el4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5015el4 {
    public static final Pattern g = Pattern.compile("webapk:\\d+:([a-fA-F0-9]+)");
    public final ByteBuffer a;
    public int b;
    public int c;
    public int d;
    public String e;
    public ArrayList f;

    public C5015el4(MappedByteBuffer mappedByteBuffer) {
        this.a = mappedByteBuffer;
        mappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final int j(PublicKey publicKey) {
        byte[] b = b(this.e);
        if (b == null || b.length == 0) {
            return 5;
        }
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(publicKey);
            int a = a(signature);
            return a != 0 ? a : signature.verify(b) ? 0 : 4;
        } catch (Exception e) {
            AbstractC4851eH1.a("WebApkVerifySignature", "Exception calculating signature", e);
            return 4;
        }
    }

    public final int a(Signature signature) {
        Collections.sort(this.f);
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4672dl4 c4672dl4 = (C4672dl4) it.next();
            if (c4672dl4.a.indexOf("META-INF/") == 0) {
                i++;
                if (i > 5) {
                    return 6;
                }
            } else {
                byte[] bytes = c4672dl4.a.getBytes();
                int length = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(4);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                allocate.putInt(length);
                signature.update(allocate.array());
                signature.update(bytes);
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.order(byteOrder);
                int i2 = c4672dl4.i;
                allocate2.putInt(i2);
                signature.update(allocate2.array());
                h(c4672dl4.g + c4672dl4.h);
                ByteBuffer slice = this.a.slice();
                slice.limit(i2);
                signature.update(slice);
            }
        }
        return 0;
    }

    public static byte[] b(String str) {
        Matcher matcher = g.matcher(str);
        byte[] bArr = null;
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        int length = group.length();
        if (length % 2 == 0) {
            bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(group.charAt(i + 1), 16) + (Character.digit(group.charAt(i), 16) << 4));
            }
        }
        return bArr;
    }

    public final int e() {
        this.f = new ArrayList(this.b);
        h(this.c);
        for (int i = 0; i < this.b; i++) {
            if (d() != 33639248) {
                return 1;
            }
            i(16);
            int d = d();
            i(4);
            int c = c();
            int c2 = c();
            int c3 = c();
            i(8);
            int d2 = d();
            String g2 = g(c);
            i(c2 + c3);
            if (c2 > 4160) {
                return 2;
            }
            if (c3 > 0) {
                return 3;
            }
            this.f.add(new C4672dl4(d2, d, g2));
        }
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.position() != this.d) {
            return 7;
        }
        Collections.sort(this.f, C4672dl4.j);
        Iterator it = this.f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4672dl4 c4672dl4 = (C4672dl4) it.next();
            int i3 = c4672dl4.g;
            if (i3 != i2) {
                return 7;
            }
            h(i3);
            if (d() != 67324752) {
                return 1;
            }
            i(2);
            int c4 = c();
            i(18);
            int c5 = c();
            int c6 = c();
            if (c6 > 4160) {
                return 2;
            }
            int position = byteBuffer.position();
            int i4 = c4672dl4.g;
            int i5 = (position - i4) + c5 + c6;
            c4672dl4.h = i5;
            int i6 = i4 + i5 + c4672dl4.i;
            if ((c4 & 8) != 0) {
                h(i6);
                i6 = ((long) d()) == 134695760 ? i6 + 16 : i6 + 12;
            }
            i2 = i6;
        }
        int i7 = this.c;
        if (i2 != i7) {
            h(i7 - 16);
            if (!"APK Sig Block 42".equals(g(16))) {
                return 7;
            }
            if (this.c - i2 > 24576) {
                return 8;
            }
        }
        return 0;
    }

    public final int f() {
        ByteBuffer byteBuffer = this.a;
        int limit = byteBuffer.limit() - 22;
        int max = Math.max(0, limit - 65536);
        while (true) {
            if (limit < max) {
                limit = -1;
                break;
            }
            h(limit);
            if (d() == 101010256) {
                break;
            }
            limit--;
        }
        if (limit < 0) {
            return 1;
        }
        this.d = limit;
        h(limit + 10);
        this.b = c();
        i(4);
        this.c = d();
        this.e = g(c());
        return byteBuffer.position() < byteBuffer.limit() ? 7 : 0;
    }

    public final void h(int i) {
        this.a.position(i);
    }

    public final void i(int i) {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public final int c() {
        return this.a.getShort();
    }

    public final int d() {
        return this.a.getInt();
    }

    public final String g(int i) {
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        this.a.get(bArr);
        return new String(bArr);
    }
}
