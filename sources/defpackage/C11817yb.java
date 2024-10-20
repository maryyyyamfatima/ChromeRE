package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11817yb {
    public int a;
    public int b;
    public int c;
    public OutputStream g;
    public Bitmap h;
    public byte[] i;
    public byte[] j;
    public int k;
    public byte[] l;
    public boolean q;
    public int d = -1;
    public int e = 0;
    public boolean f = false;
    public final boolean[] m = new boolean[256];
    public int n = 7;
    public boolean o = true;
    public int p = 10;

    public final boolean b() {
        boolean z;
        if (!this.f) {
            return false;
        }
        this.f = false;
        try {
            this.g.write(59);
            this.g.flush();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.c = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.l = null;
        this.o = true;
        return z;
    }

    public final void a() {
        int i;
        int[] iArr;
        int i2;
        byte b;
        int[][] iArr2;
        int[] iArr3;
        boolean[] zArr;
        int i3;
        int i4;
        int[] iArr4;
        int i5;
        int[] iArr5;
        C5807h32 c5807h32;
        C5807h32 c5807h322;
        int i6;
        byte[] bArr = this.i;
        int length = bArr.length;
        int i7 = length / 3;
        this.j = new byte[i7];
        C5807h32 c5807h323 = new C5807h32(bArr, length, this.p);
        int i8 = 1509;
        if (length < 1509) {
            c5807h323.c = 1;
        }
        int i9 = c5807h323.c;
        c5807h323.a = ((i9 - 1) / 3) + 30;
        int i10 = length / (i9 * 3);
        int i11 = i10 / 100;
        int i12 = 0;
        while (true) {
            i = 256;
            iArr = c5807h323.h;
            i2 = 32;
            if (i12 >= 32) {
                break;
            }
            iArr[i12] = (((1024 - (i12 * i12)) * 256) / 1024) * 1024;
            i12++;
        }
        if (length < 1509) {
            i8 = 3;
        } else if (length % 499 != 0) {
            i8 = 1497;
        } else if (length % 491 != 0) {
            i8 = 1473;
        } else if (length % 487 != 0) {
            i8 = 1461;
        }
        int i13 = 2048;
        int i14 = 1024;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            b = 255;
            iArr2 = c5807h323.d;
            if (i15 >= i10) {
                break;
            }
            byte[] bArr2 = c5807h323.b;
            int i17 = (bArr2[i16 + 0] & 255) << 4;
            int i18 = (bArr2[i16 + 1] & 255) << 4;
            int i19 = (bArr2[i16 + 2] & 255) << 4;
            int i20 = Integer.MAX_VALUE;
            int i21 = i7;
            int i22 = i10;
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = -1;
            int i26 = -1;
            while (true) {
                iArr4 = c5807h323.f;
                i5 = i13;
                iArr5 = c5807h323.g;
                c5807h32 = c5807h323;
                if (i24 >= 256) {
                    break;
                }
                int[] iArr6 = iArr2[i24];
                int i27 = i11;
                int i28 = iArr6[0] - i17;
                if (i28 < 0) {
                    i28 = -i28;
                }
                int i29 = i15;
                int i30 = iArr6[1] - i18;
                if (i30 < 0) {
                    i30 = -i30;
                }
                int i31 = i28 + i30;
                int i32 = iArr6[2] - i19;
                if (i32 < 0) {
                    i32 = -i32;
                }
                int i33 = i31 + i32;
                if (i33 < i20) {
                    i25 = i24;
                    i20 = i33;
                }
                int i34 = i33 - (iArr4[i24] >> 12);
                if (i34 < i23) {
                    i26 = i24;
                    i23 = i34;
                }
                int i35 = iArr5[i24];
                int i36 = i35 >> 10;
                iArr5[i24] = i35 - i36;
                iArr4[i24] = iArr4[i24] + (i36 << 10);
                i24++;
                i13 = i5;
                c5807h323 = c5807h32;
                i11 = i27;
                i15 = i29;
            }
            int i37 = i11;
            int i38 = i15;
            iArr5[i25] = iArr5[i25] + 64;
            iArr4[i25] = iArr4[i25] - 65536;
            int[] iArr7 = iArr2[i26];
            int i39 = iArr7[0];
            iArr7[0] = i39 - (((i39 - i17) * i14) / 1024);
            int i40 = iArr7[1];
            iArr7[1] = i40 - (((i40 - i18) * i14) / 1024);
            int i41 = iArr7[2];
            iArr7[2] = i41 - (((i41 - i19) * i14) / 1024);
            if (i2 != 0) {
                int i42 = i26 - i2;
                if (i42 < -1) {
                    i42 = -1;
                }
                int i43 = i26 + i2;
                if (i43 > 256) {
                    i43 = 256;
                }
                int i44 = i26 + 1;
                int i45 = i26 - 1;
                int i46 = 1;
                while (true) {
                    if (i44 >= i43 && i45 <= i42) {
                        break;
                    }
                    int i47 = i46 + 1;
                    int i48 = iArr[i46];
                    if (i44 < i43) {
                        int i49 = i44 + 1;
                        int[] iArr8 = iArr2[i44];
                        try {
                            int i50 = iArr8[0];
                            iArr8[0] = i50 - (((i50 - i17) * i48) / 262144);
                            int i51 = iArr8[1];
                            iArr8[1] = i51 - (((i51 - i18) * i48) / 262144);
                            int i52 = iArr8[2];
                            iArr8[2] = i52 - (((i52 - i19) * i48) / 262144);
                        } catch (Exception unused) {
                        }
                        i44 = i49;
                    }
                    if (i45 > i42) {
                        int i53 = i45 - 1;
                        int[] iArr9 = iArr2[i45];
                        try {
                            int i54 = iArr9[0];
                            iArr9[0] = i54 - (((i54 - i17) * i48) / 262144);
                            int i55 = iArr9[1];
                            iArr9[1] = i55 - (((i55 - i18) * i48) / 262144);
                            int i56 = iArr9[2];
                            iArr9[2] = i56 - (((i56 - i19) * i48) / 262144);
                        } catch (Exception unused2) {
                        }
                        i46 = i47;
                        i45 = i53;
                    } else {
                        i46 = i47;
                    }
                }
            }
            int i57 = i16 + i8;
            if (i57 >= length) {
                i57 -= length;
            }
            i16 = i57;
            i15 = i38 + 1;
            if (i37 == 0) {
                i37 = 1;
            }
            if (i15 % i37 == 0) {
                c5807h322 = c5807h32;
                i14 -= i14 / c5807h322.a;
                i13 = i5 - (i5 / 30);
                int i58 = i13 >> 6;
                if (i58 <= 1) {
                    i58 = 0;
                }
                for (int i59 = 0; i59 < i58; i59++) {
                    int i60 = i58 * i58;
                    iArr[i59] = (((i60 - (i59 * i59)) * 256) / i60) * i14;
                }
                i6 = 256;
                i2 = i58;
            } else {
                c5807h322 = c5807h32;
                i6 = 256;
                i13 = i5;
            }
            c5807h323 = c5807h322;
            i = i6;
            i10 = i22;
            i7 = i21;
            i11 = i37;
        }
        int i61 = i7;
        C5807h32 c5807h324 = c5807h323;
        int i62 = -1;
        int i63 = 0;
        for (int i64 = i; i63 < i64; i64 = 256) {
            int[] iArr10 = iArr2[i63];
            iArr10[0] = iArr10[0] >> 4;
            iArr10[1] = iArr10[1] >> 4;
            iArr10[2] = iArr10[2] >> 4;
            iArr10[3] = i63;
            i63++;
        }
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        while (true) {
            iArr3 = c5807h324.e;
            int i68 = 256;
            if (i65 >= 256) {
                break;
            }
            int[] iArr11 = iArr2[i65];
            char c = 1;
            int i69 = iArr11[1];
            int i70 = i65 + 1;
            int i71 = i65;
            int i72 = i70;
            while (i72 < i68) {
                int i73 = iArr2[i72][c];
                if (i73 < i69) {
                    i69 = i73;
                    i71 = i72;
                }
                i72++;
                i68 = 256;
                c = 1;
            }
            int[] iArr12 = iArr2[i71];
            if (i65 != i71) {
                int i74 = iArr12[0];
                iArr12[0] = iArr11[0];
                iArr11[0] = i74;
                int i75 = iArr12[1];
                iArr12[1] = iArr11[1];
                iArr11[1] = i75;
                int i76 = iArr12[2];
                iArr12[2] = iArr11[2];
                iArr11[2] = i76;
                int i77 = iArr12[3];
                iArr12[3] = iArr11[3];
                iArr11[3] = i77;
            }
            if (i69 != i67) {
                iArr3[i67] = (i66 + i65) >> 1;
                while (true) {
                    i67++;
                    if (i67 >= i69) {
                        break;
                    } else {
                        iArr3[i67] = i65;
                    }
                }
                i66 = i65;
                i67 = i69;
            }
            i65 = i70;
        }
        iArr3[i67] = (i66 + 255) >> 1;
        for (int i78 = i67 + 1; i78 < 256; i78++) {
            iArr3[i78] = 255;
        }
        byte[] bArr3 = new byte[768];
        int[] iArr13 = new int[256];
        for (int i79 = 0; i79 < 256; i79++) {
            iArr13[iArr2[i79][3]] = i79;
        }
        int i80 = 0;
        int i81 = 0;
        for (int i82 = 256; i80 < i82; i82 = 256) {
            int i83 = i81 + 1;
            int[] iArr14 = iArr2[iArr13[i80]];
            bArr3[i81] = (byte) iArr14[0];
            int i84 = i83 + 1;
            bArr3[i83] = (byte) iArr14[1];
            bArr3[i84] = (byte) iArr14[2];
            i80++;
            i81 = i84 + 1;
        }
        this.l = bArr3;
        int i85 = 0;
        while (true) {
            byte[] bArr4 = this.l;
            int length2 = bArr4.length;
            zArr = this.m;
            if (i85 >= length2) {
                break;
            }
            byte b2 = bArr4[i85];
            int i86 = i85 + 2;
            bArr4[i85] = bArr4[i86];
            bArr4[i86] = b2;
            zArr[i85 / 3] = false;
            i85 += 3;
        }
        int i87 = 0;
        int i88 = 0;
        while (i87 < i61) {
            byte[] bArr5 = this.i;
            int i89 = i88 + 1;
            int i90 = bArr5[i88] & b;
            int i91 = i89 + 1;
            int i92 = bArr5[i89] & b;
            int i93 = i91 + 1;
            int i94 = bArr5[i91] & b;
            int i95 = iArr3[i92];
            int i96 = 1000;
            int i97 = i95 - 1;
            while (true) {
                int i98 = 256;
                while (true) {
                    if (i95 < i98 || i97 >= 0) {
                        if (i95 < i98) {
                            int[] iArr15 = iArr2[i95];
                            int i99 = iArr15[1] - i92;
                            if (i99 >= i96) {
                                i95 = 256;
                            } else {
                                i95++;
                                if (i99 < 0) {
                                    i99 = -i99;
                                }
                                int i100 = iArr15[0] - i90;
                                if (i100 < 0) {
                                    i100 = -i100;
                                }
                                int i101 = i99 + i100;
                                if (i101 < i96) {
                                    int i102 = iArr15[2] - i94;
                                    if (i102 < 0) {
                                        i102 = -i102;
                                    }
                                    int i103 = i101 + i102;
                                    if (i103 < i96) {
                                        i62 = iArr15[3];
                                        i96 = i103;
                                    }
                                }
                            }
                        }
                        if (i97 < 0) {
                            i4 = i87;
                            break;
                        }
                        int[] iArr16 = iArr2[i97];
                        int i104 = i92 - iArr16[1];
                        if (i104 >= i96) {
                            b = 255;
                            i98 = 256;
                            i97 = -1;
                        } else {
                            i97--;
                            if (i104 < 0) {
                                i104 = -i104;
                            }
                            i4 = i87;
                            int i105 = iArr16[0] - i90;
                            if (i105 < 0) {
                                i105 = -i105;
                            }
                            int i106 = i104 + i105;
                            if (i106 < i96) {
                                int i107 = iArr16[2] - i94;
                                if (i107 < 0) {
                                    i107 = -i107;
                                }
                                int i108 = i107 + i106;
                                if (i108 < i96) {
                                    i62 = iArr16[3];
                                    i96 = i108;
                                }
                            }
                        }
                    }
                }
                i87 = i4;
                b = 255;
            }
            zArr[i62] = true;
            this.j[i87] = (byte) i62;
            i87++;
            i88 = i93;
            i62 = -1;
        }
        this.i = null;
        this.k = 8;
        this.n = 7;
        if (this.q) {
            if (this.l == null) {
                i3 = -1;
            } else {
                int i109 = 0;
                int red = Color.red(0);
                int green = Color.green(0);
                int blue = Color.blue(0);
                int length3 = this.l.length;
                int i110 = 16777216;
                int i111 = 0;
                while (i111 < length3) {
                    byte[] bArr6 = this.l;
                    int i112 = i111 + 1;
                    int i113 = red - (bArr6[i111] & 255);
                    int i114 = i112 + 1;
                    int i115 = green - (bArr6[i112] & 255);
                    int i116 = blue - (bArr6[i114] & 255);
                    int i117 = (i116 * i116) + (i115 * i115) + (i113 * i113);
                    int i118 = i114 / 3;
                    if (zArr[i118] && i117 < i110) {
                        i110 = i117;
                        i109 = i118;
                    }
                    i111 = i114 + 1;
                }
                i3 = i109;
            }
            this.c = i3;
        }
    }

    public final void c() {
        int width = this.h.getWidth();
        int height = this.h.getHeight();
        int i = this.a;
        if (width != i || height != this.b) {
            Bitmap createBitmap = Bitmap.createBitmap(i, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.h = createBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        this.h.getPixels(iArr, 0, width, 0, 0, width, height);
        this.i = new byte[i2 * 3];
        this.q = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = iArr[i3];
            if (i6 == 0) {
                i4++;
            }
            byte[] bArr = this.i;
            int i7 = i5 + 1;
            bArr[i5] = (byte) (i6 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i6 >> 8) & 255);
            bArr[i8] = (byte) ((i6 >> 16) & 255);
            i3++;
            i5 = i8 + 1;
        }
        this.q = ((double) (i4 * 100)) / ((double) i2) > 4.0d;
    }

    public final void d() {
        int i;
        int i2;
        this.g.write(33);
        this.g.write(249);
        this.g.write(4);
        if (this.q) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 0;
        }
        this.g.write(i | (i2 << 2) | 0 | 0);
        g(this.e);
        this.g.write(this.c);
        this.g.write(0);
    }

    public final void e() {
        this.g.write(33);
        this.g.write(255);
        this.g.write(11);
        for (int i = 0; i < 11; i++) {
            this.g.write((byte) "NETSCAPE2.0".charAt(i));
        }
        this.g.write(3);
        this.g.write(1);
        g(this.d);
        this.g.write(0);
    }

    public final void f() {
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4 = this.a;
        int i5 = this.b;
        byte[] bArr = this.j;
        C3704aw1 c3704aw1 = new C3704aw1(i4, i5, this.k, bArr);
        OutputStream outputStream = this.g;
        int i6 = c3704aw1.b;
        outputStream.write(i6);
        int i7 = i4 * i5;
        c3704aw1.c = i7;
        c3704aw1.d = 0;
        int i8 = i6 + 1;
        c3704aw1.k = i8;
        c3704aw1.j = false;
        c3704aw1.e = i8;
        c3704aw1.f = (1 << i8) - 1;
        int i9 = 1 << (i8 - 1);
        c3704aw1.l = i9;
        c3704aw1.m = i9 + 1;
        c3704aw1.i = i9 + 2;
        c3704aw1.q = 0;
        if (i7 == 0) {
            i = -1;
        } else {
            c3704aw1.c = i7 - 1;
            c3704aw1.d = 0 + 1;
            i = bArr[0] & 255;
        }
        int i10 = 0;
        for (int i11 = 5003; i11 < 65536; i11 *= 2) {
            i10++;
        }
        int i12 = 8 - i10;
        int i13 = 0;
        while (true) {
            iArr = c3704aw1.g;
            if (i13 >= 5003) {
                break;
            }
            iArr[i13] = -1;
            i13++;
        }
        c3704aw1.a(c3704aw1.l, outputStream);
        while (true) {
            int i14 = c3704aw1.c;
            if (i14 == 0) {
                i2 = -1;
            } else {
                c3704aw1.c = i14 - 1;
                int i15 = c3704aw1.d;
                c3704aw1.d = i15 + 1;
                i2 = c3704aw1.a[i15] & 255;
            }
            if (i2 != -1) {
                int i16 = (i2 << 12) + i;
                int i17 = (i2 << i12) ^ i;
                int i18 = iArr[i17];
                int[] iArr2 = c3704aw1.h;
                if (i18 == i16) {
                    i = iArr2[i17];
                } else {
                    if (i18 >= 0) {
                        int i19 = 5003 - i17;
                        if (i17 == 0) {
                            i19 = 1;
                        }
                        do {
                            i17 -= i19;
                            if (i17 < 0) {
                                i17 += 5003;
                            }
                            i3 = iArr[i17];
                            if (i3 == i16) {
                                i = iArr2[i17];
                                break;
                            }
                        } while (i3 >= 0);
                    }
                    c3704aw1.a(i, outputStream);
                    int i20 = c3704aw1.i;
                    if (i20 >= 4096) {
                        for (int i21 = 0; i21 < 5003; i21++) {
                            iArr[i21] = -1;
                        }
                        int i22 = c3704aw1.l;
                        c3704aw1.i = i22 + 2;
                        c3704aw1.j = true;
                        c3704aw1.a(i22, outputStream);
                    } else {
                        c3704aw1.i = i20 + 1;
                        iArr2[i17] = i20;
                        iArr[i17] = i16;
                    }
                    i = i2;
                }
            } else {
                c3704aw1.a(i, outputStream);
                c3704aw1.a(c3704aw1.m, outputStream);
                outputStream.write(0);
                return;
            }
        }
    }

    public final void g(int i) {
        this.g.write(i & 255);
        this.g.write((i >> 8) & 255);
    }
}
