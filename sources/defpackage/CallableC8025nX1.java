package defpackage;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC8025nX1 implements Callable {
    public final File a;
    public final File g;
    public final InterfaceC1301Ka0 h;
    public final C11455xX1 i;

    public CallableC8025nX1(File file, File file2, InterfaceC1301Ka0 interfaceC1301Ka0) {
        C11455xX1 c11455xX1 = new C11455xX1();
        this.a = file;
        this.g = file2;
        this.i = c11455xX1;
        this.h = interfaceC1301Ka0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[Catch: all -> 0x0129, TryCatch #4 {all -> 0x0129, blocks: (B:48:0x00ac, B:50:0x00b4, B:52:0x00bc, B:61:0x00d8, B:63:0x00e9, B:65:0x00f1, B:70:0x0108, B:76:0x00ff, B:77:0x0115), top: B:47:0x00ac, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115 A[Catch: all -> 0x0129, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0129, blocks: (B:48:0x00ac, B:50:0x00b4, B:52:0x00bc, B:61:0x00d8, B:63:0x00e9, B:65:0x00f1, B:70:0x0108, B:76:0x00ff, B:77:0x0115), top: B:47:0x00ac, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0150  */
    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer call() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CallableC8025nX1.call():java.lang.Integer");
    }

    public final void a(String str, String str2) {
        FileWriter fileWriter = new FileWriter(this.g, true);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() / 1000);
        sb.append(",");
        sb.append(str2);
        if (str != null) {
            sb.append(",");
            sb.append(str);
        }
        sb.append('\n');
        try {
            fileWriter.write(sb.toString());
        } finally {
            fileWriter.close();
        }
    }
}
