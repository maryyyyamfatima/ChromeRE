package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JR0 {
    public static final HR0 a = new Comparator() { // from class: HR0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[LOOP:1: B:13:0x004e->B:27:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[EDGE_INSN: B:28:0x0095->B:29:0x0095 BREAK  A[LOOP:1: B:13:0x004e->B:27:0x0091], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C4905eS0 a(android.content.Context r20, defpackage.LR0 r21) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JR0.a(android.content.Context, LR0):eS0");
    }
}
