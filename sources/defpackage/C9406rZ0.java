package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9406rZ0 {
    public ByteBuffer b;
    public C9064qZ0 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final C9064qZ0 b() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
        } else {
            this.c.f = f();
            this.c.g = f();
            int c = c();
            C9064qZ0 c9064qZ0 = this.c;
            c9064qZ0.h = (c & 128) != 0;
            c9064qZ0.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            C9064qZ0 c9064qZ02 = this.c;
            c();
            c9064qZ02.getClass();
            if (this.c.h && !a()) {
                C9064qZ0 c9064qZ03 = this.c;
                c9064qZ03.a = e(c9064qZ03.i);
                C9064qZ0 c9064qZ04 = this.c;
                c9064qZ04.k = c9064qZ04.a[c9064qZ04.j];
            }
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int c2 = c();
                if (c2 == 33) {
                    int c3 = c();
                    if (c3 == 1) {
                        g();
                    } else if (c3 == 249) {
                        this.c.d = new C7002kZ0();
                        c();
                        int c4 = c();
                        C7002kZ0 c7002kZ0 = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        c7002kZ0.g = i2;
                        if (i2 == 0) {
                            c7002kZ0.g = 1;
                        }
                        c7002kZ0.f = (c4 & 1) != 0;
                        int f = f();
                        if (f < 2) {
                            f = 10;
                        }
                        C7002kZ0 c7002kZ02 = this.c.d;
                        c7002kZ02.i = f * 10;
                        c7002kZ02.h = c();
                        c();
                    } else if (c3 == 254) {
                        g();
                    } else if (c3 == 255) {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            g();
                        }
                    } else {
                        g();
                    }
                } else if (c2 == 44) {
                    C9064qZ0 c9064qZ05 = this.c;
                    if (c9064qZ05.d == null) {
                        c9064qZ05.d = new C7002kZ0();
                    }
                    c9064qZ05.d.a = f();
                    this.c.d.b = f();
                    this.c.d.c = f();
                    this.c.d.d = f();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    C7002kZ0 c7002kZ03 = this.c.d;
                    c7002kZ03.e = (c5 & 64) != 0;
                    if (z2) {
                        c7002kZ03.k = e(pow);
                    } else {
                        c7002kZ03.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    g();
                    if (!a()) {
                        C9064qZ0 c9064qZ06 = this.c;
                        c9064qZ06.c++;
                        c9064qZ06.e.add(c9064qZ06.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            C9064qZ0 c9064qZ07 = this.c;
            if (c9064qZ07.c < 0) {
                c9064qZ07.b = 1;
            }
        }
        return this.c;
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
        }
        return iArr;
    }

    public final void g() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = 1;
                return;
            }
        }
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int f() {
        return this.b.getShort();
    }

    public final boolean a() {
        return this.c.b != 0;
    }
}
