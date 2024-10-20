package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ce2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283Ce2 {
    public static void a(long j, C5173fD c5173fD, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        C5173fD c5173fD2;
        int i8 = i;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (!(((C3804bE) arrayList.get(i9)).b() >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        C3804bE c3804bE = (C3804bE) arrayList.get(i2);
        C3804bE c3804bE2 = (C3804bE) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == c3804bE.b()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            C3804bE c3804bE3 = (C3804bE) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            c3804bE = c3804bE3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c3804bE.e(i8) == c3804bE2.e(i8)) {
            int min = Math.min(c3804bE.b(), c3804bE2.b());
            int i12 = 0;
            for (int i13 = i8; i13 < min && c3804bE.e(i13) == c3804bE2.e(i13); i13++) {
                i12++;
            }
            long j2 = 4;
            long j3 = 1 + (c5173fD.g / j2) + j + 2 + i12;
            c5173fD.C(-i12);
            c5173fD.C(i5);
            int i14 = i8 + i12;
            while (i8 < i14) {
                c5173fD.C(c3804bE.e(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (!(i14 == ((C3804bE) arrayList.get(i4)).b())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c5173fD.C(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                C5173fD c5173fD3 = new C5173fD();
                c5173fD.C(((int) ((c5173fD3.g / j2) + j3)) * (-1));
                a(j3, c5173fD3, i14, arrayList, i4, i3, arrayList2);
                do {
                } while (c5173fD3.Z0(c5173fD, 8192L) != -1);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((C3804bE) arrayList.get(i16 - 1)).e(i8) != ((C3804bE) arrayList.get(i16)).e(i8)) {
                i15++;
            }
        }
        long j4 = 4;
        long j5 = (i15 * 2) + (c5173fD.g / j4) + j + 2;
        c5173fD.C(i15);
        c5173fD.C(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            byte e = ((C3804bE) arrayList.get(i17)).e(i8);
            if (i17 == i4 || e != ((C3804bE) arrayList.get(i17 - 1)).e(i8)) {
                c5173fD.C(e & 255);
            }
        }
        C5173fD c5173fD4 = new C5173fD();
        while (i4 < i3) {
            byte e2 = ((C3804bE) arrayList.get(i4)).e(i8);
            int i18 = i4 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (e2 != ((C3804bE) arrayList.get(i19)).e(i8)) {
                        i6 = i19;
                        break;
                    }
                    i19++;
                }
            }
            if (i18 == i6 && i8 + 1 == ((C3804bE) arrayList.get(i4)).b()) {
                c5173fD.C(((Number) arrayList2.get(i4)).intValue());
                i7 = i6;
                c5173fD2 = c5173fD4;
            } else {
                c5173fD.C(((int) ((c5173fD4.g / j4) + j5)) * i10);
                i7 = i6;
                c5173fD2 = c5173fD4;
                a(j5, c5173fD4, i8 + 1, arrayList, i4, i6, arrayList2);
            }
            c5173fD4 = c5173fD2;
            i4 = i7;
            i10 = -1;
        }
        do {
        } while (c5173fD4.Z0(c5173fD, 8192L) != -1);
    }
}
